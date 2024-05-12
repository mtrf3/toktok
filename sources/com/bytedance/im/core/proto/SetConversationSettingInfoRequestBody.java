package com.bytedance.im.core.proto;

import X.C120474o7;
import X.C63580OxM;
import X.C64537PUn;
import X.DIX;
import X.EnumC96103pu;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class SetConversationSettingInfoRequestBody extends Message<SetConversationSettingInfoRequestBody, C120474o7> {
    public static final ProtoAdapter<SetConversationSettingInfoRequestBody> ADAPTER = new C63580OxM();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final EnumC96103pu DEFAULT_SET_CATEGORY;
    public static final Boolean DEFAULT_SET_FAVORITE;
    public static final Boolean DEFAULT_SET_MUTE;
    public static final Boolean DEFAULT_SET_STICK_ON_TOP;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("set_category")
    public final EnumC96103pu set_category;

    @InterfaceC65349Pkn("set_favorite")
    public final Boolean set_favorite;

    @InterfaceC65349Pkn("set_mute")
    public final Boolean set_mute;

    @InterfaceC65349Pkn("set_stick_on_top")
    public final Boolean set_stick_on_top;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_SET_STICK_ON_TOP = bool;
        DEFAULT_SET_MUTE = bool;
        DEFAULT_SET_FAVORITE = bool;
        DEFAULT_SET_CATEGORY = EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<SetConversationSettingInfoRequestBody, C120474o7> newBuilder2() {
        C120474o7 c120474o7 = new C120474o7();
        c120474o7.LIZLLL = this.conversation_id;
        c120474o7.LJ = this.conversation_short_id;
        c120474o7.LJFF = this.conversation_type;
        c120474o7.LJI = this.set_stick_on_top;
        c120474o7.LJII = this.set_mute;
        c120474o7.LJIIIIZZ = this.set_favorite;
        c120474o7.LJIIIZ = this.set_category;
        c120474o7.addUnknownFields(unknownFields());
        return c120474o7;
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
        if (this.set_stick_on_top != null) {
            sb.append(", set_stick_on_top=");
            sb.append(this.set_stick_on_top);
        }
        if (this.set_mute != null) {
            sb.append(", set_mute=");
            sb.append(this.set_mute);
        }
        if (this.set_favorite != null) {
            sb.append(", set_favorite=");
            sb.append(this.set_favorite);
        }
        if (this.set_category != null) {
            sb.append(", set_category=");
            sb.append(this.set_category);
        }
        return DIX.LIZLLL(sb, 0, 2, "SetConversationSettingInfoRequestBody{", '}');
    }

    public SetConversationSettingInfoRequestBody(String str, Long l, Integer num, Boolean bool, Boolean bool2, Boolean bool3, EnumC96103pu enumC96103pu) {
        this(str, l, num, bool, bool2, bool3, enumC96103pu, C64537PUn.EMPTY);
    }

    public SetConversationSettingInfoRequestBody(String str, Long l, Integer num, Boolean bool, Boolean bool2, Boolean bool3, EnumC96103pu enumC96103pu, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.set_stick_on_top = bool;
        this.set_mute = bool2;
        this.set_favorite = bool3;
        this.set_category = enumC96103pu;
    }
}
