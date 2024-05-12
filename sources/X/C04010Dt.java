package X;

import android.content.Context;

/* renamed from: X.0Dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04010Dt {
    public static boolean LIZ = false;
    public static int LIZIZ = 2;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static void LIZ(Context context) {
        if (LIZLLL || context == null || context.getResources() == null || context.getResources().getDisplayMetrics() == null) {
            return;
        }
        float f = context.getResources().getDisplayMetrics().density;
        if (f < 2.0f && f > 0.01f) {
            LIZJ = true;
        } else if (C03970Dp.LJI && LIZ) {
            LIZJ = true;
        }
        LIZLLL = true;
    }
}
