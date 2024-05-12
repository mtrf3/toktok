package X;

/* renamed from: X.MlE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57732MlE {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57732MlE)) {
            return false;
        }
        C57732MlE c57732MlE = (C57732MlE) obj;
        return Float.compare(this.LIZ, c57732MlE.LIZ) == 0 && Float.compare(this.LIZIZ, c57732MlE.LIZIZ) == 0 && Float.compare(this.LIZJ, c57732MlE.LIZJ) == 0 && Float.compare(this.LIZLLL, c57732MlE.LIZLLL) == 0 && Float.compare(this.LJ, c57732MlE.LJ) == 0 && Float.compare(this.LJFF, c57732MlE.LJFF) == 0 && Float.compare(this.LJI, c57732MlE.LJI) == 0;
    }

    public C57732MlE() {
        this(1.0f, 10.0f, 0.001f, 0.1f, 0.5f, 0.6f, 0.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LJI) + C47959Irz.LIZIZ(this.LJFF, C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Params(colorMergingTolerance=");
        LIZ.append(this.LIZ);
        LIZ.append(", lightnessAddition=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cLeft=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cRight=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", lLeft=");
        LIZ.append(this.LJ);
        LIZ.append(", lRight=");
        LIZ.append(this.LJFF);
        LIZ.append(", strategyThreshold=");
        return C74221TAz.LIZLLL(LIZ, this.LJI, ')', LIZ);
    }

    public C57732MlE(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
        this.LJFF = f6;
        this.LJI = f7;
    }
}
