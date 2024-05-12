package com.ss.android.ugc.aweme.watch.history.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class WatchHistoryResponse extends BaseResponse {

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> awemeList;

    @InterfaceC65349Pkn("aweme_watch_history")
    public final List<String> awemeWatchHistory;

    @InterfaceC65349Pkn("has_more")
    public final Integer hasMore;

    @InterfaceC65349Pkn("min_cursor")
    public final String minCursor;

    /* JADX WARN: Multi-variable type inference failed */
    public WatchHistoryResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchHistoryResponse)) {
            return false;
        }
        WatchHistoryResponse watchHistoryResponse = (WatchHistoryResponse) obj;
        return o.LJ(this.minCursor, watchHistoryResponse.minCursor) && o.LJ(this.hasMore, watchHistoryResponse.hasMore) && o.LJ(this.awemeList, watchHistoryResponse.awemeList) && o.LJ(this.awemeWatchHistory, watchHistoryResponse.awemeWatchHistory);
    }

    public final int hashCode() {
        String str = this.minCursor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.hasMore;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Aweme> list = this.awemeList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.awemeWatchHistory;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WatchHistoryResponse(minCursor=");
        LIZ.append(this.minCursor);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", awemeList=");
        LIZ.append(this.awemeList);
        LIZ.append(", awemeWatchHistory=");
        return C1NE.LIZIZ(LIZ, this.awemeWatchHistory, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchHistoryResponse(String str, Integer num, List<? extends Aweme> list, List<String> list2) {
        this.minCursor = str;
        this.hasMore = num;
        this.awemeList = list;
        this.awemeWatchHistory = list2;
    }

    public /* synthetic */ WatchHistoryResponse(String str, Integer num, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
