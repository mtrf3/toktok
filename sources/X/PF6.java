package X;

import Y.ARunnableS15S0100100_11;
import Y.ARunnableS18S0000000_11;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Printer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class PF6 {
    public static volatile boolean LIZ;
    public static PF5 LIZIZ;
    public static PF9 LIZJ;
    public static PFB LJ;
    public static volatile InterfaceC64104PDw LJFF;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static Printer LJIIL;
    public static final CopyOnWriteArrayList<PFB> LIZLLL = new CopyOnWriteArrayList<>();
    public static volatile boolean LJI = false;
    public static long LJII = 0;
    public static int LJIIIIZZ = 0;
    public static final ARunnableS18S0000000_11 LJIIIZ = new ARunnableS18S0000000_11(11);

    public static void LIZ() {
        if (LIZ && !LJIIJ) {
            if (C64099PDr.LIZJ("block_monitor") || Build.VERSION.SDK_INT < 24) {
                return;
            }
            LIZIZ();
            if (LJ()) {
                PF9 pf9 = LIZJ;
                C0M0 c0m0 = C0M1.LJII;
                if (c0m0 != null) {
                    c0m0.removeMessageObserver(pf9);
                }
            } else {
                FAI.LIZJ(LIZIZ);
            }
            LJIIJ = true;
            return;
        }
        if (!LJIIJJI && LJIIJ) {
            LIZIZ();
        }
    }

    public static void LIZIZ() {
        int size;
        Printer printer;
        if (!LIZ || LJIIJJI || !C45439HsR.LJLJI) {
            return;
        }
        if (LJ()) {
            List<InterfaceC06150Lz> LIZIZ2 = C0M1.LIZIZ();
            if (LIZIZ2 == null || LIZIZ2.size() != 1 || ListProtector.get(LIZIZ2, 0) != LIZJ) {
                return;
            }
            if (C0M1.LIZ && C0M1.LJII != null) {
                try {
                    Method LIZLLL2 = C0M1.LIZLLL(Looper.class, "setObserver", Class.forName("android.os.Looper$Observer"));
                    Object obj = C0M1.LIZJ;
                    if (obj == null) {
                        C0M1.LIZ(LIZLLL2, new Object[]{null});
                    } else {
                        C0M1.LIZ(LIZLLL2, new Object[]{obj});
                    }
                } catch (Throwable unused) {
                }
            }
            LJIIJJI = true;
            return;
        }
        List<Printer> LIZ2 = FAI.LIZ();
        if (LIZ2 != null && ((ArrayList) LIZ2).size() == 1 && ListProtector.get(LIZ2, 0) == LIZIZ) {
            try {
                Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
                declaredField.setAccessible(true);
                printer = (Printer) declaredField.get(C16880lQ.LLJJJJ());
            } catch (Exception unused2) {
                printer = null;
            }
            LJIIL = printer;
            if (printer == null) {
                return;
            }
            C16880lQ.LLJJJJ().setMessageLogging(null);
            LJIIJJI = true;
            return;
        }
        if (!C36381bm.LJIL.LJIJI || (size = ((ArrayList) FAI.LIZ()).size()) <= 0) {
            return;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[((ArrayList) FAI.LIZ()).size() + 1];
        List<Printer> LIZ3 = FAI.LIZ();
        int i = 0;
        do {
            stackTraceElementArr[i] = new StackTraceElement(ListProtector.get(LIZ3, i).getClass().getName(), "HasPrinter", "Looper", 0);
            i++;
        } while (i < size);
        C78983UzD.LJIJ(new C25450zF("Looper Opt Last", stackTraceElementArr), "Looper Opt Last");
    }

    public static void LIZLLL() {
        if (C45439HsR.LJLIL || LIZ) {
            return;
        }
        LIZ = true;
        LIZIZ = new PF5();
        LIZJ = new PF9();
        if (C45439HsR.LJLILLLLZI && C0M1.LIZJ()) {
            if (C0M1.LIZIZ) {
                FAI.LIZIZ();
                C16880lQ.LLLLIILLL(LIZIZ);
            }
            PF9 pf9 = LIZJ;
            C0M0 c0m0 = C0M1.LJII;
            if (c0m0 != null) {
                c0m0.addMessageObserver(pf9);
                return;
            }
            return;
        }
        if (C45439HsR.LJLILLLLZI && C0M1.LIZJ()) {
            return;
        }
        FAI.LIZIZ();
        C16880lQ.LLLLIILLL(LIZIZ);
    }

    public static boolean LJ() {
        if (C45439HsR.LJLILLLLZI && C0M1.LIZJ() && !C0M1.LIZIZ) {
            return true;
        }
        return false;
    }

    public static void LJI() {
        CopyOnWriteArrayList<PFB> copyOnWriteArrayList = LIZLLL;
        if (copyOnWriteArrayList.size() == 0) {
            return;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[copyOnWriteArrayList.size() + 1];
        int i = 0;
        while (true) {
            CopyOnWriteArrayList<PFB> copyOnWriteArrayList2 = LIZLLL;
            if (i < copyOnWriteArrayList2.size()) {
                stackTraceElementArr[i] = new StackTraceElement(copyOnWriteArrayList2.get(i).getClass().getName(), "registerListener", "activity", 0);
                i++;
            } else {
                C78983UzD.LJIJ(new C25450zF("Looper Opt", stackTraceElementArr), "Looper Opt");
                return;
            }
        }
    }

    public static void LJII() {
        if (!LIZ || !LJIIJ) {
            return;
        }
        LJIIIIZZ(false);
        if (LJ()) {
            PF9 pf9 = LIZJ;
            C0M0 c0m0 = C0M1.LJII;
            if (c0m0 != null) {
                c0m0.addMessageObserver(pf9);
            }
        } else {
            FAI.LIZIZ();
            C16880lQ.LLLLIILLL(LIZIZ);
        }
        LJIIJ = false;
    }

    public static void LJFF(PFB pfb) {
        if (!LIZ) {
            LIZLLL();
        }
        CopyOnWriteArrayList<PFB> copyOnWriteArrayList = LIZLLL;
        synchronized (copyOnWriteArrayList) {
            if (pfb != null) {
                if (!copyOnWriteArrayList.contains(pfb)) {
                    copyOnWriteArrayList.add(pfb);
                    if (C36381bm.LJIL.LJIJ) {
                        LJII();
                    }
                }
            }
        }
    }

    public static void LJIIIIZZ(boolean z) {
        if (!LIZ || !LJIIJJI || !C45439HsR.LJLJI) {
            return;
        }
        if (LJ() && z) {
            return;
        }
        if (LJ()) {
            if (C0M1.LIZ && C0M1.LJII != null) {
                try {
                    C0M1.LIZ(C0M1.LIZLLL(Looper.class, "setObserver", Class.forName("android.os.Looper$Observer")), new Object[]{C0M1.LJII});
                } catch (Throwable unused) {
                }
            }
        } else if (LJIIL != null) {
            C16880lQ.LLJJJJ().setMessageLogging(LJIIL);
        }
        LJIIJJI = false;
    }

    public static void LIZJ(boolean z, String str, Message message) {
        PFB pfb;
        PFB pfb2;
        long nanoTime = System.nanoTime();
        PFB.LIZIZ = nanoTime / 1000000;
        PFB.LIZJ = SystemClock.currentThreadTimeMillis();
        if (z && (pfb2 = LJ) != null && pfb2.LIZJ()) {
            LJ.LIZIZ(str);
        }
        try {
            Iterator<PFB> it = LIZLLL.iterator();
            while (it.hasNext()) {
                PFB next = it.next();
                if (next != null && next.LIZJ()) {
                    if (z) {
                        if (!next.LIZ) {
                            next.LIZIZ(str);
                        }
                    } else if (next.LIZ) {
                        next.LIZ();
                    }
                } else if (!z && next.LIZ) {
                    next.LIZ();
                }
            }
        } catch (Exception unused) {
        }
        if (!z && (pfb = LJ) != null && pfb.LIZJ()) {
            LJ.LIZ();
        }
        if (LJI) {
            LJII = (System.nanoTime() - nanoTime) + LJII;
            int i = LJIIIIZZ;
            LJIIIIZZ = i + 1;
            if (i >= 1000) {
                if (LJFF != null) {
                    InterfaceC64104PDw interfaceC64104PDw = LJFF;
                    long j = LJII;
                    C64101PDt c64101PDt = (C64101PDt) interfaceC64104PDw;
                    c64101PDt.getClass();
                    F9U.LIZ.LIZJ(new ARunnableS15S0100100_11(j, c64101PDt, 6));
                }
                LJIIIIZZ = 0;
                LJII = 0L;
                LJI = false;
            }
        }
    }
}
