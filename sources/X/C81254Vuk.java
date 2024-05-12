package X;

/* renamed from: X.Vuk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81254Vuk {
    public final String LIZ;
    public final C81255Vul LIZIZ;
    public C81255Vul LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.LIZ);
        sb.append('{');
        C81255Vul c81255Vul = this.LIZIZ.LIZJ;
        String str = "";
        while (c81255Vul != null) {
            sb.append(str);
            String str2 = c81255Vul.LIZ;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            sb.append(c81255Vul.LIZIZ);
            c81255Vul = c81255Vul.LIZJ;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public C81254Vuk(String str) {
        C81255Vul c81255Vul = new C81255Vul();
        this.LIZIZ = c81255Vul;
        this.LIZJ = c81255Vul;
        str.getClass();
        this.LIZ = str;
    }

    public final void LIZ(String str, boolean z) {
        LIZIZ(String.valueOf(z), str);
    }

    public final void LIZIZ(Object obj, String str) {
        C81255Vul c81255Vul = new C81255Vul();
        this.LIZJ.LIZJ = c81255Vul;
        this.LIZJ = c81255Vul;
        c81255Vul.LIZIZ = obj;
        c81255Vul.LIZ = str;
    }
}
