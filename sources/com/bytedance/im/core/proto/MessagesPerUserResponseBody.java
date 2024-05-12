package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P0F;
import X.P0G;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class MessagesPerUserResponseBody extends Message<MessagesPerUserResponseBody, P0G> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_badge_count")
    public final List<ConversationBadgeCountInfo> conversation_badge_count;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("messages")
    public final List<MessageBody> messages;

    @InterfaceC65349Pkn("messages_pb")
    public final List<C64537PUn> messages_pb;

    @InterfaceC65349Pkn("next_cmd_index")
    public final Long next_cmd_index;

    @InterfaceC65349Pkn("next_conversation_version")
    public final Long next_conversation_version;

    @InterfaceC65349Pkn("next_cursor")
    public final Long next_cursor;

    @InterfaceC65349Pkn("next_interval")
    public final Long next_interval;
    public static final ProtoAdapter<MessagesPerUserResponseBody> ADAPTER = new P0F();
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_INTERVAL = 0L;
    public static final Long DEFAULT_NEXT_CONVERSATION_VERSION = 0L;
    public static final Long DEFAULT_NEXT_CMD_INDEX = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessagesPerUserResponseBody, P0G> newBuilder2() {
        P0G p0g = new P0G();
        p0g.LIZLLL = C63685Oz3.LIZJ("messages", this.messages);
        p0g.LJ = this.next_cursor;
        p0g.LJFF = this.has_more;
        p0g.LJI = this.next_interval;
        p0g.LJII = this.next_conversation_version;
        p0g.LJIIIIZZ = C63685Oz3.LIZJ("conversation_badge_count", this.conversation_badge_count);
        p0g.LJIIIZ = this.next_cmd_index;
        p0g.LJIIJ = C63685Oz3.LIZJ("messages_pb", this.messages_pb);
        p0g.addUnknownFields(unknownFields());
        return p0g;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_interval != null) {
            sb.append(", next_interval=");
            sb.append(this.next_interval);
        }
        if (this.next_conversation_version != null) {
            sb.append(", next_conversation_version=");
            sb.append(this.next_conversation_version);
        }
        List<ConversationBadgeCountInfo> list2 = this.conversation_badge_count;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", conversation_badge_count=");
            sb.append(this.conversation_badge_count);
        }
        if (this.next_cmd_index != null) {
            sb.append(", next_cmd_index=");
            sb.append(this.next_cmd_index);
        }
        List<C64537PUn> list3 = this.messages_pb;
        if (list3 != null && !list3.isEmpty()) {
            sb.append(", messages_pb=");
            sb.append(this.messages_pb);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessagesPerUserResponseBody{", '}');
    }

    public MessagesPerUserResponseBody(List<MessageBody> list, Long l, Boolean bool, Long l2, Long l3, List<ConversationBadgeCountInfo> list2, Long l4, List<C64537PUn> list3) {
        this(list, l, bool, l2, l3, list2, l4, list3, C64537PUn.EMPTY);
    }

    public MessagesPerUserResponseBody(List<MessageBody> list, Long l, Boolean bool, Long l2, Long l3, List<ConversationBadgeCountInfo> list2, Long l4, List<C64537PUn> list3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.messages = C63685Oz3.LJFF("messages", list);
        this.next_cursor = l;
        this.has_more = bool;
        this.next_interval = l2;
        this.next_conversation_version = l3;
        this.conversation_badge_count = C63685Oz3.LJFF("conversation_badge_count", list2);
        this.next_cmd_index = l4;
        this.messages_pb = C63685Oz3.LJFF("messages_pb", list3);
    }
}
