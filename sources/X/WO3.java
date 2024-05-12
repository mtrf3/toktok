package X;

/* loaded from: classes15.dex */
public final class WO3 implements InterfaceC82206WOc {
    public final /* synthetic */ C82203WNz LIZ;

    @Override // X.InterfaceC82206WOc
    public final void close() {
        this.LIZ.LJLIL.close();
        onDismiss();
    }

    @Override // X.InterfaceC82206WOc
    public final void onDismiss() {
        WO1 wo1;
        C82203WNz c82203WNz = this.LIZ;
        if (c82203WNz.mActivity != null && (wo1 = c82203WNz.LJLJI) != null && !wo1.LJLJJLL) {
            c82203WNz.LJLIL.LIZLLL(false);
        }
    }

    public WO3(C82203WNz c82203WNz) {
        this.LIZ = c82203WNz;
    }
}
