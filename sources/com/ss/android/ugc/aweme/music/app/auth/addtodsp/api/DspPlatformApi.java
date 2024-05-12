package com.ss.android.ugc.aweme.music.app.auth.addtodsp.api;

import X.E8L;
import X.E8M;
import X.InterfaceC195787mI;
import X.InterfaceC64986Pew;
import X.InterfaceC64987Pex;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlatformListResponse;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.UpdateDspPlatformResponse;

/* loaded from: classes34.dex */
public interface DspPlatformApi {
    @E8L("/tiktok/music/tt_to_dsp/platform/list/v1")
    Object getDspPlatformList(@InterfaceC64986Pew("offset_str") String str, InterfaceC67352kd<? super DspPlatformListResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E8M("/tiktok/music/tt_to_dsp/platform/update/v1")
    Object updateDspPlatform(@InterfaceC64987Pex("platform") int i, @InterfaceC64987Pex("action") int i2, @InterfaceC64987Pex("refresh_token") String str, InterfaceC67352kd<? super UpdateDspPlatformResponse> interfaceC67352kd);
}
