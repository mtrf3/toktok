package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MessageInfo {

    @InterfaceC65349Pkn("from_uid")
    public final String fromUid;

    @InterfaceC65349Pkn("is_sender")
    public final int isSender;

    @InterfaceC65349Pkn("server_message_id")
    public final String messageId;

    @InterfaceC65349Pkn("message_uuid")
    public final String messageUuid;

    @InterfaceC65349Pkn("to_uid")
    public final String toUid;

    public static /* synthetic */ MessageInfo copy$default(MessageInfo messageInfo, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = messageInfo.messageId;
        }
        if ((i2 & 2) != 0) {
            str2 = messageInfo.messageUuid;
        }
        if ((i2 & 4) != 0) {
            str3 = messageInfo.fromUid;
        }
        if ((i2 & 8) != 0) {
            str4 = messageInfo.toUid;
        }
        if ((i2 & 16) != 0) {
            i = messageInfo.isSender;
        }
        return messageInfo.copy(str, str2, str3, str4, i);
    }

    public final MessageInfo copy(String messageId, String messageUuid, String fromUid, String str, int i) {
        o.LJIIIZ(messageId, "messageId");
        o.LJIIIZ(messageUuid, "messageUuid");
        o.LJIIIZ(fromUid, "fromUid");
        return new MessageInfo(messageId, messageUuid, fromUid, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) obj;
        return o.LJ(this.messageId, messageInfo.messageId) && o.LJ(this.messageUuid, messageInfo.messageUuid) && o.LJ(this.fromUid, messageInfo.fromUid) && o.LJ(this.toUid, messageInfo.toUid) && this.isSender == messageInfo.isSender;
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.fromUid, C79062V1e.LJ(this.messageUuid, this.messageId.hashCode() * 31, 31), 31);
        String str = this.toUid;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((LJ + hashCode) * 31) + this.isSender;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageInfo(messageId=");
        LIZ.append(this.messageId);
        LIZ.append(", messageUuid=");
        LIZ.append(this.messageUuid);
        LIZ.append(", fromUid=");
        LIZ.append(this.fromUid);
        LIZ.append(", toUid=");
        LIZ.append(this.toUid);
        LIZ.append(", isSender=");
        return b0.LIZJ(LIZ, this.isSender, ')', LIZ);
    }

    public final String getFromUid() {
        return this.fromUid;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getMessageUuid() {
        return this.messageUuid;
    }

    public final String getToUid() {
        return this.toUid;
    }

    public final int isSender() {
        return this.isSender;
    }

    public MessageInfo(String str, String str2, String str3, String str4, int i) {
        HH1.LIZ(str, "messageId", str2, "messageUuid", str3, "fromUid");
        this.messageId = str;
        this.messageUuid = str2;
        this.fromUid = str3;
        this.toUid = str4;
        this.isSender = i;
    }
}
