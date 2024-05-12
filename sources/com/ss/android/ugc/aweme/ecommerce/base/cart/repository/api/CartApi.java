package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.api;

import X.AbstractC73672Svk;
import X.C27996Aym;
import X.C58045MqH;
import X.C64797Pbt;
import X.C68352mF;
import X.E4T;
import X.InterfaceC27211Am7;
import X.RYJ;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetCartRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.RecommendAfterAddRequest;

/* loaded from: classes5.dex */
public interface CartApi {
    public static final C27996Aym LIZ = C27996Aym.LIZ;

    @E4T("/api/v1/shop/cart/add_item_to_cart")
    AbstractC73672Svk<C58045MqH> addToCart(@InterfaceC27211Am7 AddItemToCartRequest addItemToCartRequest);

    @E4T("/api/v1/shop/cart/madd_items_to_cart")
    AbstractC73672Svk<RYJ> addToCartBundle(@InterfaceC27211Am7 BundleAddItemsToCartRequest bundleAddItemsToCartRequest);

    @E4T("/api/v1/shop/cart/get_cart")
    AbstractC73672Svk<C64797Pbt<Response<Object>>> getCart(@InterfaceC27211Am7 GetCartRequest getCartRequest);

    @E4T("/api/v1/shop/cart/recommend_after_add")
    AbstractC73672Svk<C68352mF> recommendAfterAdd(@InterfaceC27211Am7 RecommendAfterAddRequest recommendAfterAddRequest);
}
