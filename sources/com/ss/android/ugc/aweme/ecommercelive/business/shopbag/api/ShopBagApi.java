package com.ss.android.ugc.aweme.ecommercelive.business.shopbag.api;

import X.C64797Pbt;
import X.C74642wO;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommercebase.network.StatusResponse;

/* loaded from: classes2.dex */
public interface ShopBagApi {
    public static final C74642wO LIZ = C74642wO.LIZ;

    @E8L("/aweme/v1/oec/bag/preview/assemble")
    Object getLiveBagPreview(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("author_id") String str2, @InterfaceC64986Pew("is_owner") boolean z, @InterfaceC64986Pew("promotion_response_style") int i, @InterfaceC64986Pew("offset") Integer num, @InterfaceC64986Pew("page_size") Integer num2, @InterfaceC64986Pew("need_new_user_voucher") boolean z2, InterfaceC67352kd<? super C64797Pbt<StatusResponse<Object>>> interfaceC67352kd);
}
