package com.ss.android.ugc.aweme.share.business.tcm;

import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes2.dex */
public interface TCMOrderDeleteApi {
    @E8M("/aweme/v1/commerce/tcm/item/delete/apply/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> applyDeleteTCMOrder(@InterfaceC64985Pev("order_id") String str, @InterfaceC64985Pev("item_id") String str2);

    @E8L("/aweme/v1/commerce/tcm/item/delete/status/")
    AbstractC73672Svk<CheckTCMOrderDeleteStatusResp> checkTCMOrderDeleteStatus(@InterfaceC64986Pew("order_id") String str, @InterfaceC64986Pew("item_id") String str2);
}
