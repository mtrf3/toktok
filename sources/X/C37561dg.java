package X;

/* renamed from: X.1dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37561dg extends AbstractInterpolatorC267413e {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public float LJIIJJI;
    public float LJIIL;

    @Override // X.AbstractInterpolatorC267413e
    public final float LIZ() {
        if (this.LJIIJ) {
            return -LIZJ(this.LJIIL);
        }
        return LIZJ(this.LJIIL);
    }

    public final float LIZJ(float f) {
        float f2;
        float f3;
        float f4 = this.LIZLLL;
        if (f <= f4) {
            f2 = this.LIZ;
            f3 = this.LIZIZ;
        } else {
            int i = this.LJIIIZ;
            if (i == 1) {
                return 0.0f;
            }
            f -= f4;
            f4 = this.LJ;
            if (f < f4) {
                f2 = this.LIZIZ;
                f3 = this.LIZJ;
            } else {
                if (i == 2) {
                    return this.LJII;
                }
                float f5 = f - f4;
                float f6 = this.LJFF;
                if (f5 < f6) {
                    float f7 = this.LIZJ;
                    return C65232Piu.LIZIZ(f5, f7, f6, f7);
                }
                return this.LJIIIIZZ;
            }
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.LIZLLL;
        if (f <= f3) {
            float f4 = this.LIZ;
            f2 = ((((this.LIZIZ - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.LJIIIZ;
            if (i == 1) {
                f2 = this.LJI;
            } else {
                float f5 = f - f3;
                float f6 = this.LJ;
                if (f5 < f6) {
                    float f7 = this.LJI;
                    float f8 = this.LIZIZ;
                    f2 = ((((this.LIZJ - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.LJII;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.LJFF;
                    if (f9 < f10) {
                        float f11 = this.LJII;
                        float f12 = this.LIZJ * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.LJIIIIZZ;
                    }
                }
            }
        }
        this.LJIIL = f;
        if (this.LJIIJ) {
            return this.LJIIJJI - f2;
        }
        return this.LJIIJJI + f2;
    }

    public final void LIZLLL(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.LIZ = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (sqrt < f4) {
                this.LJIIIZ = 2;
                this.LIZ = f;
                this.LIZIZ = sqrt;
                this.LIZJ = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.LIZLLL = f8;
                this.LJ = sqrt / f3;
                this.LJI = ((f + sqrt) * f8) / 2.0f;
                this.LJII = f2;
                this.LJIIIIZZ = f2;
                return;
            }
            this.LJIIIZ = 3;
            this.LIZ = f;
            this.LIZIZ = f4;
            this.LIZJ = f4;
            float f9 = (f4 - f) / f3;
            this.LIZLLL = f9;
            float f10 = f4 / f3;
            this.LJFF = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.LJ = ((f2 - f11) - f12) / f4;
            this.LJI = f11;
            this.LJII = f2 - f12;
            this.LJIIIIZZ = f2;
            return;
        }
        if (f7 >= f2) {
            this.LJIIIZ = 1;
            this.LIZ = f;
            this.LIZIZ = 0.0f;
            this.LJI = f2;
            this.LIZLLL = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.LJIIIZ = 2;
            this.LIZ = f;
            this.LIZIZ = f;
            this.LIZJ = 0.0f;
            this.LJI = f13;
            this.LJII = f2;
            this.LIZLLL = f14;
            this.LJ = f6;
            return;
        }
        float sqrt2 = (float) Math.sqrt(C6D8.LIZ(f, f, 2.0f, f3 * f2));
        float f15 = (sqrt2 - f) / f3;
        this.LIZLLL = f15;
        float f16 = sqrt2 / f3;
        this.LJ = f16;
        if (sqrt2 < f4) {
            this.LJIIIZ = 2;
            this.LIZ = f;
            this.LIZIZ = sqrt2;
            this.LIZJ = 0.0f;
            this.LIZLLL = f15;
            this.LJ = f16;
            this.LJI = ((f + sqrt2) * f15) / 2.0f;
            this.LJII = f2;
            return;
        }
        this.LJIIIZ = 3;
        this.LIZ = f;
        this.LIZIZ = f4;
        this.LIZJ = f4;
        float f17 = (f4 - f) / f3;
        this.LIZLLL = f17;
        float f18 = f4 / f3;
        this.LJFF = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.LJ = ((f2 - f19) - f20) / f4;
        this.LJI = f19;
        this.LJII = f2 - f20;
        this.LJIIIIZZ = f2;
    }

    public final void LIZIZ(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        this.LJIIJJI = f;
        if (f > f2) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIJ = z;
        if (z) {
            LIZLLL(-f3, f - f2, f5, f6, f4);
        } else {
            LIZLLL(f3, f2 - f, f5, f6, f4);
        }
    }
}
