package hello.spring.cloud.service.redis.service;

public interface RedisService {

    /**
     *
     * @param key
     * @param value
     * @param secends
     */
    public void put(String key,Object value,long secends);

    public  Object get(String key);
}
