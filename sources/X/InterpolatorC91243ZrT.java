package X;

import android.view.animation.Interpolator;

/* renamed from: X.ZrT, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class InterpolatorC91243ZrT implements Interpolator {
    public final Interpolator LIZ = InterpolatorC91142Zpq.LIZ;
    public final Interpolator LIZIZ;
    public boolean LIZJ;

    public InterpolatorC91243ZrT(Interpolator interpolator) {
        this.LIZIZ = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (this.LIZJ) {
            return this.LIZIZ.getInterpolation(f);
        }
        return this.LIZ.getInterpolation(f);
    }
}
