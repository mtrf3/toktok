package com.ss.android.ugc.aweme.compliance.business.policynotice.api;

import X.AbstractC73672Svk;
import X.E7R;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.ConsentAcceptanceResponse;

/* loaded from: classes7.dex */
public interface PolicyNoticeApi {
    public static final E7R LIZ = E7R.LIZ;

    @E8L("/tiktok/v1/consentbox/should_show/")
    AbstractC73672Svk<ConsentAcceptanceResponse> consentAcceptance(@InterfaceC64986Pew("ssaid") String str, @InterfaceC64986Pew("last_consent_acceptance_date") Long l, @InterfaceC64986Pew("country") String str2, @InterfaceC64986Pew("app_version") long j, @InterfaceC64986Pew("business") String str3, @InterfaceC64986Pew("store_region") String str4);

    @E8M("/aweme/v1/policy/notice/approve/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> policyNoticeApprove(@InterfaceC64985Pev("business") String str, @InterfaceC64985Pev("policy_version") String str2, @InterfaceC64985Pev("style") String str3, @InterfaceC64985Pev("extra") String str4, @InterfaceC64985Pev("operation") Integer num, @InterfaceC64985Pev("scene") Integer num2, @InterfaceC64985Pev("store_region") String str5, @InterfaceC64985Pev("app_version") Long l);
}
