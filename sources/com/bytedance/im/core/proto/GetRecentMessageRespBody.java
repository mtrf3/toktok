package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P0B;
import X.P0C;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class GetRecentMessageRespBody extends Message<GetRecentMessageRespBody, P0C> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("messages")
    public final List<ConversationRecentMessage> messages;

    @InterfaceC65349Pkn("next_conversation_version")
    public final Long next_conversation_version;
    public static final ProtoAdapter<GetRecentMessageRespBody> ADAPTER = new P0B();
    public static final Long DEFAULT_NEXT_CONVERSATION_VERSION = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetRecentMessageRespBody, P0C> newBuilder2() {
        P0C p0c = new P0C();
        p0c.LIZLLL = this.next_conversation_version;
        p0c.LJ = C63685Oz3.LIZJ("messages", this.messages);
        p0c.LJFF = this.has_more;
        p0c.addUnknownFields(unknownFields());
        return p0c;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", next_conversation_version=");
        LIZJ.append(this.next_conversation_version);
        List<ConversationRecentMessage> list = this.messages;
        if (list != null && !list.isEmpty()) {
            LIZJ.append(", messages=");
            LIZJ.append(this.messages);
        }
        LIZJ.append(", has_more=");
        LIZJ.append(this.has_more);
        return DIX.LIZLLL(LIZJ, 0, 2, "GetRecentMessageRespBody{", '}');
    }

    public GetRecentMessageRespBody(Long l, List<ConversationRecentMessage> list, Boolean bool) {
        this(l, list, bool, C64537PUn.EMPTY);
    }

    public GetRecentMessageRespBody(Long l, List<ConversationRecentMessage> list, Boolean bool, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.next_conversation_version = l;
        this.messages = C63685Oz3.LJFF("messages", list);
        this.has_more = bool;
    }
}
