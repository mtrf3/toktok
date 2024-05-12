package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class B9K {
    public static int LIZIZ(Context context) {
        if (context == null) {
            return 0;
        }
        int LJIIJJI = KL2.LJIIJJI(context);
        int LJIIIZ = KL2.LJIIIZ(context);
        if (LJIIIZ < LJIIJJI) {
            return LJIIJJI;
        }
        return LJIIIZ;
    }

    public static int LIZJ(Context context) {
        if (context == null) {
            return 0;
        }
        int LJIIJJI = KL2.LJIIJJI(context);
        int LJIIIZ = KL2.LJIIIZ(context);
        if (LJIIIZ > LJIIJJI) {
            return LJIIJJI;
        }
        return LJIIIZ;
    }

    public static float LIZ(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int LIZLLL(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
