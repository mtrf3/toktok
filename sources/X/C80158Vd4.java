package X;

import android.graphics.PointF;
import android.view.View;

/* renamed from: X.Vd4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80158Vd4 {
    public PointF LIZ;
    public C80158Vd4 LIZIZ;
    public boolean LIZJ = true;

    public final boolean LIZ(View view) {
        C80158Vd4 c80158Vd4 = this.LIZIZ;
        if (c80158Vd4 != null) {
            return c80158Vd4.LIZ(view);
        }
        return InterpolatorC80153Vcz.LIZ(view, this.LIZ, this.LIZJ);
    }

    public final boolean LIZIZ(View view) {
        C80158Vd4 c80158Vd4 = this.LIZIZ;
        if (c80158Vd4 != null) {
            return c80158Vd4.LIZIZ(view);
        }
        return InterpolatorC80153Vcz.LIZIZ(view, this.LIZ);
    }
}
