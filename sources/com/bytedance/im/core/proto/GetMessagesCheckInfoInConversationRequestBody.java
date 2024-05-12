package com.bytedance.im.core.proto;

import X.C63447OvD;
import X.C63457OvN;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetMessagesCheckInfoInConversationRequestBody extends Message<GetMessagesCheckInfoInConversationRequestBody, C63447OvD> {
    public static final ProtoAdapter<GetMessagesCheckInfoInConversationRequestBody> ADAPTER = new C63457OvN();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CURSOR_REVERSE_BEGIN = 0L;
    public static final Long DEFAULT_CURSOR_REVERSE_END = 0L;
    public static final Integer DEFAULT_EXPECT_MSG_TOTAL_COUNT = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("cursor_reverse_begin")
    public final Long cursor_reverse_begin;

    @InterfaceC65349Pkn("cursor_reverse_end")
    public final Long cursor_reverse_end;

    @InterfaceC65349Pkn("expect_msg_total_count")
    public final Integer expect_msg_total_count;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessagesCheckInfoInConversationRequestBody, C63447OvD> newBuilder2() {
        C63447OvD c63447OvD = new C63447OvD();
        c63447OvD.LIZLLL = this.conversation_short_id;
        c63447OvD.LJ = this.conversation_id;
        c63447OvD.LJFF = this.conversation_type;
        c63447OvD.LJI = this.cursor_reverse_begin;
        c63447OvD.LJII = this.cursor_reverse_end;
        c63447OvD.LJIIIIZZ = this.expect_msg_total_count;
        c63447OvD.addUnknownFields(unknownFields());
        return c63447OvD;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.cursor_reverse_begin != null) {
            sb.append(", cursor_reverse_begin=");
            sb.append(this.cursor_reverse_begin);
        }
        if (this.cursor_reverse_end != null) {
            sb.append(", cursor_reverse_end=");
            sb.append(this.cursor_reverse_end);
        }
        if (this.expect_msg_total_count != null) {
            sb.append(", expect_msg_total_count=");
            sb.append(this.expect_msg_total_count);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetMessagesCheckInfoInConversationRequestBody{", '}');
    }

    public GetMessagesCheckInfoInConversationRequestBody(Long l, String str, Integer num, Long l2, Long l3, Integer num2) {
        this(l, str, num, l2, l3, num2, C64537PUn.EMPTY);
    }

    public GetMessagesCheckInfoInConversationRequestBody(Long l, String str, Integer num, Long l2, Long l3, Integer num2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_id = l;
        this.conversation_id = str;
        this.conversation_type = num;
        this.cursor_reverse_begin = l2;
        this.cursor_reverse_end = l3;
        this.expect_msg_total_count = num2;
    }
}
