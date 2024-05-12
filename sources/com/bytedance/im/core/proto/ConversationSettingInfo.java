package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C63706OzO;
import X.C63707OzP;
import X.C64537PUn;
import X.DIX;
import X.EnumC96103pu;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes11.dex */
public final class ConversationSettingInfo extends Message<ConversationSettingInfo, C63707OzP> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("category")
    public final EnumC96103pu category;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @InterfaceC65349Pkn("favorite")
    public final Integer favorite;

    @InterfaceC65349Pkn("inbox_type")
    public final Integer inbox_type;

    @InterfaceC65349Pkn("min_index")
    public final Long min_index;

    @InterfaceC65349Pkn("min_index_v2")
    public final Long min_index_v2;

    @InterfaceC65349Pkn("mute")
    public final Integer mute;

    @InterfaceC65349Pkn("read_badge_count")
    public final Integer read_badge_count;

    @InterfaceC65349Pkn("read_badge_count_v2")
    public final Integer read_badge_count_v2;

    @InterfaceC65349Pkn("read_index")
    public final Long read_index;

    @InterfaceC65349Pkn("read_index_v2")
    public final Long read_index_v2;

    @InterfaceC65349Pkn("set_favorite_time")
    public final Long set_favorite_time;

    @InterfaceC65349Pkn("set_top_time")
    public final Long set_top_time;

    @InterfaceC65349Pkn("setting_version")
    public final Long setting_version;

    @InterfaceC65349Pkn("stick_on_top")
    public final Integer stick_on_top;
    public static final ProtoAdapter<ConversationSettingInfo> ADAPTER = new C63706OzO();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_MIN_INDEX = 0L;
    public static final Long DEFAULT_READ_INDEX = 0L;
    public static final Integer DEFAULT_MUTE = 0;
    public static final Integer DEFAULT_STICK_ON_TOP = 0;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_SETTING_VERSION = 0L;
    public static final Integer DEFAULT_FAVORITE = 0;
    public static final Long DEFAULT_SET_TOP_TIME = 0L;
    public static final Long DEFAULT_SET_FAVORITE_TIME = 0L;
    public static final Long DEFAULT_READ_INDEX_V2 = 0L;
    public static final Long DEFAULT_MIN_INDEX_V2 = 0L;
    public static final Integer DEFAULT_READ_BADGE_COUNT = 0;
    public static final Integer DEFAULT_READ_BADGE_COUNT_V2 = 0;
    public static final EnumC96103pu DEFAULT_CATEGORY = EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationSettingInfo, C63707OzP> newBuilder2() {
        C63707OzP c63707OzP = new C63707OzP();
        c63707OzP.LIZLLL = this.conversation_id;
        c63707OzP.LJ = this.conversation_short_id;
        c63707OzP.LJFF = this.conversation_type;
        c63707OzP.LJI = this.min_index;
        c63707OzP.LJII = this.read_index;
        c63707OzP.LJIIIIZZ = this.mute;
        c63707OzP.LJIIIZ = this.stick_on_top;
        c63707OzP.LJIIJ = this.inbox_type;
        c63707OzP.LJIIJJI = C63685Oz3.LIZLLL("ext", this.ext);
        c63707OzP.LJIIL = this.setting_version;
        c63707OzP.LJIILIIL = this.favorite;
        c63707OzP.LJIILJJIL = this.set_top_time;
        c63707OzP.LJIILL = this.set_favorite_time;
        c63707OzP.LJIILLIIL = this.read_index_v2;
        c63707OzP.LJIIZILJ = this.min_index_v2;
        c63707OzP.LJIJ = this.read_badge_count;
        c63707OzP.LJIJI = this.read_badge_count_v2;
        c63707OzP.LJIJJ = this.category;
        c63707OzP.addUnknownFields(unknownFields());
        return c63707OzP;
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
        if (this.min_index != null) {
            sb.append(", min_index=");
            sb.append(this.min_index);
        }
        if (this.read_index != null) {
            sb.append(", read_index=");
            sb.append(this.read_index);
        }
        if (this.mute != null) {
            sb.append(", mute=");
            sb.append(this.mute);
        }
        if (this.stick_on_top != null) {
            sb.append(", stick_on_top=");
            sb.append(this.stick_on_top);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.setting_version != null) {
            sb.append(", setting_version=");
            sb.append(this.setting_version);
        }
        if (this.favorite != null) {
            sb.append(", favorite=");
            sb.append(this.favorite);
        }
        if (this.set_top_time != null) {
            sb.append(", set_top_time=");
            sb.append(this.set_top_time);
        }
        if (this.set_favorite_time != null) {
            sb.append(", set_favorite_time=");
            sb.append(this.set_favorite_time);
        }
        if (this.read_index_v2 != null) {
            sb.append(", read_index_v2=");
            sb.append(this.read_index_v2);
        }
        if (this.min_index_v2 != null) {
            sb.append(", min_index_v2=");
            sb.append(this.min_index_v2);
        }
        if (this.read_badge_count != null) {
            sb.append(", read_badge_count=");
            sb.append(this.read_badge_count);
        }
        if (this.read_badge_count_v2 != null) {
            sb.append(", read_badge_count_v2=");
            sb.append(this.read_badge_count_v2);
        }
        if (this.category != null) {
            sb.append(", category=");
            sb.append(this.category);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationSettingInfo{", '}');
    }

    public ConversationSettingInfo(String str, Long l, Integer num, Long l2, Long l3, Integer num2, Integer num3, Integer num4, Map<String, String> map, Long l4, Integer num5, Long l5, Long l6, Long l7, Long l8, Integer num6, Integer num7, EnumC96103pu enumC96103pu) {
        this(str, l, num, l2, l3, num2, num3, num4, map, l4, num5, l5, l6, l7, l8, num6, num7, enumC96103pu, C64537PUn.EMPTY);
    }

    public ConversationSettingInfo(String str, Long l, Integer num, Long l2, Long l3, Integer num2, Integer num3, Integer num4, Map<String, String> map, Long l4, Integer num5, Long l5, Long l6, Long l7, Long l8, Integer num6, Integer num7, EnumC96103pu enumC96103pu, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.min_index = l2;
        this.read_index = l3;
        this.mute = num2;
        this.stick_on_top = num3;
        this.inbox_type = num4;
        this.ext = C63685Oz3.LJI("ext", map);
        this.setting_version = l4;
        this.favorite = num5;
        this.set_top_time = l5;
        this.set_favorite_time = l6;
        this.read_index_v2 = l7;
        this.min_index_v2 = l8;
        this.read_badge_count = num6;
        this.read_badge_count_v2 = num7;
        this.category = enumC96103pu;
    }
}
