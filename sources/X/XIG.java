package X;

/* loaded from: classes16.dex */
public final class XIG implements T2N {
    public final /* synthetic */ XIF LJLIL;
    public final /* synthetic */ Runnable LJLILLLLZI;

    @Override // X.T2N
    public final void dispose() {
        this.LJLIL.LJLIL.removeCallbacks(this.LJLILLLLZI);
    }

    public XIG(XIF xif, Runnable runnable) {
        this.LJLIL = xif;
        this.LJLILLLLZI = runnable;
    }
}
