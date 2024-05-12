package com.bytedance.im.core.proto;

import X.C63663Oyh;
import X.C63664Oyi;
import X.C64537PUn;
import X.DIX;
import X.EnumC63506OwA;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetMessagesCheckInfoV2RequestBody extends Message<GetMessagesCheckInfoV2RequestBody, C63663Oyh> {
    public static final ProtoAdapter<GetMessagesCheckInfoV2RequestBody> ADAPTER = new C63664Oyi();
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final EnumC63506OwA DEFAULT_CONV_TYPE = EnumC63506OwA.ONE_TO_ONE_CHAT;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conv_id")
    public final String conv_id;

    @InterfaceC65349Pkn("conv_short_id")
    public final Long conv_short_id;

    @InterfaceC65349Pkn("conv_type")
    public final EnumC63506OwA conv_type;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("limit")
    public final Integer limit;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessagesCheckInfoV2RequestBody, C63663Oyh> newBuilder2() {
        C63663Oyh c63663Oyh = new C63663Oyh();
        c63663Oyh.LIZLLL = this.conv_short_id;
        c63663Oyh.LJ = this.conv_id;
        c63663Oyh.LJFF = this.conv_type;
        c63663Oyh.LJI = this.cursor;
        c63663Oyh.LJII = this.limit;
        c63663Oyh.addUnknownFields(unknownFields());
        return c63663Oyh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        if (this.conv_id != null) {
            sb.append(", conv_id=");
            sb.append(this.conv_id);
        }
        if (this.conv_type != null) {
            sb.append(", conv_type=");
            sb.append(this.conv_type);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetMessagesCheckInfoV2RequestBody{", '}');
    }

    public GetMessagesCheckInfoV2RequestBody(Long l, String str, EnumC63506OwA enumC63506OwA, Long l2, Integer num) {
        this(l, str, enumC63506OwA, l2, num, C64537PUn.EMPTY);
    }

    public GetMessagesCheckInfoV2RequestBody(Long l, String str, EnumC63506OwA enumC63506OwA, Long l2, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conv_short_id = l;
        this.conv_id = str;
        this.conv_type = enumC63506OwA;
        this.cursor = l2;
        this.limit = num;
    }
}
