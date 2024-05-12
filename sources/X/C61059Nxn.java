package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.manager.WishListManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Nxn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61059Nxn extends NM4 {
    public final /* synthetic */ WishListManager LJLIL;

    public C61059Nxn(WishListManager wishListManager) {
        this.LJLIL = wishListManager;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        if (!this.LJLIL.LJLJLLL) {
            view.LJIIJ("favoritePageShow", C61878OQg.INSTANCE);
            this.LJLIL.LJLJJL.onNext(C61069Nxx.LIZ);
            WishListManager wishListManager = this.LJLIL;
            View LIZJ = view.LIZJ();
            boolean z = false;
            if (LIZJ != null && LIZJ.getContext() != null) {
                try {
                    z = C2NU.LIZ.LIZIZ();
                } catch (Exception unused) {
                }
            }
            FMX.LJIIL("ads_wishlist_tab_load", wishListManager.LIZ(z).LIZ);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        WishListManager wishListManager = this.LJLIL;
        wishListManager.LJLJLLL = false;
        wishListManager.LJLJJL.onNext(C61068Nxw.LIZ);
        this.LJLIL.LJLJLJ = System.currentTimeMillis();
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        WishListManager wishListManager = this.LJLIL;
        wishListManager.LJLJLLL = true;
        wishListManager.LJLJJL.onNext(C61067Nxv.LIZ);
        FMX.LJIIL("ads_wishlist_tab_load", this.LJLIL.LIZ(false).LIZ);
    }
}
