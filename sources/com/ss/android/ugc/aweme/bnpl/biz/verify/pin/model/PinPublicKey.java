package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PinPublicKey extends F9E {

    @InterfaceC65349Pkn("pin_pubkey")
    public final String publicKey;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.publicKey};
    }

    public PinPublicKey(String publicKey) {
        o.LJIIIZ(publicKey, "publicKey");
        this.publicKey = publicKey;
    }
}
