package com.project.thisvsthat.chat.util;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class RedisConnectionLogger {
    private static final Logger logger = LoggerFactory.getLogger(RedisConnectionLogger.class);

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @PostConstruct
    public void checkRedisConnection() {
        try {
            // Redis 연결 테스트
            redisTemplate.opsForValue().set("testKey", "testValue");
            String value = (String) redisTemplate.opsForValue().get("testKey");

            // 연결 성공 시 로그 출력
            if ("testValue".equals(value)) {
                logger.info("🔗Redis 서버에 성공적으로 연결되었습니다.");
            } else {
                logger.warn("⚠️Redis 연결 후 예상된 값이 반환되지 않았습니다.");
            }
        } catch (Exception e) {
            // Redis 연결 실패 시 로그 출력
            logger.error("⛓️‍💥Redis 서버에 연결할 수 없습니다.", e);
        }
    }
}
