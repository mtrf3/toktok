package X;

import android.view.View;

/* renamed from: X.VPk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC79692VPk {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    public final int LJLIL;

    public int intValue() {
        return this.LJLIL;
    }

    public static EnumC79692VPk fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return AT_MOST;
                }
                throw new IllegalArgumentException("Unknown measureMode");
            }
            return EXACTLY;
        }
        return UNDEFINED;
    }

    public static int fromMeasureSpec(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return EXACTLY.intValue();
                }
                throw new IllegalArgumentException("Unknown measureSpec");
            }
            return UNDEFINED.intValue();
        }
        return AT_MOST.intValue();
    }

    public static EnumC79692VPk valueOf(String str) {
        return (EnumC79692VPk) V0N.LJJJ(EnumC79692VPk.class, str);
    }

    EnumC79692VPk(int i) {
        this.LJLIL = i;
    }
}
