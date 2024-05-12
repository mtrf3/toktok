package X;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.P1o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C63784P1o extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C63784P1o(Object obj) {
        super(0, obj, C63781P1l.class, "onLoading", "onLoading()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        SwipeRefreshLayout swipeRefreshLayout;
        C63781P1l c63781P1l = (C63781P1l) this.receiver;
        C73305Spp c73305Spp = c63781P1l.LJLJJI;
        if (c73305Spp != null && (swipeRefreshLayout = c63781P1l.LJLJI) != null) {
            if (c73305Spp.getVisibility() == 0) {
                c73305Spp.LJFF();
            } else {
                swipeRefreshLayout.setRefreshing(true);
            }
        }
        return C76800UCe.LIZ;
    }
}
