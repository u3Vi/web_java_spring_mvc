/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.sie.charity_network.services;

import java.util.List;
import org.sie.charity_network.POJOs.Tag;

/**
 *
 * @author sie
 */
public interface TagService {
    boolean addTag(Tag tag);
    List<Tag> getTagList();
    List<Tag> getTagList(String keyword);
}
