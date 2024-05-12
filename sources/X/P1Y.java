package X;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final /* synthetic */ class P1Y extends TBS implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public P1Y(Object obj) {
        super(1, obj, P1W.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable th) {
        Throwable p0 = th;
        o.LJIIIZ(p0, "p0");
        P1W p1w = (P1W) this.receiver;
        p1w.getClass();
        C221018lt.LIZJ("ContactComp", "list error", p0);
        C73305Spp c73305Spp = p1w.LJLJJL;
        if (c73305Spp != null) {
            P1U p1u = p1w.LJLJLLL;
            if (p1u != null) {
                if (p1u.LJIIL) {
                    C73306Spq c73306Spq = p1u.LJIILLIIL;
                    if (c73306Spq != null) {
                        c73305Spp.setStatus(c73306Spq);
                        c73305Spp.setVisibility(0);
                        SwipeRefreshLayout swipeRefreshLayout = p1w.LJLJJI;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setVisibility(8);
                        }
                    } else {
                        p1w.LIZLLL();
                    }
                }
            } else {
                o.LJIJI("config");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
