package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69580RSm;
import X.C69581RSn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class BatchGetMessagesResponseBody extends Message<BatchGetMessagesResponseBody, C69581RSn> {
    public static final ProtoAdapter<BatchGetMessagesResponseBody> ADAPTER = new C69580RSm();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("errors")
    public final List<GetMessageByKeyError> errors;

    @InterfaceC65349Pkn("messages")
    public final List<MessageBody> messages;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchGetMessagesResponseBody, C69581RSn> newBuilder2() {
        C69581RSn c69581RSn = new C69581RSn();
        c69581RSn.LIZLLL = C63685Oz3.LIZJ("messages", this.messages);
        c69581RSn.LJ = C63685Oz3.LIZJ("errors", this.errors);
        c69581RSn.addUnknownFields(unknownFields());
        return c69581RSn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        List<GetMessageByKeyError> list2 = this.errors;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", errors=");
            sb.append(this.errors);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchGetMessagesResponseBody{", '}');
    }

    public BatchGetMessagesResponseBody(List<MessageBody> list, List<GetMessageByKeyError> list2) {
        this(list, list2, C64537PUn.EMPTY);
    }

    public BatchGetMessagesResponseBody(List<MessageBody> list, List<GetMessageByKeyError> list2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.messages = C63685Oz3.LJFF("messages", list);
        this.errors = C63685Oz3.LJFF("errors", list2);
    }
}
