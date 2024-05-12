package com.ss.android.ugc.aweme.account.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class VerificationMethod extends F9E {

    @InterfaceC65349Pkn("type")
    public final VerificationMethodType type;

    @InterfaceC65349Pkn("verification_details")
    public final VerificationDetails verificationDetails;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.type, this.verificationDetails};
    }

    public VerificationMethod(VerificationMethodType type, VerificationDetails verificationDetails) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(verificationDetails, "verificationDetails");
        this.type = type;
        this.verificationDetails = verificationDetails;
    }
}
