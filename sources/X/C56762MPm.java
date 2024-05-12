package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.MPm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56762MPm {
    public static boolean LIZ = true;
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static volatile AtomicInteger LIZLLL = new AtomicInteger(0);

    public static boolean LIZIZ() {
        if (LIZLLL.get() == 1) {
            return true;
        }
        return false;
    }

    public static void LIZ() {
        long max;
        if (LIZIZ()) {
            EnumC56764MPo.LJLJJL.LIZJ();
            EnumC56764MPo.LJLLL.LJ(LIZ ? 1 : 0);
            if (LIZLLL.compareAndSet(1, 2)) {
                C198517qh c198517qh = new C198517qh();
                for (EnumC56764MPo enumC56764MPo : EnumC56764MPo.values()) {
                    int i = enumC56764MPo.LJLILLLLZI;
                    if (i != 0) {
                        if (i == 1) {
                            c198517qh.LIZIZ(Integer.valueOf(enumC56764MPo.LIZLLL()), enumC56764MPo.LJLIL);
                        }
                    } else {
                        String str = enumC56764MPo.LJLIL;
                        synchronized (enumC56764MPo) {
                            MR9 mr9 = enumC56764MPo.LJLJI;
                            max = Math.max(0L, mr9.LIZIZ - mr9.LIZ);
                        }
                        c198517qh.LIZJ(Long.valueOf(max), str);
                    }
                }
                FMX.LJIILJJIL("follower_enter_perf", c198517qh.LJ());
                LIZ = false;
                LIZLLL.set(0);
            }
        }
    }
}
