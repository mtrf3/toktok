package com.ss.android.ugc.now.interaction.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.List;

/* loaded from: classes4.dex */
public final class CommentItemList extends BaseCommentResponse {

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("is_downgrade")
    public boolean isDowngrade;

    @InterfaceC65349Pkn("has_more")
    public int isHasMore;

    @InterfaceC65349Pkn("comments")
    public List<? extends Comment> items;

    @InterfaceC65349Pkn("total")
    public long total;

    /* renamed from: isHasMore, reason: collision with other method in class */
    public final boolean m197isHasMore() {
        if (this.isHasMore == 1) {
            return true;
        }
        return false;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final List<Comment> getItems() {
        return this.items;
    }

    public final long getTotal() {
        return this.total;
    }

    public final boolean isDowngrade() {
        return this.isDowngrade;
    }

    public final int isHasMore() {
        return this.isHasMore;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setDowngrade(boolean z) {
        this.isDowngrade = z;
    }

    public final void setHasMore(int i) {
        this.isHasMore = i;
    }

    public final void setItems(List<? extends Comment> list) {
        this.items = list;
    }

    public final void setTotal(long j) {
        this.total = j;
    }
}
