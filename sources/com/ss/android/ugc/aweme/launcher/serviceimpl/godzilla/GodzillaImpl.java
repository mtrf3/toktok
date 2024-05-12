package com.ss.android.ugc.aweme.launcher.serviceimpl.godzilla;

import X.C36722Eb8;
import X.C88074YhS;
import X.F88;
import X.F8E;
import X.F8G;
import X.FKM;
import com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi;

/* loaded from: classes7.dex */
public final class GodzillaImpl implements IGodzillaApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi
    public final void LIZ() {
        if (((Boolean) C88074YhS.LIZLLL.getValue()).booleanValue()) {
            F8E.LIZ(FKM.LIZ());
        }
        if (F8E.LIZ) {
            if (F8G.LIZJ != null) {
                F8G.LIZJ.LIZ(F88.REGISTER_EXCEPTION);
                if (((Boolean) C88074YhS.LJIIJ.getValue()).booleanValue() && FKM.LIZ() != null) {
                    new C36722Eb8(FKM.LIZ()).LIZLLL();
                    return;
                }
                return;
            }
            throw new RuntimeException("Godzilla.init() method must be called first");
        }
    }
}
