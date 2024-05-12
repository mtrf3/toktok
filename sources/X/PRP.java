package X;

/* loaded from: classes12.dex */
public final class PRP extends PRS {
    public final /* synthetic */ PRJ LJLIL;

    public PRP(PRJ prj) {
        this.LJLIL = prj;
    }

    @Override // X.C0C3
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
