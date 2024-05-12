package com.bytedance.im.core.proto;

import X.C120414o1;
import X.C63685Oz3;
import X.C63753P0j;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UpdateConversationParticipantRequestBody extends Message<UpdateConversationParticipantRequestBody, C120414o1> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("alias")
    public final String alias;

    @InterfaceC65349Pkn("biz_ext")
    public final Map<String, String> biz_ext;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("is_alias_set")
    public final Boolean is_alias_set;

    @InterfaceC65349Pkn("role")
    public final Integer role;

    @InterfaceC65349Pkn("user_id")
    public final Long user_id;
    public static final ProtoAdapter<UpdateConversationParticipantRequestBody> ADAPTER = new C63753P0j();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_ROLE = 0;
    public static final Boolean DEFAULT_IS_ALIAS_SET = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<UpdateConversationParticipantRequestBody, C120414o1> newBuilder2() {
        C120414o1 c120414o1 = new C120414o1();
        c120414o1.LIZLLL = this.conversation_id;
        c120414o1.LJ = this.conversation_short_id;
        c120414o1.LJFF = this.conversation_type;
        c120414o1.LJI = this.user_id;
        c120414o1.LJII = this.role;
        c120414o1.LJIIIIZZ = this.alias;
        c120414o1.LJIIIZ = this.is_alias_set;
        c120414o1.LJIIJ = C63685Oz3.LIZLLL("biz_ext", this.biz_ext);
        c120414o1.addUnknownFields(unknownFields());
        return c120414o1;
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
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (this.alias != null) {
            sb.append(", alias=");
            sb.append(this.alias);
        }
        if (this.is_alias_set != null) {
            sb.append(", is_alias_set=");
            sb.append(this.is_alias_set);
        }
        Map<String, String> map = this.biz_ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        return DIX.LIZLLL(sb, 0, 2, "UpdateConversationParticipantRequestBody{", '}');
    }

    public UpdateConversationParticipantRequestBody(String str, Long l, Integer num, Long l2, Integer num2, String str2, Boolean bool, Map<String, String> map) {
        this(str, l, num, l2, num2, str2, bool, map, C64537PUn.EMPTY);
    }

    public UpdateConversationParticipantRequestBody(String str, Long l, Integer num, Long l2, Integer num2, String str2, Boolean bool, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.user_id = l2;
        this.role = num2;
        this.alias = str2;
        this.is_alias_set = bool;
        this.biz_ext = C63685Oz3.LJI("biz_ext", map);
    }
}
