package X;

import android.util.TypedValue;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YC2 extends AbstractC86978YBq {
    public YC2() {
        super("sp", 10, 2, 1, 0);
    }

    @Override // X.AbstractC86978YBq
    public final float LIZ(C86982YBu fl, int i, int i2, float f, float f2) {
        o.LJIIIZ(fl, "fl");
        return TypedValue.applyDimension(2, f, fl.getResources().getDisplayMetrics());
    }
}
