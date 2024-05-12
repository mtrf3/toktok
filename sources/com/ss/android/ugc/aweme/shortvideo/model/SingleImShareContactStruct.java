package com.ss.android.ugc.aweme.shortvideo.model;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SingleImShareContactStruct extends ImShareContactStruct {
    public String uid = "";
    public String secUid = "";
    public int followStatus = -1;
    public String nickname = "";
    public String remarkName = "";

    @Override // com.ss.android.ugc.aweme.shortvideo.model.ImShareContactStruct
    public String getDisplayName() {
        if (this.remarkName.length() > 0) {
            return this.remarkName;
        }
        return this.nickname;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getRemarkName() {
        return this.remarkName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setNickname(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.nickname = str;
    }

    public final void setRemarkName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.remarkName = str;
    }

    public final void setSecUid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.secUid = str;
    }

    public final void setUid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.uid = str;
    }
}
