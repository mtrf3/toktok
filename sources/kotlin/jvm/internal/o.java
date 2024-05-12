package kotlin.jvm.internal;

import X.C06540Nm;
import X.C16880lQ;
import X.C37470EnC;
import X.C41768GaK;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import defpackage.a1;
import defpackage.b0;
import defpackage.i0;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class o {
    public static int LJIIJJI(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int LJIIL(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static void LJIIZILJ() {
        C37470EnC c37470EnC = new C37470EnC();
        LJIILL(c37470EnC);
        throw c37470EnC;
    }

    public static void LJIJ() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static boolean LIZIZ(Double d) {
        if (d != null && d.doubleValue() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return true;
        }
        return false;
    }

    public static void LJI(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        LJIILL(nullPointerException);
        throw nullPointerException;
    }

    public static String LJIILIIL(String str) {
        StackTraceElement stackTraceElement = C16880lQ.LLLLIIIILLL().getStackTrace()[4];
        StringBuilder LIZLLL = C06540Nm.LIZLLL("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        LIZLLL.append(str);
        return X1D.LIZIZ(LIZLLL);
    }

    public static void LJIILL(Throwable th) {
        LJIILJJIL(o.class.getName(), th);
    }

    public static void LJIJI(String str) {
        C41768GaK c41768GaK = new C41768GaK(a1.LJ("lateinit property ", str, " has not been initialized"));
        LJIILL(c41768GaK);
        throw c41768GaK;
    }

    public static boolean LIZ(float f, Float f2) {
        if (f2 != null && f == f2.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Float f, float f2) {
        if (f != null && f.floatValue() == f2) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Float f, Float f2) {
        if (f == null) {
            if (f2 == null) {
                return true;
            }
        } else if (f2 != null && f.floatValue() == f2.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean LJ(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void LJFF(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(i0.LJFF(str, " must not be null"));
        LJIILL(illegalStateException);
        throw illegalStateException;
    }

    public static void LJII(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        LJIILL(nullPointerException);
        throw nullPointerException;
    }

    public static void LJIIIIZZ(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(i0.LJFF(str, " must not be null"));
        LJIILL(nullPointerException);
        throw nullPointerException;
    }

    public static void LJIIIZ(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(LJIILIIL(str));
        LJIILL(nullPointerException);
        throw nullPointerException;
    }

    public static void LJIIJ(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(LJIILIIL(str));
        LJIILL(illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void LJIILJJIL(String str, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static String LJIILLIIL(Object obj, String str) {
        return b0.LIZIZ(str, obj);
    }
}
