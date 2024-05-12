package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.YYB;
import X.YYC;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes17.dex */
public final class BatchMarkConversationReadResponseBody extends Message<BatchMarkConversationReadResponseBody, YYC> {
    public static final ProtoAdapter<BatchMarkConversationReadResponseBody> ADAPTER = new YYB();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("failed_requests")
    public final List<MarkConversationReadRequestBody> failed_requests;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchMarkConversationReadResponseBody, YYC> newBuilder2() {
        YYC yyc = new YYC();
        yyc.LIZLLL = C63685Oz3.LIZJ("failed_requests", this.failed_requests);
        yyc.addUnknownFields(unknownFields());
        return yyc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MarkConversationReadRequestBody> list = this.failed_requests;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_requests=");
            sb.append(this.failed_requests);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchMarkConversationReadResponseBody{", '}');
    }

    public BatchMarkConversationReadResponseBody(List<MarkConversationReadRequestBody> list) {
        this(list, C64537PUn.EMPTY);
    }

    public BatchMarkConversationReadResponseBody(List<MarkConversationReadRequestBody> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.failed_requests = C63685Oz3.LJFF("failed_requests", list);
    }
}
