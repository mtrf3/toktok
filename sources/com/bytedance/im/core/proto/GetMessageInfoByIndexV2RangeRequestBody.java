package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.EnumC63513OwH;
import X.InterfaceC65349Pkn;
import X.YYF;
import X.YYG;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class GetMessageInfoByIndexV2RangeRequestBody extends Message<GetMessageInfoByIndexV2RangeRequestBody, YYG> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("direction")
    public final EnumC63513OwH direction;

    @InterfaceC65349Pkn("max_index_in_conversation_v2")
    public final Long max_index_in_conversation_v2;

    @InterfaceC65349Pkn("min_index_in_conversation_v2")
    public final Long min_index_in_conversation_v2;
    public static final ProtoAdapter<GetMessageInfoByIndexV2RangeRequestBody> ADAPTER = new YYF();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_MIN_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final Long DEFAULT_MAX_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final EnumC63513OwH DEFAULT_DIRECTION = EnumC63513OwH.OLDER;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessageInfoByIndexV2RangeRequestBody, YYG> newBuilder2() {
        YYG yyg = new YYG();
        yyg.LIZLLL = this.conversation_id;
        yyg.LJ = this.conversation_type;
        yyg.LJFF = this.conversation_short_id;
        yyg.LJI = this.min_index_in_conversation_v2;
        yyg.LJII = this.max_index_in_conversation_v2;
        yyg.LJIIIIZZ = this.direction;
        yyg.addUnknownFields(unknownFields());
        return yyg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        sb.append(", min_index_in_conversation_v2=");
        sb.append(this.min_index_in_conversation_v2);
        sb.append(", max_index_in_conversation_v2=");
        sb.append(this.max_index_in_conversation_v2);
        if (this.direction != null) {
            sb.append(", direction=");
            sb.append(this.direction);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetMessageInfoByIndexV2RangeRequestBody{", '}');
    }

    public GetMessageInfoByIndexV2RangeRequestBody(String str, Integer num, Long l, Long l2, Long l3, EnumC63513OwH enumC63513OwH) {
        this(str, num, l, l2, l3, enumC63513OwH, C64537PUn.EMPTY);
    }

    public GetMessageInfoByIndexV2RangeRequestBody(String str, Integer num, Long l, Long l2, Long l3, EnumC63513OwH enumC63513OwH, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.min_index_in_conversation_v2 = l2;
        this.max_index_in_conversation_v2 = l3;
        this.direction = enumC63513OwH;
    }
}
