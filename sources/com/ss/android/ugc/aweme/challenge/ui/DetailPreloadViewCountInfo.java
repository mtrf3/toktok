package com.ss.android.ugc.aweme.challenge.ui;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes15.dex */
public final class DetailPreloadViewCountInfo extends F9E {

    @InterfaceC65349Pkn("detail_preload_vh_view_max_count")
    public final int maxCount;

    @InterfaceC65349Pkn("detail_preload_vh_view_min_count")
    public final int minCount;

    public static /* synthetic */ DetailPreloadViewCountInfo copy$default(DetailPreloadViewCountInfo detailPreloadViewCountInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = detailPreloadViewCountInfo.minCount;
        }
        if ((i3 & 2) != 0) {
            i2 = detailPreloadViewCountInfo.maxCount;
        }
        return detailPreloadViewCountInfo.copy(i, i2);
    }

    public final DetailPreloadViewCountInfo copy(int i, int i2) {
        return new DetailPreloadViewCountInfo(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.minCount), Integer.valueOf(this.maxCount)};
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final int getMinCount() {
        return this.minCount;
    }

    public DetailPreloadViewCountInfo(int i, int i2) {
        this.minCount = i;
        this.maxCount = i2;
    }
}
