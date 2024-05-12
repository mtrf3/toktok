package X;

/* renamed from: X.1JP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JP extends C0Q9 {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public final int LJ = 4;

    @Override // X.C0Q9
    public final void LIZLLL() {
        this.LIZ = 0.0f;
        this.LIZIZ = 0.0f;
        this.LIZJ = 0.0f;
        this.LIZLLL = 0.0f;
    }

    @Override // X.C0Q9
    public final C0Q9 LIZJ() {
        return new C1JP(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimationVector4D: v1 = ");
        LIZ.append(this.LIZ);
        LIZ.append(", v2 = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", v3 = ");
        LIZ.append(this.LIZJ);
        LIZ.append(", v4 = ");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C0Q9
    public final int LIZIZ() {
        return this.LJ;
    }

    @Override // X.C0Q9
    public final float LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0.0f;
                    }
                    return this.LIZLLL;
                }
                return this.LIZJ;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1JP)) {
            return false;
        }
        C1JP c1jp = (C1JP) obj;
        if (c1jp.LIZ != this.LIZ || c1jp.LIZIZ != this.LIZIZ || c1jp.LIZJ != this.LIZJ || c1jp.LIZLLL != this.LIZLLL) {
            return false;
        }
        return true;
    }

    @Override // X.C0Q9
    public final void LJ(float f, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.LIZLLL = f;
                    return;
                }
                this.LIZJ = f;
                return;
            }
            this.LIZIZ = f;
            return;
        }
        this.LIZ = f;
    }

    public C1JP(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
