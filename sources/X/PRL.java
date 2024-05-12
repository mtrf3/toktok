package X;

/* loaded from: classes12.dex */
public final class PRL extends C1CZ {
    public final /* synthetic */ PRD LJLIL;

    public PRL(PRD prd) {
        this.LJLIL = prd;
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            if (i != 1) {
                this.LJLIL.start();
                return;
            } else {
                this.LJLIL.start();
                IOH.LIZIZ(this.LJLIL.LIZ);
                return;
            }
        }
        this.LJLIL.stop();
        IOH.LIZ();
    }
}
