package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RQB;
import X.RQC;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class MessageByInitRequestBody extends Message<MessageByInitRequestBody, RQC> {
    public static final ProtoAdapter<MessageByInitRequestBody> ADAPTER = new RQB();
    public static final Long DEFAULT_VERSION = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("version")
    public final Long version;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessageByInitRequestBody, RQC> newBuilder2() {
        RQC rqc = new RQC();
        rqc.LIZLLL = this.version;
        rqc.addUnknownFields(unknownFields());
        return rqc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessageByInitRequestBody{", '}');
    }

    public MessageByInitRequestBody(Long l) {
        this(l, C64537PUn.EMPTY);
    }

    public MessageByInitRequestBody(Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.version = l;
    }
}
