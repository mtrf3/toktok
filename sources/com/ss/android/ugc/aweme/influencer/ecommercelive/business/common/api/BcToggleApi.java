package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import X.C36579EXf;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;

/* loaded from: classes7.dex */
public interface BcToggleApi {
    public static final C36579EXf LIZ = C36579EXf.LIZ;

    @E8M("/aweme/v1/oec/creator/sale_mode/get")
    Object getCreatorSaleMode(@InterfaceC195727mC SelfSaleModeRequestBody selfSaleModeRequestBody, InterfaceC67352kd<? super BaseResponse<SaleMode>> interfaceC67352kd);
}
