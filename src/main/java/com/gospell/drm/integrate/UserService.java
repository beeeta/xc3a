package com.gospell.drm.integrate;

import org.springframework.stereotype.Component;

/**
 * User Service
 */
@Component
public class UserService {

	public UserService() {
		System.out.println("UserService Constructor...");
	}

	public void save() {
		System.out.println("save");
	}
}
