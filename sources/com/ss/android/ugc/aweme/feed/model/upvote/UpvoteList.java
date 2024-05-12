package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UpvoteList extends F9E implements Serializable {

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("item_id")
    public final String itemId;

    @InterfaceC65349Pkn("total")
    public final long total;

    @InterfaceC65349Pkn("upvotes")
    public final List<UpvoteStruct> upvotes;

    public UpvoteList() {
        this(null, 0L, false, 0L, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpvoteList copy$default(UpvoteList upvoteList, List list, long j, boolean z, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = upvoteList.upvotes;
        }
        if ((i & 2) != 0) {
            j = upvoteList.cursor;
        }
        if ((i & 4) != 0) {
            z = upvoteList.hasMore;
        }
        if ((i & 8) != 0) {
            j2 = upvoteList.total;
        }
        if ((i & 16) != 0) {
            str = upvoteList.itemId;
        }
        return upvoteList.copy(list, j, z, j2, str);
    }

    public final UpvoteList copy(List<UpvoteStruct> upvotes, long j, boolean z, long j2, String itemId) {
        o.LJIIIZ(upvotes, "upvotes");
        o.LJIIIZ(itemId, "itemId");
        return new UpvoteList(upvotes, j, z, j2, itemId);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.upvotes, Long.valueOf(this.cursor), Boolean.valueOf(this.hasMore), Long.valueOf(this.total), this.itemId};
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final long getTotal() {
        return this.total;
    }

    public final List<UpvoteStruct> getUpvotes() {
        return this.upvotes;
    }

    public UpvoteList(List<UpvoteStruct> upvotes, long j, boolean z, long j2, String itemId) {
        o.LJIIIZ(upvotes, "upvotes");
        o.LJIIIZ(itemId, "itemId");
        this.upvotes = upvotes;
        this.cursor = j;
        this.hasMore = z;
        this.total = j2;
        this.itemId = itemId;
    }

    public UpvoteList(List list, long j, boolean z, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z, (i & 8) == 0 ? j2 : 0L, (i & 16) != 0 ? "" : str);
    }
}
