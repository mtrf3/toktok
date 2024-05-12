package X;

/* renamed from: X.Fh7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39641Fh7 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final String toString() {
        String str;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Symbol[");
        LIZ.append(this.LIZ);
        LIZ.append(",");
        int i = this.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("STB_??? (");
                    str = C08380Uo.LIZ(LIZ2, this.LIZIZ, ")", LIZ2);
                } else {
                    str = "WEAK";
                }
            } else {
                str = "GLOBAL";
            }
        } else {
            str = "LOCAL";
        }
        LIZ.append(str);
        LIZ.append(",");
        switch (this.LIZJ) {
            case 0:
                str2 = "NOTYPE";
                break;
            case 1:
                str2 = "OBJECT";
                break;
            case 2:
                str2 = "FUNC";
                break;
            case 3:
                str2 = "SECTION";
                break;
            case 4:
                str2 = "FILE";
                break;
            case 5:
                str2 = "COMMON";
                break;
            case 6:
                str2 = "TLS";
                break;
            default:
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("STT_??? (");
                str2 = C08380Uo.LIZ(LIZ3, this.LIZJ, ")", LIZ3);
                break;
        }
        return JBR.LJFF(LIZ, str2, "]", LIZ);
    }

    public C39641Fh7(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = (i >> 4) & 15;
        this.LIZJ = i & 15;
    }
}
