package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.EnumC63751P0h;
import X.InterfaceC65349Pkn;
import X.RT5;
import X.RT6;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class BlockConversationRequestBody extends Message<BlockConversationRequestBody, RT6> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("block_normal_only")
    public final Boolean block_normal_only;

    @InterfaceC65349Pkn("block_status")
    public final EnumC63751P0h block_status;

    @InterfaceC65349Pkn("conv_short_id")
    public final Long conv_short_id;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;
    public static final ProtoAdapter<BlockConversationRequestBody> ADAPTER = new RT5();
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final EnumC63751P0h DEFAULT_BLOCK_STATUS = EnumC63751P0h.UNBLOCK;
    public static final Boolean DEFAULT_BLOCK_NORMAL_ONLY = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BlockConversationRequestBody, RT6> newBuilder2() {
        RT6 rt6 = new RT6();
        rt6.LIZLLL = this.conversation_id;
        rt6.LJ = this.conv_short_id;
        rt6.LJFF = this.conversation_type;
        rt6.LJI = this.block_status;
        rt6.LJII = this.block_normal_only;
        rt6.addUnknownFields(unknownFields());
        return rt6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conv_short_id != null) {
            sb.append(", conv_short_id=");
            sb.append(this.conv_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.block_status != null) {
            sb.append(", block_status=");
            sb.append(this.block_status);
        }
        if (this.block_normal_only != null) {
            sb.append(", block_normal_only=");
            sb.append(this.block_normal_only);
        }
        return DIX.LIZLLL(sb, 0, 2, "BlockConversationRequestBody{", '}');
    }

    public BlockConversationRequestBody(String str, Long l, Integer num, EnumC63751P0h enumC63751P0h, Boolean bool) {
        this(str, l, num, enumC63751P0h, bool, C64537PUn.EMPTY);
    }

    public BlockConversationRequestBody(String str, Long l, Integer num, EnumC63751P0h enumC63751P0h, Boolean bool, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conv_short_id = l;
        this.conversation_type = num;
        this.block_status = enumC63751P0h;
        this.block_normal_only = bool;
    }
}
