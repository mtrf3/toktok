package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* loaded from: classes11.dex */
public interface ShopApi {
    @E8L("/api/shop/v1/category/info/get")
    Object getCategoryTabInfo(@InterfaceC64986Pew("seller_id") String str, InterfaceC67352kd<? super String> interfaceC67352kd);

    @E8L("/api/shop/v1/creator/info/get")
    Object getCreatorShopInfo(@InterfaceC64986Pew("creator_uid") String str, InterfaceC67352kd<? super Response<m>> interfaceC67352kd);

    @E8L("/api/shop/v1/marketing_tab/info/get")
    Object getMarketingTabInfo(@InterfaceC64986Pew("seller_id") String str, InterfaceC67352kd<? super String> interfaceC67352kd);

    @E8M("/api/shop/v1/mega_sale/product/list")
    Object getMegaSaleProductList(@InterfaceC195727mC MegaSaleProductListRequestBody megaSaleProductListRequestBody, InterfaceC67352kd<? super String> interfaceC67352kd);

    @E8M("/api/shop/v1/product/list")
    Object getProductList(@InterfaceC195727mC ProductListRequestBody productListRequestBody, InterfaceC67352kd<? super String> interfaceC67352kd);

    @E8M("/api/shop/v1/product/list")
    Object getProductListResponse(@InterfaceC195727mC ProductListRequestBody productListRequestBody, InterfaceC67352kd<? super Response<m>> interfaceC67352kd);

    @E8L("/api/shop/v1/homepage/get")
    Object getShopHomepage(@InterfaceC64986Pew("seller_id") String str, InterfaceC67352kd<? super Response<m>> interfaceC67352kd);

    @E8L("/api/shop/v1/product/tab/list")
    Object getShopHomepageProductFilterList(@InterfaceC64986Pew("seller_id") String str, @InterfaceC64986Pew("priority_filter") String str2, @InterfaceC64986Pew("enter_from") String str3, InterfaceC67352kd<? super Response<j>> interfaceC67352kd);

    @E8L("/api/shop/v1/homepage/tab/list")
    Object getShopHomepageTabList(@InterfaceC64986Pew("seller_id") String str, @InterfaceC64986Pew("source_previous_page") String str2, @InterfaceC64986Pew("custom_tab") String str3, InterfaceC67352kd<? super Response<j>> interfaceC67352kd);

    @E8M("/api/shop/v1/homepage/get_v2")
    Object getShopHomepageV2(@InterfaceC195727mC m mVar, InterfaceC67352kd<? super Response<m>> interfaceC67352kd);

    @E8M("/api/showcase/v1/profile_tab_product/list")
    Object getTabShowcaseProducts(@InterfaceC195727mC ShowcaseProductRequest showcaseProductRequest, InterfaceC67352kd<? super String> interfaceC67352kd);
}
