package com.example.demo.util;

import com.example.demo.domain.MsgBody;

public class MsgUtil {

    public static MsgBody buildMsg(String channelId, String msgInfo){
        MsgBody.Builder builder = MsgBody.newBuilder();
        builder.setChannelId(channelId);
        builder.setMsgInfo(msgInfo);
        return builder.build();
    }

}
