package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195727mC;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes10.dex */
public interface ScreenTimeUploadApi {
    @E8M("/tiktok/v1/app_open_times/upload/")
    AbstractC73672Svk<BaseResponse> uploadAppOpenedTimes(@InterfaceC195727mC AppOpenedTimesData appOpenedTimesData);

    @E8M("/tiktok/v1/screen_time/upload/")
    AbstractC73672Svk<BaseResponse> uploadScreenTime(@InterfaceC195727mC ScreenTimeData screenTimeData);
}
