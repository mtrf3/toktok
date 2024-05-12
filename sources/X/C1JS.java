package X;

/* renamed from: X.1JS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JS implements InterfaceC07020Pi {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31), 31);
    }

    @Override // X.InterfaceC07020Pi
    public final float LIZ(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / 2;
                    float f5 = 3;
                    float f6 = 1 - f4;
                    float f7 = f4 * f4 * f4;
                    float LIZ = C06490Nh.LIZ(this.LIZJ, f5, f6, f4, f4, this.LIZ * f5 * f6 * f6 * f4) + f7;
                    if (Math.abs(f - LIZ) < 0.001f) {
                        return (f5 * this.LIZLLL * f6 * f4 * f4) + (this.LIZIZ * f5 * f6 * f6 * f4) + f7;
                    }
                    if (LIZ < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1JS)) {
            return false;
        }
        C1JS c1js = (C1JS) obj;
        if (this.LIZ != c1js.LIZ || this.LIZIZ != c1js.LIZIZ || this.LIZJ != c1js.LIZJ || this.LIZLLL != c1js.LIZLLL) {
            return false;
        }
        return true;
    }

    public C1JS(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
