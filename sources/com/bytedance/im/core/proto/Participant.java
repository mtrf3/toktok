package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C63749P0f;
import X.C63750P0g;
import X.C64537PUn;
import X.DIX;
import X.EnumC63751P0h;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes11.dex */
public final class Participant extends Message<Participant, C63750P0g> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("alias")
    public final String alias;

    @InterfaceC65349Pkn("blocked")
    public final EnumC63751P0h blocked;

    @InterfaceC65349Pkn("ext")
    public final Map<String, String> ext;

    @InterfaceC65349Pkn("left_block_time")
    public final Long left_block_time;

    @InterfaceC65349Pkn("role")
    public final Integer role;

    @InterfaceC65349Pkn("sec_uid")
    public final String sec_uid;

    @InterfaceC65349Pkn("sort_order")
    public final Long sort_order;

    @InterfaceC65349Pkn("user_id")
    public final Long user_id;
    public static final ProtoAdapter<Participant> ADAPTER = new C63749P0f();
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_SORT_ORDER = 0L;
    public static final Integer DEFAULT_ROLE = 0;
    public static final EnumC63751P0h DEFAULT_BLOCKED = EnumC63751P0h.UNBLOCK;
    public static final Long DEFAULT_LEFT_BLOCK_TIME = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<Participant, C63750P0g> newBuilder2() {
        C63750P0g c63750P0g = new C63750P0g();
        c63750P0g.LIZLLL = this.user_id;
        c63750P0g.LJ = this.sort_order;
        c63750P0g.LJFF = this.role;
        c63750P0g.LJI = this.alias;
        c63750P0g.LJII = this.sec_uid;
        c63750P0g.LJIIIIZZ = this.blocked;
        c63750P0g.LJIIIZ = this.left_block_time;
        c63750P0g.LJIIJ = C63685Oz3.LIZLLL("ext", this.ext);
        c63750P0g.addUnknownFields(unknownFields());
        return c63750P0g;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.sort_order != null) {
            sb.append(", sort_order=");
            sb.append(this.sort_order);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (this.alias != null) {
            sb.append(", alias=");
            sb.append(this.alias);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.blocked != null) {
            sb.append(", blocked=");
            sb.append(this.blocked);
        }
        if (this.left_block_time != null) {
            sb.append(", left_block_time=");
            sb.append(this.left_block_time);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        return DIX.LIZLLL(sb, 0, 2, "Participant{", '}');
    }

    public Participant(Long l, Long l2, Integer num, String str, String str2, EnumC63751P0h enumC63751P0h, Long l3, Map<String, String> map) {
        this(l, l2, num, str, str2, enumC63751P0h, l3, map, C64537PUn.EMPTY);
    }

    public Participant(Long l, Long l2, Integer num, String str, String str2, EnumC63751P0h enumC63751P0h, Long l3, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.user_id = l;
        this.sort_order = l2;
        this.role = num;
        this.alias = str;
        this.sec_uid = str2;
        this.blocked = enumC63751P0h;
        this.left_block_time = l3;
        this.ext = C63685Oz3.LJI("ext", map);
    }
}
