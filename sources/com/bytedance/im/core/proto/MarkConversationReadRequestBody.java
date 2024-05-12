package com.bytedance.im.core.proto;

import X.C63462OvS;
import X.C63463OvT;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class MarkConversationReadRequestBody extends Message<MarkConversationReadRequestBody, C63462OvS> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conv_unread_count")
    public final Long conv_unread_count;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("read_badge_count")
    public final Integer read_badge_count;

    @InterfaceC65349Pkn("read_badge_count_v2")
    public final Integer read_badge_count_v2;

    @InterfaceC65349Pkn("read_message_index")
    public final Long read_message_index;

    @InterfaceC65349Pkn("read_message_index_v2")
    public final Long read_message_index_v2;

    @InterfaceC65349Pkn("server_message_id")
    public final Long server_message_id;

    @InterfaceC65349Pkn("ticket")
    public final String ticket;

    @InterfaceC65349Pkn("total_unread_count")
    public final Long total_unread_count;
    public static final ProtoAdapter<MarkConversationReadRequestBody> ADAPTER = new C63463OvT();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_READ_MESSAGE_INDEX = 0L;
    public static final Long DEFAULT_CONV_UNREAD_COUNT = 0L;
    public static final Long DEFAULT_TOTAL_UNREAD_COUNT = 0L;
    public static final Long DEFAULT_READ_MESSAGE_INDEX_V2 = 0L;
    public static final Integer DEFAULT_READ_BADGE_COUNT = 0;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Integer DEFAULT_READ_BADGE_COUNT_V2 = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MarkConversationReadRequestBody, C63462OvS> newBuilder2() {
        C63462OvS c63462OvS = new C63462OvS();
        c63462OvS.LIZLLL = this.conversation_id;
        c63462OvS.LJ = this.conversation_short_id;
        c63462OvS.LJFF = this.conversation_type;
        c63462OvS.LJI = this.read_message_index;
        c63462OvS.LJII = this.conv_unread_count;
        c63462OvS.LJIIIIZZ = this.total_unread_count;
        c63462OvS.LJIIIZ = this.read_message_index_v2;
        c63462OvS.LJIIJ = this.read_badge_count;
        c63462OvS.LJIIJJI = this.ticket;
        c63462OvS.LJIIL = this.server_message_id;
        c63462OvS.LJIILIIL = this.read_badge_count_v2;
        c63462OvS.addUnknownFields(unknownFields());
        return c63462OvS;
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
        if (this.read_message_index != null) {
            sb.append(", read_message_index=");
            sb.append(this.read_message_index);
        }
        if (this.conv_unread_count != null) {
            sb.append(", conv_unread_count=");
            sb.append(this.conv_unread_count);
        }
        if (this.total_unread_count != null) {
            sb.append(", total_unread_count=");
            sb.append(this.total_unread_count);
        }
        if (this.read_message_index_v2 != null) {
            sb.append(", read_message_index_v2=");
            sb.append(this.read_message_index_v2);
        }
        if (this.read_badge_count != null) {
            sb.append(", read_badge_count=");
            sb.append(this.read_badge_count);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.read_badge_count_v2 != null) {
            sb.append(", read_badge_count_v2=");
            sb.append(this.read_badge_count_v2);
        }
        return DIX.LIZLLL(sb, 0, 2, "MarkConversationReadRequestBody{", '}');
    }

    public MarkConversationReadRequestBody(String str, Long l, Integer num, Long l2, Long l3, Long l4, Long l5, Integer num2, String str2, Long l6, Integer num3) {
        this(str, l, num, l2, l3, l4, l5, num2, str2, l6, num3, C64537PUn.EMPTY);
    }

    public MarkConversationReadRequestBody(String str, Long l, Integer num, Long l2, Long l3, Long l4, Long l5, Integer num2, String str2, Long l6, Integer num3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.read_message_index = l2;
        this.conv_unread_count = l3;
        this.total_unread_count = l4;
        this.read_message_index_v2 = l5;
        this.read_badge_count = num2;
        this.ticket = str2;
        this.server_message_id = l6;
        this.read_badge_count_v2 = num3;
    }
}
