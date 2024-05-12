package com.ss.android.ugc.aweme.bnpl.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class ConfirmRegisterMobileResponse extends F9E {

    @InterfaceC65349Pkn("verify_info")
    public final String verifyInfo;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.verifyInfo};
    }

    public ConfirmRegisterMobileResponse(String verifyInfo) {
        o.LJIIIZ(verifyInfo, "verifyInfo");
        this.verifyInfo = verifyInfo;
    }
}
