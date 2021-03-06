package com.wks.customProtocol.packet.data;

import com.wks.customProtocol.packet.Command;
import lombok.Data;

@Data
public class MessageRequestData implements EncodeData{

    private String toUser;

    private String message;

    public MessageRequestData(String toUser, String message) {
        this.toUser = toUser;
        this.message = message;
    }

    @Override
    public byte getCommand() {
        return Command.MESSAGE_REQUEST;
    }
}
