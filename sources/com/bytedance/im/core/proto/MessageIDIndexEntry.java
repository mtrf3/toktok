package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63683Oz1;
import X.C63684Oz2;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class MessageIDIndexEntry extends Message<MessageIDIndexEntry, C63684Oz2> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("index_in_conversation")
    public final Long index_in_conversation;

    @InterfaceC65349Pkn("server_message_id")
    public final Long server_message_id;
    public static final ProtoAdapter<MessageIDIndexEntry> ADAPTER = new C63683Oz1();
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessageIDIndexEntry, C63684Oz2> newBuilder2() {
        C63684Oz2 c63684Oz2 = new C63684Oz2();
        c63684Oz2.LIZLLL = this.server_message_id;
        c63684Oz2.LJ = this.index_in_conversation;
        c63684Oz2.addUnknownFields(unknownFields());
        return c63684Oz2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", server_message_id=");
        LIZJ.append(this.server_message_id);
        LIZJ.append(", index_in_conversation=");
        LIZJ.append(this.index_in_conversation);
        return DIX.LIZLLL(LIZJ, 0, 2, "MessageIDIndexEntry{", '}');
    }

    public MessageIDIndexEntry(Long l, Long l2) {
        this(l, l2, C64537PUn.EMPTY);
    }

    public MessageIDIndexEntry(Long l, Long l2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.server_message_id = l;
        this.index_in_conversation = l2;
    }
}
