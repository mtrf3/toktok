package com.ss.android.ugc.aweme.bnpl.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class SendVerifyCodeRequest extends F9E {

    @InterfaceC65349Pkn("verify_code_detail")
    public final String verifyCodeDetail;

    @InterfaceC65349Pkn("verify_code_type")
    public final String verifyCodeType;

    @InterfaceC65349Pkn("verify_id")
    public final String verifyId;

    @InterfaceC65349Pkn("verify_type")
    public final String verifyType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.verifyId, this.verifyType, this.verifyCodeType, this.verifyCodeDetail};
    }

    public SendVerifyCodeRequest(String verifyId, String verifyType, String verifyCodeType, String verifyCodeDetail) {
        o.LJIIIZ(verifyId, "verifyId");
        o.LJIIIZ(verifyType, "verifyType");
        o.LJIIIZ(verifyCodeType, "verifyCodeType");
        o.LJIIIZ(verifyCodeDetail, "verifyCodeDetail");
        this.verifyId = verifyId;
        this.verifyType = verifyType;
        this.verifyCodeType = verifyCodeType;
        this.verifyCodeDetail = verifyCodeDetail;
    }
}
