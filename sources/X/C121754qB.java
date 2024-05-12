package X;

/* renamed from: X.4qB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121754qB {
    public final Double LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C121754qB) && Float.compare(this.LIZIZ, ((C121754qB) obj).LIZIZ) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordParams(volume=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", dbRange=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C121754qB(float f, Double d) {
        this.LIZIZ = f;
        this.LIZ = d;
    }
}
