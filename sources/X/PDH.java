package X;

/* loaded from: classes12.dex */
public final class PDH implements Runnable {
    public final InterfaceC51050K1u LJLIL;
    public final int LJLILLLLZI;
    public final Throwable LJLJI;
    public final byte[] LJLJJI;
    public final String LJLJJL;
    public final java.util.Map LJLJJLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LIZ(this.LJLJJL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJLL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public /* synthetic */ PDH(String str, InterfaceC51050K1u interfaceC51050K1u, int i, Throwable th, byte[] bArr, java.util.Map map) {
        QH7.LJIIIIZZ(interfaceC51050K1u);
        this.LJLIL = interfaceC51050K1u;
        this.LJLILLLLZI = i;
        this.LJLJI = th;
        this.LJLJJI = bArr;
        this.LJLJJL = str;
        this.LJLJJLL = map;
    }
}
