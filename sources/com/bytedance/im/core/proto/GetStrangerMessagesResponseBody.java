package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P0D;
import X.P0E;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class GetStrangerMessagesResponseBody extends Message<GetStrangerMessagesResponseBody, P0E> {
    public static final ProtoAdapter<GetStrangerMessagesResponseBody> ADAPTER = new P0D();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("messages")
    public final List<MessageBody> messages;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetStrangerMessagesResponseBody, P0E> newBuilder2() {
        P0E p0e = new P0E();
        p0e.LIZLLL = C63685Oz3.LIZJ("messages", this.messages);
        p0e.addUnknownFields(unknownFields());
        return p0e;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetStrangerMessagesResponseBody{", '}');
    }

    public GetStrangerMessagesResponseBody(List<MessageBody> list) {
        this(list, C64537PUn.EMPTY);
    }

    public GetStrangerMessagesResponseBody(List<MessageBody> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.messages = C63685Oz3.LJFF("messages", list);
    }
}
