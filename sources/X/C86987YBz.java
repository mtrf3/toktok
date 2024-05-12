package X;

import android.util.TypedValue;
import kotlin.jvm.internal.o;

/* renamed from: X.YBz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86987YBz extends AbstractC86978YBq {
    public C86987YBz() {
        super("dp", 10, 2, 1, 0);
    }

    @Override // X.AbstractC86978YBq
    public final float LIZ(C86982YBu fl, int i, int i2, float f, float f2) {
        o.LJIIIZ(fl, "fl");
        return TypedValue.applyDimension(1, f, fl.getResources().getDisplayMetrics());
    }
}
