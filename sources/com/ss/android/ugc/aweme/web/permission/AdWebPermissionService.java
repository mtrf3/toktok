package com.ss.android.ugc.aweme.web.permission;

import X.C58096Mr6;
import X.C61011Nx1;
import X.C78983UzD;
import X.C84763XOl;
import X.EF7;
import X.NK2;
import X.OHI;
import Y.AObjectS45S0101000_13;
import android.app.Activity;
import android.content.Context;
import android.webkit.PermissionRequest;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdWebPermissionService implements IAdWebPermissionService {
    public static IAdWebPermissionService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IAdWebPermissionService.class, false);
        if (LIZ != null) {
            return (IAdWebPermissionService) LIZ;
        }
        if (C58096Mr6.j8 == null) {
            synchronized (IAdWebPermissionService.class) {
                if (C58096Mr6.j8 == null) {
                    C58096Mr6.j8 = new AdWebPermissionService();
                }
            }
        }
        return C58096Mr6.j8;
    }

    @Override // com.ss.android.ugc.aweme.web.permission.IAdWebPermissionService
    public final int LIZIZ() {
        OHI ohi = OHI.LIZ;
        Context LIZIZ = EF7.LIZIZ();
        ohi.getClass();
        if (OHI.LJ(LIZIZ, "android.permission.CAMERA")) {
            return 3;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            C78983UzD.LJIILL("AdWebPermissionUtils_no_activity");
            return 0;
        }
        if (OHI.LJI(LJIIIIZZ, "android.permission.CAMERA")) {
            return 2;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.web.permission.IAdWebPermissionService
    public final void LIZ(PermissionRequest request, NK2 nk2, boolean z, AObjectS45S0101000_13 aObjectS45S0101000_13) {
        o.LJIIIZ(request, "request");
        C61011Nx1.LIZ(request, nk2, z, aObjectS45S0101000_13);
    }
}
