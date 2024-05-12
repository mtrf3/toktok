package X;

import android.util.TypedValue;
import kotlin.jvm.internal.o;

/* renamed from: X.YBy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86986YBy extends AbstractC86978YBq {
    public C86986YBy() {
        super("mm", 10, 2, 1, 0);
    }

    @Override // X.AbstractC86978YBq
    public final float LIZ(C86982YBu fl, int i, int i2, float f, float f2) {
        o.LJIIIZ(fl, "fl");
        return TypedValue.applyDimension(5, f, fl.getResources().getDisplayMetrics());
    }
}
