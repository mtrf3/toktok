package X;

/* renamed from: X.0tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22140tu {
    public static final C22140tu LIZJ = new C22140tu(1.0f, 0.0f);
    public final float LIZ;
    public final float LIZIZ;

    public C22140tu() {
        this(1.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZIZ) + (Float.floatToIntBits(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextGeometricTransform(scaleX=");
        LIZ.append(this.LIZ);
        LIZ.append(", skewX=");
        return C74221TAz.LIZLLL(LIZ, this.LIZIZ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22140tu)) {
            return false;
        }
        C22140tu c22140tu = (C22140tu) obj;
        if (this.LIZ == c22140tu.LIZ && this.LIZIZ == c22140tu.LIZIZ) {
            return true;
        }
        return false;
    }

    public C22140tu(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
