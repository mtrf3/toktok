package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69558RRq;
import X.C69559RRr;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class CheckMessagesPerUserResponseBody extends Message<CheckMessagesPerUserResponseBody, C69559RRr> {
    public static final ProtoAdapter<CheckMessagesPerUserResponseBody> ADAPTER = new C69558RRq();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("messages")
    public final List<InboxMessagesPerUserResponseBody> messages;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<CheckMessagesPerUserResponseBody, C69559RRr> newBuilder2() {
        C69559RRr c69559RRr = new C69559RRr();
        c69559RRr.LIZLLL = C63685Oz3.LIZJ("messages", this.messages);
        c69559RRr.addUnknownFields(unknownFields());
        return c69559RRr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<InboxMessagesPerUserResponseBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        return DIX.LIZLLL(sb, 0, 2, "CheckMessagesPerUserResponseBody{", '}');
    }

    public CheckMessagesPerUserResponseBody(List<InboxMessagesPerUserResponseBody> list) {
        this(list, C64537PUn.EMPTY);
    }

    public CheckMessagesPerUserResponseBody(List<InboxMessagesPerUserResponseBody> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.messages = C63685Oz3.LJFF("messages", list);
    }
}
