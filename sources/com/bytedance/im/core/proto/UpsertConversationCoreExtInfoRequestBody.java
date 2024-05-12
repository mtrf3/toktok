package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69542RRa;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RRZ;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes13.dex */
public final class UpsertConversationCoreExtInfoRequestBody extends Message<UpsertConversationCoreExtInfoRequestBody, C69542RRa> {
    public static final ProtoAdapter<UpsertConversationCoreExtInfoRequestBody> ADAPTER = new RRZ();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<UpsertConversationCoreExtInfoRequestBody, C69542RRa> newBuilder2() {
        C69542RRa c69542RRa = new C69542RRa();
        c69542RRa.LIZLLL = this.conversation_id;
        c69542RRa.LJ = this.conversation_short_id;
        c69542RRa.LJFF = this.conversation_type;
        c69542RRa.LJI = C63685Oz3.LIZLLL("ext", this.ext);
        c69542RRa.addUnknownFields(unknownFields());
        return c69542RRa;
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
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        return DIX.LIZLLL(sb, 0, 2, "UpsertConversationCoreExtInfoRequestBody{", '}');
    }

    public UpsertConversationCoreExtInfoRequestBody(String str, Long l, Integer num, Map<String, String> map) {
        this(str, l, num, map, C64537PUn.EMPTY);
    }

    public UpsertConversationCoreExtInfoRequestBody(String str, Long l, Integer num, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.ext = C63685Oz3.LJI("ext", map);
    }
}
