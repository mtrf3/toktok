package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMNoticeMsgStruct {

    @InterfaceC65349Pkn("msg_content")
    public IMFromMessageTips msgContent;

    @InterfaceC65349Pkn("msg_type")
    public Integer msgType;

    @InterfaceC65349Pkn("notice_code")
    public String noticeCode;

    @InterfaceC65349Pkn("position")
    public Integer position;

    public static /* synthetic */ IMNoticeMsgStruct copy$default(IMNoticeMsgStruct iMNoticeMsgStruct, Integer num, String str, IMFromMessageTips iMFromMessageTips, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = iMNoticeMsgStruct.msgType;
        }
        if ((i & 2) != 0) {
            str = iMNoticeMsgStruct.noticeCode;
        }
        if ((i & 4) != 0) {
            iMFromMessageTips = iMNoticeMsgStruct.msgContent;
        }
        if ((i & 8) != 0) {
            num2 = iMNoticeMsgStruct.position;
        }
        return iMNoticeMsgStruct.copy(num, str, iMFromMessageTips, num2);
    }

    public final IMNoticeMsgStruct copy(Integer num, String str, IMFromMessageTips msgContent, Integer num2) {
        o.LJIIIZ(msgContent, "msgContent");
        return new IMNoticeMsgStruct(num, str, msgContent, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMNoticeMsgStruct)) {
            return false;
        }
        IMNoticeMsgStruct iMNoticeMsgStruct = (IMNoticeMsgStruct) obj;
        return o.LJ(this.msgType, iMNoticeMsgStruct.msgType) && o.LJ(this.noticeCode, iMNoticeMsgStruct.noticeCode) && o.LJ(this.msgContent, iMNoticeMsgStruct.msgContent) && o.LJ(this.position, iMNoticeMsgStruct.position);
    }

    public int hashCode() {
        Integer num = this.msgType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.noticeCode;
        int hashCode2 = (this.msgContent.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num2 = this.position;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMNoticeMsgStruct(msgType=");
        LIZ.append(this.msgType);
        LIZ.append(", noticeCode=");
        LIZ.append(this.noticeCode);
        LIZ.append(", msgContent=");
        LIZ.append(this.msgContent);
        LIZ.append(", position=");
        return s0.LIZJ(LIZ, this.position, ')', LIZ);
    }

    public final IMFromMessageTips getMsgContent() {
        return this.msgContent;
    }

    public final Integer getMsgType() {
        return this.msgType;
    }

    public final String getNoticeCode() {
        return this.noticeCode;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final void setMsgContent(IMFromMessageTips iMFromMessageTips) {
        o.LJIIIZ(iMFromMessageTips, "<set-?>");
        this.msgContent = iMFromMessageTips;
    }

    public final void setMsgType(Integer num) {
        this.msgType = num;
    }

    public final void setNoticeCode(String str) {
        this.noticeCode = str;
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public IMNoticeMsgStruct(Integer num, String str, IMFromMessageTips msgContent, Integer num2) {
        o.LJIIIZ(msgContent, "msgContent");
        this.msgType = num;
        this.noticeCode = str;
        this.msgContent = msgContent;
        this.position = num2;
    }

    public /* synthetic */ IMNoticeMsgStruct(Integer num, String str, IMFromMessageTips iMFromMessageTips, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, iMFromMessageTips, (i & 8) != 0 ? null : num2);
    }
}
