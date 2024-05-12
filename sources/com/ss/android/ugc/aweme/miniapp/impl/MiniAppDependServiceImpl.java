package com.ss.android.ugc.aweme.miniapp.impl;

import X.C221108m2;
import X.C58096Mr6;
import X.C58597MzB;
import X.C59090NHa;
import X.C62822Ol8;
import X.C85999Xp5;
import X.EF7;
import X.NKA;
import X.NKB;
import X.NKC;
import X.NKE;
import X.NKF;
import X.NKG;
import X.NKH;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppDependService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MiniAppDependServiceImpl implements IMiniAppDependService {
    public final C62822Ol8 LIZ;

    public static IMiniAppDependService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IMiniAppDependService.class, false);
        if (LIZ != null) {
            return (IMiniAppDependService) LIZ;
        }
        if (C58096Mr6.L2 == null) {
            synchronized (IMiniAppDependService.class) {
                if (C58096Mr6.L2 == null) {
                    C58096Mr6.L2 = new MiniAppDependServiceImpl();
                }
            }
        }
        return C58096Mr6.L2;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppDependService
    public final NKH LJJLIIIJLJLI() {
        return (NKH) this.LIZ.getValue();
    }

    public MiniAppDependServiceImpl() {
        C221108m2.LIZIZ(C59090NHa.LJLIL);
        C221108m2.LIZIZ(NKA.LJLIL);
        this.LIZ = C221108m2.LIZIZ(NKC.LJLIL);
        C221108m2.LIZIZ(C58597MzB.LJLIL);
        C221108m2.LIZIZ(NKB.LJLIL);
        C221108m2.LIZIZ(NKF.LJLIL);
        C221108m2.LIZIZ(NKE.LJLIL);
        C221108m2.LIZIZ(NKG.LJLIL);
        o.LJIIIIZZ(C85999Xp5.LIZJ(EF7.LIZIZ(), null, null), "getLocaleSetting(getApplication())");
    }
}
