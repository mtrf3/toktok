package com.ss.android.ugc.localnotify;

import X.C39263Fb1;
import X.C47629Imf;
import X.C67247QaJ;
import X.C67248QaK;
import X.C67249QaL;
import X.C67251QaN;
import X.C67257QaT;
import X.DJ9;
import X.IVZ;
import X.ORZ;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.localnotifyapi.INonLoginNotifyApi;

/* loaded from: classes12.dex */
public final class NonLoginNotifyService implements INonLoginNotifyApi {
    public static int LIZ = -1;

    @Override // com.ss.android.ugc.localnotifyapi.INonLoginNotifyApi
    public final boolean LIZ() {
        return C67257QaT.LIZJ(0) == DJ9.LIZ().getLong("last_launched_date_ts", 0L);
    }

    public static void LIZJ() {
        boolean LIZJ = IVZ.LIZJ();
        if (LIZJ != LIZ) {
            if (!IVZ.LIZJ()) {
                C67249QaL.LIZ().LIZJ();
            } else {
                C67249QaL.LIZ().LJ();
                long LIZJ2 = C67257QaT.LIZJ(0);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("updateLastLaunchDate(");
                LIZ2.append(LIZJ2);
                LIZ2.append(')');
                C47629Imf.LIZ("NonLoginNotifyService", X1D.LIZIZ(LIZ2));
                DJ9.LIZ().storeLong("last_launched_date_ts", LIZJ2);
            }
            LIZ = LIZJ ? 1 : 0;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("checkStatusChange() - isLocalPush status changed! ");
            LIZ3.append(LIZ);
            C47629Imf.LIZ("NonLoginNotifyService", X1D.LIZIZ(LIZ3));
        }
    }

    @Override // com.ss.android.ugc.localnotifyapi.INonLoginNotifyApi
    public final void LIZIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initNonLogin() - ");
        LIZ2.append(LIZ);
        C47629Imf.LIZ("NonLoginNotifyService", X1D.LIZIZ(LIZ2));
        if (LIZ == -1) {
            SettingsManager.LIZLLL().LJIIIZ(new C67251QaN(this));
            AccountService.LJIJ().LJIILJJIL(C67247QaJ.LJLIL);
            C39263Fb1.LJIIIZ = ORZ.LLIIJI(new C67248QaK(), C39263Fb1.LJIIIZ);
        }
        LIZJ();
    }
}
