package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RQ7;
import X.RQ8;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class DeleteMultiStrangerConversationRequestBody extends Message<DeleteMultiStrangerConversationRequestBody, RQ8> {
    public static final ProtoAdapter<DeleteMultiStrangerConversationRequestBody> ADAPTER = new RQ7();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_short_ids")
    public final List<Long> conversation_short_ids;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<DeleteMultiStrangerConversationRequestBody, RQ8> newBuilder2() {
        RQ8 rq8 = new RQ8();
        rq8.LIZLLL = C63685Oz3.LIZJ("conversation_short_ids", this.conversation_short_ids);
        rq8.addUnknownFields(unknownFields());
        return rq8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.conversation_short_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_short_ids=");
            sb.append(this.conversation_short_ids);
        }
        return DIX.LIZLLL(sb, 0, 2, "DeleteMultiStrangerConversationRequestBody{", '}');
    }

    public DeleteMultiStrangerConversationRequestBody(List<Long> list) {
        this(list, C64537PUn.EMPTY);
    }

    public DeleteMultiStrangerConversationRequestBody(List<Long> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_ids = C63685Oz3.LJFF("conversation_short_ids", list);
    }
}
