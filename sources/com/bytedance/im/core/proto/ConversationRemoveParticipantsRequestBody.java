package com.bytedance.im.core.proto;

import X.C120434o3;
import X.C63685Oz3;
import X.C63738Ozu;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class ConversationRemoveParticipantsRequestBody extends Message<ConversationRemoveParticipantsRequestBody, C120434o3> {
    public static final ProtoAdapter<ConversationRemoveParticipantsRequestBody> ADAPTER = new C63738Ozu();
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
    public Message.Builder<ConversationRemoveParticipantsRequestBody, C120434o3> newBuilder2() {
        C120434o3 c120434o3 = new C120434o3();
        c120434o3.LIZLLL = this.conversation_id;
        c120434o3.LJ = this.conversation_short_id;
        c120434o3.LJFF = this.conversation_type;
        c120434o3.LJI = C63685Oz3.LIZJ("participants", this.participants);
        c120434o3.LJII = C63685Oz3.LIZLLL("biz_ext", this.biz_ext);
        c120434o3.addUnknownFields(unknownFields());
        return c120434o3;
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
        return DIX.LIZLLL(sb, 0, 2, "ConversationRemoveParticipantsRequestBody{", '}');
    }

    public ConversationRemoveParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, Map<String, String> map) {
        this(str, l, num, list, map, C64537PUn.EMPTY);
    }

    public ConversationRemoveParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.participants = C63685Oz3.LJFF("participants", list);
        this.biz_ext = C63685Oz3.LJI("biz_ext", map);
    }
}
