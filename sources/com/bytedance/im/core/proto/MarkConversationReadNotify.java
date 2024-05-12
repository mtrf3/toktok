package com.bytedance.im.core.proto;

import X.C63747P0d;
import X.C63748P0e;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class MarkConversationReadNotify extends Message<MarkConversationReadNotify, C63748P0e> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("message_id")
    public final Long message_id;

    @InterfaceC65349Pkn("read_index")
    public final Long read_index;

    @InterfaceC65349Pkn("read_index_v2")
    public final Long read_index_v2;

    @InterfaceC65349Pkn("user_id")
    public final Long user_id;
    public static final ProtoAdapter<MarkConversationReadNotify> ADAPTER = new C63747P0d();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_READ_INDEX = 0L;
    public static final Long DEFAULT_READ_INDEX_V2 = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_MESSAGE_ID = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MarkConversationReadNotify, C63748P0e> newBuilder2() {
        C63748P0e c63748P0e = new C63748P0e();
        c63748P0e.LIZLLL = this.conversation_id;
        c63748P0e.LJ = this.conversation_type;
        c63748P0e.LJFF = this.read_index;
        c63748P0e.LJI = this.read_index_v2;
        c63748P0e.LJII = this.user_id;
        c63748P0e.LJIIIIZZ = this.message_id;
        c63748P0e.addUnknownFields(unknownFields());
        return c63748P0e;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.read_index != null) {
            sb.append(", read_index=");
            sb.append(this.read_index);
        }
        if (this.read_index_v2 != null) {
            sb.append(", read_index_v2=");
            sb.append(this.read_index_v2);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        return DIX.LIZLLL(sb, 0, 2, "MarkConversationReadNotify{", '}');
    }

    public MarkConversationReadNotify(String str, Integer num, Long l, Long l2, Long l3, Long l4) {
        this(str, num, l, l2, l3, l4, C64537PUn.EMPTY);
    }

    public MarkConversationReadNotify(String str, Integer num, Long l, Long l2, Long l3, Long l4, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.read_index = l;
        this.read_index_v2 = l2;
        this.user_id = l3;
        this.message_id = l4;
    }
}
