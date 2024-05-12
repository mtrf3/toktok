package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RR6;
import X.RR7;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class DeleteMultiStrangerConversationResponseBody extends Message<DeleteMultiStrangerConversationResponseBody, RR7> {
    public static final ProtoAdapter<DeleteMultiStrangerConversationResponseBody> ADAPTER = new RR6();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("failed_conversation_short_ids")
    public final List<Long> failed_conversation_short_ids;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<DeleteMultiStrangerConversationResponseBody, RR7> newBuilder2() {
        RR7 rr7 = new RR7();
        rr7.LIZLLL = C63685Oz3.LIZJ("failed_conversation_short_ids", this.failed_conversation_short_ids);
        rr7.addUnknownFields(unknownFields());
        return rr7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.failed_conversation_short_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_conversation_short_ids=");
            sb.append(this.failed_conversation_short_ids);
        }
        return DIX.LIZLLL(sb, 0, 2, "DeleteMultiStrangerConversationResponseBody{", '}');
    }

    public DeleteMultiStrangerConversationResponseBody(List<Long> list) {
        this(list, C64537PUn.EMPTY);
    }

    public DeleteMultiStrangerConversationResponseBody(List<Long> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.failed_conversation_short_ids = C63685Oz3.LJFF("failed_conversation_short_ids", list);
    }
}
