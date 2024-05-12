package X;

import Y.ARunnableS17S0000000_10;
import android.os.Handler;
import com.bytedance.apm.PerfConfig;
import com.bytedance.apm.block.evil.EvilMethodSwitcher;

/* loaded from: classes12.dex */
public final class PFG {
    public static PFH LIZ;
    public static boolean LIZIZ;

    public static void LIZ() {
        PFH pfh = new PFH();
        LIZ = pfh;
        pfh.LIZ = System.currentTimeMillis();
        if (C09970aH.LJIIIZ()) {
            boolean isOpenLaunchEvilMethod = EvilMethodSwitcher.isOpenLaunchEvilMethod();
            LIZIZ = isOpenLaunchEvilMethod;
            if (isOpenLaunchEvilMethod) {
                synchronized (C63081OpJ.class) {
                    if (!C63081OpJ.LJLIL) {
                        C63081OpJ.LJLIL = true;
                        if (!C63081OpJ.LJLILLLLZI) {
                            C63081OpJ.LJLILLLLZI = true;
                            PFC.LJIILJJIL(EvilMethodSwitcher.getLaunchEvilThresholdMs());
                            PFC.LJLLJ = true;
                            if (EvilMethodSwitcher.isMessageKeyEnable()) {
                                PerfConfig.setReportMessage();
                            }
                            C36381bm.LJIL.LJIIIIZZ();
                            C25500zK.LJI();
                            PFC.LJLLILLLL = true;
                            EvilMethodSwitcher.isLaunchLimitEvilMethodDepth();
                            PFC pfc = new PFC(true);
                            C63081OpJ.LJLJI = pfc;
                            pfc.LJIILL();
                            PF6.LIZJ(true, "launch", null);
                            new Handler().postDelayed(new ARunnableS17S0000000_10(2), 10000L);
                        }
                        C06140Ly.LIZ("app_launch_evil_method_scene_apm_2");
                    }
                }
            }
        }
    }
}
