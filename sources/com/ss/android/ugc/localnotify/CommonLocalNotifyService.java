package com.ss.android.ugc.localnotify;

import X.C34445DfV;
import X.C47629Imf;
import X.C67249QaL;
import X.C67250QaM;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.localnotifyapi.ILocalNotifyApi;

/* loaded from: classes12.dex */
public final class CommonLocalNotifyService implements ILocalNotifyApi {
    public static int LIZ = -1;

    public static void LIZJ() {
        boolean z = C34445DfV.LIZ;
        if (z != LIZ) {
            if (!z) {
                C67249QaL.LIZ().LJFF();
            } else {
                C67249QaL.LIZ().LIZ();
            }
            LIZ = z ? 1 : 0;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("checkStatusChange() - isLocalPush status changed! ");
            LIZ2.append(LIZ);
            C47629Imf.LIZ("LocalNotifyService", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.android.ugc.localnotifyapi.ILocalNotifyApi
    public final void LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initCommon() - ");
        LIZ2.append(LIZ);
        C47629Imf.LIZ("LocalNotifyService", X1D.LIZIZ(LIZ2));
        if (LIZ == -1) {
            SettingsManager.LIZLLL().LJIIIZ(new C67250QaM(this));
        }
        LIZJ();
    }

    @Override // com.ss.android.ugc.localnotifyapi.ILocalNotifyApi
    public final boolean LIZIZ() {
        return C34445DfV.LIZ;
    }
}
