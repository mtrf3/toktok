package X;

import Y.IDRunnableS65S0000000;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.util.LinkedList;

/* renamed from: X.0zK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25500zK {
    public static volatile int LIZ;
    public static volatile boolean LIZIZ;
    public static final Object LIZJ;
    public static long[] LIZLLL;
    public static int LJ;
    public static boolean LJFF;
    public static volatile long LJI;
    public static volatile long LJII;
    public static final Thread LJIIIIZZ;
    public static volatile IDRunnableS65S0000000 LJIIIZ;
    public static final HandlerThread LJIIJ;
    public static final Handler LJIIJJI;
    public static long LJIIL;
    public static long LJIILIIL;
    public static final int LJIILJJIL;
    public static final C36411bp[] LJIILL;
    public static int LJIILLIIL;
    public static final Object LJIIZILJ;
    public static boolean LJIJ;
    public static IDRunnableS65S0000000 LJIJI;
    public static final C36401bo LJIJJ;
    public static C25490zJ LJIJJLI;
    public static C25490zJ LJIL;

    public static void LJI() {
        synchronized (LIZJ) {
            if (LIZ < 2 && LIZ >= -2) {
                LJIIJJI.removeCallbacks(LJIJI);
                if (LIZLLL != null) {
                    LIZ = 2;
                    LIZIZ = false;
                } else {
                    throw new RuntimeException("MethodCollector sBuffer == null");
                }
            }
        }
    }

    public static void LJII() {
        synchronized (LIZJ) {
            if (LIZ == 2) {
                LIZ = -1;
                LIZIZ = true;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.1bo, X.PFB] */
    static {
        LIZ = Integer.MAX_VALUE;
        LIZIZ = false;
        Object obj = new Object();
        LIZJ = obj;
        LIZLLL = new long[600000];
        LJ = 0;
        LJFF = false;
        LJI = SystemClock.uptimeMillis();
        LJII = LJI;
        LJIIIIZZ = C16880lQ.LLJJJJ().getThread();
        LJIIIZ = null;
        HandlerThread LIZ2 = C06M.LIZ("trace_time_update_thread");
        LJIIJ = LIZ2;
        Handler handler = new Handler(LIZ2.getLooper());
        LJIIJJI = handler;
        LJIILJJIL = 50;
        LJIILL = new C36411bp[50];
        LJIILLIIL = 0;
        LJIIZILJ = new Object();
        LJIJ = false;
        LJIJI = null;
        ?? r9 = new PFB() { // from class: X.1bo
            @Override // X.PFB
            public final void LIZ() {
                this.LIZ = false;
                C25500zK.LJIJ = true;
            }

            @Override // X.PFB
            public final boolean LIZJ() {
                if (C25500zK.LJIIIZ != null) {
                    C25500zK.LJIIIZ.run();
                    C25500zK.LJIIIZ = null;
                }
                if (C25500zK.LIZ >= 1) {
                    return true;
                }
                return false;
            }

            @Override // X.PFB
            public final void LIZIZ(String str) {
                this.LIZ = true;
                C25500zK.LJI = PFB.LIZIZ - C25500zK.LJII;
                C25500zK.LJIJ = false;
                Object obj2 = C25500zK.LJIIZILJ;
                synchronized (obj2) {
                    obj2.notify();
                }
            }
        };
        LJIJJ = r9;
        IDRunnableS65S0000000 iDRunnableS65S0000000 = new IDRunnableS65S0000000(9);
        if (Build.VERSION.SDK_INT < 24) {
            LIZ = -4;
            LIZIZ = true;
        } else {
            if (LIZ == Integer.MAX_VALUE) {
                synchronized (obj) {
                    if (LIZ == Integer.MAX_VALUE) {
                        LJI = SystemClock.uptimeMillis() - LJII;
                        handler.removeCallbacksAndMessages(null);
                        handler.postDelayed(iDRunnableS65S0000000, 5L);
                        IDRunnableS65S0000000 iDRunnableS65S00000002 = new IDRunnableS65S0000000(12);
                        LJIJI = iDRunnableS65S00000002;
                        handler.postDelayed(iDRunnableS65S00000002, LivePlayEnforceIntervalSetting.DEFAULT);
                        PF6.LJFF(r9);
                        LIZ = 1;
                    }
                }
            }
            LIZLLL(1048574, 0L);
            LJ(PFB.LIZIZ, "EvilMethodTracer#message_0");
        }
        handler.postDelayed(new IDRunnableS65S0000000(10), LivePlayEnforceIntervalSetting.DEFAULT);
    }

    public static long[] LIZ(int i, int i2) {
        long[] jArr = new long[0];
        int max = Math.max(0, i);
        int max2 = Math.max(0, i2);
        if (max2 > max) {
            int i3 = (max2 - max) + 1;
            long[] jArr2 = new long[i3];
            System.arraycopy(LIZLLL, max, jArr2, 0, i3);
            return jArr2;
        }
        if (max2 >= max) {
            return jArr;
        }
        int i4 = max2 + 1;
        long[] jArr3 = LIZLLL;
        long[] jArr4 = new long[(jArr3.length - max) + i4];
        System.arraycopy(jArr3, max, jArr4, 0, jArr3.length - max);
        long[] jArr5 = LIZLLL;
        System.arraycopy(jArr5, 0, jArr4, jArr5.length - max, i4);
        return jArr4;
    }

    public static long[] LIZIZ(long j, long j2) {
        C25490zJ c25490zJ;
        C25490zJ c25490zJ2 = LJIJJLI;
        if (c25490zJ2 == null || (c25490zJ = LJIL) == null) {
            return null;
        }
        while (c25490zJ2 != c25490zJ) {
            C25490zJ c25490zJ3 = c25490zJ2.LIZJ;
            if (c25490zJ3.LJFF > j2) {
                c25490zJ2 = c25490zJ3;
            } else {
                C25490zJ c25490zJ4 = c25490zJ.LIZLLL;
                if (c25490zJ4.LJFF >= j) {
                    break;
                }
                c25490zJ = c25490zJ4;
            }
        }
        int i = c25490zJ2.LIZIZ;
        if (i == 0) {
            i = LJ - 1;
        }
        return LIZ(c25490zJ.LIZ, i);
    }

    public static String LIZJ(long j, long[] jArr) {
        if (jArr == null) {
            return "";
        }
        LinkedList linkedList = new LinkedList();
        C64229PIr.LJFF(jArr, linkedList, j);
        C64229PIr.LJI(1, linkedList);
        StringBuilder sb = new StringBuilder();
        C64229PIr.LJ(linkedList, sb);
        return sb.toString();
    }

    public static void LIZLLL(int i, long j) {
        if (C38667FFn.LIZIZ) {
            try {
                C38667FFn.LIZJ.LJJIII(i);
            } catch (Throwable unused) {
            }
        }
        int[] iArr = C38667FFn.LIZ;
        if (iArr != null && iArr.length > 0) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (iArr[i2] == i) {
                    String LIZIZ2 = C0NY.LIZIZ("method id------>:", i, "\n");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LIZIZ2);
                    LIZ2.append(android.util.Log.getStackTraceString(new Throwable()));
                    System.err.println(X1D.LIZIZ(LIZ2));
                    break;
                }
                i2++;
            }
        }
        if (LIZIZ || !PFC.LJLLJ || i >= 1048575 || C16880lQ.LLLLIIIILLL() != LJIIIIZZ || LJFF) {
            return;
        }
        LJFF = true;
        if (j != 0) {
            LJI = j - LJII;
            LJI &= 8796093022207L;
        }
        LJIIL = LJI;
        if (C25520zM.LIZ.LIZ.contains(Integer.valueOf(i))) {
            LJIILIIL = i;
            C64125PEr.LIZLLL().getClass();
        }
        long j2 = (i << 43) | Long.MIN_VALUE | LJI;
        long[] jArr = LIZLLL;
        int i3 = LJ;
        jArr[i3] = j2;
        int i4 = i3 + 1;
        LJ = i4;
        if (i4 == 600000) {
            LJ = 0;
        }
        LJFF = false;
        C25490zJ c25490zJ = LJIL;
        if (c25490zJ == null || c25490zJ.LIZ != LJ) {
            return;
        }
        C25490zJ c25490zJ2 = c25490zJ.LIZLLL;
        LJIL = c25490zJ2;
        if (c25490zJ2 != null) {
            c25490zJ2.LIZJ = null;
        } else {
            LJIJJLI = null;
        }
    }

    public static C25490zJ LJ(long j, String str) {
        if (LJIJJLI == null) {
            C25490zJ c25490zJ = new C25490zJ(LJ);
            LJIJJLI = c25490zJ;
            if (j <= 0) {
                j = SystemClock.uptimeMillis();
            }
            c25490zJ.LJFF = j;
            C25490zJ c25490zJ2 = LJIJJLI;
            c25490zJ2.LJ = str;
            LJIL = c25490zJ2;
            return c25490zJ2;
        }
        int i = LJ;
        C25490zJ c25490zJ3 = new C25490zJ(i);
        if (j <= 0) {
            j = SystemClock.uptimeMillis();
        }
        c25490zJ3.LJFF = j;
        c25490zJ3.LJ = str;
        C25490zJ c25490zJ4 = LJIJJLI;
        c25490zJ3.LIZJ = c25490zJ4;
        c25490zJ4.LIZIZ = i - 1;
        c25490zJ4.LIZLLL = c25490zJ3;
        LJIJJLI = c25490zJ3;
        return c25490zJ3;
    }

    public static void LJFF(int i, long j) {
        int i2;
        if (C38667FFn.LIZIZ) {
            try {
                C38667FFn.LIZJ.LJJIIJ(i);
            } catch (Throwable unused) {
            }
        }
        if (LIZIZ || !PFC.LJLLJ || i >= 1048575) {
            return;
        }
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        Thread thread = LJIIIIZZ;
        if (LLLLIIIILLL != thread) {
            return;
        }
        if (j != 0) {
            LJI = j - LJII;
            LJI &= 8796093022207L;
        }
        long j2 = i;
        if (j2 == LJIILIIL) {
            if (LJI - LJIIL > 16 && (i2 = LJIILLIIL) < LJIILJJIL - 1) {
                LJIILL[i2] = new C36411bp(thread.getStackTrace());
                LJIILLIIL++;
            }
            LJIILIIL = 0L;
            C64125PEr.LIZLLL().getClass();
        }
        LJIIL = 0L;
        long j3 = (j2 << 43) | 0 | LJI;
        long[] jArr = LIZLLL;
        int i3 = LJ;
        jArr[i3] = j3;
        int i4 = i3 + 1;
        LJ = i4;
        if (i4 == 600000) {
            LJ = 0;
        }
        C25490zJ c25490zJ = LJIL;
        if (c25490zJ == null || c25490zJ.LIZ != LJ) {
            return;
        }
        C25490zJ c25490zJ2 = c25490zJ.LIZLLL;
        LJIL = c25490zJ2;
        if (c25490zJ2 != null) {
            c25490zJ2.LIZJ = null;
        } else {
            LJIJJLI = null;
        }
    }
}
