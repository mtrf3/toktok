package X;

/* loaded from: classes12.dex */
public final class PHM implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ PHJ LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJI.LJIILL(this.LJLILLLLZI, this.LJLIL, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public PHM(PHJ phj, String str, long j, String str2) {
        this.LJLJJI = phj;
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = str2;
    }
}
