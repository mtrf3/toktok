package com.ss.android.ugc.aweme.bnpl.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class Nonce extends F9E {

    @InterfaceC65349Pkn("nonce")
    public final String nonce;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.nonce};
    }

    public Nonce(String nonce) {
        o.LJIIIZ(nonce, "nonce");
        this.nonce = nonce;
    }
}
