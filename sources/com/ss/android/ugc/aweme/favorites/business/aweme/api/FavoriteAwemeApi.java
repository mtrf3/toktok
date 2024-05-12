package com.ss.android.ugc.aweme.favorites.business.aweme.api;

import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes4.dex */
public interface FavoriteAwemeApi {
    @E4Q("/aweme/v1/aweme/collect/")
    Object collectAweme(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("action") int i, @InterfaceC64989Pez("collect_privacy_setting") int i2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E4Q("/aweme/v1/aweme/collect/")
    Object collectAwemeReverse(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("action") int i, @InterfaceC64989Pez("collect_privacy_setting") int i2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);
}
