package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.00Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00Q {
    public double LIZ;
    public double LIZIZ;
    public boolean LIZJ;
    public double LIZLLL;
    public double LJ;
    public double LJFF;
    public double LJI;
    public double LJII;
    public double LJIIIIZZ;
    public final C00N LJIIIZ;

    public C00Q() {
        this.LIZ = Math.sqrt(1500.0d);
        this.LIZIZ = 0.5d;
        this.LIZJ = false;
        this.LJIIIIZZ = Double.MAX_VALUE;
        this.LJIIIZ = new C00N();
    }

    public C00Q(float f) {
        this.LIZ = Math.sqrt(1500.0d);
        this.LIZIZ = 0.5d;
        this.LIZJ = false;
        this.LJIIIZ = new C00N();
        this.LJIIIIZZ = f;
    }

    public final void LIZ(float f) {
        if (f >= 0.0f) {
            this.LIZIZ = f;
            this.LIZJ = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void LIZIZ(float f) {
        if (f > 0.0f) {
            this.LIZ = Math.sqrt(f);
            this.LIZJ = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final C00N LIZJ(double d, double d2, long j) {
        double sin;
        double cos;
        if (!this.LIZJ) {
            if (this.LJIIIIZZ != Double.MAX_VALUE) {
                double d3 = this.LIZIZ;
                if (d3 > 1.0d) {
                    double d4 = this.LIZ;
                    this.LJFF = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                    double d5 = this.LIZIZ;
                    double d6 = this.LIZ;
                    this.LJI = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
                } else if (d3 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d3 < 1.0d) {
                    this.LJII = Math.sqrt(1.0d - (d3 * d3)) * this.LIZ;
                }
                this.LIZJ = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.LJIIIIZZ;
        double d9 = this.LIZIZ;
        if (d9 > 1.0d) {
            double d10 = this.LJI;
            double d11 = this.LJFF;
            double d12 = d8 - (((d10 * d8) - d2) / (d10 - d11));
            double d13 = ((d8 * d10) - d2) / (d10 - d11);
            sin = (Math.pow(2.718281828459045d, this.LJFF * d7) * d13) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d14 = this.LJI;
            double pow = Math.pow(2.718281828459045d, d14 * d7) * d12 * d14;
            double d15 = this.LJFF;
            cos = (Math.pow(2.718281828459045d, d15 * d7) * d13 * d15) + pow;
        } else if (d9 == 1.0d) {
            double d16 = this.LIZ;
            double d17 = (d16 * d8) + d2;
            double d18 = (d17 * d7) + d8;
            sin = Math.pow(2.718281828459045d, (-d16) * d7) * d18;
            double pow2 = Math.pow(2.718281828459045d, (-this.LIZ) * d7) * d18;
            double d19 = this.LIZ;
            cos = (Math.pow(2.718281828459045d, (-d19) * d7) * d17) + (pow2 * (-d19));
        } else {
            double d20 = 1.0d / this.LJII;
            double d21 = this.LIZ;
            double d22 = ((d9 * d21 * d8) + d2) * d20;
            sin = ((Math.sin(this.LJII * d7) * d22) + (Math.cos(this.LJII * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d21 * d7);
            double d23 = this.LIZ;
            double d24 = this.LIZIZ;
            double d25 = (-d23) * sin * d24;
            double pow3 = Math.pow(2.718281828459045d, (-d24) * d23 * d7);
            double d26 = this.LJII;
            double sin2 = Math.sin(d26 * d7) * (-d26) * d8;
            double d27 = this.LJII;
            cos = (((Math.cos(d27 * d7) * d22 * d27) + sin2) * pow3) + d25;
        }
        C00N c00n = this.LJIIIZ;
        c00n.LIZ = (float) (sin + this.LJIIIIZZ);
        c00n.LIZIZ = (float) cos;
        return c00n;
    }
}
