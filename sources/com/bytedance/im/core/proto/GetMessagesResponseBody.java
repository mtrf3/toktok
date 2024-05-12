package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C63727Ozj;
import X.C63728Ozk;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class GetMessagesResponseBody extends Message<GetMessagesResponseBody, C63728Ozk> {
    public static final ProtoAdapter<GetMessagesResponseBody> ADAPTER = new C63727Ozj();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("errors")
    public final List<GetMessageError> errors;

    @InterfaceC65349Pkn("messages")
    public final List<MessageBody> messages;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessagesResponseBody, C63728Ozk> newBuilder2() {
        C63728Ozk c63728Ozk = new C63728Ozk();
        c63728Ozk.LIZLLL = C63685Oz3.LIZJ("messages", this.messages);
        c63728Ozk.LJ = C63685Oz3.LIZJ("errors", this.errors);
        c63728Ozk.addUnknownFields(unknownFields());
        return c63728Ozk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        List<GetMessageError> list2 = this.errors;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", errors=");
            sb.append(this.errors);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetMessagesResponseBody{", '}');
    }

    public GetMessagesResponseBody(List<MessageBody> list, List<GetMessageError> list2) {
        this(list, list2, C64537PUn.EMPTY);
    }

    public GetMessagesResponseBody(List<MessageBody> list, List<GetMessageError> list2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.messages = C63685Oz3.LJFF("messages", list);
        this.errors = C63685Oz3.LJFF("errors", list2);
    }
}
