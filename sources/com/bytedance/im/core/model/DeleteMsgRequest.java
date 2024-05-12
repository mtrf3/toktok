package com.bytedance.im.core.model;

import X.C63468OvY;
import X.C63490Ovu;
import X.InterfaceC65349Pkn;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class DeleteMsgRequest implements Serializable {

    @InterfaceC65349Pkn("cid")
    public String conversationId;

    @InterfaceC65349Pkn("short_id")
    public Long conversationShortId;

    @InterfaceC65349Pkn("c_type")
    public Integer conversationType;

    @InterfaceC65349Pkn("inbox")
    public Integer inboxType;

    @InterfaceC65349Pkn("server_message_id")
    public Long server_message_id;

    @InterfaceC65349Pkn("del_time")
    public Long userDelTime;

    @InterfaceC65349Pkn("retry_times")
    public Integer retryTimes = 0;

    @InterfaceC65349Pkn("is_stranger")
    public boolean isStranger = false;

    public DeleteMessageRequestBody toMsgReqBody() {
        C63468OvY c63468OvY = new C63468OvY();
        c63468OvY.LIZLLL = this.conversationId;
        c63468OvY.LJ = this.conversationShortId;
        c63468OvY.LJFF = this.conversationType;
        c63468OvY.LJI = this.server_message_id;
        return c63468OvY.build();
    }

    public DeleteStrangerMessageRequestBody toStrangeMsgReqBody() {
        C63490Ovu c63490Ovu = new C63490Ovu();
        c63490Ovu.LJ = this.conversationShortId;
        c63490Ovu.LIZLLL = this.server_message_id;
        return c63490Ovu.build();
    }

    public static DeleteMsgRequest fromReqBody(int i, DeleteMessageRequestBody deleteMessageRequestBody) {
        DeleteMsgRequest deleteMsgRequest = new DeleteMsgRequest();
        deleteMsgRequest.inboxType = Integer.valueOf(i);
        deleteMsgRequest.conversationId = deleteMessageRequestBody.conversation_id;
        deleteMsgRequest.conversationShortId = deleteMessageRequestBody.conversation_short_id;
        deleteMsgRequest.conversationType = deleteMessageRequestBody.conversation_type;
        deleteMsgRequest.server_message_id = deleteMessageRequestBody.message_id;
        deleteMsgRequest.isStranger = false;
        deleteMsgRequest.userDelTime = Long.valueOf(System.currentTimeMillis());
        return deleteMsgRequest;
    }

    public static DeleteMsgRequest fromReqBody(int i, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
        DeleteMsgRequest deleteMsgRequest = new DeleteMsgRequest();
        deleteMsgRequest.inboxType = Integer.valueOf(i);
        deleteMsgRequest.conversationShortId = deleteStrangerMessageRequestBody.conversation_short_id;
        deleteMsgRequest.isStranger = true;
        deleteMsgRequest.userDelTime = Long.valueOf(System.currentTimeMillis());
        return deleteMsgRequest;
    }
}
