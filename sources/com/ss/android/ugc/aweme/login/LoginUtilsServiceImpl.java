package com.ss.android.ugc.aweme.login;

import X.C40384Ft6;
import X.C58096Mr6;
import android.os.Bundle;

/* loaded from: classes10.dex */
public class LoginUtilsServiceImpl implements ILoginUtilsService {
    public static ILoginUtilsService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ILoginUtilsService.class, false);
        if (LIZ != null) {
            return (ILoginUtilsService) LIZ;
        }
        if (C58096Mr6.z2 == null) {
            synchronized (ILoginUtilsService.class) {
                if (C58096Mr6.z2 == null) {
                    C58096Mr6.z2 = new LoginUtilsServiceImpl();
                }
            }
        }
        return C58096Mr6.z2;
    }

    @Override // com.ss.android.ugc.aweme.login.ILoginUtilsService
    public final void restartApp(Bundle bundle) {
        C40384Ft6.LIZIZ(bundle);
    }
}
