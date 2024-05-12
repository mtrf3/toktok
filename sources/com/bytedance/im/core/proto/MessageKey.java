package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63460OvQ;
import X.C63461OvR;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class MessageKey extends Message<MessageKey, C63460OvQ> {
    public static final ProtoAdapter<MessageKey> ADAPTER = new C63461OvR();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("server_message_id")
    public final Long server_message_id;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessageKey, C63460OvQ> newBuilder2() {
        C63460OvQ c63460OvQ = new C63460OvQ();
        c63460OvQ.LIZLLL = this.conversation_id;
        c63460OvQ.LJ = this.conversation_short_id;
        c63460OvQ.LJFF = this.server_message_id;
        c63460OvQ.addUnknownFields(unknownFields());
        return c63460OvQ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", conversation_id=");
        LIZJ.append(this.conversation_id);
        LIZJ.append(", conversation_short_id=");
        LIZJ.append(this.conversation_short_id);
        LIZJ.append(", server_message_id=");
        LIZJ.append(this.server_message_id);
        return DIX.LIZLLL(LIZJ, 0, 2, "MessageKey{", '}');
    }

    public MessageKey(String str, Long l, Long l2) {
        this(str, l, l2, C64537PUn.EMPTY);
    }

    public MessageKey(String str, Long l, Long l2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.server_message_id = l2;
    }
}
