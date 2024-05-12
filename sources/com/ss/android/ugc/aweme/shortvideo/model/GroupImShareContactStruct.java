package com.ss.android.ugc.aweme.shortvideo.model;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class GroupImShareContactStruct extends ImShareContactStruct {
    public String conversationName = "";
    public int groupMemberCount;
    public boolean newGroupAvatar;

    public final String getConversationName() {
        return this.conversationName;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.model.ImShareContactStruct
    public String getDisplayName() {
        return this.conversationName;
    }

    public final int getGroupMemberCount() {
        return this.groupMemberCount;
    }

    public final boolean getNewGroupAvatar() {
        return this.newGroupAvatar;
    }

    public final void setConversationName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.conversationName = str;
    }

    public final void setGroupMemberCount(int i) {
        this.groupMemberCount = i;
    }

    public final void setNewGroupAvatar(boolean z) {
        this.newGroupAvatar = z;
    }
}
