package X;

/* renamed from: X.Fvj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC40547Fvj implements Runnable {
    public final C40542Fve LJLIL;
    public final AbstractC40550Fvm LJLILLLLZI;

    public RunnableC40547Fvj(C40542Fve c40542Fve, AbstractC40550Fvm abstractC40550Fvm) {
        this.LJLIL = c40542Fve;
        this.LJLILLLLZI = abstractC40550Fvm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C40542Fve c40542Fve = this.LJLIL;
            AbstractC40550Fvm abstractC40550Fvm = this.LJLILLLLZI;
            c40542Fve.LJ.LIZ(abstractC40550Fvm);
            c40542Fve.LJFF.LIZ(abstractC40550Fvm);
        } finally {
            if (LIZ) {
            }
        }
    }
}
