package X;

import Y.AfS36S0101000_5;
import Y.IDHandlerS23S0100000_11;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes10.dex */
public final class LUZ {
    public static volatile LUZ LIZIZ;
    public boolean LIZ;

    public final void LIZ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        HandlerThread LIZ = C06M.LIZ("power_handler");
        new Handler(LIZ.getLooper());
        synchronized (C54333LUb.LIZ) {
            if (!C54333LUb.LIZIZ) {
                C54333LUb.LIZIZ = true;
                Context LIZIZ2 = EF7.LIZIZ();
                int intValue = ((Number) C2303092c.LIZ.getValue()).intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 4) {
                            if (C48837JEr.LIZ()) {
                                C54333LUb.LIZJ = C48837JEr.LIZIZ(LIZIZ2);
                            }
                        } else {
                            C54333LUb.LIZJ = true;
                        }
                    } else {
                        C54333LUb.LIZJ = C48837JEr.LIZIZ(LIZIZ2);
                    }
                } else {
                    C54333LUb.LIZJ = C48833JEn.LIZLLL;
                }
            }
        }
        C64432PQm.LIZIZ().LIZ();
        C54334LUc LIZ2 = C54334LUc.LIZ();
        Looper looper = LIZ.getLooper();
        if (!LIZ2.LIZ) {
            PR9 pr9 = new PR9(looper);
            IDHandlerS23S0100000_11 iDHandlerS23S0100000_11 = new IDHandlerS23S0100000_11(pr9, pr9.LIZ, 2);
            pr9.LJFF = iDHandlerS23S0100000_11;
            iDHandlerS23S0100000_11.sendEmptyMessageDelayed(80, 30000L);
            LIZ2.LIZ = true;
        }
        LUX LIZIZ3 = LUX.LIZIZ();
        Looper looper2 = LIZ.getLooper();
        if (!LIZIZ3.LIZ) {
            LIZIZ3.LJFF = new LUW(LIZIZ3, looper2);
            LNU LIZ3 = LNU.LIZ();
            LIZ3.LIZ = new LNW(LIZIZ3);
            if (!TextUtils.isEmpty(LIZ3.LIZIZ)) {
                LNY lny = LIZ3.LIZ;
                String str = LIZ3.LIZIZ;
                LUX lux = (LUX) ((LNW) lny).LIZ;
                if (!TextUtils.equals(str, lux.LIZIZ)) {
                    lux.LIZJ = lux.LIZIZ;
                    lux.LIZIZ = str;
                    lux.LIZLLL();
                }
            }
            C84763XOl.LJI().LJJJJZI(new AfS36S0101000_5(3, LIZIZ3, 23));
            LIZIZ3.LIZ = true;
            LIZIZ3.LIZLLL();
        }
        C54332LUa LIZ4 = C54332LUa.LIZ();
        LIZ4.getClass();
        LUX.LIZIZ().LIZJ(LIZ4.LIZ);
    }
}
