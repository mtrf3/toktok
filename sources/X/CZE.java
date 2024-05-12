package X;

/* loaded from: classes6.dex */
public final class CZE implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ CZG LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public CZE(int i, CZG czg, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = czg;
        this.LJLJI = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            CZB czb = CZB.LIZ;
            int i = this.LJLIL;
            int i2 = this.LJLILLLLZI.LIZJ;
            boolean z = this.LJLJI;
            czb.getClass();
            CZB.LIZ(i, i2, z);
        } finally {
            if (LIZ) {
            }
        }
    }
}
