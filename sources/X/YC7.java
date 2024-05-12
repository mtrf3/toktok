package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YC7 extends AbstractC86978YBq {
    public YC7() {
        super("match_parent", 0, 0, 0, 0);
    }

    @Override // X.AbstractC86978YBq
    public final float LIZ(C86982YBu fl, int i, int i2, float f, float f2) {
        int myHeight;
        o.LJIIIZ(fl, "fl");
        if (i2 == 0) {
            if (fl.getMyWidth() == -1) {
                return Float.NaN;
            }
            myHeight = fl.getMyWidth();
        } else {
            if (fl.getMyHeight() == -1) {
                return Float.NaN;
            }
            myHeight = fl.getMyHeight();
        }
        return myHeight;
    }
}
