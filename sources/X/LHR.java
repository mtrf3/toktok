package X;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class LHR {
    public static volatile boolean LIZJ;
    public static final LHR LIZ = new LHR();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicInteger LIZLLL = new AtomicInteger(0);
    public static final AtomicInteger LJ = new AtomicInteger(0);

    public final void LIZ() {
        boolean z = false;
        if (!LIZIZ.compareAndSet(false, true)) {
            return;
        }
        int nextInt = new Random().nextInt(1000) + 1;
        LHU lhu = LHU.LIZIZ;
        if (lhu.LIZJ() >= nextInt) {
            z = true;
        }
        LIZJ = z;
        boolean LIZIZ2 = lhu.LIZIZ(C3GR.CONFIG_SYNC);
        onEvent("cold_boot");
        if (!LIZIZ2) {
            return;
        }
        FH5.LIZIZ().LJFF(C52423Khn.class, LHS.LJLIL);
        FH5.LIZIZ().LJFF(C52422Khm.class, LHT.LJLIL);
    }

    public final void onEvent(String str) {
        if (!C114914f9.LIZ()) {
            if (!FMX.LIZJ("config_center_verify_dt_exp")) {
                return;
            }
        } else if (!LIZJ || str == null) {
            return;
        }
        try {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("source", str);
            c188727au.LJIIIZ("version", "4");
            FHD.LIZLLL().getClass();
            c188727au.LIZLLL(FHD.LJ(-1, 0, "tt_did_verify_config_dt_exp_on", false), "on_val");
            FHD.LIZLLL().getClass();
            c188727au.LIZLLL(FHD.LJ(-1, 0, "tt_did_verify_config_dt_exp_off", false), "off_val");
            c188727au.LIZLLL(LIZLLL.get(), "on_count");
            c188727au.LIZLLL(LJ.get(), "off_count");
            FMX.LJIIL("config_center_verify_dt_exp", c188727au.LIZ);
        } catch (Throwable unused) {
        }
    }
}
