package com.ss.android.ugc.aweme.paidcontent.api;

import X.AbstractC73638SvC;
import X.C254389yc;
import X.E4T;
import X.EKC;
import X.InterfaceC27211Am7;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public interface PromoteApi {
    public static final C254389yc LIZ = C254389yc.LIZ;

    @E4T("/tiktok/v1/creator/record_event")
    @EKC({"Content-Type: application/json"})
    AbstractC73638SvC<BaseResponse> logPromoteImpression(@InterfaceC27211Am7 PromoteImpressionEvent promoteImpressionEvent);
}
