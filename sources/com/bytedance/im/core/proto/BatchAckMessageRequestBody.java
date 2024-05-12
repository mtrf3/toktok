package com.bytedance.im.core.proto;

import X.C63639OyJ;
import X.C63640OyK;
import X.C63685Oz3;
import X.C64537PUn;
import X.C89451Z8t;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class BatchAckMessageRequestBody extends Message<BatchAckMessageRequestBody, C63640OyK> {
    public static final ProtoAdapter<BatchAckMessageRequestBody> ADAPTER;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("ack_msgs")
    public final List<AckMessage> ack_msgs;

    static {
        C63639OyJ c63639OyJ = new C63639OyJ();
        ADAPTER = c63639OyJ;
        C89451Z8t.LJ.put(2059, c63639OyJ);
    }

    public static void registerAdapter() {
        C89451Z8t.LJ.put(2059, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchAckMessageRequestBody, C63640OyK> newBuilder2() {
        C63640OyK c63640OyK = new C63640OyK();
        c63640OyK.LIZLLL = C63685Oz3.LIZJ("ack_msgs", this.ack_msgs);
        c63640OyK.addUnknownFields(unknownFields());
        return c63640OyK;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<AckMessage> list = this.ack_msgs;
        if (list != null && !list.isEmpty()) {
            sb.append(", ack_msgs=");
            sb.append(this.ack_msgs);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchAckMessageRequestBody{", '}');
    }

    public BatchAckMessageRequestBody(List<AckMessage> list) {
        this(list, C64537PUn.EMPTY);
    }

    public BatchAckMessageRequestBody(List<AckMessage> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.ack_msgs = C63685Oz3.LJFF("ack_msgs", list);
    }
}
