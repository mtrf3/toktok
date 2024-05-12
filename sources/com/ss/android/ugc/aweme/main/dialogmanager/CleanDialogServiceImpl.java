package com.ss.android.ugc.aweme.main.dialogmanager;

import X.AbstractC73672Svk;
import X.C67630QgU;
import X.C73969T1h;
import X.C77334UWs;
import X.C84763XOl;
import X.InterfaceC64592gB;
import X.T16;
import Y.AfS22S1200000_13;
import Y.IDuS323S0100000_13;
import android.app.Activity;
import com.ss.android.ugc.aweme.clean.ICleanDialogService;

/* loaded from: classes14.dex */
public final class CleanDialogServiceImpl implements ICleanDialogService {
    @Override // com.ss.android.ugc.aweme.clean.ICleanDialogService
    public final boolean LIZ() {
        if (System.currentTimeMillis() - C67630QgU.LIZ().getLong("last_check_storage_time", 0L) <= 604800000 || (C67630QgU.LIZ().getInt("show_storage_manager_count", 0) >= 3 && C67630QgU.LIZ().getInt("show_system_clean_count", 0) >= 3)) {
            return false;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            AbstractC73672Svk.LJIIJ(new IDuS323S0100000_13(LJIIIIZZ, 1)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS22S1200000_13(LJIIIIZZ, new C77334UWs(), 1), new InterfaceC64592gB() { // from class: X.2P5
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("CleanCacheDialog#show: ");
                    LIZ.append(((Throwable) obj).getMessage());
                    C36922EeM.LJ(X1D.LIZIZ(LIZ));
                }
            });
        }
        return true;
    }
}
