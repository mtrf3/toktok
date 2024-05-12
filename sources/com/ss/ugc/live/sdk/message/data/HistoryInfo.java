package com.ss.ugc.live.sdk.message.data;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class HistoryInfo {
    public String commentCursor = "";
    public boolean hasMore;

    public final String getCommentCursor() {
        return this.commentCursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final void setCommentCursor(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.commentCursor = str;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }
}
