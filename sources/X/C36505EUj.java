package X;

import android.os.Handler;
import android.view.Choreographer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.EUj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36505EUj {
    public static Handler LIZ;
    public static Object LIZIZ;
    public static final HandlerC36506EUk LIZJ = new HandlerC36506EUk();
    public static long LIZLLL = 0;
    public static boolean LJ = true;
    public static boolean LJFF = false;

    public static void LIZ() {
        boolean z;
        boolean z2 = true;
        if (C9QH.LJ) {
            if (LIZLLL % C9QH.LIZJ != 0) {
                z = true;
            } else {
                z = false;
            }
            LJ = z;
            if (OHZ.LJLJJL) {
                LJ = false;
                OHZ.LJLJJL = false;
            } else if (!z) {
                if (OHZ.LJLJI && C9QH.LIZLLL && LIZLLL % 2 == 0) {
                    OHZ.LJLJJL = true;
                    LJ = true;
                }
                if (LIZLLL > 180) {
                    LIZLLL = C9QH.LIZJ;
                    OHZ.LJLJI = false;
                    OHZ.LJLJJI = 0L;
                    OHZ.LJLJJL = false;
                    OHZ.LJLJJLL = 0;
                }
            }
        } else {
            long j = LIZLLL;
            long j2 = C9QH.LIZJ;
            if (j % j2 != 0) {
                z2 = false;
            }
            LJ = z2;
            if (LIZLLL > 180 && z2) {
                LIZLLL = j2;
                OHZ.LJLJI = false;
                OHZ.LJLJJI = 0L;
                OHZ.LJLJJL = false;
                OHZ.LJLJJLL = 0;
            }
        }
        LIZLLL++;
    }

    public static void LIZIZ() {
        Object obj;
        long longValue;
        if (!C9QH.LIZ || LIZ != null) {
            return;
        }
        try {
            Choreographer LLIIIJ = C16880lQ.LLIIIJ();
            Object obj2 = null;
            try {
                obj = EUZ.LIZ(LLIIIJ.getClass(), "mHandler").get(LLIIIJ);
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
                obj = null;
            }
            LIZ = (Handler) obj;
            Choreographer LLIIIJ2 = C16880lQ.LLIIIJ();
            try {
                obj2 = EUZ.LIZ(LLIIIJ2.getClass(), "mDisplayEventReceiver").get(LLIIIJ2);
            } catch (IllegalAccessException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            LIZIZ = obj2;
            Field LIZ2 = EUZ.LIZ(Choreographer.class, "mHandler");
            Method LIZ3 = C36504EUi.LIZ(C36504EUi.LIZ, "objectFieldOffset", Field.class);
            Object obj3 = C36504EUi.LIZIZ;
            Object[] objArr = {LIZ2};
            if (LIZ3 != null) {
                try {
                    Object invoke = LIZ3.invoke(obj3, objArr);
                    if (invoke != null) {
                        longValue = ((Long) invoke).longValue();
                        C36504EUi.LIZIZ(longValue, C16880lQ.LLIIIJ(), LIZJ);
                        LJFF = true;
                    }
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            longValue = 0;
            C36504EUi.LIZIZ(longValue, C16880lQ.LLIIIJ(), LIZJ);
            LJFF = true;
        } catch (Exception unused) {
        }
    }
}
