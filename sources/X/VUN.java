package X;

import com.lynx.tasm.utils.DisplayMetricsHolder;

/* loaded from: classes15.dex */
public final class VUN extends C49615Jdb {
    public VUN(int i, String str) {
        super(i, str);
    }

    public final void LIZLLL(int i, int i2, int i3, int i4, int i5, int i6) {
        if (DisplayMetricsHolder.LIZIZ() == null) {
            return;
        }
        LIZJ(Float.valueOf(i / DisplayMetricsHolder.LIZIZ().density), "scrollLeft");
        LIZJ(Float.valueOf(i2 / DisplayMetricsHolder.LIZIZ().density), "scrollTop");
        LIZJ(Float.valueOf(i3 / DisplayMetricsHolder.LIZIZ().density), "scrollHeight");
        LIZJ(Float.valueOf(i4 / DisplayMetricsHolder.LIZIZ().density), "scrollWidth");
        LIZJ(Float.valueOf(i5 / DisplayMetricsHolder.LIZIZ().density), "deltaX");
        LIZJ(Float.valueOf(i6 / DisplayMetricsHolder.LIZIZ().density), "deltaY");
    }
}
