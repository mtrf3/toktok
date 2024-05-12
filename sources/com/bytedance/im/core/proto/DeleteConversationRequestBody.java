package com.bytedance.im.core.proto;

import X.C63456OvM;
import X.C63459OvP;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class DeleteConversationRequestBody extends Message<DeleteConversationRequestBody, C63459OvP> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("badge_count")
    public final Integer badge_count;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("last_message_index")
    public final Long last_message_index;

    @InterfaceC65349Pkn("last_message_index_v2")
    public final Long last_message_index_v2;
    public static final ProtoAdapter<DeleteConversationRequestBody> ADAPTER = new C63456OvM();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_LAST_MESSAGE_INDEX = 0L;
    public static final Long DEFAULT_LAST_MESSAGE_INDEX_V2 = 0L;
    public static final Integer DEFAULT_BADGE_COUNT = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<DeleteConversationRequestBody, C63459OvP> newBuilder2() {
        C63459OvP c63459OvP = new C63459OvP();
        c63459OvP.LIZLLL = this.conversation_id;
        c63459OvP.LJ = this.conversation_short_id;
        c63459OvP.LJFF = this.conversation_type;
        c63459OvP.LJI = this.last_message_index;
        c63459OvP.LJII = this.last_message_index_v2;
        c63459OvP.LJIIIIZZ = this.badge_count;
        c63459OvP.addUnknownFields(unknownFields());
        return c63459OvP;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.last_message_index != null) {
            sb.append(", last_message_index=");
            sb.append(this.last_message_index);
        }
        if (this.last_message_index_v2 != null) {
            sb.append(", last_message_index_v2=");
            sb.append(this.last_message_index_v2);
        }
        if (this.badge_count != null) {
            sb.append(", badge_count=");
            sb.append(this.badge_count);
        }
        return DIX.LIZLLL(sb, 0, 2, "DeleteConversationRequestBody{", '}');
    }

    public DeleteConversationRequestBody(String str, Long l, Integer num, Long l2, Long l3, Integer num2) {
        this(str, l, num, l2, l3, num2, C64537PUn.EMPTY);
    }

    public DeleteConversationRequestBody(String str, Long l, Integer num, Long l2, Long l3, Integer num2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.last_message_index = l2;
        this.last_message_index_v2 = l3;
        this.badge_count = num2;
    }
}
