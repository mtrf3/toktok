package X;

import Y.ARunnableS12S1000000_6;
import android.content.Context;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EGA implements Runnable {
    public static final EGA LJLIL = new EGA();

    public static void LIZ() {
        String str;
        Context LIZIZ = EF7.LIZIZ();
        FCD.LJI(LIZIZ);
        String LIZ = FCD.LIZ(LIZIZ);
        o.LJIIIIZZ(LIZ, "getCurProcessName(it)");
        EG9.LJ = i0.LJFF("lastUpdateTime_", LIZ);
        if (EG9.LIZ.compareAndSet(false, true)) {
            try {
                if (((Boolean) EG9.LIZIZ.getValue()).booleanValue()) {
                    str = "app_boot_flow_monitor_new_user";
                } else if (((Boolean) EG9.LIZJ.getValue()).booleanValue()) {
                    str = "app_boot_flow_monitor_overlay_user";
                } else {
                    str = "app_boot_flow_monitor_normal_user";
                }
                EGB.LIZ.LJJJLIIL(str, true);
                C37179EiV.LJFF.postDelayed(new ARunnableS12S1000000_6(str, 4), 600000L);
                EG9.LIZ();
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
