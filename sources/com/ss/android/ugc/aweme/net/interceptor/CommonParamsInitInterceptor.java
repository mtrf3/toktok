package com.ss.android.ugc.aweme.net.interceptor;

import X.C64797Pbt;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;

/* loaded from: classes7.dex */
public final class CommonParamsInitInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        System.currentTimeMillis();
        SettingServiceImpl.LIZ().installCommonParams();
        F7S f7s = (F7S) fbz;
        return f7s.LIZ(f7s.LIZJ);
    }
}
