package X;

/* renamed from: X.Fvp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC40553Fvp implements Runnable {
    public final /* synthetic */ AbstractC40550Fvm LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C40551Fvn LJLJJI;

    public RunnableC40553Fvp(C40551Fvn c40551Fvn, AbstractC40550Fvm abstractC40550Fvm, int i, int i2) {
        this.LJLJJI = c40551Fvn;
        this.LJLIL = abstractC40550Fvm;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C40551Fvn c40551Fvn = this.LJLJJI;
            AbstractC40550Fvm abstractC40550Fvm = this.LJLIL;
            c40551Fvn.LJI(new C40549Fvl(abstractC40550Fvm.LJIIJ(), this.LJLILLLLZI, this.LJLJI, abstractC40550Fvm.LIZJ(), abstractC40550Fvm.LJIIL(), abstractC40550Fvm.LIZ(), abstractC40550Fvm.LIZIZ(), abstractC40550Fvm.LJIIIZ(), abstractC40550Fvm.LIZLLL()));
        } finally {
            if (LIZ) {
            }
        }
    }
}
