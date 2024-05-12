package com.ss.android.ugc.aweme.detail.api;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeedPagination implements Serializable {

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("page_token")
    public final String pageToken;

    @InterfaceC65349Pkn("total_count")
    public final Long totalCount;

    @InterfaceC65349Pkn("version")
    public final Long version;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedPagination() {
        this(false, 0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FeedPagination copy$default(FeedPagination feedPagination, boolean z, long j, Long l, Long l2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = feedPagination.hasMore;
        }
        if ((i & 2) != 0) {
            j = feedPagination.cursor;
        }
        if ((i & 4) != 0) {
            l = feedPagination.totalCount;
        }
        if ((i & 8) != 0) {
            l2 = feedPagination.version;
        }
        if ((i & 16) != 0) {
            str = feedPagination.pageToken;
        }
        return feedPagination.copy(z, j, l, l2, str);
    }

    public final FeedPagination copy(boolean z, long j, Long l, Long l2, String str) {
        return new FeedPagination(z, j, l, l2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedPagination)) {
            return false;
        }
        FeedPagination feedPagination = (FeedPagination) obj;
        return this.hasMore == feedPagination.hasMore && this.cursor == feedPagination.cursor && o.LJ(this.totalCount, feedPagination.totalCount) && o.LJ(this.version, feedPagination.version) && o.LJ(this.pageToken, feedPagination.pageToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        boolean z = this.hasMore;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LIZJ = JBR.LIZJ(this.cursor, r0 * 31, 31);
        Long l = this.totalCount;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        Long l2 = this.version;
        if (l2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.pageToken;
        if (str != null) {
            i = str.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedPagination(hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", totalCount=");
        LIZ.append(this.totalCount);
        LIZ.append(", version=");
        LIZ.append(this.version);
        LIZ.append(", pageToken=");
        return q.LIZIZ(LIZ, this.pageToken, ')', LIZ);
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final Long getTotalCount() {
        return this.totalCount;
    }

    public final Long getVersion() {
        return this.version;
    }

    public FeedPagination(boolean z, long j, Long l, Long l2, String str) {
        this.hasMore = z;
        this.cursor = j;
        this.totalCount = l;
        this.version = l2;
        this.pageToken = str;
    }

    public /* synthetic */ FeedPagination(boolean z, long j, Long l, Long l2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) == 0 ? str : null);
    }
}
