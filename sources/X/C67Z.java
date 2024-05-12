package X;

/* renamed from: X.67Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67Z {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public boolean LJI;
    public boolean LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public C67P LJIIL;

    public final void LIZ(float f, float f2, float f3, float f4) {
        if (!this.LJI) {
            return;
        }
        float f5 = this.LJIIJ;
        float f6 = 1.0f;
        float f7 = 0.0f;
        if (f5 < 0.0f ? !(f > 1.0f || f2 < 0.0f || f3 != this.LJ || f4 != this.LJFF) : !(f > 1.0f || f2 > 0.0f || f3 != this.LJ || f4 != this.LJFF)) {
            this.LJI = false;
            this.LJII = false;
            C67P c67p = this.LJIIL;
            c67p.LJLJJI.LIZ = 1.0f;
            c67p.LJJIFFI(0.0f);
            this.LJIIL.setCenterX(this.LJ);
            this.LJIIL.setCenterY(this.LJFF);
            this.LJIIL.invalidate();
            return;
        }
        if (f > 1.0f) {
            float f8 = f - this.LIZ;
            if (f8 >= 1.0f) {
                f6 = f8;
            }
            this.LJIIL.LJLJJI.LIZ = f6;
        } else {
            float f9 = f + this.LIZ;
            if (f9 <= 1.0f) {
                f6 = f9;
            }
            this.LJIIL.LJLJJI.LIZ = f6;
        }
        if (f5 > 0.0f) {
            if (f2 >= 0.0f) {
                float f10 = f2 - this.LIZIZ;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                this.LJIIL.LJJIFFI(f7);
            }
        } else if (f2 <= 0.0f) {
            float f11 = f2 - this.LIZIZ;
            if (f11 <= 0.0f) {
                f7 = f11;
            }
            this.LJIIL.LJJIFFI(f7);
        }
        float f12 = this.LJIIIIZZ;
        float f13 = this.LJ;
        if (f12 > f13) {
            if (f3 > f13) {
                float f14 = f3 - this.LIZJ;
                if (f14 >= f13) {
                    f13 = f14;
                }
                this.LJIIL.setCenterX(f13);
            }
        } else if (f3 < f13) {
            float f15 = f3 - this.LIZJ;
            if (f15 <= f13) {
                f13 = f15;
            }
            this.LJIIL.setCenterX(f13);
        }
        float f16 = this.LJIIIZ;
        float f17 = this.LJFF;
        if (f16 > f17) {
            if (f4 > f17) {
                float f18 = f4 - this.LIZLLL;
                if (f18 >= f17) {
                    f17 = f18;
                }
                this.LJIIL.setCenterY(f17);
            }
        } else if (f4 < f17) {
            float f19 = f4 - this.LIZLLL;
            if (f19 <= f17) {
                f17 = f19;
            }
            this.LJIIL.setCenterY(f17);
        }
        this.LJIIL.invalidate();
    }

    public final void LIZIZ(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        if (!this.LJII) {
            return;
        }
        float f5 = this.LJIIJ;
        if (f5 < 0.0f ? f2 <= f5 : f2 >= f5) {
            z = true;
        } else {
            z = false;
        }
        float f6 = this.LJIIJJI;
        if (f6 < 1.0f ? f <= f6 : f >= f6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2 && f3 == this.LJIIIIZZ && f4 == this.LJIIIZ) {
            this.LJII = false;
            this.LJI = false;
            C67P c67p = this.LJIIL;
            c67p.LJLJJI.LIZ = f6;
            c67p.LJJIFFI(f5);
            this.LJIIL.setCenterX(this.LJIIIIZZ);
            this.LJIIL.setCenterY(this.LJIIIZ);
            this.LJIIL.invalidate();
            return;
        }
        if (f <= f6) {
            float f7 = f - this.LIZ;
            if (f7 <= f6) {
                f6 = f7;
            }
            this.LJIIL.LJLJJI.LIZ = f6;
        } else {
            float f8 = f + this.LIZ;
            if (f8 >= f6) {
                f6 = f8;
            }
            this.LJIIL.LJLJJI.LIZ = f6;
        }
        if (f5 > 0.0f) {
            if (f2 <= f5) {
                float f9 = f2 - this.LIZIZ;
                if (f9 <= f5) {
                    f5 = f9;
                }
                this.LJIIL.LJJIFFI(f5);
            }
        } else if (f2 >= f5) {
            float f10 = f2 - this.LIZIZ;
            if (f10 >= f5) {
                f5 = f10;
            }
            this.LJIIL.LJJIFFI(f5);
        }
        float f11 = this.LJIIIIZZ;
        if (f11 > this.LJ) {
            if (f3 < f11) {
                float f12 = f3 - this.LIZJ;
                if (f12 <= f11) {
                    f11 = f12;
                }
                this.LJIIL.setCenterX(f11);
            }
        } else if (f3 > f11) {
            float f13 = f3 - this.LIZJ;
            if (f13 >= f11) {
                f11 = f13;
            }
            this.LJIIL.setCenterX(f11);
        }
        float f14 = this.LJIIIZ;
        if (f14 > this.LJFF) {
            if (f4 < f14) {
                float f15 = f4 - this.LIZLLL;
                if (f15 <= f14) {
                    f14 = f15;
                }
                this.LJIIL.setCenterY(f14);
            }
        } else if (f4 > f14) {
            float f16 = f4 - this.LIZLLL;
            if (f16 >= f14) {
                f14 = f16;
            }
            this.LJIIL.setCenterY(f14);
        }
        this.LJIIL.invalidate();
    }
}
