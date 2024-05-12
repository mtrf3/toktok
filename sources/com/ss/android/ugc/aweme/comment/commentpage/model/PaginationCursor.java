package com.ss.android.ugc.aweme.comment.commentpage.model;

/* loaded from: classes4.dex */
public final class PaginationCursor {
    public long cursor;
    public long offset;

    public final long getCursor() {
        return this.cursor;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setOffset(long j) {
        this.offset = j;
    }

    public PaginationCursor(long j, long j2) {
        this.cursor = j;
        this.offset = j2;
    }
}
