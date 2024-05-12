package X;

import Y.ARunnableS42S0100000_6;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FN7 {
    public static boolean LIZ;
    public static ArrayList<Runnable> LIZIZ;
    public static boolean LIZJ;

    public static boolean LIZ() {
        boolean booleanValue;
        if (C2NW.LIZ().isNewUser()) {
            booleanValue = C33842DPy.LIZ();
        } else {
            booleanValue = ((Boolean) C34710Djm.LJIJJ.getValue()).booleanValue();
        }
        if (booleanValue && !LIZ) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(Runnable runnable) {
        Method method;
        boolean LJIIIIZZ;
        ArrayList<Runnable> arrayList;
        o.LJIIIZ(runnable, "runnable");
        if (LIZ()) {
            if (C34710Djm.LIZIZ() && (arrayList = LIZIZ) != null) {
                arrayList.add(runnable);
                return;
            }
            FN6.LIZ.LIZ();
            ARunnableS42S0100000_6 aRunnableS42S0100000_6 = new ARunnableS42S0100000_6(runnable, 155);
            if (LIZJ) {
                if (FN6.LJII && (method = FN6.LIZLLL) != null) {
                    try {
                        method.invoke(FN6.LIZJ, 0, new ARunnableS42S0100000_6(aRunnableS42S0100000_6, 61), null, 0);
                        return;
                    } finally {
                        if (LJIIIIZZ) {
                        }
                    }
                }
            } else if (FN6.LIZJ(aRunnableS42S0100000_6)) {
                return;
            }
            runnable.run();
            return;
        }
        runnable.run();
    }

    public static void LIZJ(Boolean bool) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        LIZ = z;
    }
}
