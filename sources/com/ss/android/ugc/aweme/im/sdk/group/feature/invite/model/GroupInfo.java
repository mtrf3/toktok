package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupInfo implements Serializable {

    @InterfaceC65349Pkn("avatar_url")
    public String avatarUrl;

    @InterfaceC65349Pkn("conversation_id")
    public String conversationId;

    @InterfaceC65349Pkn("conversation_short_id")
    public String conversationShortId;

    @InterfaceC65349Pkn("group_size")
    public Integer groupSize;

    @InterfaceC65349Pkn("name")
    public String name;

    /* JADX WARN: Multi-variable type inference failed */
    public GroupInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GroupInfo copy$default(GroupInfo groupInfo, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupInfo.conversationId;
        }
        if ((i & 2) != 0) {
            str2 = groupInfo.conversationShortId;
        }
        if ((i & 4) != 0) {
            str3 = groupInfo.name;
        }
        if ((i & 8) != 0) {
            str4 = groupInfo.avatarUrl;
        }
        if ((i & 16) != 0) {
            num = groupInfo.groupSize;
        }
        return groupInfo.copy(str, str2, str3, str4, num);
    }

    public final GroupInfo copy(String str, String str2, String str3, String str4, Integer num) {
        return new GroupInfo(str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupInfo)) {
            return false;
        }
        GroupInfo groupInfo = (GroupInfo) obj;
        return o.LJ(this.conversationId, groupInfo.conversationId) && o.LJ(this.conversationShortId, groupInfo.conversationShortId) && o.LJ(this.name, groupInfo.name) && o.LJ(this.avatarUrl, groupInfo.avatarUrl) && o.LJ(this.groupSize, groupInfo.groupSize);
    }

    public int hashCode() {
        String str = this.conversationId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.conversationShortId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.avatarUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.groupSize;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupInfo(conversationId=");
        LIZ.append(this.conversationId);
        LIZ.append(", conversationShortId=");
        LIZ.append(this.conversationShortId);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", avatarUrl=");
        LIZ.append(this.avatarUrl);
        LIZ.append(", groupSize=");
        return s0.LIZJ(LIZ, this.groupSize, ')', LIZ);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationShortId() {
        return this.conversationShortId;
    }

    public final Integer getGroupSize() {
        return this.groupSize;
    }

    public final String getName() {
        return this.name;
    }

    public final void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setConversationShortId(String str) {
        this.conversationShortId = str;
    }

    public final void setGroupSize(Integer num) {
        this.groupSize = num;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public GroupInfo(String str, String str2, String str3, String str4, Integer num) {
        this.conversationId = str;
        this.conversationShortId = str2;
        this.name = str3;
        this.avatarUrl = str4;
        this.groupSize = num;
    }

    public /* synthetic */ GroupInfo(String str, String str2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? num : null);
    }
}
