package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class FFI {
    public static final java.util.Map<Object, Boolean> LIZ = new ConcurrentHashMap();
    public static final java.util.Map<Object, Integer> LIZIZ = new ConcurrentHashMap();
    public static final java.util.Map<Object, Long> LIZJ = new ConcurrentHashMap();
    public static final java.util.Map<Object, Float> LIZLLL = new ConcurrentHashMap();
    public static final java.util.Map<Object, Double> LJ = new ConcurrentHashMap();
    public static final java.util.Map<Object, String> LJFF = new ConcurrentHashMap();
    public static final java.util.Map<Object, Object> LJI = new ConcurrentHashMap();
    public static final Object LJII = new Object();
    public static boolean LJIIIIZZ = false;

    public static boolean LIZ() {
        boolean z = false;
        try {
            if (FFK.LIZ) {
                z = FFK.LIZIZ;
            } else {
                FFL.LJIIIZ().getClass();
                boolean LJ2 = FFL.LJ(31744, "player_setting_enable_ab_cache", true, false);
                FFK.LIZIZ = LJ2;
                FFK.LIZ = true;
                z = LJ2;
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T LIZIZ(java.lang.String r2) {
        /*
            java.util.Map<java.lang.String, java.lang.Object> r1 = X.C34928DnI.LIZ     // Catch: java.lang.Throwable -> L24
            r0 = r1
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L12
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L24
            goto L25
        L12:
            java.util.Map<java.lang.String, java.lang.Object> r1 = X.C34928DnI.LIZIZ     // Catch: java.lang.Throwable -> L24
            r0 = r1
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L24
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L24
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FFI.LIZIZ(java.lang.String):java.lang.Object");
    }

    public static boolean LIZJ(String str) {
        if (((Boolean) C34710Djm.LJJJJJ.getValue()).booleanValue()) {
            AwemeConfigCenter.AwemeConfigCenterImpl.LIZIZ().LIZ(str);
        }
        C35810E3q.LJIIIIZZ();
        if (!FFJ.LIZIZ) {
            FFJ.LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("performance_opt_great_reversal_2440", false);
            FFJ.LIZIZ = true;
        }
        if (FFJ.LIZ) {
            return ((HashMap) C34928DnI.LIZ).containsKey(str);
        }
        if (!C35127DqV.LIZ()) {
            return false;
        }
        return ((HashMap) C34928DnI.LIZIZ).containsKey(str);
    }
}
