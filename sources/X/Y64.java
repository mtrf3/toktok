package X;

/* loaded from: classes16.dex */
public final class Y64 implements Comparable<Y64> {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public final int hashCode() {
        return (this.LJLIL * 31) + this.LJLILLLLZI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append("x");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    public final Y64 LIZJ(Y64 y64) {
        int i = this.LJLIL;
        int i2 = y64.LJLILLLLZI;
        int i3 = i * i2;
        int i4 = y64.LJLIL;
        int i5 = this.LJLILLLLZI;
        if (i3 <= i4 * i5) {
            return new Y64(i4, (i5 * i4) / i);
        }
        return new Y64((i * i2) / i5, i2);
    }

    public final Y64 LIZLLL(Y64 y64) {
        int i = this.LJLIL;
        int i2 = y64.LJLILLLLZI;
        int i3 = i * i2;
        int i4 = y64.LJLIL;
        int i5 = this.LJLILLLLZI;
        if (i3 >= i4 * i5) {
            return new Y64(i4, (i5 * i4) / i);
        }
        return new Y64((i * i2) / i5, i2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Y64 y64) {
        Y64 y642 = y64;
        int i = this.LJLILLLLZI * this.LJLIL;
        int i2 = y642.LJLILLLLZI * y642.LJLIL;
        if (i2 < i) {
            return 1;
        }
        if (i2 > i) {
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y64.class != obj.getClass()) {
            return false;
        }
        Y64 y64 = (Y64) obj;
        if (this.LJLIL == y64.LJLIL && this.LJLILLLLZI == y64.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public Y64(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
