package X;

/* renamed from: X.IuF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48099IuF {
    public final String LIZ;
    public final String LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HttpHeader{name='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", value='");
        return C77800Ug8.LIZJ(LIZ, this.LIZIZ, '\'', '}', LIZ);
    }

    public C48099IuF(String str, String str2) {
        String trim = str.trim();
        String trim2 = str2.trim();
        if (trim.length() != 0 && trim2.length() != 0) {
            this.LIZ = trim;
            this.LIZIZ = trim2;
            return;
        }
        throw new IllegalArgumentException("name and value can't be empty");
    }
}
