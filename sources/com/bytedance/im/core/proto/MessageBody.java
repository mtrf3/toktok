package com.bytedance.im.core.proto;

import X.C63578OxK;
import X.C63579OxL;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.EnumC96123pw;
import X.InterfaceC65349Pkn;
import X.WM7;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes11.dex */
public final class MessageBody extends Message<MessageBody, C63579OxL> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("content_pb")
    public final C64537PUn content_pb;

    @InterfaceC65349Pkn("conv_rank_update_rule")
    public final EnumC96123pw conv_rank_update_rule;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("create_time")
    public final Long create_time;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @InterfaceC65349Pkn("index_in_conversation")
    public final Long index_in_conversation;

    @InterfaceC65349Pkn("index_in_conversation_v1")
    public final Long index_in_conversation_v1;

    @InterfaceC65349Pkn("index_in_conversation_v2")
    public final Long index_in_conversation_v2;

    @InterfaceC65349Pkn("message_type")
    public final Integer message_type;

    @InterfaceC65349Pkn("order_in_conversation")
    public final Long order_in_conversation;

    @InterfaceC65349Pkn("property_list")
    public final Map<String, PropertyItemList> property_list;

    @InterfaceC65349Pkn("reference_info")
    public final ReferenceInfo reference_info;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("sec_sender")
    public final String sec_sender;

    @InterfaceC65349Pkn("sender")
    public final Long sender;

    @InterfaceC65349Pkn("server_message_id")
    public final Long server_message_id;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("user_profile")
    public final Map<String, String> user_profile;

    @InterfaceC65349Pkn("version")
    public final Long version;
    public static final ProtoAdapter<MessageBody> ADAPTER = new C63578OxK();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION = 0L;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;
    public static final Long DEFAULT_SENDER = 0L;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_ORDER_IN_CONVERSATION = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION_V1 = 0L;
    public static final C64537PUn DEFAULT_CONTENT_PB = C64537PUn.EMPTY;
    public static final EnumC96123pw DEFAULT_CONV_RANK_UPDATE_RULE = EnumC96123pw.IgnoreSenderRankUpdate;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessageBody, C63579OxL> newBuilder2() {
        C63579OxL c63579OxL = new C63579OxL();
        c63579OxL.LIZLLL = this.conversation_id;
        c63579OxL.LJ = this.conversation_type;
        c63579OxL.LJFF = this.server_message_id;
        c63579OxL.LJI = this.index_in_conversation;
        c63579OxL.LJII = this.conversation_short_id;
        c63579OxL.LJIIIIZZ = this.message_type;
        c63579OxL.LJIIIZ = this.sender;
        c63579OxL.LJIIJ = this.content;
        c63579OxL.LJIIJJI = C63685Oz3.LIZLLL("ext", this.ext);
        c63579OxL.LJIIL = this.create_time;
        c63579OxL.LJIILIIL = this.version;
        c63579OxL.LJIILJJIL = this.status;
        c63579OxL.LJIILL = this.order_in_conversation;
        c63579OxL.LJIILLIIL = this.sec_sender;
        c63579OxL.LJIIZILJ = C63685Oz3.LIZLLL("property_list", this.property_list);
        c63579OxL.LJIJ = C63685Oz3.LIZLLL("user_profile", this.user_profile);
        c63579OxL.LJIJI = this.index_in_conversation_v2;
        c63579OxL.LJIJJ = this.reference_info;
        c63579OxL.LJIJJLI = this.index_in_conversation_v1;
        c63579OxL.LJIL = this.content_pb;
        c63579OxL.LJJ = this.scene;
        c63579OxL.LJJI = this.conv_rank_update_rule;
        c63579OxL.addUnknownFields(unknownFields());
        return c63579OxL;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.index_in_conversation != null) {
            sb.append(", index_in_conversation=");
            sb.append(this.index_in_conversation);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.sender != null) {
            sb.append(", sender=");
            sb.append(this.sender);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.order_in_conversation != null) {
            sb.append(", order_in_conversation=");
            sb.append(this.order_in_conversation);
        }
        if (this.sec_sender != null) {
            sb.append(", sec_sender=");
            sb.append(this.sec_sender);
        }
        Map<String, PropertyItemList> map2 = this.property_list;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", property_list=");
            sb.append(this.property_list);
        }
        Map<String, String> map3 = this.user_profile;
        if (map3 != null && !map3.isEmpty()) {
            sb.append(", user_profile=");
            sb.append(this.user_profile);
        }
        if (this.index_in_conversation_v2 != null) {
            sb.append(", index_in_conversation_v2=");
            sb.append(this.index_in_conversation_v2);
        }
        if (this.reference_info != null) {
            sb.append(", reference_info=");
            sb.append(this.reference_info);
        }
        if (this.index_in_conversation_v1 != null) {
            sb.append(", index_in_conversation_v1=");
            sb.append(this.index_in_conversation_v1);
        }
        if (this.content_pb != null) {
            sb.append(", content_pb=");
            sb.append(this.content_pb);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.conv_rank_update_rule != null) {
            sb.append(", conv_rank_update_rule=");
            sb.append(this.conv_rank_update_rule);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessageBody{", '}');
    }

    public MessageBody(String str, Integer num, Long l, Long l2, Long l3, Integer num2, Long l4, String str2, Map<String, String> map, Long l5, Long l6, Integer num3, Long l7, String str3, Map<String, PropertyItemList> map2, Map<String, String> map3, Long l8, ReferenceInfo referenceInfo, Long l9, C64537PUn c64537PUn, String str4, EnumC96123pw enumC96123pw) {
        this(str, num, l, l2, l3, num2, l4, str2, map, l5, l6, num3, l7, str3, map2, map3, l8, referenceInfo, l9, c64537PUn, str4, enumC96123pw, C64537PUn.EMPTY);
    }

    public MessageBody(String str, Integer num, Long l, Long l2, Long l3, Integer num2, Long l4, String str2, Map<String, String> map, Long l5, Long l6, Integer num3, Long l7, String str3, Map<String, PropertyItemList> map2, Map<String, String> map3, Long l8, ReferenceInfo referenceInfo, Long l9, C64537PUn c64537PUn, String str4, EnumC96123pw enumC96123pw, C64537PUn c64537PUn2) {
        super(ADAPTER, c64537PUn2);
        this.conversation_id = str;
        this.conversation_type = num;
        this.server_message_id = l;
        this.index_in_conversation = l2;
        this.conversation_short_id = l3;
        this.message_type = num2;
        this.sender = l4;
        this.content = str2;
        this.ext = C63685Oz3.LJI("ext", map);
        this.create_time = l5;
        this.version = l6;
        this.status = num3;
        this.order_in_conversation = l7;
        this.sec_sender = str3;
        this.property_list = C63685Oz3.LJI("property_list", map2);
        this.user_profile = C63685Oz3.LJI("user_profile", map3);
        this.index_in_conversation_v2 = l8;
        this.reference_info = referenceInfo;
        this.index_in_conversation_v1 = l9;
        this.content_pb = c64537PUn;
        this.scene = str4;
        this.conv_rank_update_rule = enumC96123pw;
    }
}
