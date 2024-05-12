package X;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J79 extends Y8J {
    public static int LJIIIIZZ(Context context, Context context2) {
        boolean z;
        if (context == null) {
            context = context2;
        }
        Resources resources = context.getResources();
        o.LJFF(resources, "resContext.resources");
        int i = 0;
        if (resources.getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        int i2 = J78.LIZIZ;
        if (i2 <= 0) {
            J78.LIZ(context);
            i2 = J78.LIZIZ;
            if (i2 <= 0) {
                i2 = 0;
            }
        }
        int LJIIIZ = LJIIIZ(i2, context);
        int i3 = J78.LIZ;
        if (i3 <= 0) {
            J78.LIZ(context);
            int i4 = J78.LIZ;
            if (i4 > 0) {
                i = i4;
            }
            i3 = i;
        }
        int LJIIIZ2 = LJIIIZ(i3, context);
        if (z) {
            return Math.min(LJIIIZ, LJIIIZ2);
        }
        return Math.max(LJIIIZ, LJIIIZ2);
    }

    public static int LJIIIZ(double d, Context context) {
        o.LJFF(context.getResources(), "context.resources");
        return (int) ((d / r1.getDisplayMetrics().density) + 0.5f);
    }
}
