package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69586RSs;
import X.C69587RSt;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class MessageByInitResponseBody extends Message<MessageByInitResponseBody, C69587RSt> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cmd_index")
    public final Long cmd_index;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("messages")
    public final List<ConversationMessage> messages;

    @InterfaceC65349Pkn("next_init_version")
    public final Long next_init_version;

    @InterfaceC65349Pkn("user_cursor")
    public final Long user_cursor;

    @InterfaceC65349Pkn("version")
    public final Long version;
    public static final ProtoAdapter<MessageByInitResponseBody> ADAPTER = new C69586RSs();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_INIT_VERSION = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    public static final Long DEFAULT_USER_CURSOR = 0L;
    public static final Long DEFAULT_CMD_INDEX = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessageByInitResponseBody, C69587RSt> newBuilder2() {
        C69587RSt c69587RSt = new C69587RSt();
        c69587RSt.LIZLLL = C63685Oz3.LIZJ("messages", this.messages);
        c69587RSt.LJ = this.has_more;
        c69587RSt.LJFF = this.next_init_version;
        c69587RSt.LJI = this.version;
        c69587RSt.LJII = this.user_cursor;
        c69587RSt.LJIIIIZZ = this.cmd_index;
        c69587RSt.addUnknownFields(unknownFields());
        return c69587RSt;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationMessage> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        sb.append(", has_more=");
        sb.append(this.has_more);
        sb.append(", next_init_version=");
        sb.append(this.next_init_version);
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.user_cursor != null) {
            sb.append(", user_cursor=");
            sb.append(this.user_cursor);
        }
        if (this.cmd_index != null) {
            sb.append(", cmd_index=");
            sb.append(this.cmd_index);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessageByInitResponseBody{", '}');
    }

    public MessageByInitResponseBody(List<ConversationMessage> list, Boolean bool, Long l, Long l2, Long l3, Long l4) {
        this(list, bool, l, l2, l3, l4, C64537PUn.EMPTY);
    }

    public MessageByInitResponseBody(List<ConversationMessage> list, Boolean bool, Long l, Long l2, Long l3, Long l4, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.messages = C63685Oz3.LJFF("messages", list);
        this.has_more = bool;
        this.next_init_version = l;
        this.version = l2;
        this.user_cursor = l3;
        this.cmd_index = l4;
    }
}
