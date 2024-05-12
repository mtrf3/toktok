package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.MRd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56805MRd {
    public static boolean LIZ = true;
    public static volatile AtomicInteger LIZIZ = new AtomicInteger(0);

    public static boolean LIZJ() {
        if (LIZIZ.get() == 1) {
            return true;
        }
        return false;
    }

    public static void LIZ() {
        long max;
        if (LIZJ()) {
            EnumC56806MRe.LJLJLLL.LIZLLL();
            EnumC56806MRe.LJLJJL.LIZLLL();
            EnumC56806MRe.LJLLILLLL.LJFF(((Number) L0H.LIZ.getValue()).intValue());
            EnumC56806MRe.LJLLL.LJFF(LIZ ? 1 : 0);
            if (LIZIZ.compareAndSet(1, 2)) {
                C198517qh c198517qh = new C198517qh();
                for (EnumC56806MRe enumC56806MRe : EnumC56806MRe.values()) {
                    int i = enumC56806MRe.LJLILLLLZI;
                    if (i != 0) {
                        if (i == 1) {
                            c198517qh.LIZIZ(Integer.valueOf(enumC56806MRe.LIZJ()), enumC56806MRe.LJLIL);
                        }
                    } else {
                        String str = enumC56806MRe.LJLIL;
                        synchronized (enumC56806MRe) {
                            C56807MRf c56807MRf = enumC56806MRe.LJLJI;
                            max = Math.max(0L, c56807MRf.LIZIZ - c56807MRf.LIZ);
                            if (max <= 0 || max >= 30000) {
                                EnumC56806MRe.LJLLJ.LJFF(1);
                            }
                        }
                        c198517qh.LIZJ(Long.valueOf(max), str);
                    }
                }
                FMX.LJIILJJIL("activities_enter_perf", c198517qh.LJ());
                LIZ = false;
                LIZIZ.set(0);
            }
        }
    }

    public static void LIZIZ(int i) {
        if (!((Boolean) DWT.LIZIZ.getValue()).booleanValue() || !LIZIZ.compareAndSet(0, 1)) {
            return;
        }
        EnumC56806MRe.LJLJJL.LJ();
        EnumC56806MRe.LJLJJLL.LJ();
        EnumC56806MRe.LJLL.LJFF(i);
        EnumC56806MRe.LJLLJ.LJFF(0);
    }
}
