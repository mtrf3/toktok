package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.EnumC63751P0h;
import X.InterfaceC65349Pkn;
import X.RT3;
import X.RT4;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes13.dex */
public final class BlockMembersRequestBody extends Message<BlockMembersRequestBody, RT4> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("biz_ext")
    public final Map<String, String> biz_ext;

    @InterfaceC65349Pkn("block_status")
    public final EnumC63751P0h block_status;

    @InterfaceC65349Pkn("block_time")
    public final Map<Long, Long> block_time;

    @InterfaceC65349Pkn("conv_short_id")
    public final Long conv_short_id;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;
    public static final ProtoAdapter<BlockMembersRequestBody> ADAPTER = new RT3();
    public static final EnumC63751P0h DEFAULT_BLOCK_STATUS = EnumC63751P0h.UNBLOCK;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BlockMembersRequestBody, RT4> newBuilder2() {
        RT4 rt4 = new RT4();
        rt4.LIZLLL = this.block_status;
        rt4.LJ = C63685Oz3.LIZLLL("block_time", this.block_time);
        rt4.LJFF = this.conv_short_id;
        rt4.LJI = this.conversation_type;
        rt4.LJII = this.conversation_id;
        rt4.LJIIIIZZ = C63685Oz3.LIZLLL("biz_ext", this.biz_ext);
        rt4.addUnknownFields(unknownFields());
        return rt4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.block_status != null) {
            sb.append(", block_status=");
            sb.append(this.block_status);
        }
        Map<Long, Long> map = this.block_time;
        if (map != null && !map.isEmpty()) {
            sb.append(", block_time=");
            sb.append(this.block_time);
        }
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        Map<String, String> map2 = this.biz_ext;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        return DIX.LIZLLL(sb, 0, 2, "BlockMembersRequestBody{", '}');
    }

    public BlockMembersRequestBody(EnumC63751P0h enumC63751P0h, Map<Long, Long> map, Long l, Integer num, String str, Map<String, String> map2) {
        this(enumC63751P0h, map, l, num, str, map2, C64537PUn.EMPTY);
    }

    public BlockMembersRequestBody(EnumC63751P0h enumC63751P0h, Map<Long, Long> map, Long l, Integer num, String str, Map<String, String> map2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.block_status = enumC63751P0h;
        this.block_time = C63685Oz3.LJI("block_time", map);
        this.conv_short_id = l;
        this.conversation_type = num;
        this.conversation_id = str;
        this.biz_ext = C63685Oz3.LJI("biz_ext", map2);
    }
}
