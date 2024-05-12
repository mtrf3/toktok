package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.bytedance.crash.nativecrash.NativeCrashCollector;

/* renamed from: X.Q6s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66466Q6s {
    public static volatile boolean LIZ;

    public static synchronized void LIZ(Context context) {
        synchronized (C66466Q6s.class) {
            if (C36839Ed1.LIZIZ(context)) {
                Npth.registerCrashCallback(new ICrashCallback() { // from class: X.PTN
                    @Override // com.bytedance.crash.ICrashCallback
                    public final void onCrash(CrashType crashType, String str, Thread thread) {
                        C66460Q6m.LIZIZ().LIZ(System.currentTimeMillis(), CrashType.JAVA.getName(), str);
                    }
                }, CrashType.LAUNCH);
                Npth.registerCrashCallback(new ICrashCallback() { // from class: X.PTO
                    @Override // com.bytedance.crash.ICrashCallback
                    public final void onCrash(CrashType crashType, String str, Thread thread) {
                        C66460Q6m.LIZIZ().LIZ(System.currentTimeMillis(), CrashType.JAVA.getName(), str);
                    }
                }, CrashType.JAVA);
                NativeCrashCollector.LIZ = true;
                Npth.registerCrashCallback(new ICrashCallback() { // from class: X.PTP
                    @Override // com.bytedance.crash.ICrashCallback
                    public final void onCrash(CrashType crashType, String str, Thread thread) {
                        C66460Q6m.LIZIZ().LIZ(System.currentTimeMillis(), CrashType.NATIVE.getName(), str);
                    }
                }, CrashType.NATIVE);
            }
        }
    }

    public static void LIZIZ(int i) {
        C66470Q6w c66470Q6w = new C66470Q6w();
        c66470Q6w.LJ = 600000L;
        c66470Q6w.LIZLLL = LivePlayEnforceIntervalSetting.DEFAULT;
        c66470Q6w.LIZ = true;
        c66470Q6w.LIZIZ = 6;
        c66470Q6w.LIZJ = 4;
        c66470Q6w.LJFF = i;
        c66470Q6w.LJI = 2L;
        c66470Q6w.LJII = 5L;
        c66470Q6w.LJIIIIZZ = 5400000L;
        c66470Q6w.LJIIIZ = 2L;
        c66470Q6w.LJIIJ = 5L;
        c66470Q6w.LJIIJJI = "";
        c66470Q6w.LJIIL = -1.0f;
        synchronized (C66460Q6m.LIZIZ()) {
            C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
            c66465Q6r.LIZLLL.LIZJ(Boolean.valueOf(c66470Q6w.LIZ));
            c66465Q6r.LJI.LIZJ(Long.valueOf(c66470Q6w.LIZLLL));
            c66465Q6r.LJ.LIZJ(Integer.valueOf(c66470Q6w.LIZIZ));
            c66465Q6r.LJFF.LIZJ(Integer.valueOf(c66470Q6w.LIZJ));
            c66465Q6r.LJII.LIZJ(Long.valueOf(c66470Q6w.LJ));
            c66465Q6r.LJIIIIZZ.LIZJ(Long.valueOf(c66470Q6w.LJFF));
            c66465Q6r.LJIIIZ.LIZJ(Long.valueOf(c66470Q6w.LJI));
            c66465Q6r.LJIIJ.LIZJ(Long.valueOf(c66470Q6w.LJII));
            c66465Q6r.LJIIJJI.LIZJ(Long.valueOf(c66470Q6w.LJIIIIZZ));
            c66465Q6r.LJIIL.LIZJ(Long.valueOf(c66470Q6w.LJIIIZ));
            c66465Q6r.LJIILIIL.LIZJ(Long.valueOf(c66470Q6w.LJIIJ));
            c66465Q6r.LJIILJJIL.LIZJ(c66470Q6w.LJIIJJI);
            c66465Q6r.LJIILL.LIZJ(Float.valueOf(c66470Q6w.LJIIL));
            c66465Q6r.LIZJ();
        }
    }
}
