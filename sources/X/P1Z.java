package X;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes11.dex */
public final /* synthetic */ class P1Z extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public P1Z(Object obj) {
        super(0, obj, P1W.class, "onLoading", "onLoading()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        SwipeRefreshLayout swipeRefreshLayout;
        P1W p1w = (P1W) this.receiver;
        C73305Spp c73305Spp = p1w.LJLJJL;
        if (c73305Spp != null && (swipeRefreshLayout = p1w.LJLJJI) != null) {
            if (c73305Spp.getVisibility() == 0) {
                c73305Spp.LJFF();
            } else {
                swipeRefreshLayout.setRefreshing(true);
            }
        }
        return C76800UCe.LIZ;
    }
}
