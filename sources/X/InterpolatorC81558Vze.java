package X;

import android.view.animation.Interpolator;

/* renamed from: X.Vze, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class InterpolatorC81558Vze implements Interpolator {
    public final /* synthetic */ C81556Vzc LIZ;
    public final /* synthetic */ Interpolator LIZIZ;

    public InterpolatorC81558Vze(C81556Vzc c81556Vzc, Interpolator interpolator) {
        this.LIZ = c81556Vzc;
        this.LIZIZ = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        C81556Vzc c81556Vzc = this.LIZ;
        if (c81556Vzc.LLIIII == 0) {
            c81556Vzc.LLIIIILZ = System.nanoTime();
        }
        this.LIZ.LLIIII++;
        return this.LIZIZ.getInterpolation(f);
    }
}
