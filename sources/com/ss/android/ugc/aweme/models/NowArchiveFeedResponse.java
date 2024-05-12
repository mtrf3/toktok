package com.ss.android.ugc.aweme.models;

import X.C61878OQg;
import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowArchiveFeedResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final List<Aweme> data;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("next_cursor")
    public final long nextCursor;

    @InterfaceC65349Pkn("pre_cursor")
    public final long prevCursor;

    public NowArchiveFeedResponse() {
        this(false, 0L, 0L, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NowArchiveFeedResponse) {
            return C78966Uyw.LJIIIZ(((NowArchiveFeedResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.hasMore), Long.valueOf(this.prevCursor), Long.valueOf(this.nextCursor), this.data};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("NowArchiveFeedResponse:%s,%s,%s,%s", getObjects());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NowArchiveFeedResponse(boolean z, long j, long j2, List<? extends Aweme> data) {
        o.LJIIIZ(data, "data");
        this.hasMore = z;
        this.prevCursor = j;
        this.nextCursor = j2;
        this.data = data;
    }

    public NowArchiveFeedResponse(boolean z, long j, long j2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) == 0 ? j2 : 0L, (i & 8) != 0 ? C61878OQg.INSTANCE : list);
    }
}
