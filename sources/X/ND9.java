package X;

/* loaded from: classes11.dex */
public final class ND9 {
    public int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public int LIZLLL;

    public ND9() {
        this(0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ND9)) {
            return false;
        }
        ND9 nd9 = (ND9) obj;
        return this.LIZ == nd9.LIZ && this.LIZIZ == nd9.LIZIZ && this.LIZJ == nd9.LIZJ && this.LIZLLL == nd9.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("marginStart:");
        LIZ.append(this.LIZ);
        LIZ.append("\nmarginEnd:");
        LIZ.append(this.LIZIZ);
        LIZ.append("\nbottomMargin:");
        LIZ.append(this.LIZJ);
        LIZ.append("\ntopMargin:");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    public ND9(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}
