package com.bytedance.im.core.proto;

import X.C120514oB;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P1E;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class BatchMarkConversationReadRequestBody extends Message<BatchMarkConversationReadRequestBody, C120514oB> {
    public static final ProtoAdapter<BatchMarkConversationReadRequestBody> ADAPTER = new P1E();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("mark_read_requests")
    public final List<MarkConversationReadRequestBody> mark_read_requests;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchMarkConversationReadRequestBody, C120514oB> newBuilder2() {
        C120514oB c120514oB = new C120514oB();
        c120514oB.LIZLLL = C63685Oz3.LIZJ("mark_read_requests", this.mark_read_requests);
        c120514oB.addUnknownFields(unknownFields());
        return c120514oB;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MarkConversationReadRequestBody> list = this.mark_read_requests;
        if (list != null && !list.isEmpty()) {
            sb.append(", mark_read_requests=");
            sb.append(this.mark_read_requests);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchMarkConversationReadRequestBody{", '}');
    }

    public BatchMarkConversationReadRequestBody(List<MarkConversationReadRequestBody> list) {
        this(list, C64537PUn.EMPTY);
    }

    public BatchMarkConversationReadRequestBody(List<MarkConversationReadRequestBody> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.mark_read_requests = C63685Oz3.LJFF("mark_read_requests", list);
    }
}
