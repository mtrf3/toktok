package X;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;

/* renamed from: X.Ves, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80270Ves {
    public static final int[] LIZ = {R.attr.state_pressed};
    public static final int[] LIZIZ = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] LIZJ = {R.attr.state_selected};
    public static final int[] LIZLLL = {R.attr.state_enabled, R.attr.state_pressed};

    static {
        C16880lQ.LJLLJ(C80270Ves.class);
    }

    public static ColorStateList LIZ(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{LIZJ, StateSet.NOTHING}, new int[]{LIZIZ(colorStateList, LIZIZ), LIZIZ(colorStateList, LIZ)});
    }

    public static ColorStateList LIZJ(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
                Color.alpha(colorStateList.getColorForState(LIZLLL, 0));
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean LIZLLL(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static int LIZIZ(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        return C07290Qj.LJIIL(i, Math.min(Color.alpha(i) * 2, 255));
    }
}
