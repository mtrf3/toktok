package X;

/* loaded from: classes9.dex */
public final class IHE implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ IHD LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ AbstractC48384Iyq LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLIL) {
                this.LJLILLLLZI.LIZ(this.LJLJJI);
            } else if (this.LJLJI) {
                this.LJLILLLLZI.LIZJ(this.LJLJJI);
            } else {
                this.LJLILLLLZI.LIZLLL(this.LJLJJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public IHE(AbstractC48384Iyq abstractC48384Iyq, boolean z, IHD ihd, boolean z2) {
        this.LJLJJI = abstractC48384Iyq;
        this.LJLIL = z;
        this.LJLILLLLZI = ihd;
        this.LJLJI = z2;
    }
}
