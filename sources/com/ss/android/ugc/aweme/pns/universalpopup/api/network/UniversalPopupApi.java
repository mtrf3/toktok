package com.ss.android.ugc.aweme.pns.universalpopup.api.network;

import X.C10K;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36332ENs;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.PolicyNoticeApproveResponseUPSdk;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.PolicyNoticeResponseUPSdk;

/* loaded from: classes7.dex */
public interface UniversalPopupApi {
    @E8L("{path_prefix}/policy/notice/")
    C10K<PolicyNoticeResponseUPSdk> getUniversalPopup(@InterfaceC36332ENs(encode = false, value = "path_prefix") String str, @InterfaceC64986Pew("scene") int i);

    @E8M("{path_prefix}/policy/notice/approve/")
    @InterfaceC195757mF
    C10K<PolicyNoticeApproveResponseUPSdk> universalPopupApprove(@InterfaceC36332ENs(encode = false, value = "path_prefix") String str, @InterfaceC64985Pev("business") String str2, @InterfaceC64985Pev("scene") Integer num, @InterfaceC64985Pev("policy_version") String str3, @InterfaceC64985Pev("style") String str4, @InterfaceC64985Pev("extra") String str5, @InterfaceC64985Pev("operation") Integer num2);
}
