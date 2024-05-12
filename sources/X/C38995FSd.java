package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.FSd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38995FSd {
    public static C39001FSj LIZ = new C39001FSj(new C39005FSn());
    public static InterfaceC39006FSo LIZIZ = new C38998FSg();
    public static volatile ExecutorService LIZJ;
    public static volatile ExecutorService LIZLLL;
    public static volatile ExecutorService LJ;
    public static volatile ScheduledExecutorService LJFF;
    public static volatile ExecutorService LJI;

    public static ExecutorService LIZIZ() {
        if (LJ == null) {
            synchronized (C38995FSd.class) {
                if (LJ == null) {
                    LJ = C38994FSc.LIZ.LIZ(C38028EwC.LIZ(FSY.BACKGROUND).LIZ(), true);
                }
            }
        }
        return LJ;
    }

    public static ExecutorService LIZJ() {
        if (LIZLLL == null) {
            synchronized (C38995FSd.class) {
                if (LIZLLL == null) {
                    LIZLLL = C38994FSc.LIZ.LIZ(C38028EwC.LIZ(FSY.DEFAULT).LIZ(), true);
                }
            }
        }
        return LIZLLL;
    }

    public static ExecutorService LIZLLL() {
        if (LIZJ == null) {
            synchronized (C38995FSd.class) {
                if (LIZJ == null) {
                    LIZJ = C38994FSc.LIZ.LIZ(C38028EwC.LIZ(FSY.IO).LIZ(), true);
                }
            }
        }
        return LIZJ;
    }

    public static ScheduledExecutorService LJ() {
        if (LJFF == null) {
            synchronized (C38995FSd.class) {
                if (LJFF == null) {
                    FST fst = C38994FSc.LIZ;
                    C38027EwB LIZ2 = C38028EwC.LIZ(FSY.SCHEDULED);
                    LIZ2.LIZJ = 1;
                    LJFF = (ScheduledExecutorService) fst.LIZ(LIZ2.LIZ(), true);
                }
            }
        }
        return LJFF;
    }

    public static ExecutorService LJFF() {
        if (LJI == null) {
            synchronized (C38995FSd.class) {
                if (LJI == null) {
                    LJI = C38994FSc.LIZ.LIZ(C38028EwC.LIZ(FSY.SERIAL).LIZ(), true);
                }
            }
        }
        return LJI;
    }

    public static ExecutorService LIZ(C38028EwC c38028EwC) {
        FSY fsy = c38028EwC.LIZ;
        if (fsy != FSY.IO && fsy != FSY.DEFAULT && fsy != FSY.BACKGROUND) {
            return C38994FSc.LIZ.LIZ(c38028EwC, false);
        }
        throw new IllegalArgumentException();
    }

    public static boolean LJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = LIZ.LIZJ.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJII(ExecutorService executorService) {
        if ((LIZJ != null && executorService == LIZLLL()) || ((LIZLLL != null && executorService == LIZJ()) || ((LJ != null && executorService == LIZIZ()) || ((LJFF != null && executorService == LJ()) || (LJI != null && executorService == LJFF()))))) {
            return true;
        }
        return false;
    }
}
