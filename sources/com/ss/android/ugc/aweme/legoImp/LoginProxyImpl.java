package com.ss.android.ugc.aweme.legoImp;

import X.C58096Mr6;
import com.ss.android.ugc.aweme.login.ILoginProxy;
import com.ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent;

/* loaded from: classes9.dex */
public final class LoginProxyImpl implements ILoginProxy {
    public static ILoginProxy LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(ILoginProxy.class, false);
        if (LIZ != null) {
            return (ILoginProxy) LIZ;
        }
        if (C58096Mr6.f2 == null) {
            synchronized (ILoginProxy.class) {
                if (C58096Mr6.f2 == null) {
                    C58096Mr6.f2 = new LoginProxyImpl();
                }
            }
        }
        return C58096Mr6.f2;
    }

    @Override // com.ss.android.ugc.aweme.login.ILoginProxy
    public final I18nLoginActivityComponent LIZ() {
        return new I18nLoginActivityComponent();
    }
}
