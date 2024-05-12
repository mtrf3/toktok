package X;

/* renamed from: X.P3c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C63824P3c {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public float LIZLLL;

    public final boolean LIZ() {
        if (this.LIZ > this.LIZJ && this.LIZLLL > 0.001f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExposureCompensationInfo{max = ");
        LIZ.append(this.LIZ);
        LIZ.append(", exposure = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", min = ");
        LIZ.append(this.LIZJ);
        LIZ.append(", step = ");
        LIZ.append(this.LIZLLL);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }
}
