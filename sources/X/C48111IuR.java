package X;

/* renamed from: X.IuR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48111IuR {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoHttpHeaderInfo{key='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", mime='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", contentLength=");
        LIZ.append(this.LIZJ);
        LIZ.append(", flag=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", extra='");
        return C77800Ug8.LIZJ(LIZ, this.LJ, '\'', '}', LIZ);
    }

    public C48111IuR(int i, int i2, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = str3;
    }
}
