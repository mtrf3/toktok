package com.ss.android.ugc.aweme.commercialize.ecommerce.service;

import X.C59647Nb1;
import X.C61074Ny2;
import X.F3T;
import X.InterfaceC38186Eyk;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.model.ShopifyPdpAdInfo;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.ui.WishListFragment;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public interface IShoppingAdsService {
    void LIZ(FragmentManager fragmentManager, C61074Ny2 c61074Ny2, ShopifyPdpAdInfo shopifyPdpAdInfo);

    List<InterfaceC38186Eyk> LIZIZ(F3T f3t);

    Map<String, Class<?>> LIZJ();

    ShoppingAdsServiceImpl.WishListFragmentData LIZLLL(String str);

    boolean LJ();

    boolean LJFF();

    boolean LJI(Context context);

    C59647Nb1 LJII();

    WishListFragment LJIIIIZZ(String str);
}
