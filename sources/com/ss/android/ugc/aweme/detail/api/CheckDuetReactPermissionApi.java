package com.ss.android.ugc.aweme.detail.api;

import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.duet.CheckDuetReactPermissionResponse;

/* loaded from: classes8.dex */
public final class CheckDuetReactPermissionApi {
    public static final String LIZ;

    /* loaded from: classes8.dex */
    public interface CheckDuetReactPermissionRequest {
        @E8L("/aweme/v1/permission/check/")
        InterfaceC37276Ek4<CheckDuetReactPermissionResponse> checkDuetReactPermission(@InterfaceC64986Pew("aweme_id") String str, @InterfaceC64986Pew("check_type") int i);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append("api-va.tiktokv.com");
        LIZ = X1D.LIZIZ(LIZ2);
    }
}
