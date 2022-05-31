package com.jasofalcon.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jasofalcon.message.MessageType;
import com.jasofalcon.user.User;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message implements Serializable{

    private User user;
    private MessageType type;
    private String data;
    private String roomid;

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData(){
        return data;
    }
    
    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getRoomid(){
        return roomid;
    }
}
