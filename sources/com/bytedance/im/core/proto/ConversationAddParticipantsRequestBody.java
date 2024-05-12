package com.bytedance.im.core.proto;

import X.C120424o2;
import X.C63685Oz3;
import X.C63737Ozt;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class ConversationAddParticipantsRequestBody extends Message<ConversationAddParticipantsRequestBody, C120424o2> {
    public static final ProtoAdapter<ConversationAddParticipantsRequestBody> ADAPTER = new C63737Ozt();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("biz_ext")
    public final Map<String, String> biz_ext;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("participants")
    public final List<Long> participants;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationAddParticipantsRequestBody, C120424o2> newBuilder2() {
        C120424o2 c120424o2 = new C120424o2();
        c120424o2.LIZLLL = this.conversation_id;
        c120424o2.LJ = this.conversation_short_id;
        c120424o2.LJFF = this.conversation_type;
        c120424o2.LJI = C63685Oz3.LIZJ("participants", this.participants);
        c120424o2.LJII = C63685Oz3.LIZLLL("biz_ext", this.biz_ext);
        c120424o2.addUnknownFields(unknownFields());
        return c120424o2;
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
        List<Long> list = this.participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        Map<String, String> map = this.biz_ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationAddParticipantsRequestBody{", '}');
    }

    public ConversationAddParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, Map<String, String> map) {
        this(str, l, num, list, map, C64537PUn.EMPTY);
    }

    public ConversationAddParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.participants = C63685Oz3.LJFF("participants", list);
        this.biz_ext = C63685Oz3.LJI("biz_ext", map);
    }
}
