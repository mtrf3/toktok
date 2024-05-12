package com.ss.android.ugc.aweme.setting.page.privacy.sug;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public interface SuggestAccountSetApi$RealApi {
    @E8M("/tiktok/privacy/setting/suggestion/update/v1")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> setSuggestPrivacySettings(@InterfaceC64985Pev("field") String str, @InterfaceC64985Pev("value") int i);
}
