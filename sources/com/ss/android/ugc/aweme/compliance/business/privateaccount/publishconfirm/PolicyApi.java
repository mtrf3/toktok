package com.ss.android.ugc.aweme.compliance.business.privateaccount.publishconfirm;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.C62947On9;
import X.E4T;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes11.dex */
public final class PolicyApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C62947On9.LJLIL);

    /* loaded from: classes11.dex */
    public interface PolicyService {
        @E4T("/aweme/v1/accept-private-policy/")
        AbstractC73672Svk<BaseResponse> acceptPrivacyPolicy();
    }
}
