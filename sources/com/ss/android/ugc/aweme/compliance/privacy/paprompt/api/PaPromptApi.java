package com.ss.android.ugc.aweme.compliance.privacy.paprompt.api;

import X.AbstractC73672Svk;
import X.E7W;
import X.E8M;
import X.InterfaceC195787mI;
import X.InterfaceC64985Pev;

/* loaded from: classes7.dex */
public interface PaPromptApi {
    public static final E7W LIZ = E7W.LIZ;

    @InterfaceC195787mI
    @E8M("/tiktok/privacy/user/private_account_prompt/v1")
    AbstractC73672Svk<PaPromptResponse> updatePrivateAccountAndFetchPrivacySettings(@InterfaceC64985Pev("private_account") int i);
}
