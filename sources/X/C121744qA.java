package X;

/* renamed from: X.4qA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121744qA {
    public final Double LIZ;
    public float LIZIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C121744qA) && Float.compare(this.LIZIZ, ((C121744qA) obj).LIZIZ) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Params(volume=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", dbRange=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C121744qA(float f) {
        this.LIZIZ = f;
    }

    public C121744qA(float f, Double d) {
        this(f);
        this.LIZ = d;
    }
}
