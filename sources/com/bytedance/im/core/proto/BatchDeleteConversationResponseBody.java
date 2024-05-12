package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.YY9;
import X.YYA;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes17.dex */
public final class BatchDeleteConversationResponseBody extends Message<BatchDeleteConversationResponseBody, YYA> {
    public static final ProtoAdapter<BatchDeleteConversationResponseBody> ADAPTER = new YY9();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("failed_requests")
    public final List<DeleteConversationRequestBody> failed_requests;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchDeleteConversationResponseBody, YYA> newBuilder2() {
        YYA yya = new YYA();
        yya.LIZLLL = C63685Oz3.LIZJ("failed_requests", this.failed_requests);
        yya.addUnknownFields(unknownFields());
        return yya;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<DeleteConversationRequestBody> list = this.failed_requests;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_requests=");
            sb.append(this.failed_requests);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchDeleteConversationResponseBody{", '}');
    }

    public BatchDeleteConversationResponseBody(List<DeleteConversationRequestBody> list) {
        this(list, C64537PUn.EMPTY);
    }

    public BatchDeleteConversationResponseBody(List<DeleteConversationRequestBody> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.failed_requests = C63685Oz3.LJFF("failed_requests", list);
    }
}
