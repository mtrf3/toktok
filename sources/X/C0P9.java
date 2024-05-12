package X;

import android.view.animation.Interpolator;

/* renamed from: X.0P9, reason: invalid class name */
/* loaded from: classes.dex */
public class C0P9 {
    public final int LIZ;
    public float LIZIZ;
    public final Interpolator LIZJ;
    public final long LIZLLL;

    public float LIZIZ() {
        Interpolator interpolator = this.LIZJ;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.LIZIZ);
        }
        return this.LIZIZ;
    }

    public long LIZ() {
        return this.LIZLLL;
    }

    public int LIZJ() {
        return this.LIZ;
    }

    public void LIZLLL(float f) {
        this.LIZIZ = f;
    }

    public C0P9(int i, Interpolator interpolator, long j) {
        this.LIZ = i;
        this.LIZJ = interpolator;
        this.LIZLLL = j;
    }
}
