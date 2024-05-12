package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RQ9;
import X.RQA;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class MarkMultiStrangerConversationReadRequestBody extends Message<MarkMultiStrangerConversationReadRequestBody, RQA> {
    public static final ProtoAdapter<MarkMultiStrangerConversationReadRequestBody> ADAPTER = new RQ9();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_short_ids")
    public final List<Long> conversation_short_ids;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MarkMultiStrangerConversationReadRequestBody, RQA> newBuilder2() {
        RQA rqa = new RQA();
        rqa.LIZLLL = C63685Oz3.LIZJ("conversation_short_ids", this.conversation_short_ids);
        rqa.addUnknownFields(unknownFields());
        return rqa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.conversation_short_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_short_ids=");
            sb.append(this.conversation_short_ids);
        }
        return DIX.LIZLLL(sb, 0, 2, "MarkMultiStrangerConversationReadRequestBody{", '}');
    }

    public MarkMultiStrangerConversationReadRequestBody(List<Long> list) {
        this(list, C64537PUn.EMPTY);
    }

    public MarkMultiStrangerConversationReadRequestBody(List<Long> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_ids = C63685Oz3.LJFF("conversation_short_ids", list);
    }
}
