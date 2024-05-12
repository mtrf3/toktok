package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class StarCommentPushMessage extends CR6 {

    @InterfaceC65349Pkn("current")
    public StarCommentMessage current;

    @InterfaceC65349Pkn("next")
    public StarCommentMessage next;

    @InterfaceC65349Pkn("queue_version")
    public int queueVersion;

    public StarCommentPushMessage() {
        this.type = EnumC31509CYf.STAR_COMMENT_PUSH_MESSAGE;
    }
}
