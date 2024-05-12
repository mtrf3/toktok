package X;

import ujb.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class XAO {
    public static final /* synthetic */ int LJI = 0;
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public int LIZLLL = -1;
    public boolean LJ;
    public final String LJFF;

    public final String LIZ() {
        String LJII;
        String str = this.LIZJ;
        if ((str == null || o.LJJJJJL(str)) && (LJII = C10820be.LJII(this.LJFF)) != null) {
            this.LIZJ = XAN.LIZIZ(LJII);
        }
        return this.LIZJ;
    }

    public final String LIZIZ() {
        String LJII;
        String str = this.LIZ;
        if ((str == null || o.LJJJJJL(str)) && (LJII = C10820be.LJII(this.LJFF)) != null) {
            this.LIZ = XAN.LIZJ(LJII);
        }
        return this.LIZ;
    }

    public final int LIZJ() {
        String LJII;
        int LIZLLL;
        if (this.LIZLLL == -1) {
            if (!C10820be.LJ(this.LJFF) || (LJII = C10820be.LJII(this.LJFF)) == null) {
                LIZLLL = 0;
            } else {
                LIZLLL = XAN.LIZLLL(LJII);
            }
            this.LIZLLL = LIZLLL;
        }
        return this.LIZLLL;
    }

    public final String LIZLLL() {
        String LJII;
        int LJJLIIJ;
        String str;
        String str2 = this.LIZIZ;
        if ((str2 == null || o.LJJJJJL(str2)) && (LJII = C10820be.LJII(this.LJFF)) != null) {
            s.LJJLIIJ(LJII, "/", 6);
            int LJJLIIJ2 = s.LJJLIIJ(LJII, "_v", 6);
            if (s.LJJJLZIJ(LJII, "size", false)) {
                LJJLIIJ = s.LJJLIIJ(LJII, "_size", 6);
            } else {
                LJJLIIJ = s.LJJLIIJ(LJII, "_model", 6);
            }
            if (LJJLIIJ2 > 0) {
                String substring = LJII.substring(LJJLIIJ2 + 2, LJJLIIJ);
                kotlin.jvm.internal.o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                str = o.LJJJJLL(substring, '_', '.', false);
            } else {
                str = "1.0";
            }
            this.LIZIZ = str;
        }
        return this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalModelInfo{name=");
        LIZ.append(LIZIZ());
        LIZ.append('\'');
        LIZ.append(",version=");
        LIZ.append(LIZLLL());
        LIZ.append('\'');
        LIZ.append(",size=");
        LIZ.append(LIZJ());
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public XAO(String str) {
        this.LJFF = str;
    }
}
