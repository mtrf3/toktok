package com.ss.android.ugc.aweme.setting.creatorverification;

import X.AbstractC73672Svk;
import X.C85793Xll;
import X.E4Q;

/* loaded from: classes16.dex */
public interface CreatorVerificationApi {
    public static final C85793Xll LIZ = C85793Xll.LIZ;

    @E4Q("/creator/verification/status/")
    AbstractC73672Svk<CreatorVerificationResponse> getVerificationStatus();
}
