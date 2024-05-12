package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P0H;
import X.P0I;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class MessagesInConversationResponseBody extends Message<MessagesInConversationResponseBody, P0I> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("messages")
    public final List<MessageBody> messages;

    @InterfaceC65349Pkn("messages_pb")
    public final List<C64537PUn> messages_pb;

    @InterfaceC65349Pkn("next_cursor")
    public final Long next_cursor;
    public static final ProtoAdapter<MessagesInConversationResponseBody> ADAPTER = new P0H();
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessagesInConversationResponseBody, P0I> newBuilder2() {
        P0I p0i = new P0I();
        p0i.LIZLLL = C63685Oz3.LIZJ("messages", this.messages);
        p0i.LJ = this.next_cursor;
        p0i.LJFF = this.has_more;
        p0i.LJI = C63685Oz3.LIZJ("messages_pb", this.messages_pb);
        p0i.addUnknownFields(unknownFields());
        return p0i;
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
        List<C64537PUn> list2 = this.messages_pb;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", messages_pb=");
            sb.append(this.messages_pb);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessagesInConversationResponseBody{", '}');
    }

    public MessagesInConversationResponseBody(List<MessageBody> list, Long l, Boolean bool, List<C64537PUn> list2) {
        this(list, l, bool, list2, C64537PUn.EMPTY);
    }

    public MessagesInConversationResponseBody(List<MessageBody> list, Long l, Boolean bool, List<C64537PUn> list2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.messages = C63685Oz3.LJFF("messages", list);
        this.next_cursor = l;
        this.has_more = bool;
        this.messages_pb = C63685Oz3.LJFF("messages_pb", list2);
    }
}
