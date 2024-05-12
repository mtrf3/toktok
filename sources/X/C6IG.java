package X;

import Y.ACallableS105S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6IG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IG {
    public static boolean LIZ;
    public static boolean LIZIZ;

    public static void LIZ(C6IE panelType) {
        o.LJIIIZ(panelType, "panelType");
        int i = C6IF.LIZ[panelType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LIZIZ = false;
            return;
        }
        LIZ = false;
    }

    public static boolean LIZIZ(C6IE panelType) {
        o.LJIIIZ(panelType, "panelType");
        int i = C6IF.LIZ[panelType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return LIZIZ;
        }
        return LIZ;
    }

    public static void LIZJ(C6IE panelType) {
        o.LJIIIZ(panelType, "panelType");
        o.LJIIIIZZ(C10K.LIZJ(new ACallableS105S0100000_2(panelType, 37)), "panelType: CommentAndQue…              }\n        }");
    }
}
