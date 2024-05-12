package X;

/* renamed from: X.1JN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JN extends C0Q9 {
    public float LIZ;
    public float LIZIZ;
    public final int LIZJ = 2;

    @Override // X.C0Q9
    public final void LIZLLL() {
        this.LIZ = 0.0f;
        this.LIZIZ = 0.0f;
    }

    @Override // X.C0Q9
    public final C0Q9 LIZJ() {
        return new C1JN(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZIZ) + (Float.floatToIntBits(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimationVector2D: v1 = ");
        LIZ.append(this.LIZ);
        LIZ.append(", v2 = ");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C0Q9
    public final int LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.C0Q9
    public final float LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0.0f;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1JN)) {
            return false;
        }
        C1JN c1jn = (C1JN) obj;
        if (c1jn.LIZ != this.LIZ || c1jn.LIZIZ != this.LIZIZ) {
            return false;
        }
        return true;
    }

    public C1JN(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }

    @Override // X.C0Q9
    public final void LJ(float f, int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LIZIZ = f;
            return;
        }
        this.LIZ = f;
    }
}
