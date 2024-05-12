package com.ss.android.ugc.aweme.compliance.business.fbv;

import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;

/* loaded from: classes11.dex */
public interface FBVApi {
    @E8L("/aweme/v1/policy/notice/check")
    Object consentAcceptance(@InterfaceC64986Pew("business") String str, InterfaceC67352kd<? super FBVCheckResponse> interfaceC67352kd);
}
