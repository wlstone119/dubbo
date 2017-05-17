package com.bytebeats.rpc.api;

import com.bytebeats.rpc.api.model.User;

public interface DemoService {
 
	public String sayHello(String name);
 
    public User findUserById(long id);
}