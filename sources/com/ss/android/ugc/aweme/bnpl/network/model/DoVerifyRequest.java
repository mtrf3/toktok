package com.ss.android.ugc.aweme.bnpl.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class DoVerifyRequest extends F9E {

    @InterfaceC65349Pkn("merchant_user_id")
    public final String merchantUserId;

    @InterfaceC65349Pkn("verify_content")
    public final String verifyContent;

    @InterfaceC65349Pkn("verify_id")
    public final String verifyId;

    @InterfaceC65349Pkn("verify_type")
    public final String verifyType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.merchantUserId, this.verifyId, this.verifyType, this.verifyContent};
    }

    public DoVerifyRequest(String merchantUserId, String verifyId, String verifyType, String verifyContent) {
        o.LJIIIZ(merchantUserId, "merchantUserId");
        o.LJIIIZ(verifyId, "verifyId");
        o.LJIIIZ(verifyType, "verifyType");
        o.LJIIIZ(verifyContent, "verifyContent");
        this.merchantUserId = merchantUserId;
        this.verifyId = verifyId;
        this.verifyType = verifyType;
        this.verifyContent = verifyContent;
    }
}
