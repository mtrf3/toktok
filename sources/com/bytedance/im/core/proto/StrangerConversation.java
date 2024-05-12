package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P0L;
import X.P0M;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class StrangerConversation extends Message<StrangerConversation, P0M> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("badge_count")
    public final Integer badge_count;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @InterfaceC65349Pkn("last_message")
    public final MessageBody last_message;

    @InterfaceC65349Pkn("participants")
    public final List<Participant> participants;

    @InterfaceC65349Pkn("unread")
    public final Integer unread;
    public static final ProtoAdapter<StrangerConversation> ADAPTER = new P0L();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_UNREAD = 0;
    public static final Integer DEFAULT_BADGE_COUNT = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<StrangerConversation, P0M> newBuilder2() {
        P0M p0m = new P0M();
        p0m.LIZLLL = this.conversation_short_id;
        p0m.LJ = this.unread;
        p0m.LJFF = this.last_message;
        p0m.LJI = this.conversation_id;
        p0m.LJII = C63685Oz3.LIZJ("participants", this.participants);
        p0m.LJIIIIZZ = this.badge_count;
        p0m.LJIIIZ = C63685Oz3.LIZLLL("ext", this.ext);
        p0m.addUnknownFields(unknownFields());
        return p0m;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.unread != null) {
            sb.append(", unread=");
            sb.append(this.unread);
        }
        if (this.last_message != null) {
            sb.append(", last_message=");
            sb.append(this.last_message);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        List<Participant> list = this.participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.badge_count != null) {
            sb.append(", badge_count=");
            sb.append(this.badge_count);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        return DIX.LIZLLL(sb, 0, 2, "StrangerConversation{", '}');
    }

    public StrangerConversation(Long l, Integer num, MessageBody messageBody, String str, List<Participant> list, Integer num2, Map<String, String> map) {
        this(l, num, messageBody, str, list, num2, map, C64537PUn.EMPTY);
    }

    public StrangerConversation(Long l, Integer num, MessageBody messageBody, String str, List<Participant> list, Integer num2, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_short_id = l;
        this.unread = num;
        this.last_message = messageBody;
        this.conversation_id = str;
        this.participants = C63685Oz3.LJFF("participants", list);
        this.badge_count = num2;
        this.ext = C63685Oz3.LJI("ext", map);
    }
}
