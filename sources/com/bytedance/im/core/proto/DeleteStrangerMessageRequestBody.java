package com.bytedance.im.core.proto;

import X.C63490Ovu;
import X.C63491Ovv;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class DeleteStrangerMessageRequestBody extends Message<DeleteStrangerMessageRequestBody, C63490Ovu> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("server_message_id")
    public final Long server_message_id;
    public static final ProtoAdapter<DeleteStrangerMessageRequestBody> ADAPTER = new C63491Ovv();
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<DeleteStrangerMessageRequestBody, C63490Ovu> newBuilder2() {
        C63490Ovu c63490Ovu = new C63490Ovu();
        c63490Ovu.LIZLLL = this.server_message_id;
        c63490Ovu.LJ = this.conversation_short_id;
        c63490Ovu.addUnknownFields(unknownFields());
        return c63490Ovu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        return DIX.LIZLLL(sb, 0, 2, "DeleteStrangerMessageRequestBody{", '}');
    }

    public DeleteStrangerMessageRequestBody(Long l, Long l2) {
        this(l, l2, C64537PUn.EMPTY);
    }

    public DeleteStrangerMessageRequestBody(Long l, Long l2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.server_message_id = l;
        this.conversation_short_id = l2;
    }
}
