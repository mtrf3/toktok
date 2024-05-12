package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RR8;
import X.RR9;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class MarkMultiStrangerConversationReadResponseBody extends Message<MarkMultiStrangerConversationReadResponseBody, RR9> {
    public static final ProtoAdapter<MarkMultiStrangerConversationReadResponseBody> ADAPTER = new RR8();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("failed_conversation_short_ids")
    public final List<Long> failed_conversation_short_ids;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MarkMultiStrangerConversationReadResponseBody, RR9> newBuilder2() {
        RR9 rr9 = new RR9();
        rr9.LIZLLL = C63685Oz3.LIZJ("failed_conversation_short_ids", this.failed_conversation_short_ids);
        rr9.addUnknownFields(unknownFields());
        return rr9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.failed_conversation_short_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_conversation_short_ids=");
            sb.append(this.failed_conversation_short_ids);
        }
        return DIX.LIZLLL(sb, 0, 2, "MarkMultiStrangerConversationReadResponseBody{", '}');
    }

    public MarkMultiStrangerConversationReadResponseBody(List<Long> list) {
        this(list, C64537PUn.EMPTY);
    }

    public MarkMultiStrangerConversationReadResponseBody(List<Long> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.failed_conversation_short_ids = C63685Oz3.LJFF("failed_conversation_short_ids", list);
    }
}
