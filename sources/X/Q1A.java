package X;

import android.util.LruCache;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS34S1000000_11;
import kotlin.jvm.internal.AqS64S1100000_11;
import kotlin.jvm.internal.AqS66S1200000_11;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class Q1A {
    public static Q19 LIZIZ;
    public static Q1M LIZJ;
    public static boolean LJ;
    public static C66225Pyv LJII;
    public static String LJIIJ;
    public static long LJIILJJIL;
    public static long LJIILL;
    public static long LJIILLIIL;
    public static long LJIIZILJ;
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static int LIZLLL = 100;
    public static final Q1B LJFF = new Q1B();
    public static final C66339Q1v LJI = new C66339Q1v();
    public static final C1FE LJIIIIZZ = new C1FE();
    public static final boolean LJIIIZ = true;
    public static boolean LJIIJJI = true;
    public static final boolean LJIIL = true;
    public static boolean LJIILIIL = true;

    public static final Q1M LIZ() {
        if (LIZJ == null) {
            LIZJ = new Q1M(LIZLLL);
        }
        Q1M q1m = LIZJ;
        if (q1m != null) {
            return q1m;
        }
        o.LJIIZILJ();
        throw null;
    }

    public static final C66336Q1s LIZIZ() {
        Q19 q19 = LIZIZ;
        if (q19 != null) {
            return q19.LIZIZ;
        }
        return null;
    }

    public static void LIZJ(Q1P it) {
        boolean z;
        List<Q2L> LIZ2;
        o.LJIIJ(it, "it");
        String str = it.cel;
        if (str != null) {
            Q1M LIZ3 = LIZ();
            Boolean bool = null;
            if (LIZ3 != null) {
                try {
                    C66319Q1b.LIZ(4, new AqS34S1000000_11(str, 4));
                    LruCache<String, List<Q2L>> lruCache = ((C66321Q1d) LIZ3.LIZ.LIZJ).LIZ;
                    if (lruCache != null && (LIZ2 = lruCache.get(s.LJZI(str).toString())) != null) {
                        C66319Q1b.LIZ(4, new AqS34S1000000_11(str, 5));
                    } else {
                        LIZ2 = LIZ3.LIZIZ.LIZ(str);
                        C66319Q1b.LIZ(4, new AqS34S1000000_11(str, 6));
                    }
                    C66321Q1d c66321Q1d = (C66321Q1d) LIZ3.LIZ.LIZJ;
                    c66321Q1d.getClass();
                    Q1M.LJFF.getClass();
                    InterfaceC66328Q1k interfaceC66328Q1k = Q1M.LJ;
                    if (interfaceC66328Q1k != null) {
                        interfaceC66328Q1k.LIZ(new AqS66S1200000_11(c66321Q1d, str, LIZ2, 10));
                    }
                    z = true;
                } catch (Throwable th) {
                    C66319Q1b.LIZ(6, new AqS64S1100000_11(str, th, 3));
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            bool.booleanValue();
        }
    }

    public static final void LIZLLL(FTR<?> ftr) {
        HashMap<String, FTR<?>> hashMap = Q16.LIZ;
        synchronized (hashMap) {
            hashMap.put(ftr.name(), ftr);
        }
    }

    public static final synchronized void LJ(int i) {
        synchronized (Q1A.class) {
            if (LIZLLL != i) {
                LIZLLL = i;
                Q1M LIZ2 = LIZ();
                if (LIZ2 != null) {
                    C66321Q1d c66321Q1d = (C66321Q1d) LIZ2.LIZ.LIZJ;
                    if (i == 0) {
                        c66321Q1d.LIZ = null;
                    } else {
                        LruCache<String, List<Q2L>> lruCache = c66321Q1d.LIZ;
                        if (lruCache == null) {
                            c66321Q1d.LIZ = new LruCache<>(i);
                        } else {
                            lruCache.resize(i);
                        }
                    }
                }
            }
        }
    }
}
