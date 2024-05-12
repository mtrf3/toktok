package X;

/* loaded from: classes6.dex */
public final class CKS implements Runnable {
    public final /* synthetic */ CKO LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Exception LJLJI;
    public final /* synthetic */ int LJLJJI;

    public CKS(CKO cko, int i, Exception exc, int i2) {
        this.LJLIL = cko;
        this.LJLILLLLZI = i;
        this.LJLJI = exc;
        this.LJLJJI = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        String str;
        try {
            CKO cko = this.LJLIL;
            if (cko.LJIIIIZZ == -1) {
                cko.LJIIIIZZ = this.LJLILLLLZI;
            }
            Exception exc = this.LJLJI;
            String str2 = "";
            if (exc == null) {
                str = "";
            } else {
                str = exc.getMessage();
            }
            CKO cko2 = this.LJLIL;
            if (cko2.LJII != null) {
                int i = cko2.LJIIIIZZ;
                int i2 = this.LJLJJI;
                if (str != null) {
                    str2 = str;
                }
                cko2.LJIIL.removeCallbacksAndMessages(null);
                InterfaceC21030s7 interfaceC21030s7 = cko2.LJII;
                if (interfaceC21030s7 != null) {
                    interfaceC21030s7.G(i, i2, str2);
                }
            }
            this.LJLIL.LJIIIIZZ = -1;
        } finally {
            if (LIZ) {
            }
        }
    }
}
