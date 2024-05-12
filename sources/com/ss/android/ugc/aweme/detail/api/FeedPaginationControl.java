package com.ss.android.ugc.aweme.detail.api;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeedPaginationControl implements Serializable {

    @InterfaceC65349Pkn("count")
    public long count;

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("page_token")
    public String pageToken;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FeedPaginationControl() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            r6 = 7
            r0 = r8
            r3 = r1
            r7 = r5
            r0.<init>(r1, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.api.FeedPaginationControl.<init>():void");
    }

    public static /* synthetic */ FeedPaginationControl copy$default(FeedPaginationControl feedPaginationControl, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = feedPaginationControl.cursor;
        }
        if ((i & 2) != 0) {
            j2 = feedPaginationControl.count;
        }
        if ((i & 4) != 0) {
            str = feedPaginationControl.pageToken;
        }
        return feedPaginationControl.copy(j, j2, str);
    }

    public final FeedPaginationControl copy(long j, long j2, String str) {
        return new FeedPaginationControl(j, j2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedPaginationControl)) {
            return false;
        }
        FeedPaginationControl feedPaginationControl = (FeedPaginationControl) obj;
        return this.cursor == feedPaginationControl.cursor && this.count == feedPaginationControl.count && o.LJ(this.pageToken, feedPaginationControl.pageToken);
    }

    public int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.count, C16880lQ.LLJIJIL(this.cursor) * 31, 31);
        String str = this.pageToken;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZJ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedPaginationControl(cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", count=");
        LIZ.append(this.count);
        LIZ.append(", pageToken=");
        return q.LIZIZ(LIZ, this.pageToken, ')', LIZ);
    }

    public final long getCount() {
        return this.count;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final void setCount(long j) {
        this.count = j;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setPageToken(String str) {
        this.pageToken = str;
    }

    public FeedPaginationControl(long j, long j2, String str) {
        this.cursor = j;
        this.count = j2;
        this.pageToken = str;
    }

    public /* synthetic */ FeedPaginationControl(long j, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 8L : j2, (i & 4) != 0 ? null : str);
    }
}
