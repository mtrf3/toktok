package com.bytedance.im.core.proto;

import X.C63509OwD;
import X.C63510OwE;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class BatchDeleteConversationRequestBody extends Message<BatchDeleteConversationRequestBody, C63509OwD> {
    public static final ProtoAdapter<BatchDeleteConversationRequestBody> ADAPTER = new C63510OwE();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("delete_requests")
    public final List<DeleteConversationRequestBody> delete_requests;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchDeleteConversationRequestBody, C63509OwD> newBuilder2() {
        C63509OwD c63509OwD = new C63509OwD();
        c63509OwD.LIZLLL = C63685Oz3.LIZJ("delete_requests", this.delete_requests);
        c63509OwD.addUnknownFields(unknownFields());
        return c63509OwD;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<DeleteConversationRequestBody> list = this.delete_requests;
        if (list != null && !list.isEmpty()) {
            sb.append(", delete_requests=");
            sb.append(this.delete_requests);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchDeleteConversationRequestBody{", '}');
    }

    public BatchDeleteConversationRequestBody(List<DeleteConversationRequestBody> list) {
        this(list, C64537PUn.EMPTY);
    }

    public BatchDeleteConversationRequestBody(List<DeleteConversationRequestBody> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.delete_requests = C63685Oz3.LJFF("delete_requests", list);
    }
}
