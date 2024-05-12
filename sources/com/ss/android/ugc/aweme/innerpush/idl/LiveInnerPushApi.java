package com.ss.android.ugc.aweme.innerpush.idl;

import X.C10K;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes12.dex */
public interface LiveInnerPushApi {
    @InterfaceC195787mI
    @E4T("/cloudpush/callback/in_app_notification/")
    C10K<BaseResponse> reportLiveInnerPush(@InterfaceC64987Pex("client_time") Long l, @InterfaceC64987Pex("rule_id") Long l2, @InterfaceC64987Pex("group_id") Long l3, @InterfaceC64987Pex("sender") String str, @InterfaceC64987Pex("gd_label") String str2, @InterfaceC64987Pex("o_url") String str3);
}
