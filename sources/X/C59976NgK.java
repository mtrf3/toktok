package X;

import android.graphics.Color;
import kotlin.jvm.internal.o;

/* renamed from: X.NgK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59976NgK {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(String color) {
        o.LJIIJ(color, "color");
        try {
            return Color.parseColor(color);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String LIZIZ(String rgbaColor) {
        o.LJIIJ(rgbaColor, "rgbaColor");
        try {
            if (rgbaColor.length() != 8 && rgbaColor.length() != 9) {
                if (rgbaColor.length() == 6) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('#');
                    LIZ2.append(rgbaColor);
                    return X1D.LIZIZ(LIZ2);
                }
                return rgbaColor;
            }
            if (ujb.o.LJJJLIIL(rgbaColor, "#", false)) {
                rgbaColor = C40689Fy1.LLF(1, rgbaColor);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(C40689Fy1.LLIIIILZ(2, rgbaColor));
            LIZ3.append(C40689Fy1.LLFFF(2, rgbaColor));
            String LIZIZ = X1D.LIZIZ(LIZ3);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append('#');
            LIZ4.append(LIZIZ);
            return X1D.LIZIZ(LIZ4);
        } catch (Throwable unused) {
            return "#00000000";
        }
    }
}
