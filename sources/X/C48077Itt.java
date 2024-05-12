package X;

import java.util.List;

/* renamed from: X.Itt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48077Itt {
    public final C48080Itw LIZ;
    public final List<C48099IuF> LIZIZ;
    public final C48076Its LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request{requestLine=");
        LIZ.append(this.LIZ);
        LIZ.append(", headers=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", extra=");
        LIZ.append(this.LIZJ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("request header format error, header: ");
        r1.append(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00aa, code lost:
    
        throw new java.lang.IllegalArgumentException(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        throw new X.C48086Iu2();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C48077Itt LIZ(java.io.InputStream r21) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48077Itt.LIZ(java.io.InputStream):X.Itt");
    }

    public C48077Itt(C48080Itw c48080Itw, List<C48099IuF> list, C48076Its c48076Its) {
        this.LIZ = c48080Itw;
        this.LIZIZ = list;
        this.LIZJ = c48076Its;
    }
}
