package com.ss.android.ugc.aweme.opt;

import X.AV1;
import X.EOA;
import X.EOB;
import X.EOC;
import X.EOD;
import X.EOE;
import X.EOH;
import X.EOJ;
import X.EOL;
import X.HG3;
import X.RBX;
import X.T16;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BackendApiCallerOptService implements IBackendApiCallerOptService {
    public static final /* synthetic */ int LIZJ = 0;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public volatile Boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final boolean LIZ() {
        LJ(false);
        return o.LJ(this.LIZIZ, Boolean.FALSE) && ((String[]) EOL.LIZ.getValue()).length != 0;
    }

    public BackendApiCallerOptService() {
        if (!LIZ()) {
            return;
        }
        HG3.LJIIL();
        IAccountService iAccountService = HG3.LJLJL;
        if (iAccountService == null) {
            return;
        }
        iAccountService.LJIILJJIL(new EOE(this));
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final void LIZJ() {
        IAccountUserService LJIILL;
        if (!LIZ() || this.LIZ.get()) {
            return;
        }
        long j = EOJ.LIZ().getLong("key_last_store_ts", 0L);
        String installId = AppLog.getInstallId();
        if (installId == null) {
            installId = "";
        }
        String string = EOJ.LIZ().getString("key_data_identify", "");
        o.LJIIIIZZ(string, "keva.getString(KEY_DATA_IDENTIFY, \"\")");
        if (((o.LJ(string, "") || o.LJ(installId, string)) && j != 0 && System.currentTimeMillis() - j < 518400000) || (LJIILL = HG3.LJIILL()) == null || !((RBX) LJIILL).isLogin() || !this.LIZ.compareAndSet(false, true)) {
            return;
        }
        ((IBackendParamsFetchApi) EOH.LIZ.getValue()).fetchParams().LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(new EOD(installId), EOC.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final void LIZLLL() {
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null && ((RBX) LJIILL).isLogin()) {
            LJ(false);
            if (o.LJ(this.LIZIZ, Boolean.TRUE)) {
                return;
            }
            ((ILocationApi) EOH.LIZIZ.getValue()).activityDetect("2", ujb.o.LJJJJZ("https://location.tiktokv.com", ".com", ".v6.com", false)).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(EOB.LJLIL, EOA.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final boolean LIZIZ(String str) {
        if (str == null || !LIZ()) {
            return false;
        }
        for (String str2 : (String[]) EOL.LIZ.getValue()) {
            if (o.LJ(str2, str)) {
                if (str2 == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void LJ(boolean z) {
        boolean z2;
        if (this.LIZIZ == null || z) {
            if (AV1.LJIILLIIL() || HG3.LJIILL().isChildrenMode()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LIZIZ = Boolean.valueOf(z2);
        }
    }
}
