package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.EnumC115774gX;
import X.InterfaceC65349Pkn;
import X.P19;
import X.P1A;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes11.dex */
public final class ConversationApplyInfo extends Message<ConversationApplyInfo, P1A> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("apply_id")
    public final Long apply_id;

    @InterfaceC65349Pkn("apply_reason")
    public final String apply_reason;

    @InterfaceC65349Pkn("apply_status")
    public final EnumC115774gX apply_status;

    @InterfaceC65349Pkn("conv_short_id")
    public final Long conv_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("create_time")
    public final Long create_time;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @InterfaceC65349Pkn("invite_user_id")
    public final Long invite_user_id;

    @InterfaceC65349Pkn("modify_time")
    public final Long modify_time;

    @InterfaceC65349Pkn("modify_user")
    public final Long modify_user;

    @InterfaceC65349Pkn("sec_invite_uid")
    public final String sec_invite_uid;

    @InterfaceC65349Pkn("sec_uid")
    public final String sec_uid;

    @InterfaceC65349Pkn("user_id")
    public final Long user_id;
    public static final ProtoAdapter<ConversationApplyInfo> ADAPTER = new P19();
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final EnumC115774gX DEFAULT_APPLY_STATUS = EnumC115774gX.APPLYING;
    public static final Long DEFAULT_APPLY_ID = 0L;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_MODIFY_TIME = 0L;
    public static final Long DEFAULT_MODIFY_USER = 0L;
    public static final Long DEFAULT_INVITE_USER_ID = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationApplyInfo, P1A> newBuilder2() {
        P1A p1a = new P1A();
        p1a.LIZLLL = this.user_id;
        p1a.LJ = this.conv_short_id;
        p1a.LJFF = this.conversation_type;
        p1a.LJI = this.apply_status;
        p1a.LJII = this.apply_id;
        p1a.LJIIIIZZ = this.create_time;
        p1a.LJIIIZ = this.modify_time;
        p1a.LJIIJ = this.modify_user;
        p1a.LJIIJJI = this.sec_uid;
        p1a.LJIIL = this.invite_user_id;
        p1a.LJIILIIL = this.sec_invite_uid;
        p1a.LJIILJJIL = C63685Oz3.LIZLLL("ext", this.ext);
        p1a.LJIILL = this.apply_reason;
        p1a.addUnknownFields(unknownFields());
        return p1a;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.apply_status != null) {
            sb.append(", apply_status=");
            sb.append(this.apply_status);
        }
        if (this.apply_id != null) {
            sb.append(", apply_id=");
            sb.append(this.apply_id);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.modify_time != null) {
            sb.append(", modify_time=");
            sb.append(this.modify_time);
        }
        if (this.modify_user != null) {
            sb.append(", modify_user=");
            sb.append(this.modify_user);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.invite_user_id != null) {
            sb.append(", invite_user_id=");
            sb.append(this.invite_user_id);
        }
        if (this.sec_invite_uid != null) {
            sb.append(", sec_invite_uid=");
            sb.append(this.sec_invite_uid);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.apply_reason != null) {
            sb.append(", apply_reason=");
            sb.append(this.apply_reason);
        }
        return DIX.LIZLLL(sb, 0, 2, "ConversationApplyInfo{", '}');
    }

    public ConversationApplyInfo(Long l, Long l2, Integer num, EnumC115774gX enumC115774gX, Long l3, Long l4, Long l5, Long l6, String str, Long l7, String str2, Map<String, String> map, String str3) {
        this(l, l2, num, enumC115774gX, l3, l4, l5, l6, str, l7, str2, map, str3, C64537PUn.EMPTY);
    }

    public ConversationApplyInfo(Long l, Long l2, Integer num, EnumC115774gX enumC115774gX, Long l3, Long l4, Long l5, Long l6, String str, Long l7, String str2, Map<String, String> map, String str3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.user_id = l;
        this.conv_short_id = l2;
        this.conversation_type = num;
        this.apply_status = enumC115774gX;
        this.apply_id = l3;
        this.create_time = l4;
        this.modify_time = l5;
        this.modify_user = l6;
        this.sec_uid = str;
        this.invite_user_id = l7;
        this.sec_invite_uid = str2;
        this.ext = C63685Oz3.LJI("ext", map);
        this.apply_reason = str3;
    }
}
