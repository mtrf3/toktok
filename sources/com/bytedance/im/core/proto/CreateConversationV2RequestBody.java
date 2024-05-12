package com.bytedance.im.core.proto;

import X.C63561Ox3;
import X.C63562Ox4;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class CreateConversationV2RequestBody extends Message<CreateConversationV2RequestBody, C63561Ox3> {
    public static final ProtoAdapter<CreateConversationV2RequestBody> ADAPTER = new C63562Ox4();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Boolean DEFAULT_PERSISTENT = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("avatar_url")
    public final String avatar_url;

    @InterfaceC65349Pkn("biz")
    public final String biz;

    @InterfaceC65349Pkn("biz_ext")
    public final Map<String, String> biz_ext;

    @InterfaceC65349Pkn("channel")
    public final String channel;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("idempotent_id")
    public final String idempotent_id;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("participants")
    public final List<Long> participants;

    @InterfaceC65349Pkn("persistent")
    public final Boolean persistent;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<CreateConversationV2RequestBody, C63561Ox3> newBuilder2() {
        C63561Ox3 c63561Ox3 = new C63561Ox3();
        c63561Ox3.LIZLLL = this.conversation_type;
        c63561Ox3.LJ = C63685Oz3.LIZJ("participants", this.participants);
        c63561Ox3.LJFF = this.persistent;
        c63561Ox3.LJI = this.idempotent_id;
        c63561Ox3.LJII = this.name;
        c63561Ox3.LJIIIIZZ = this.avatar_url;
        c63561Ox3.LJIIIZ = this.description;
        c63561Ox3.LJIIJ = C63685Oz3.LIZLLL("biz_ext", this.biz_ext);
        c63561Ox3.LJIIJJI = this.biz;
        c63561Ox3.LJIIL = this.channel;
        c63561Ox3.addUnknownFields(unknownFields());
        return c63561Ox3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        List<Long> list = this.participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.persistent != null) {
            sb.append(", persistent=");
            sb.append(this.persistent);
        }
        if (this.idempotent_id != null) {
            sb.append(", idempotent_id=");
            sb.append(this.idempotent_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar_url != null) {
            sb.append(", avatar_url=");
            sb.append(this.avatar_url);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        Map<String, String> map = this.biz_ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        if (this.biz != null) {
            sb.append(", biz=");
            sb.append(this.biz);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        return DIX.LIZLLL(sb, 0, 2, "CreateConversationV2RequestBody{", '}');
    }

    public CreateConversationV2RequestBody(Integer num, List<Long> list, Boolean bool, String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6) {
        this(num, list, bool, str, str2, str3, str4, map, str5, str6, C64537PUn.EMPTY);
    }

    public CreateConversationV2RequestBody(Integer num, List<Long> list, Boolean bool, String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_type = num;
        this.participants = C63685Oz3.LJFF("participants", list);
        this.persistent = bool;
        this.idempotent_id = str;
        this.name = str2;
        this.avatar_url = str3;
        this.description = str4;
        this.biz_ext = C63685Oz3.LJI("biz_ext", map);
        this.biz = str5;
        this.channel = str6;
    }
}
