package com.bytedance.im.core.model;

import X.C63459OvP;
import X.InterfaceC65349Pkn;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class DeleteConversationRequest implements Serializable {

    @InterfaceC65349Pkn("badge")
    public int badgeCount;

    @InterfaceC65349Pkn("cid")
    public String conversationId;

    @InterfaceC65349Pkn("short_id")
    public long conversationShortId;

    @InterfaceC65349Pkn("c_type")
    public int conversationType;

    @InterfaceC65349Pkn("inbox")
    public int inboxType;

    @InterfaceC65349Pkn("index")
    public long lastMsgIndex;

    @InterfaceC65349Pkn("index_v2")
    public long lastMsgIndexV2;

    @InterfaceC65349Pkn("retry_times")
    public int retryTimes;

    @InterfaceC65349Pkn("del_time")
    public long userDelTime;

    public DeleteConversationRequestBody toReqBody() {
        C63459OvP c63459OvP = new C63459OvP();
        c63459OvP.LIZLLL = this.conversationId;
        c63459OvP.LJ = Long.valueOf(this.conversationShortId);
        c63459OvP.LJFF = Integer.valueOf(this.conversationType);
        c63459OvP.LJI = Long.valueOf(this.lastMsgIndex);
        c63459OvP.LJII = Long.valueOf(this.lastMsgIndexV2);
        c63459OvP.LJIIIIZZ = Integer.valueOf(this.badgeCount);
        return c63459OvP.build();
    }

    public static DeleteConversationRequest fromReqBody(int i, String str, DeleteConversationRequestBody deleteConversationRequestBody) {
        DeleteConversationRequest deleteConversationRequest = new DeleteConversationRequest();
        deleteConversationRequest.inboxType = i;
        deleteConversationRequest.conversationId = str;
        deleteConversationRequest.conversationShortId = deleteConversationRequestBody.conversation_short_id.longValue();
        deleteConversationRequest.conversationType = deleteConversationRequestBody.conversation_type.intValue();
        deleteConversationRequest.lastMsgIndex = deleteConversationRequestBody.last_message_index.longValue();
        deleteConversationRequest.lastMsgIndexV2 = deleteConversationRequestBody.last_message_index_v2.longValue();
        deleteConversationRequest.badgeCount = deleteConversationRequestBody.badge_count.intValue();
        deleteConversationRequest.userDelTime = System.currentTimeMillis();
        return deleteConversationRequest;
    }
}
