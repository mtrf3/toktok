package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C87560YYa;
import X.DIX;
import X.EnumC63751P0h;
import X.InterfaceC65349Pkn;
import X.YYZ;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes17.dex */
public final class ConversationCoreInfo extends Message<ConversationCoreInfo, C87560YYa> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("block_normal_only")
    public final Boolean block_normal_only;

    @InterfaceC65349Pkn("block_status")
    public final EnumC63751P0h block_status;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("creator_uid")
    public final Long creator_uid;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @InterfaceC65349Pkn("icon")
    public final String icon;

    @InterfaceC65349Pkn("inbox_type")
    public final Integer inbox_type;

    @InterfaceC65349Pkn("info_version")
    public final Long info_version;

    @InterfaceC65349Pkn("mode")
    public final Integer mode;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("notice")
    public final String notice;

    @InterfaceC65349Pkn("owner")
    public final Long owner;

    @InterfaceC65349Pkn("sec_owner")
    public final String sec_owner;

    @InterfaceC65349Pkn("status")
    public final Integer status;
    public static final ProtoAdapter<ConversationCoreInfo> ADAPTER = new YYZ();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_INFO_VERSION = 0L;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_OWNER = 0L;
    public static final EnumC63751P0h DEFAULT_BLOCK_STATUS = EnumC63751P0h.UNBLOCK;
    public static final Boolean DEFAULT_BLOCK_NORMAL_ONLY = Boolean.FALSE;
    public static final Integer DEFAULT_MODE = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CREATOR_UID = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationCoreInfo, C87560YYa> newBuilder2() {
        C87560YYa c87560YYa = new C87560YYa();
        c87560YYa.LIZLLL = this.conversation_id;
        c87560YYa.LJ = this.conversation_short_id;
        c87560YYa.LJFF = this.conversation_type;
        c87560YYa.LJI = this.info_version;
        c87560YYa.LJII = this.name;
        c87560YYa.LJIIIIZZ = this.desc;
        c87560YYa.LJIIIZ = this.icon;
        c87560YYa.LJIIJ = this.inbox_type;
        c87560YYa.LJIIJJI = this.notice;
        c87560YYa.LJIIL = C63685Oz3.LIZLLL("ext", this.ext);
        c87560YYa.LJIILIIL = this.owner;
        c87560YYa.LJIILJJIL = this.sec_owner;
        c87560YYa.LJIILL = this.block_status;
        c87560YYa.LJIILLIIL = this.block_normal_only;
        c87560YYa.LJIIZILJ = this.mode;
        c87560YYa.LJIJ = this.status;
        c87560YYa.LJIJI = this.creator_uid;
        c87560YYa.addUnknownFields(unknownFields());
        return c87560YYa;
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
        if (this.info_version != null) {
            sb.append(", info_version=");
            sb.append(this.info_version);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.notice != null) {
            sb.append(", notice=");
            sb.append(this.notice);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.owner != null) {
            sb.append(", owner=");
            sb.append(this.owner);
        }
        if (this.sec_owner != null) {
            sb.append(", sec_owner=");
            sb.append(this.sec_owner);
        }
        if (this.block_status != null) {
            sb.append(", block_status=");
            sb.append(this.block_status);
        }
        if (this.block_normal_only != null) {
            sb.append(", block_normal_only=");
            sb.append(this.block_normal_only);
        }
        if (this.mode != null) {
            sb.append(", mode=");
            sb.append(this.mode);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.creator_uid != null) {
            sb.append(", creator_uid=");
            sb.append(this.creator_uid);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationCoreInfo{", '}');
    }

    public ConversationCoreInfo(String str, Long l, Integer num, Long l2, String str2, String str3, String str4, Integer num2, String str5, Map<String, String> map, Long l3, String str6, EnumC63751P0h enumC63751P0h, Boolean bool, Integer num3, Integer num4, Long l4) {
        this(str, l, num, l2, str2, str3, str4, num2, str5, map, l3, str6, enumC63751P0h, bool, num3, num4, l4, C64537PUn.EMPTY);
    }

    public ConversationCoreInfo(String str, Long l, Integer num, Long l2, String str2, String str3, String str4, Integer num2, String str5, Map<String, String> map, Long l3, String str6, EnumC63751P0h enumC63751P0h, Boolean bool, Integer num3, Integer num4, Long l4, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.info_version = l2;
        this.name = str2;
        this.desc = str3;
        this.icon = str4;
        this.inbox_type = num2;
        this.notice = str5;
        this.ext = C63685Oz3.LJI("ext", map);
        this.owner = l3;
        this.sec_owner = str6;
        this.block_status = enumC63751P0h;
        this.block_normal_only = bool;
        this.mode = num3;
        this.status = num4;
        this.creator_uid = l4;
    }
}
