package X;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final /* synthetic */ class P1X extends TBS implements InterfaceC88472Yns<C9U5, C76800UCe> {
    public P1X(Object obj) {
        super(1, obj, P1W.class, "onSuccess", "onSuccess(Lcom/ss/android/ugc/aweme/relation/auth/model/ContactModel;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C9U5 c9u5) {
        C9U5 p0 = c9u5;
        o.LJIIIZ(p0, "p0");
        P1W p1w = (P1W) this.receiver;
        C73305Spp c73305Spp = p1w.LJLJJL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        SwipeRefreshLayout swipeRefreshLayout = p1w.LJLJJI;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = p1w.LJLJJI;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setVisibility(0);
        }
        SYL syl = p1w.LJLJJLL;
        if (syl != null) {
            C12460eI.LIZ(syl);
        }
        P1U p1u = p1w.LJLJLLL;
        if (p1u != null) {
            if (C76917UGr.LJJIJ(p1u) && p0.getUnregisterItemList().isEmpty()) {
                p1w.LIZLLL();
            } else if (p0.getUnregisterItemList().isEmpty() && p0.getRegisterItemList().isEmpty()) {
                p1w.LIZLLL();
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("config");
        throw null;
    }
}
