package com.ss.android.ugc.tiktok.tpsc.data.restriction;

import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes13.dex */
public interface PrivacyRestrictionApi {
    @E8L("/tiktok/privacy/setting/restriction/v1")
    AbstractC73672Svk<PrivacyRestrictionResponse> fetchPrivacyRestriction();

    @E8M("/tiktok/privacy/agreement/record/agree/v1")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> updateAgreement(@InterfaceC64985Pev("record_name") String str);

    @E8M("/tiktok/privacy/agreement/record/agree/v1")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> updateAgreement(@InterfaceC64985Pev("record_name") String str, @InterfaceC64985Pev("record_value") int i);
}
