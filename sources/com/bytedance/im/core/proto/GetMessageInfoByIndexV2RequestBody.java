package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RQP;
import X.RQQ;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class GetMessageInfoByIndexV2RequestBody extends Message<GetMessageInfoByIndexV2RequestBody, RQQ> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("index_in_conversation_v2")
    public final List<Long> index_in_conversation_v2;
    public static final ProtoAdapter<GetMessageInfoByIndexV2RequestBody> ADAPTER = new RQP();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessageInfoByIndexV2RequestBody, RQQ> newBuilder2() {
        RQQ rqq = new RQQ();
        rqq.LIZLLL = this.conversation_id;
        rqq.LJ = this.conversation_type;
        rqq.LJFF = this.conversation_short_id;
        rqq.LJI = C63685Oz3.LIZJ("index_in_conversation_v2", this.index_in_conversation_v2);
        rqq.addUnknownFields(unknownFields());
        return rqq;
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
        List<Long> list = this.index_in_conversation_v2;
        if (list != null && !list.isEmpty()) {
            sb.append(", index_in_conversation_v2=");
            sb.append(this.index_in_conversation_v2);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetMessageInfoByIndexV2RequestBody{", '}');
    }

    public GetMessageInfoByIndexV2RequestBody(String str, Integer num, Long l, List<Long> list) {
        this(str, num, l, list, C64537PUn.EMPTY);
    }

    public GetMessageInfoByIndexV2RequestBody(String str, Integer num, Long l, List<Long> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.index_in_conversation_v2 = C63685Oz3.LJFF("index_in_conversation_v2", list);
    }
}
