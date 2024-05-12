package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RRO;
import X.RRP;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class BroadcastUserCounterRequestBody extends Message<BroadcastUserCounterRequestBody, RRP> {
    public static final ProtoAdapter<BroadcastUserCounterRequestBody> ADAPTER = new RRO();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversations")
    public final List<ConversationRequest> conversations;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BroadcastUserCounterRequestBody, RRP> newBuilder2() {
        RRP rrp = new RRP();
        rrp.LIZLLL = C63685Oz3.LIZJ("conversations", this.conversations);
        rrp.addUnknownFields(unknownFields());
        return rrp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationRequest> list = this.conversations;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversations=");
            sb.append(this.conversations);
        }
        return DIX.LIZLLL(sb, 0, 2, "BroadcastUserCounterRequestBody{", '}');
    }

    public BroadcastUserCounterRequestBody(List<ConversationRequest> list) {
        this(list, C64537PUn.EMPTY);
    }

    public BroadcastUserCounterRequestBody(List<ConversationRequest> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversations = C63685Oz3.LJFF("conversations", list);
    }
}
