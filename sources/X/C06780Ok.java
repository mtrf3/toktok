package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: X.0Ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06780Ok<T> {
    public final C0GY LIZ;
    public final T LIZIZ;
    public T LIZJ;
    public final Interpolator LIZLLL;
    public final float LJ;
    public Float LJFF;
    public float LJI;
    public float LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public PointF LJIIL;
    public PointF LJIILIIL;

    public final float LIZIZ() {
        if (this.LIZ == null) {
            return 1.0f;
        }
        if (this.LJIIJJI == Float.MIN_VALUE) {
            if (this.LJFF == null) {
                this.LJIIJJI = 1.0f;
            } else {
                float LIZJ = LIZJ();
                float floatValue = this.LJFF.floatValue() - this.LJ;
                C0GY c0gy = this.LIZ;
                this.LJIIJJI = (floatValue / (c0gy.LJIIJ - c0gy.LJIIIZ)) + LIZJ;
            }
        }
        return this.LJIIJJI;
    }

    public final float LIZJ() {
        C0GY c0gy = this.LIZ;
        if (c0gy == null) {
            return 0.0f;
        }
        if (this.LJIIJ == Float.MIN_VALUE) {
            float f = this.LJ;
            float f2 = c0gy.LJIIIZ;
            this.LJIIJ = (f - f2) / (c0gy.LJIIJ - f2);
        }
        return this.LJIIJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Keyframe{startValue=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", endValue=");
        LIZ.append(this.LIZJ);
        LIZ.append(", startFrame=");
        LIZ.append(this.LJ);
        LIZ.append(", endFrame=");
        LIZ.append(this.LJFF);
        LIZ.append(", interpolator=");
        LIZ.append(this.LIZLLL);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C06780Ok(T t) {
        this.LJI = -3987645.8f;
        this.LJII = -3987645.8f;
        this.LJIIIIZZ = 784923401;
        this.LJIIIZ = 784923401;
        this.LJIIJ = Float.MIN_VALUE;
        this.LJIIJJI = Float.MIN_VALUE;
        this.LIZIZ = t;
        this.LIZJ = t;
        this.LJ = Float.MIN_VALUE;
        this.LJFF = Float.valueOf(Float.MAX_VALUE);
    }

    public final boolean LIZ(float f) {
        if (f >= LIZJ() && f < LIZIZ()) {
            return true;
        }
        return false;
    }

    public C06780Ok(C0GY c0gy, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.LJI = -3987645.8f;
        this.LJII = -3987645.8f;
        this.LJIIIIZZ = 784923401;
        this.LJIIIZ = 784923401;
        this.LJIIJ = Float.MIN_VALUE;
        this.LJIIJJI = Float.MIN_VALUE;
        this.LIZ = c0gy;
        this.LIZIZ = t;
        this.LIZJ = t2;
        this.LIZLLL = interpolator;
        this.LJ = f;
        this.LJFF = f2;
    }
}
