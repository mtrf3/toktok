package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RRE;
import X.RRF;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class AckMessageResponseBody extends Message<AckMessageResponseBody, RRF> {
    public static final ProtoAdapter<AckMessageResponseBody> ADAPTER = new RRE();
    public static final Long DEFAULT_BACKEND_E2E_LATENCY = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("backend_e2e_latency")
    public final Long backend_e2e_latency;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<AckMessageResponseBody, RRF> newBuilder2() {
        RRF rrf = new RRF();
        rrf.LIZLLL = this.backend_e2e_latency;
        rrf.addUnknownFields(unknownFields());
        return rrf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.backend_e2e_latency != null) {
            sb.append(", backend_e2e_latency=");
            sb.append(this.backend_e2e_latency);
        }
        return DIX.LIZLLL(sb, 0, 2, "AckMessageResponseBody{", '}');
    }

    public AckMessageResponseBody(Long l) {
        this(l, C64537PUn.EMPTY);
    }

    public AckMessageResponseBody(Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.backend_e2e_latency = l;
    }
}
