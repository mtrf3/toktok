package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69566RRy;
import X.C69567RRz;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class ConversationMessagePreViewResponseBody extends Message<ConversationMessagePreViewResponseBody, C69567RRz> {
    public static final ProtoAdapter<ConversationMessagePreViewResponseBody> ADAPTER = new C69566RRy();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("message_result")
    public final List<MessageBody> message_result;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationMessagePreViewResponseBody, C69567RRz> newBuilder2() {
        C69567RRz c69567RRz = new C69567RRz();
        c69567RRz.LIZLLL = C63685Oz3.LIZJ("message_result", this.message_result);
        c69567RRz.addUnknownFields(unknownFields());
        return c69567RRz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.message_result;
        if (list != null && !list.isEmpty()) {
            sb.append(", message_result=");
            sb.append(this.message_result);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationMessagePreViewResponseBody{", '}');
    }

    public ConversationMessagePreViewResponseBody(List<MessageBody> list) {
        this(list, C64537PUn.EMPTY);
    }

    public ConversationMessagePreViewResponseBody(List<MessageBody> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.message_result = C63685Oz3.LJFF("message_result", list);
    }
}
