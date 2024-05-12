package X;

import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.proxy.TopProxyFragment;

/* renamed from: X.Jlw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50132Jlw implements InterfaceC50133Jlx {
    public final /* synthetic */ TopProxyFragment LIZ;

    public C50132Jlw(TopProxyFragment topProxyFragment) {
        this.LIZ = topProxyFragment;
    }

    @Override // X.InterfaceC50133Jlx
    public final void LIZ(C50287JoR c50287JoR) {
        C51105K3x vl;
        InterfaceC50133Jlx interfaceC50133Jlx;
        InterfaceC50133Jlx interfaceC50133Jlx2 = this.LIZ.em().LIZJ;
        if (interfaceC50133Jlx2 != null) {
            interfaceC50133Jlx2.LIZ(c50287JoR);
        }
        SearchFragment un = this.LIZ.un();
        if (un != null && (vl = un.vl()) != null && (interfaceC50133Jlx = vl.LIZJ) != null) {
            interfaceC50133Jlx.LIZ(c50287JoR);
        }
    }

    @Override // X.InterfaceC50133Jlx
    public final void LIZIZ(C50287JoR c50287JoR) {
        C51105K3x vl;
        InterfaceC50133Jlx interfaceC50133Jlx;
        InterfaceC50133Jlx interfaceC50133Jlx2 = this.LIZ.em().LIZJ;
        if (interfaceC50133Jlx2 != null) {
            interfaceC50133Jlx2.LIZIZ(c50287JoR);
        }
        SearchFragment un = this.LIZ.un();
        if (un != null && (vl = un.vl()) != null && (interfaceC50133Jlx = vl.LIZJ) != null) {
            interfaceC50133Jlx.LIZIZ(c50287JoR);
        }
    }
}
