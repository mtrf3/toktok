package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.wishlist.WishListFragment;
import kotlin.jvm.internal.AqS51S0110000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KME extends AbstractC60811Ntn {
    public final /* synthetic */ WishListFragment LJLILLLLZI;

    public KME(WishListFragment wishListFragment) {
        this.LJLILLLLZI = wishListFragment;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        boolean z;
        o.LJIIIZ(view, "view");
        if (!this.LJLILLLLZI.LJLJLJ) {
            view.LJIIJ("favoritePageShow", C61878OQg.INSTANCE);
            WishListFragment wishListFragment = this.LJLILLLLZI;
            View LIZJ = view.LIZJ();
            if (LIZJ != null && LIZJ.getContext() != null) {
                try {
                    z = C2NU.LIZ.LIZIZ();
                } catch (Exception unused) {
                }
                wishListFragment.getClass();
                C76542zS.LIZJ("ads_wishlist_tab_load", new AqS51S0110000_8(wishListFragment, z, 2));
            }
            z = false;
            wishListFragment.getClass();
            C76542zS.LIZJ("ads_wishlist_tab_load", new AqS51S0110000_8(wishListFragment, z, 2));
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        WishListFragment wishListFragment = this.LJLILLLLZI;
        wishListFragment.LJLJLJ = false;
        wishListFragment.LJLJL = System.currentTimeMillis();
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        WishListFragment wishListFragment = this.LJLILLLLZI;
        wishListFragment.LJLJLJ = true;
        C76542zS.LIZJ("ads_wishlist_tab_load", new AqS51S0110000_8(wishListFragment, false, 2));
    }
}
