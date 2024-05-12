package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.6IB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IB {
    public static int LIZ = -1;
    public static int LIZIZ = -1;
    public static int LIZJ = -1;

    public static void LIZ(Context context) {
        int i;
        o.LJIIIZ(context, "context");
        C157236Fb c157236Fb = C157236Fb.LIZ;
        int LJI = c157236Fb.LJI();
        int LJIIIZ = c157236Fb.LJIIIZ();
        boolean z = false;
        if ((LJIIIZ == 1 || LJIIIZ == 2 || LJIIIZ == 4 || LJIIIZ == 5) && LJI > 0) {
            z = true;
        }
        if (C60903NvH.LJIIJJI().LJJIII().getABService().getButtonPositionGoDownExperiment()) {
            i = 25;
        } else {
            i = 40;
        }
        LIZIZ = (int) ((((C1549666i.LIZ(z) + C7MY.LIZIZ(i)) + ((int) C74275TDb.LIZIZ(context, 100.0f))) + ((int) C74275TDb.LIZIZ(context, -12.5f))) - C74275TDb.LIZ(1.0f));
    }

    public static void LIZIZ(Context context) {
        int LIZLLL;
        int LIZJ2;
        o.LJIIIZ(context, "context");
        int LIZIZ2 = C81184Vtc.LIZIZ(context);
        if (AnonymousClass668.LIZ()) {
            LIZLLL = C157226Fa.LIZ.LIZLLL();
        } else {
            LIZLLL = C157236Fb.LIZ.LIZLLL();
        }
        if (C81184Vtc.LJ(context) / (LIZIZ2 - LIZLLL) >= 0.5625f) {
            LIZJ2 = C81184Vtc.LJFF(context);
        } else {
            LIZJ2 = (int) ((r2 - LIZJ(context)) - (C81184Vtc.LJ(context) / 0.75f));
        }
        LIZ = LIZJ2;
    }

    public static int LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        int i = LIZIZ;
        if (i >= 0) {
            return i;
        }
        LIZ(context);
        return LIZIZ;
    }

    public static int LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        int i = LIZ;
        if (i >= 0) {
            return i;
        }
        LIZIZ(context);
        return LIZ;
    }
}
