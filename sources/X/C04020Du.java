package X;

import android.os.Handler;
import java.util.Random;

/* renamed from: X.0Du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04020Du {
    public static boolean LIZ;
    public static Handler LIZIZ;
    public static Random LIZJ;

    static {
        synchronized (C04040Dw.class) {
            InterfaceC04030Dv interfaceC04030Dv = C04040Dw.LIZ;
            if (interfaceC04030Dv != null) {
                interfaceC04030Dv.LIZ();
                C04040Dw.LIZ = null;
            } else {
                C04040Dw.LIZIZ = true;
            }
        }
        LIZIZ = null;
    }

    public static void LIZ(C29701Eo c29701Eo, C04740Go c04740Go, Object obj) {
        Integer num;
        if (LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("traceLottieViewSetAnimation  {value=");
            LIZ2.append(obj);
            LIZ2.append("  view=");
            LIZ2.append(c29701Eo.hashCode());
            LIZ2.append(" visibility:");
            LIZ2.append(c29701Eo.getVisibility());
            LIZ2.append(" drawable=");
            if (c04740Go != null) {
                num = Integer.valueOf(c04740Go.hashCode());
            } else {
                num = null;
            }
            LIZ2.append(num);
            LIZ2.append(" visible:");
            LIZ2.append(c29701Eo.isShown());
            LIZ2.append("}");
            X1D.LIZIZ(LIZ2);
        }
    }
}
