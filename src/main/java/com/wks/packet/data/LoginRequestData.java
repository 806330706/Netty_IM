package com.wks.packet.data;


import com.wks.packet.Command;
import lombok.Data;

@Data
public class LoginRequestData implements EncodeData{

    private Integer userId;

    private String username;

    private String password;

    public LoginRequestData(Integer userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    @Override
    public byte getCommand() {
        return Command.LOGIN_REQUEST;
    }
}