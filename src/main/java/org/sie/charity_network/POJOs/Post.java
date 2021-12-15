/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.sie.charity_network.POJOs;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author sie
 */
@Entity
@Table(name = "post")
public class Post implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 10, max = 300, message = "{post.description.size}")
    private String description;
    @Size(min = 5, max = 50, message = "{post.title.size}")
    private String title;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date")
    private Date createdDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_date")
    @NotNull(message = "{post.endDate.null}")
    private Date endDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;
    @ManyToOne
    @JoinColumn(name = "winner_id")
    private User winner;
    @OneToMany(mappedBy = "post")
    private Set<Like> likeSet;
    @OneToMany(mappedBy = "post")
    private Set<Comment> commentSet;

    public Post() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the user
     */
    public User getOwner() {
        return owner;
    }

    /**
     * @param owner the user to set
     */
    public void setOwner(User owner) {
        this.owner = owner;
    }

    /**
     * @return the winner
     */
    public User getWinner() {
        return winner;
    }

    /**
     * @param winner the winner to set
     */
    public void setWinner(User winner) {
        this.winner = winner;
    }

    /**
     * @return the likeSet
     */
    public Set<Like> getLikeSet() {
        return likeSet;
    }

    /**
     * @param likeSet the likeSet to set
     */
    public void setLikeSet(Set<Like> likeSet) {
        this.likeSet = likeSet;
    }

    /**
     * @return the commentSet
     */
    public Set<Comment> getCommentSet() {
        return commentSet;
    }

    /**
     * @param commentSet the commentSet to set
     */
    public void setCommentSet(Set<Comment> commentSet) {
        this.commentSet = commentSet;
    }
    
    
}
