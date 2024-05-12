package com.ss.android.ugc.aweme.trending.ui.billboardpage.api;

import X.AbstractC73672Svk;
import X.C118134kL;
import X.E8L;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.list.TrendingBillboardResp;

/* loaded from: classes2.dex */
public interface TrendingBillboardApi {
    public static final C118134kL LIZ = C118134kL.LIZ;

    @E8L("tiktok/trends/billboard/v1/")
    AbstractC73672Svk<TrendingBillboardResp> getBillboardInfo();
}
