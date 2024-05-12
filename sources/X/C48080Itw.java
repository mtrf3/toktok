package X;

/* renamed from: X.Itw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48080Itw {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RequestLine{method='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", path='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", version='");
        return C77800Ug8.LIZJ(LIZ, this.LIZJ, '\'', '}', LIZ);
    }

    public C48080Itw(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
