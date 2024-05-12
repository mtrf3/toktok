package X;

/* renamed from: X.NWh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59487NWh implements InterfaceC59635Nap {
    public final /* synthetic */ NWH LJLIL;

    public C59487NWh(NWH nwh) {
        this.LJLIL = nwh;
    }

    @Override // X.InterfaceC59635Nap
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        InterfaceC59505NWz scrollListener = this.LJLIL.getScrollListener();
        if (scrollListener != null) {
            scrollListener.onScrollChanged(i, i2, i3, i4);
        }
    }
}
