package com.ss.android.ugc.aweme.buildconfigdiff;

import X.C76L;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;

/* loaded from: classes2.dex */
public interface UnlockStickerApiBcd$RetrofitApi {
    @InterfaceC195787mI
    @E4T("https://api-va.tiktokv.com/aweme/v1/ug/event/record/")
    C76L<Object> unlockSticker(@InterfaceC64987Pex("event_type") int i, @InterfaceC64987Pex("extra") String str);
}
