package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Wd3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82705Wd3 {
    public static int LIZ;
    public static int LIZIZ;
    public static int LIZJ;

    public static void LIZIZ(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.width == i2 && marginLayoutParams.height == i) {
            return;
        }
        marginLayoutParams.width = i2;
        marginLayoutParams.height = i;
        view.setLayoutParams(marginLayoutParams);
        view.setRotation(0.0f);
    }

    public static void LIZ(Context context, View view, int i, int i2) {
        if (LIZIZ == 0 || LIZ == 0) {
            C82704Wd2.LIZ(context);
        }
        int i3 = C61451O9v.LIZ().LIZ;
        int i4 = LIZ;
        double d = i4;
        int i5 = LIZIZ;
        double d2 = d / i5;
        if (d2 <= 0.5d) {
            double d3 = i / i2;
            double d4 = d / i3;
            if (d3 > 0.625d || d4 > 0.625d || d3 < 0.4699999988079071d) {
                i3 = (i <= 0 || i2 <= 0) ? i4 : (i2 * i4) / i;
            } else {
                i4 = (i <= 0 || i2 <= 0) ? i3 : (i * i3) / i2;
            }
            LIZIZ(i3, i4, view);
            return;
        }
        if (d2 >= 0.6666666666666666d) {
            if (i / i2 > 1.0d) {
                if (i <= 0 || i2 <= 0) {
                    i5 = i4;
                } else {
                    i5 = i4;
                    i4 = (i2 * i4) / i;
                }
            } else if (i <= 0 || i2 <= 0) {
                i4 = i5;
            } else {
                i4 = i5;
                i5 = (i * i5) / i2;
            }
            LIZIZ(i4, i5, view);
            return;
        }
        double d5 = i / i2;
        double d6 = d / i3;
        if (d5 > 0.5625d || d6 > 0.5625d || d5 < 0.4699999988079071d) {
            i3 = (i <= 0 || i2 <= 0) ? i4 : (i2 * i4) / i;
        } else {
            i4 = (i <= 0 || i2 <= 0) ? i3 : (i * i3) / i2;
        }
        LIZIZ(i3, i4, view);
    }
}
