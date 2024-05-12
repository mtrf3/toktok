package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69548RRg;
import X.C69549RRh;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public final class BatchUpdateConversationParticipantRequestBody extends Message<BatchUpdateConversationParticipantRequestBody, C69549RRh> {
    public static final ProtoAdapter<BatchUpdateConversationParticipantRequestBody> ADAPTER = new C69548RRg();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Integer DEFAULT_ROLE = 0;
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

    @InterfaceC65349Pkn("role")
    public final Integer role;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchUpdateConversationParticipantRequestBody, C69549RRh> newBuilder2() {
        C69549RRh c69549RRh = new C69549RRh();
        c69549RRh.LIZLLL = this.conversation_id;
        c69549RRh.LJ = this.conversation_short_id;
        c69549RRh.LJFF = this.conversation_type;
        c69549RRh.LJI = C63685Oz3.LIZJ("participants", this.participants);
        c69549RRh.LJII = this.role;
        c69549RRh.LJIIIIZZ = C63685Oz3.LIZLLL("biz_ext", this.biz_ext);
        c69549RRh.addUnknownFields(unknownFields());
        return c69549RRh;
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
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        Map<String, String> map = this.biz_ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchUpdateConversationParticipantRequestBody{", '}');
    }

    public BatchUpdateConversationParticipantRequestBody(String str, Long l, Integer num, List<Long> list, Integer num2, Map<String, String> map) {
        this(str, l, num, list, num2, map, C64537PUn.EMPTY);
    }

    public BatchUpdateConversationParticipantRequestBody(String str, Long l, Integer num, List<Long> list, Integer num2, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.participants = C63685Oz3.LJFF("participants", list);
        this.role = num2;
        this.biz_ext = C63685Oz3.LJI("biz_ext", map);
    }
}
