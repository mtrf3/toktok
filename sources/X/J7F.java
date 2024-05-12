package X;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J7F {
    public static DisplayMetrics LIZ;

    public static final float LIZ(float f, Context context) {
        if (LIZ == null) {
            LIZ = context.getResources().getDisplayMetrics();
        }
        DisplayMetrics displayMetrics = LIZ;
        o.LJI(displayMetrics);
        float f2 = 3.0f;
        if (displayMetrics.density < 3.0f) {
            f2 = 2.0f;
        }
        return (f * f2) + 0.5f;
    }
}
