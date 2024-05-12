package X;

/* loaded from: classes11.dex */
public final class OI9 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ OIA LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJI.LIZ.LJIILJJIL(this.LJLILLLLZI, this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public OI9(OIA oia, String str, long j) {
        this.LJLJI = oia;
        this.LJLIL = str;
        this.LJLILLLLZI = j;
    }
}
