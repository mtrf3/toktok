package com.ss.android.ugc.aweme.shortvideo.model;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class ImShareContactStruct implements Serializable {
    public UrlModel avatar = new UrlModel();
    public String conversationId = "";

    public abstract String getDisplayName();

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final void setAvatar(UrlModel urlModel) {
        o.LJIIIZ(urlModel, "<set-?>");
        this.avatar = urlModel;
    }

    public final void setConversationId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.conversationId = str;
    }
}
