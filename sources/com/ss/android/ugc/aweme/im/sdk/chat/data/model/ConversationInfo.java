package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ConversationInfo {

    @InterfaceC65349Pkn("conversation_id")
    public final String conversationId;

    @InterfaceC65349Pkn("conversation_short_id")
    public final String conversationShortId;

    @InterfaceC65349Pkn("cur_uid")
    public final String curUid;

    @InterfaceC65349Pkn("is_group")
    public final int isGroup;

    @InterfaceC65349Pkn("other_uid")
    public final String otherUid;

    public static /* synthetic */ ConversationInfo copy$default(ConversationInfo conversationInfo, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = conversationInfo.conversationId;
        }
        if ((i2 & 2) != 0) {
            str2 = conversationInfo.conversationShortId;
        }
        if ((i2 & 4) != 0) {
            i = conversationInfo.isGroup;
        }
        if ((i2 & 8) != 0) {
            str3 = conversationInfo.curUid;
        }
        if ((i2 & 16) != 0) {
            str4 = conversationInfo.otherUid;
        }
        return conversationInfo.copy(str, str2, i, str3, str4);
    }

    public final ConversationInfo copy(String str, String str2, int i, String curUid, String str3) {
        o.LJIIIZ(curUid, "curUid");
        return new ConversationInfo(str, str2, i, curUid, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationInfo)) {
            return false;
        }
        ConversationInfo conversationInfo = (ConversationInfo) obj;
        return o.LJ(this.conversationId, conversationInfo.conversationId) && o.LJ(this.conversationShortId, conversationInfo.conversationShortId) && this.isGroup == conversationInfo.isGroup && o.LJ(this.curUid, conversationInfo.curUid) && o.LJ(this.otherUid, conversationInfo.otherUid);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.conversationId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.conversationShortId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.curUid, (((i2 + hashCode2) * 31) + this.isGroup) * 31, 31);
        String str3 = this.otherUid;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return LJ + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConversationInfo(conversationId=");
        LIZ.append(this.conversationId);
        LIZ.append(", conversationShortId=");
        LIZ.append(this.conversationShortId);
        LIZ.append(", isGroup=");
        LIZ.append(this.isGroup);
        LIZ.append(", curUid=");
        LIZ.append(this.curUid);
        LIZ.append(", otherUid=");
        return q.LIZIZ(LIZ, this.otherUid, ')', LIZ);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationShortId() {
        return this.conversationShortId;
    }

    public final String getCurUid() {
        return this.curUid;
    }

    public final String getOtherUid() {
        return this.otherUid;
    }

    public final int isGroup() {
        return this.isGroup;
    }

    public ConversationInfo(String str, String str2, int i, String curUid, String str3) {
        o.LJIIIZ(curUid, "curUid");
        this.conversationId = str;
        this.conversationShortId = str2;
        this.isGroup = i;
        this.curUid = curUid;
        this.otherUid = str3;
    }

    public /* synthetic */ ConversationInfo(String str, String str2, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, (i2 & 16) != 0 ? null : str4);
    }
}
