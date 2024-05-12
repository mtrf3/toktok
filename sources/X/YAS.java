package X;

/* loaded from: classes16.dex */
public final class YAS {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YAS)) {
            return false;
        }
        YAS yas = (YAS) obj;
        return Float.compare(this.LIZ, yas.LIZ) == 0 && Float.compare(this.LIZIZ, yas.LIZIZ) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZIZ) + (Float.floatToIntBits(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinePt(x=");
        LIZ.append(this.LIZ);
        LIZ.append(", y=");
        return C74221TAz.LIZLLL(LIZ, this.LIZIZ, ')', LIZ);
    }

    public YAS(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }

    public static YAS LIZ(YAS yas, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = yas.LIZ;
        }
        if ((i & 2) != 0) {
            f2 = yas.LIZIZ;
        }
        yas.getClass();
        return new YAS(f, f2);
    }
}
