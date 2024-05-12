package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J7C {
    public static final int LIZIZ(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static final float LIZ(Context context, float f) {
        o.LJIIIZ(context, "context");
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "context.resources");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }
}
