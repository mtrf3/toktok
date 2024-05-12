package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YCB extends AbstractC86978YBq {
    public YCB() {
        super("%", 8, 2, 1, 0);
    }

    @Override // X.AbstractC86978YBq
    public final float LIZ(C86982YBu fl, int i, int i2, float f, float f2) {
        int myHeight;
        o.LJIIIZ(fl, "fl");
        if (i2 == 0) {
            if (fl.getMyWidth() != -1) {
                myHeight = fl.getMyWidth();
                return myHeight * f * 0.01f;
            }
            return Float.NaN;
        }
        if (fl.getMyHeight() != -1) {
            myHeight = fl.getMyHeight();
            return myHeight * f * 0.01f;
        }
        return Float.NaN;
    }
}
