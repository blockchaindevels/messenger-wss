package com.jasofalcon.user;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class User implements Serializable {
    private String id;
    private String name;
    private String roomid;

    public User() {
    }

    public User(String name) {
        this.name = name;
        this.roomid = roomid;
        id = UUID.randomUUID().toString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomid() {
        return this.roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if(null == o || o.getClass() != this.getClass()) return false;

        User other = (User) o;

        return Objects.equals(this.id, other.id) && Objects.equals(this.name, other.name);
    }
}
