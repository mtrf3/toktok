package X;

/* loaded from: classes16.dex */
public final class YAR {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YAR)) {
            return false;
        }
        YAR yar = (YAR) obj;
        return Float.compare(this.LIZ, yar.LIZ) == 0 && Float.compare(this.LIZIZ, yar.LIZIZ) == 0 && Float.compare(this.LIZJ, yar.LIZJ) == 0 && Float.compare(this.LIZLLL, yar.LIZLLL) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ArcPt(x=");
        LIZ.append(this.LIZ);
        LIZ.append(", y=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", radius=");
        LIZ.append(this.LIZJ);
        LIZ.append(", angle=");
        return C74221TAz.LIZLLL(LIZ, this.LIZLLL, ')', LIZ);
    }

    public YAR(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
