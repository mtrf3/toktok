package com.ss.android.ugc.aweme.setting.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes10.dex */
public interface LinkPrivacyPopupApi {
    @E4Q("/tiktok/v1/link/privacy/popup/status/")
    AbstractC73672Svk<Object> getLinkPrivacyPopupStatus();

    @InterfaceC195787mI
    @E4T("/tiktok/v1/link/privacy/popup/status/update/")
    AbstractC73672Svk<BaseResponse> updateLinkPrivacyPopupStatus(@InterfaceC64987Pex("displayed") boolean z);
}
