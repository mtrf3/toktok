package com.ss.android.ugc.aweme.brdatagift;

import X.AV1;
import X.C10K;
import X.C16880lQ;
import X.C39405FdJ;
import X.C39571Ffz;
import X.C48203Ivv;
import X.C58096Mr6;
import X.C58512Rj;
import X.C61601OFp;
import X.C61608OFw;
import X.EF7;
import Y.ACallableS113S0100000_10;
import Y.AgS113S0200000_10;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import com.ss.android.ugc.aweme.api.IBemobiGiftService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes11.dex */
public final class BemobiGiftServiceImpl implements IBemobiGiftService {
    public static IBemobiGiftService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IBemobiGiftService.class, false);
        if (LIZ != null) {
            return (IBemobiGiftService) LIZ;
        }
        if (C58096Mr6.LLJJJIL == null) {
            synchronized (IBemobiGiftService.class) {
                if (C58096Mr6.LLJJJIL == null) {
                    C58096Mr6.LLJJJIL = new BemobiGiftServiceImpl();
                }
            }
        }
        return C58096Mr6.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.api.IBemobiGiftService
    public final void LIZ(String str) {
        if (!C58512Rj.LIZ().getEnable() || AV1.LJIILLIIL()) {
            return;
        }
        Callable callable = new Callable() { // from class: X.6uR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                FMX.onEventV3("bemobi_setting_enable");
                return C76800UCe.LIZ;
            }
        };
        ExecutorService executorService = C10K.LJI;
        C10K.LIZIZ(callable, executorService, null);
        if (!C48203Ivv.LIZLLL(EF7.LIZIZ())) {
            return;
        }
        try {
            String str2 = "";
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(EF7.LIZIZ(), "phone");
                if (telephonyManager != null) {
                    C39405FdJ.LJFF.getClass();
                    str2 = C39571Ffz.LJI(telephonyManager);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (!C58512Rj.LIZ().getMccMncList().contains(str2)) {
                return;
            }
            C10K.LIZIZ(new Callable() { // from class: X.6uT
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    FMX.onEventV3("ies_network_speed_request");
                    return C76800UCe.LIZ;
                }
            }, executorService, null);
            C61608OFw c61608OFw = C61608OFw.LIZLLL;
            if (!c61608OFw.LIZJ) {
                c61608OFw.LIZJ = true;
                C10K.LIZIZ(new ACallableS113S0100000_10(SystemClock.elapsedRealtime(), 20), executorService, null).LJ(new AgS113S0200000_10(2), C10K.LJIIIIZZ, null);
            }
            C61601OFp.LIZJ = str;
        } catch (Exception unused) {
        }
    }
}
