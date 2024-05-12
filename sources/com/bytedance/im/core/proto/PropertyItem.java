package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.YYN;
import X.YYO;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class PropertyItem extends Message<PropertyItem, YYO> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("create_time")
    public final Long create_time;

    @InterfaceC65349Pkn("create_time_micro")
    public final Long create_time_micro;

    @InterfaceC65349Pkn("idempotent_id")
    public final String idempotent_id;

    @InterfaceC65349Pkn("sec_uid")
    public final String sec_uid;

    @InterfaceC65349Pkn("uid")
    public final Long uid;

    @InterfaceC65349Pkn("value")
    public final String value;
    public static final ProtoAdapter<PropertyItem> ADAPTER = new YYN();
    public static final Long DEFAULT_UID = 0L;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_CREATE_TIME_MICRO = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<PropertyItem, YYO> newBuilder2() {
        YYO yyo = new YYO();
        yyo.LIZLLL = this.uid;
        yyo.LJ = this.sec_uid;
        yyo.LJFF = this.create_time;
        yyo.LJI = this.idempotent_id;
        yyo.LJII = this.value;
        yyo.LJIIIIZZ = this.create_time_micro;
        yyo.addUnknownFields(unknownFields());
        return yyo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.idempotent_id != null) {
            sb.append(", idempotent_id=");
            sb.append(this.idempotent_id);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        if (this.create_time_micro != null) {
            sb.append(", create_time_micro=");
            sb.append(this.create_time_micro);
        }
        return DIX.LIZLLL(sb, 0, 2, "PropertyItem{", '}');
    }

    public PropertyItem(Long l, String str, Long l2, String str2, String str3, Long l3) {
        this(l, str, l2, str2, str3, l3, C64537PUn.EMPTY);
    }

    public PropertyItem(Long l, String str, Long l2, String str2, String str3, Long l3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.uid = l;
        this.sec_uid = str;
        this.create_time = l2;
        this.idempotent_id = str2;
        this.value = str3;
        this.create_time_micro = l3;
    }
}
