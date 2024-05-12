package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IuL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48105IuL {
    public final String LIZ;
    public final String LIZIZ;
    public final List<C48099IuF> LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HttpRequest{url='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", method='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", headers=");
        LIZ.append(this.LIZJ);
        LIZ.append(", connectTimeout=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", readTimeout=");
        LIZ.append(this.LJ);
        LIZ.append(", writeTimeout=");
        return C47135Ieh.LIZIZ(LIZ, this.LJFF, '}', LIZ);
    }

    public C48105IuL(C48110IuQ c48110IuQ) {
        this.LIZ = c48110IuQ.LIZ;
        this.LIZIZ = c48110IuQ.LIZIZ;
        this.LIZJ = c48110IuQ.LIZJ;
        this.LIZLLL = c48110IuQ.LIZLLL;
        this.LJ = c48110IuQ.LJ;
        this.LJFF = c48110IuQ.LJFF;
    }

    public final String LIZ(String str) {
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            C48099IuF c48099IuF = (C48099IuF) it.next();
            if (c48099IuF.LIZ.equalsIgnoreCase(str)) {
                return c48099IuF.LIZIZ;
            }
        }
        return null;
    }
}
