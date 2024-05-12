package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes7.dex */
public interface QAProfileEntranceApi {
    @E8M("/tiktok/v1/forum/user/settings/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> setQAStatus(@InterfaceC64985Pev("enable_qna_on_profile") int i);
}
