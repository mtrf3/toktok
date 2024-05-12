package com.ss.android.ugc.aweme.search.common.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TopHistoryInfo extends F9E {

    @InterfaceC65349Pkn("recent_del_top_history_list")
    public final List<RecentDelHistory> recentDelTopHistoryList;

    @InterfaceC65349Pkn("top_history_list")
    public final List<TopHistory> topHistoryList;

    /* JADX WARN: Multi-variable type inference failed */
    public TopHistoryInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.topHistoryList, this.recentDelTopHistoryList};
    }

    public TopHistoryInfo(List<TopHistory> topHistoryList, List<RecentDelHistory> recentDelTopHistoryList) {
        o.LJIIIZ(topHistoryList, "topHistoryList");
        o.LJIIIZ(recentDelTopHistoryList, "recentDelTopHistoryList");
        this.topHistoryList = topHistoryList;
        this.recentDelTopHistoryList = recentDelTopHistoryList;
    }

    public static TopHistoryInfo L(TopHistoryInfo topHistoryInfo, List list) {
        List<RecentDelHistory> recentDelTopHistoryList = topHistoryInfo.recentDelTopHistoryList;
        o.LJIIIZ(recentDelTopHistoryList, "recentDelTopHistoryList");
        return new TopHistoryInfo(list, recentDelTopHistoryList);
    }

    public /* synthetic */ TopHistoryInfo(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }
}
