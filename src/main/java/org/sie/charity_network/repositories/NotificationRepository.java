/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.sie.charity_network.repositories;

import java.util.List;
import org.sie.charity_network.POJOs.Notification;

/**
 *
 * @author sie
 */
public interface NotificationRepository {
    void addNotification(Notification notification);
    List<Notification> getNotificationList(int userId);
}
