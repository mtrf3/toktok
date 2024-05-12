package com.bytedance.android.livesdk.envelope.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class EnvelopeListResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public RedEnvelopeListResponse data;

    @Override // X.F9E
    public final Object[] getObjects() {
        RedEnvelopeListResponse redEnvelopeListResponse = this.data;
        return new Object[]{redEnvelopeListResponse, redEnvelopeListResponse};
    }
}
