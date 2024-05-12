package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Fy2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40690Fy2 {
    public static final String LIZ(String rgbaColor) {
        o.LJIIIZ(rgbaColor, "rgbaColor");
        if (rgbaColor.length() != 8 && rgbaColor.length() != 9) {
            if (rgbaColor.length() == 6) {
                return QZZ.LIZIZ('#', rgbaColor);
            }
            return rgbaColor;
        }
        if (ujb.o.LJJJLIIL(rgbaColor, "#", false)) {
            rgbaColor = C40689Fy1.LLF(1, rgbaColor);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C40689Fy1.LLIIIILZ(2, rgbaColor));
        LIZ.append(C40689Fy1.LLFFF(2, rgbaColor));
        return QZZ.LIZIZ('#', X1D.LIZIZ(LIZ));
    }
}
