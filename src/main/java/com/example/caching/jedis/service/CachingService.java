package com.example.caching.jedis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class CachingService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private HashOperations<String, String, String> hashOperations;

    public void save(){
        hashOperations.put("sample","1","2");
    }

    public String get(){
        return (String)hashOperations.get("sample","1");
    }
}
