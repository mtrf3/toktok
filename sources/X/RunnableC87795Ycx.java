package X;

/* renamed from: X.Ycx, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class RunnableC87795Ycx implements Runnable {
    public final /* synthetic */ C87820YdM LJLIL;
    public final /* synthetic */ C31521CYr LJLILLLLZI;
    public final /* synthetic */ C31521CYr LJLJI;

    public RunnableC87795Ycx(C87820YdM c87820YdM, C31521CYr c31521CYr, C31521CYr c31521CYr2) {
        this.LJLIL = c87820YdM;
        this.LJLILLLLZI = c31521CYr;
        this.LJLJI = c31521CYr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LJI(this.LJLILLLLZI, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }
}
