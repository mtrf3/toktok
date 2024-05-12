package com.ss.android.ugc.aweme.setting.verification;

import X.AbstractC73672Svk;
import X.C78976Uz6;
import X.E4Q;
import X.InterfaceC64989Pez;

/* loaded from: classes14.dex */
public interface VerificationApi {
    public static final C78976Uz6 LIZ = C78976Uz6.LIZ;

    @E4Q("/aweme/v1/mtcert/status/")
    AbstractC73672Svk<VerificationResponse> requestVerification(@InterfaceC64989Pez("sec_uid") String str);
}
