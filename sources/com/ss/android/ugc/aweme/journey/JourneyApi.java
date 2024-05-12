package com.ss.android.ugc.aweme.journey;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes2.dex */
public interface JourneyApi {
    @InterfaceC195787mI
    @E4T("aweme/v1/user/interest/select/")
    AbstractC73672Svk<BaseResponse> uploadInterest(@InterfaceC64987Pex("selectedInterestList") String str, @InterfaceC64987Pex("type") String str2, @InterfaceC64987Pex("selectedTopicList") String str3);
}
