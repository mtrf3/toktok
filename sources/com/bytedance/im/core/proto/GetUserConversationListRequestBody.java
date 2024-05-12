package com.bytedance.im.core.proto;

import X.C63448OvE;
import X.C63454OvK;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.EnumC63479Ovj;
import X.EnumC63506OwA;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class GetUserConversationListRequestBody extends Message<GetUserConversationListRequestBody, C63448OvE> {
    public static final Integer DEFAULT_CUSTOMED_CON_TYPE;
    public static final Boolean DEFAULT_INCLUDE_REMOVED_GROUP;
    public static final Boolean DEFAULT_WITH_COLD;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("con_type")
    public final EnumC63506OwA con_type;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("customed_con_type")
    public final Integer customed_con_type;

    @InterfaceC65349Pkn("exclude_role")
    public final Integer exclude_role;

    @InterfaceC65349Pkn("include_multiple_roles")
    public final List<Integer> include_multiple_roles;

    @InterfaceC65349Pkn("include_removed_group")
    public final Boolean include_removed_group;

    @InterfaceC65349Pkn("include_role")
    public final Integer include_role;

    @InterfaceC65349Pkn("limit")
    public final Long limit;

    @InterfaceC65349Pkn("sort_type")
    public final EnumC63479Ovj sort_type;

    @InterfaceC65349Pkn("with_cold")
    public final Boolean with_cold;
    public static final ProtoAdapter<GetUserConversationListRequestBody> ADAPTER = new C63454OvK();
    public static final EnumC63479Ovj DEFAULT_SORT_TYPE = EnumC63479Ovj.JOIN_TIME;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final EnumC63506OwA DEFAULT_CON_TYPE = EnumC63506OwA.ONE_TO_ONE_CHAT;
    public static final Long DEFAULT_LIMIT = 0L;
    public static final Integer DEFAULT_INCLUDE_ROLE = 0;
    public static final Integer DEFAULT_EXCLUDE_ROLE = 0;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_INCLUDE_REMOVED_GROUP = bool;
        DEFAULT_WITH_COLD = bool;
        DEFAULT_CUSTOMED_CON_TYPE = 0;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetUserConversationListRequestBody, C63448OvE> newBuilder2() {
        C63448OvE c63448OvE = new C63448OvE();
        c63448OvE.LIZLLL = this.sort_type;
        c63448OvE.LJ = this.cursor;
        c63448OvE.LJFF = this.con_type;
        c63448OvE.LJI = this.limit;
        c63448OvE.LJII = this.include_role;
        c63448OvE.LJIIIIZZ = this.exclude_role;
        c63448OvE.LJIIIZ = this.include_removed_group;
        c63448OvE.LJIIJ = this.with_cold;
        c63448OvE.LJIIJJI = this.customed_con_type;
        c63448OvE.LJIIL = C63685Oz3.LIZJ("include_multiple_roles", this.include_multiple_roles);
        c63448OvE.addUnknownFields(unknownFields());
        return c63448OvE;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sort_type != null) {
            sb.append(", sort_type=");
            sb.append(this.sort_type);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.con_type != null) {
            sb.append(", con_type=");
            sb.append(this.con_type);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.include_role != null) {
            sb.append(", include_role=");
            sb.append(this.include_role);
        }
        if (this.exclude_role != null) {
            sb.append(", exclude_role=");
            sb.append(this.exclude_role);
        }
        if (this.include_removed_group != null) {
            sb.append(", include_removed_group=");
            sb.append(this.include_removed_group);
        }
        if (this.with_cold != null) {
            sb.append(", with_cold=");
            sb.append(this.with_cold);
        }
        if (this.customed_con_type != null) {
            sb.append(", customed_con_type=");
            sb.append(this.customed_con_type);
        }
        List<Integer> list = this.include_multiple_roles;
        if (list != null && !list.isEmpty()) {
            sb.append(", include_multiple_roles=");
            sb.append(this.include_multiple_roles);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetUserConversationListRequestBody{", '}');
    }

    public GetUserConversationListRequestBody(EnumC63479Ovj enumC63479Ovj, Long l, EnumC63506OwA enumC63506OwA, Long l2, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, List<Integer> list) {
        this(enumC63479Ovj, l, enumC63506OwA, l2, num, num2, bool, bool2, num3, list, C64537PUn.EMPTY);
    }

    public GetUserConversationListRequestBody(EnumC63479Ovj enumC63479Ovj, Long l, EnumC63506OwA enumC63506OwA, Long l2, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, List<Integer> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.sort_type = enumC63479Ovj;
        this.cursor = l;
        this.con_type = enumC63506OwA;
        this.limit = l2;
        this.include_role = num;
        this.exclude_role = num2;
        this.include_removed_group = bool;
        this.with_cold = bool2;
        this.customed_con_type = num3;
        this.include_multiple_roles = C63685Oz3.LJFF("include_multiple_roles", list);
    }
}
