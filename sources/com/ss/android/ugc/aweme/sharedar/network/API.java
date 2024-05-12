package com.ss.android.ugc.aweme.sharedar.network;

import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC37276Ek4;
import X.InterfaceC64992Pf2;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;

/* loaded from: classes5.dex */
public interface API {
    @InterfaceC195787mI
    @E4T("/tiktok/v1/shareshoot/invite/")
    InterfaceC37276Ek4<BaseResponse> inviteFriend(@InterfaceC64992Pf2 Map<String, String> map);
}
