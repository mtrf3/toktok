package com.ss.android.ugc.aweme.commercialize.tcm.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes11.dex */
public interface TcmBarStatusApi {
    @E8L("/aweme/v1/commerce/tcm/params/through/get")
    AbstractC73672Svk<TcmBarStatusResponse> getBarStatus(@InterfaceC64986Pew("service_name") String str, @InterfaceC64986Pew("service_method") String str2, @InterfaceC64986Pew("item_id") long j, @InterfaceC64986Pew("order_id") long j2);
}
