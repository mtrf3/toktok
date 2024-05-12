package X;

import android.util.TypedValue;
import com.lynx.tasm.utils.DisplayMetricsHolder;

/* loaded from: classes14.dex */
public final class V9Y {
    public static float LIZ(float f) {
        return TypedValue.applyDimension(1, f, DisplayMetricsHolder.LIZIZ());
    }

    public static float LIZIZ(float f) {
        return f / DisplayMetricsHolder.LIZIZ().density;
    }
}
