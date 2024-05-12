package com.ss.android.ugc.aweme.ecommerce.mall.customdot.repository;

import X.C64797Pbt;
import X.E4T;
import X.EC4;
import X.InterfaceC195727mC;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotUpdateParams;

/* loaded from: classes7.dex */
public interface CustomDotApi {
    public static final EC4 LIZ = EC4.LIZ;

    @E4T("api/v1/mall/shop_tab/reach/get")
    Object shopReachGet(@InterfaceC195727mC CustomDotGetParams customDotGetParams, InterfaceC67352kd<? super C64797Pbt<Response<CustomDotResponse>>> interfaceC67352kd);

    @E4T("api/v1/mall/shop_tab/reach/update")
    Object shopReachUpdate(@InterfaceC195727mC CustomDotUpdateParams customDotUpdateParams, InterfaceC67352kd<? super C64797Pbt<Response<CustomDotResponse>>> interfaceC67352kd);
}
