package X;

import android.graphics.PointF;

/* renamed from: X.8fA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216848fA extends InterpolatorC216858fB {
    public boolean LIZLLL;

    public C216848fA() {
        PointF pointF = this.LIZIZ;
        pointF.x = 0.46f;
        pointF.y = 0.0f;
        PointF pointF2 = this.LIZJ;
        pointF2.x = 0.18f;
        pointF2.y = 1.0f;
    }

    @Override // X.InterpolatorC216858fB, android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (this.LIZLLL) {
            return super.getInterpolation(f);
        }
        float f2 = f - 1.0f;
        return C06490Nh.LIZ(f2, f2, f2, f2, f2, 1.0f);
    }
}
