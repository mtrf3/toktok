package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api;

import X.AbstractC73672Svk;
import X.C71131Rvr;
import X.E4Q;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.GetEntranceInfoResponse;

/* loaded from: classes13.dex */
public interface OrderEntranceApi {
    public static final C71131Rvr LIZ = C71131Rvr.LIZ;

    @E4Q("/api/v1/trade/entrance/get")
    AbstractC73672Svk<GetEntranceInfoResponse> getEntranceInfo();
}
