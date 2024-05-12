package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P07;
import X.P08;
import X.P09;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class MessagesPerUserInitV2ResponseBody extends Message<MessagesPerUserInitV2ResponseBody, P08> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cmd_start_index")
    public final Long cmd_start_index;

    @InterfaceC65349Pkn("conversations")
    public final List<ConversationInfoV2> conversations;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("init_type")
    public final P09 init_type;

    @InterfaceC65349Pkn("messages")
    public final List<MessageBody> messages;

    @InterfaceC65349Pkn("messages_pb")
    public final List<C64537PUn> messages_pb;

    @InterfaceC65349Pkn("next_conversation_version")
    public final Long next_conversation_version;

    @InterfaceC65349Pkn("next_cursor")
    public final Long next_cursor;

    @InterfaceC65349Pkn("per_user_cursor")
    public final Long per_user_cursor;
    public static final ProtoAdapter<MessagesPerUserInitV2ResponseBody> ADAPTER = new P07();
    public static final Long DEFAULT_PER_USER_CURSOR = 0L;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final P09 DEFAULT_INIT_TYPE = P09.TYPE_BY_CONVERSATION;
    public static final Long DEFAULT_CMD_START_INDEX = 0L;
    public static final Long DEFAULT_NEXT_CONVERSATION_VERSION = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessagesPerUserInitV2ResponseBody, P08> newBuilder2() {
        P08 p08 = new P08();
        p08.LIZLLL = C63685Oz3.LIZJ("messages", this.messages);
        p08.LJ = C63685Oz3.LIZJ("conversations", this.conversations);
        p08.LJFF = this.per_user_cursor;
        p08.LJI = this.next_cursor;
        p08.LJII = this.has_more;
        p08.LJIIIIZZ = this.init_type;
        p08.LJIIIZ = this.cmd_start_index;
        p08.LJIIJ = this.next_conversation_version;
        p08.LJIIJJI = C63685Oz3.LIZJ("messages_pb", this.messages_pb);
        p08.addUnknownFields(unknownFields());
        return p08;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        List<ConversationInfoV2> list2 = this.conversations;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", conversations=");
            sb.append(this.conversations);
        }
        if (this.per_user_cursor != null) {
            sb.append(", per_user_cursor=");
            sb.append(this.per_user_cursor);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.init_type != null) {
            sb.append(", init_type=");
            sb.append(this.init_type);
        }
        if (this.cmd_start_index != null) {
            sb.append(", cmd_start_index=");
            sb.append(this.cmd_start_index);
        }
        if (this.next_conversation_version != null) {
            sb.append(", next_conversation_version=");
            sb.append(this.next_conversation_version);
        }
        List<C64537PUn> list3 = this.messages_pb;
        if (list3 != null && !list3.isEmpty()) {
            sb.append(", messages_pb=");
            sb.append(this.messages_pb);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessagesPerUserInitV2ResponseBody{", '}');
    }

    public MessagesPerUserInitV2ResponseBody(List<MessageBody> list, List<ConversationInfoV2> list2, Long l, Long l2, Boolean bool, P09 p09, Long l3, Long l4, List<C64537PUn> list3) {
        this(list, list2, l, l2, bool, p09, l3, l4, list3, C64537PUn.EMPTY);
    }

    public MessagesPerUserInitV2ResponseBody(List<MessageBody> list, List<ConversationInfoV2> list2, Long l, Long l2, Boolean bool, P09 p09, Long l3, Long l4, List<C64537PUn> list3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.messages = C63685Oz3.LJFF("messages", list);
        this.conversations = C63685Oz3.LJFF("conversations", list2);
        this.per_user_cursor = l;
        this.next_cursor = l2;
        this.has_more = bool;
        this.init_type = p09;
        this.cmd_start_index = l3;
        this.next_conversation_version = l4;
        this.messages_pb = C63685Oz3.LJFF("messages_pb", list3);
    }
}
