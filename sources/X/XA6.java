package X;

/* loaded from: classes16.dex */
public final class XA6 {
    public final C35694Dze<InterfaceC37242EjW, String> LIZ = new C35694Dze<>();
    public final XAC LIZIZ = new XAC(new C43051mX(10), new XAB());

    public final String LIZ(C37241EjV c37241EjV) {
        String str;
        XAE xae = (XAE) this.LIZIZ.LIZIZ();
        try {
            c37241EjV.LIZ(xae.LIZ);
            byte[] digest = xae.LIZ.digest();
            char[] cArr = C84377X9p.LIZIZ;
            synchronized (cArr) {
                for (int i = 0; i < digest.length; i++) {
                    int i2 = digest[i] & 255;
                    int i3 = i * 2;
                    char[] cArr2 = C84377X9p.LIZJ;
                    cArr[i3] = cArr2[i2 >>> 4];
                    cArr[i3 + 1] = cArr2[i2 & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            this.LIZIZ.LIZ(xae);
        }
    }

    public final String LIZIZ(C37241EjV c37241EjV) {
        String str;
        synchronized (this.LIZ) {
            str = (String) this.LIZ.LIZIZ(c37241EjV);
        }
        if (str == null) {
            str = LIZ(c37241EjV);
        }
        synchronized (this.LIZ) {
            this.LIZ.LIZJ(c37241EjV, str);
        }
        return str;
    }
}
