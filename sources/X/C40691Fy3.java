package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Fy3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40691Fy3 {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(int i) {
        return C0ON.LIZJ(Q8U.LIZIZ(new Object[]{Integer.valueOf(((16711680 & i) >> 16) & 255)}, 1, "%02X", "format(format, *args)"), Q8U.LIZIZ(new Object[]{Integer.valueOf(((65280 & i) >> 8) & 255)}, 1, "%02X", "format(format, *args)"), Q8U.LIZIZ(new Object[]{Integer.valueOf(i & 255 & 255)}, 1, "%02X", "format(format, *args)"), Q8U.LIZIZ(new Object[]{Integer.valueOf((i >>> 24) & 255)}, 1, "%02X", "format(format, *args)"));
    }

    public static String LIZIZ(String rgbaColor) {
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
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C40689Fy1.LLIIIILZ(2, rgbaColor));
        LIZ2.append(C40689Fy1.LLFFF(2, rgbaColor));
        return QZZ.LIZIZ('#', X1D.LIZIZ(LIZ2));
    }
}
