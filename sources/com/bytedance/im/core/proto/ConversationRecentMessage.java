package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P0N;
import X.P0O;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class ConversationRecentMessage extends Message<ConversationRecentMessage, P0O> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("badge_count")
    public final Integer badge_count;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("ext_messages")
    public final List<MessageBody> ext_messages;

    @InterfaceC65349Pkn("messages")
    public final List<MessageBody> messages;

    @InterfaceC65349Pkn("version")
    public final Long version;
    public static final ProtoAdapter<ConversationRecentMessage> ADAPTER = new P0N();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    public static final Integer DEFAULT_BADGE_COUNT = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationRecentMessage, P0O> newBuilder2() {
        P0O p0o = new P0O();
        p0o.LIZLLL = this.conversation_short_id;
        p0o.LJ = C63685Oz3.LIZJ("messages", this.messages);
        p0o.LJFF = this.version;
        p0o.LJI = this.badge_count;
        p0o.LJII = this.conversation_id;
        p0o.LJIIIIZZ = C63685Oz3.LIZJ("ext_messages", this.ext_messages);
        p0o.addUnknownFields(unknownFields());
        return p0o;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", conversation_short_id=");
        LIZJ.append(this.conversation_short_id);
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            LIZJ.append(", messages=");
            LIZJ.append(this.messages);
        }
        LIZJ.append(", version=");
        LIZJ.append(this.version);
        if (this.badge_count != null) {
            LIZJ.append(", badge_count=");
            LIZJ.append(this.badge_count);
        }
        LIZJ.append(", conversation_id=");
        LIZJ.append(this.conversation_id);
        List<MessageBody> list2 = this.ext_messages;
        if (list2 != null && !list2.isEmpty()) {
            LIZJ.append(", ext_messages=");
            LIZJ.append(this.ext_messages);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "ConversationRecentMessage{", '}');
    }

    public ConversationRecentMessage(Long l, List<MessageBody> list, Long l2, Integer num, String str, List<MessageBody> list2) {
        this(l, list, l2, num, str, list2, C64537PUn.EMPTY);
    }

    public ConversationRecentMessage(Long l, List<MessageBody> list, Long l2, Integer num, String str, List<MessageBody> list2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_id = l;
        this.messages = C63685Oz3.LJFF("messages", list);
        this.version = l2;
        this.badge_count = num;
        this.conversation_id = str;
        this.ext_messages = C63685Oz3.LJFF("ext_messages", list2);
    }
}
