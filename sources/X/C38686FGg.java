package X;

import Y.ARunnableS42S0100000_6;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FGg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38686FGg {
    public static InterfaceC38690FGk LIZ;
    public static volatile C38692FGm LIZIZ;
    public static volatile Future LIZLLL;
    public static final java.util.Map<String, Object> LIZJ = new ConcurrentHashMap();
    public static volatile boolean LJ = false;
    public static volatile boolean LJFF = false;
    public static volatile boolean LJI = false;
    public static final Object LJII = new Object();
    public static final java.util.Map<String, String> LJIIIIZZ = new ConcurrentHashMap();
    public static final java.util.Set<String> LJIIIZ = new ConcurrentSkipListSet();
    public static final java.util.Map<String, String> LJIIJ = new ConcurrentHashMap();

    public static void LIZ() {
        if (LIZLLL != null) {
            try {
                LIZLLL.get();
                return;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        throw new RuntimeException("ExperimentManager has not been init");
    }

    public static void LIZLLL() {
        LIZ();
        C38692FGm c38692FGm = LIZIZ;
        synchronized (c38692FGm) {
            Future future = c38692FGm.LJIIIIZZ;
            if (future != null) {
                future.cancel(true);
            }
            c38692FGm.LJIIIIZZ = C38696FGq.LIZ.scheduleWithFixedDelay(new ARunnableS42S0100000_6(c38692FGm, 109), 0L, 3600000L, TimeUnit.MILLISECONDS);
        }
    }

    public static void LJ(String str, Object obj, boolean z, String str2) {
        if (z && obj != null) {
            ((ConcurrentHashMap) LIZJ).put(str, obj);
        }
        ((ConcurrentHashMap) LJIIJ).put(str, str2);
    }

    public static Object LIZIZ(String str, Type type, Object obj, boolean z, EYS eys) {
        return LIZJ(str, type, obj, true, true, z, eys);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZJ(java.lang.String r15, java.lang.reflect.Type r16, java.lang.Object r17, boolean r18, boolean r19, boolean r20, X.EYS r21) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38686FGg.LIZJ(java.lang.String, java.lang.reflect.Type, java.lang.Object, boolean, boolean, boolean, X.EYS):java.lang.Object");
    }
}
