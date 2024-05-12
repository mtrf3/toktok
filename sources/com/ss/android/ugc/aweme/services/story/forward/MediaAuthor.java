package com.ss.android.ugc.aweme.services.story.forward;

import java.io.Serializable;

/* loaded from: classes8.dex */
public final class MediaAuthor implements Serializable {
    public final String authorSecId;
    public final String nickName;
    public final String renderName;
    public final String uid;

    public final String getAuthorSecId() {
        return this.authorSecId;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getRenderName() {
        return this.renderName;
    }

    public final String getUid() {
        return this.uid;
    }

    public MediaAuthor(String str, String str2, String str3, String str4) {
        this.nickName = str;
        this.uid = str2;
        this.authorSecId = str3;
        this.renderName = str4;
    }
}
