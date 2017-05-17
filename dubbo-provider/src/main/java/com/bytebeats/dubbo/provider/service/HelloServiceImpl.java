package com.bytebeats.dubbo.provider.service;

import com.bytebeats.rpc.api.HelloService;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHi(String msg) {
		
		return "Hello "+msg;
	}

}
