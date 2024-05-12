package com.ss.android.ugc.aweme.ecommercelive.business.audience.api;

import X.C71017Ru1;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* loaded from: classes13.dex */
public interface AudienceApi {
    public static final C71017Ru1 LIZ = C71017Ru1.LIZ;

    @E8L("/aweme/v1/oec/live/action/report")
    Object reportAction(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("author_id") String str2, @InterfaceC64986Pew("product_id") String str3, @InterfaceC64986Pew("action_type") int i, InterfaceC67352kd<? super BaseResponse<Object>> interfaceC67352kd);
}
