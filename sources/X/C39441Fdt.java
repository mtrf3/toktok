package X;

import android.content.res.Resources;

/* renamed from: X.Fdt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39441Fdt {
    public static final int LIZ;
    public static final long LIZIZ;
    public static final float LIZJ;

    static {
        int i;
        double d = FKM.LIZ().getResources().getDisplayMetrics().density;
        if (d <= 1.4d) {
            i = 1;
        } else if (d <= 2.4d) {
            i = 2;
        } else {
            i = 3;
        }
        LIZ = i;
        Resources.getSystem().getDisplayMetrics();
        LIZIZ = 1048576L;
        LIZJ = 2.0f;
    }
}
