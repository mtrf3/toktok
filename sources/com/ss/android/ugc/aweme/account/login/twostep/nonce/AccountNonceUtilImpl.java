package com.ss.android.ugc.aweme.account.login.twostep.nonce;

import X.C53224Kui;
import X.FFL;
import X.InterfaceC67352kd;
import com.bytedance.ies.abmock.ClientExpManager;
import com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse;
import com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;

/* loaded from: classes10.dex */
public final class AccountNonceUtilImpl implements IAccountNonceUtil {
    @Override // com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil
    public final boolean LIZIZ() {
        if (((Boolean) C53224Kui.LIZ.getValue()).booleanValue() && FFL.LJIIIZ().LJIIJJI(ClientExpManager.google_onetap_nonce_fix_2(), "google_onetap_nonce_fix_2") == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil
    public final Object LIZ(String str, InterfaceC67352kd<? super GetNonceResponse> interfaceC67352kd) {
        return TwoStepAuthApi.LIZ.LIZLLL(str, interfaceC67352kd);
    }
}
