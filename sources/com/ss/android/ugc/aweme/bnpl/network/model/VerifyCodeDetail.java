package com.ss.android.ugc.aweme.bnpl.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class VerifyCodeDetail extends F9E {

    @InterfaceC65349Pkn("app_id")
    public final String appId;

    @InterfaceC65349Pkn("code_type")
    public final String codeType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.codeType, this.appId};
    }

    public VerifyCodeDetail(String codeType, String appId) {
        o.LJIIIZ(codeType, "codeType");
        o.LJIIIZ(appId, "appId");
        this.codeType = codeType;
        this.appId = appId;
    }
}
