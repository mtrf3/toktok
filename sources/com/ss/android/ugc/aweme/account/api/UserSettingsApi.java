package com.ss.android.ugc.aweme.account.api;

import X.C10K;
import X.C221108m2;
import X.C62822Ol8;
import X.C84720XMu;
import X.E4T;
import X.InterfaceC195757mF;
import X.InterfaceC64987Pex;

/* loaded from: classes16.dex */
public final class UserSettingsApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C84720XMu.LJLIL);

    /* loaded from: classes16.dex */
    public interface Api {
        @InterfaceC195757mF
        @E4T("/passport/user/settings/")
        C10K<UserSettingsResponse> userSettings(@InterfaceC64987Pex("category") int i, @InterfaceC64987Pex("new_nickname") String str);
    }

    public static C10K LIZ(int i, String str) {
        return ((Api) LIZ.getValue()).userSettings(i, str);
    }
}
