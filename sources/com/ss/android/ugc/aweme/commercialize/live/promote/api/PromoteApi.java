package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.EKC;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes7.dex */
public interface PromoteApi {
    @E8L("/aweme/v1/promote/api/eligible/")
    AbstractC73672Svk<PromoteEligibleCheckModel> checkUserPromoteEligible();

    @E8M
    @EKC({"Content-Type: application/json"})
    AbstractC73672Svk<BaseResponse> postPromoteClickToFE(@InterfaceC195747mE String str, @InterfaceC195727mC PromoteEventData promoteEventData);
}
