package com.ss.android.ugc.aweme.profile.widgets.api;

import X.AbstractC73672Svk;
import X.C252149v0;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public interface BAProfileGrowthShowApi {
    public static final C252149v0 LIZ = C252149v0.LIZ;

    @E8M("/tiktok/v1/ad/ba/profile/message/show/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> sendMessageIsShown(@InterfaceC64985Pev("message_id") String str);
}
