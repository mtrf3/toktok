package com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.repo;

import X.C64797Pbt;
import X.E8M;
import X.EC3;
import X.InterfaceC195727mC;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotUpdateParams;

/* loaded from: classes7.dex */
public interface MallReddotApi {
    public static final EC3 LIZ = EC3.LIZ;

    @E8M("api/v1/mall/shop_tab/reach/get")
    Object getShopRedDot(@InterfaceC195727mC CustomDotGetParams customDotGetParams, InterfaceC67352kd<? super C64797Pbt<Response<CustomDotResponse>>> interfaceC67352kd);

    @E8M("api/v1/mall/shop_tab/reach/update")
    Object updateUserMsg(@InterfaceC195727mC CustomDotUpdateParams customDotUpdateParams, InterfaceC67352kd<? super C64797Pbt<Response<CustomDotResponse>>> interfaceC67352kd);
}
