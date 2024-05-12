package com.bytedance.im.core.proto;

import X.C120444o4;
import X.C63685Oz3;
import X.C64537PUn;
import X.C69547RRf;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes13.dex */
public final class SetConversationCoreInfoRequestBody extends Message<SetConversationCoreInfoRequestBody, C120444o4> {
    public static final ProtoAdapter<SetConversationCoreInfoRequestBody> ADAPTER = new C69547RRf();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Boolean DEFAULT_IS_DESC_SET;
    public static final Boolean DEFAULT_IS_ICON_SET;
    public static final Boolean DEFAULT_IS_NAME_SET;
    public static final Boolean DEFAULT_IS_NOTICE_SET;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @InterfaceC65349Pkn("icon")
    public final String icon;

    @InterfaceC65349Pkn("is_desc_set")
    public final Boolean is_desc_set;

    @InterfaceC65349Pkn("is_icon_set")
    public final Boolean is_icon_set;

    @InterfaceC65349Pkn("is_name_set")
    public final Boolean is_name_set;

    @InterfaceC65349Pkn("is_notice_set")
    public final Boolean is_notice_set;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("notice")
    public final String notice;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_NAME_SET = bool;
        DEFAULT_IS_DESC_SET = bool;
        DEFAULT_IS_ICON_SET = bool;
        DEFAULT_IS_NOTICE_SET = bool;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<SetConversationCoreInfoRequestBody, C120444o4> newBuilder2() {
        C120444o4 c120444o4 = new C120444o4();
        c120444o4.LIZLLL = this.conversation_id;
        c120444o4.LJ = this.conversation_short_id;
        c120444o4.LJFF = this.conversation_type;
        c120444o4.LJI = this.name;
        c120444o4.LJII = this.desc;
        c120444o4.LJIIIIZZ = this.icon;
        c120444o4.LJIIIZ = this.notice;
        c120444o4.LJIIJ = this.is_name_set;
        c120444o4.LJIIJJI = this.is_desc_set;
        c120444o4.LJIIL = this.is_icon_set;
        c120444o4.LJIILIIL = this.is_notice_set;
        c120444o4.LJIILJJIL = C63685Oz3.LIZLLL("ext", this.ext);
        c120444o4.addUnknownFields(unknownFields());
        return c120444o4;
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
        if (this.notice != null) {
            sb.append(", notice=");
            sb.append(this.notice);
        }
        if (this.is_name_set != null) {
            sb.append(", is_name_set=");
            sb.append(this.is_name_set);
        }
        if (this.is_desc_set != null) {
            sb.append(", is_desc_set=");
            sb.append(this.is_desc_set);
        }
        if (this.is_icon_set != null) {
            sb.append(", is_icon_set=");
            sb.append(this.is_icon_set);
        }
        if (this.is_notice_set != null) {
            sb.append(", is_notice_set=");
            sb.append(this.is_notice_set);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        return DIX.LIZLLL(sb, 0, 2, "SetConversationCoreInfoRequestBody{", '}');
    }

    public SetConversationCoreInfoRequestBody(String str, Long l, Integer num, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Map<String, String> map) {
        this(str, l, num, str2, str3, str4, str5, bool, bool2, bool3, bool4, map, C64537PUn.EMPTY);
    }

    public SetConversationCoreInfoRequestBody(String str, Long l, Integer num, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.name = str2;
        this.desc = str3;
        this.icon = str4;
        this.notice = str5;
        this.is_name_set = bool;
        this.is_desc_set = bool2;
        this.is_icon_set = bool3;
        this.is_notice_set = bool4;
        this.ext = C63685Oz3.LJI("ext", map);
    }
}
