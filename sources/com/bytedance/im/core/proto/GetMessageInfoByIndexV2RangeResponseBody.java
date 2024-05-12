package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P0P;
import X.P0Q;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class GetMessageInfoByIndexV2RangeResponseBody extends Message<GetMessageInfoByIndexV2RangeResponseBody, P0Q> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("infos")
    public final List<MessageInfo> infos;

    @InterfaceC65349Pkn("next_index_in_conversation_v2")
    public final Long next_index_in_conversation_v2;
    public static final ProtoAdapter<GetMessageInfoByIndexV2RangeResponseBody> ADAPTER = new P0P();
    public static final Long DEFAULT_NEXT_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessageInfoByIndexV2RangeResponseBody, P0Q> newBuilder2() {
        P0Q p0q = new P0Q();
        p0q.LIZLLL = C63685Oz3.LIZJ("infos", this.infos);
        p0q.LJ = this.next_index_in_conversation_v2;
        p0q.LJFF = this.has_more;
        p0q.addUnknownFields(unknownFields());
        return p0q;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageInfo> list = this.infos;
        if (list != null && !list.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        if (this.next_index_in_conversation_v2 != null) {
            sb.append(", next_index_in_conversation_v2=");
            sb.append(this.next_index_in_conversation_v2);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetMessageInfoByIndexV2RangeResponseBody{", '}');
    }

    public GetMessageInfoByIndexV2RangeResponseBody(List<MessageInfo> list, Long l, Boolean bool) {
        this(list, l, bool, C64537PUn.EMPTY);
    }

    public GetMessageInfoByIndexV2RangeResponseBody(List<MessageInfo> list, Long l, Boolean bool, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.infos = C63685Oz3.LJFF("infos", list);
        this.next_index_in_conversation_v2 = l;
        this.has_more = bool;
    }
}
