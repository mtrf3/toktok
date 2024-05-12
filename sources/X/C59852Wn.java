package X;

/* renamed from: X.2Wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59852Wn {
    public final float LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59852Wn)) {
            return false;
        }
        C59852Wn c59852Wn = (C59852Wn) obj;
        return Float.compare(this.LIZ, c59852Wn.LIZ) == 0 && this.LIZIZ == c59852Wn.LIZIZ && Float.compare(this.LIZJ, c59852Wn.LIZJ) == 0 && Float.compare(this.LIZLLL, c59852Wn.LIZLLL) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + C47959Irz.LIZIZ(this.LIZJ, ((Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("confidence == ");
        LIZ.append(this.LIZ);
        LIZ.append(", hand == ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", leftPercent == ");
        LIZ.append(this.LIZJ);
        LIZ.append(", rightPercent == ");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    public C59852Wn(float f, float f2, float f3, int i) {
        this.LIZ = f;
        this.LIZIZ = i;
        this.LIZJ = f2;
        this.LIZLLL = f3;
    }
}
