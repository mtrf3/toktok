package X;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.P1n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C63783P1n extends TBS implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public C63783P1n(Object obj) {
        super(1, obj, C63781P1l.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable th) {
        Throwable p0 = th;
        o.LJIIIZ(p0, "p0");
        C63781P1l c63781P1l = (C63781P1l) this.receiver;
        c63781P1l.getClass();
        C221018lt.LIZJ("FBComp", "list error", p0);
        C73305Spp c73305Spp = c63781P1l.LJLJJI;
        if (c73305Spp != null) {
            P1V p1v = c63781P1l.LJLJLJ;
            if (p1v != null) {
                C73306Spq c73306Spq = p1v.LJII;
                if (c73306Spq != null) {
                    c73305Spp.setStatus(c73306Spq);
                    c73305Spp.setVisibility(0);
                    SwipeRefreshLayout swipeRefreshLayout = c63781P1l.LJLJI;
                    if (swipeRefreshLayout != null) {
                        swipeRefreshLayout.setVisibility(8);
                    }
                } else {
                    c63781P1l.LIZ();
                }
            } else {
                o.LJIJI("config");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
