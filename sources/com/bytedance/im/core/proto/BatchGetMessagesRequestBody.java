package com.bytedance.im.core.proto;

import X.C63471Ovb;
import X.C63472Ovc;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class BatchGetMessagesRequestBody extends Message<BatchGetMessagesRequestBody, C63471Ovb> {
    public static final ProtoAdapter<BatchGetMessagesRequestBody> ADAPTER = new C63472Ovc();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("keys")
    public final List<MessageKey> keys;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchGetMessagesRequestBody, C63471Ovb> newBuilder2() {
        C63471Ovb c63471Ovb = new C63471Ovb();
        c63471Ovb.LIZLLL = C63685Oz3.LIZJ("keys", this.keys);
        c63471Ovb.addUnknownFields(unknownFields());
        return c63471Ovb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageKey> list = this.keys;
        if (list != null && !list.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchGetMessagesRequestBody{", '}');
    }

    public BatchGetMessagesRequestBody(List<MessageKey> list) {
        this(list, C64537PUn.EMPTY);
    }

    public BatchGetMessagesRequestBody(List<MessageKey> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.keys = C63685Oz3.LJFF("keys", list);
    }
}
