package com.neo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.neo.model.Notification;

public interface NotificationRepo extends JpaRepository<Notification, Integer>{
	
	@Query(value = "SELECT MAX(cnt) FROM (SELECT COUNT(*) AS cnt FROM notifications GROUP BY user_id) AS subquery", nativeQuery = true)
	public Integer getMaxNotificationByUser();

}
