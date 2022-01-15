package com.devin.redisspringbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 52361
 * @Description
 * @create 2022-01-07 17:17
 */
@ConfigurationProperties(prefix = "devin.redisson")
public class RedissonProperties {

    private String host = "localhost";
    private String password ;
    private int port = 6379;
    private int timeout;
    private boolean ssl;
    private int maxIdle=8;
    private int minIdle=0;
    private int maxActive =8;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }
}
