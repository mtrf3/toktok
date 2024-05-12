package com.bytedance.im.core.proto;

import X.C63492Ovw;
import X.C63493Ovx;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class DeleteStrangerConversationRequestBody extends Message<DeleteStrangerConversationRequestBody, C63492Ovw> {
    public static final ProtoAdapter<DeleteStrangerConversationRequestBody> ADAPTER = new C63493Ovx();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<DeleteStrangerConversationRequestBody, C63492Ovw> newBuilder2() {
        C63492Ovw c63492Ovw = new C63492Ovw();
        c63492Ovw.LIZLLL = this.conversation_short_id;
        c63492Ovw.addUnknownFields(unknownFields());
        return c63492Ovw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        return DIX.LIZLLL(sb, 0, 2, "DeleteStrangerConversationRequestBody{", '}');
    }

    public DeleteStrangerConversationRequestBody(Long l) {
        this(l, C64537PUn.EMPTY);
    }

    public DeleteStrangerConversationRequestBody(Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_id = l;
    }
}
