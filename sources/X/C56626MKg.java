package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.o;

/* renamed from: X.MKg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56626MKg extends C1C9 {
    public C56626MKg(Context context) {
        super(context);
    }

    @Override // X.C0AB
    public final PointF LIZ(int i) {
        return super.LIZ(i);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        o.LJIIIZ(displayMetrics, "displayMetrics");
        return 100.0f / displayMetrics.densityDpi;
    }
}
