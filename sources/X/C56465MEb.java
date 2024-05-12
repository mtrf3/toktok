package X;

import android.animation.TimeInterpolator;
import android.graphics.PointF;

/* renamed from: X.MEb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56465MEb implements TimeInterpolator {
    public final PointF LIZ;
    public final PointF LIZIZ;
    public final MKJ LIZJ;

    public C56465MEb() {
        PointF pointF = new PointF(0.15f, 0.0f);
        PointF pointF2 = new PointF(0.85f, 1.0f);
        this.LIZ = new PointF(0.0f, 0.0f);
        this.LIZIZ = new PointF(1.0f, 1.0f);
        this.LIZJ = new MKJ(pointF, pointF2);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (Math.abs(f - 0.0f) < 1.0E-6f) {
            return 1.0f;
        }
        if (f < 0.4f) {
            float f2 = 1;
            return f2 - ((f2 - 0.8f) * this.LIZJ.evaluate(f / 0.4f, this.LIZ, this.LIZIZ).y);
        }
        if (f <= 0.6f) {
            return 0.8f;
        }
        return C06420Na.LIZIZ(1, 0.8f, this.LIZJ.evaluate((f - 0.6f) / 0.39999998f, this.LIZ, this.LIZIZ).y, 0.8f);
    }
}
