package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RQR;
import X.RQS;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class MarkMsgGetUnreadCountRequestBody extends Message<MarkMsgGetUnreadCountRequestBody, RQS> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_id")
    public final String conversation_id;

    @InterfaceC65349Pkn("conversation_short_id")
    public final Long conversation_short_id;

    @InterfaceC65349Pkn("conversation_type")
    public final Integer conversation_type;

    @InterfaceC65349Pkn("get_total")
    public final Boolean get_total;

    @InterfaceC65349Pkn("tags")
    public final List<Long> tags;
    public static final ProtoAdapter<MarkMsgGetUnreadCountRequestBody> ADAPTER = new RQR();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Boolean DEFAULT_GET_TOTAL = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MarkMsgGetUnreadCountRequestBody, RQS> newBuilder2() {
        RQS rqs = new RQS();
        rqs.LIZLLL = this.conversation_id;
        rqs.LJ = this.conversation_type;
        rqs.LJFF = this.conversation_short_id;
        rqs.LJI = this.get_total;
        rqs.LJII = C63685Oz3.LIZJ("tags", this.tags);
        rqs.addUnknownFields(unknownFields());
        return rqs;
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
        if (this.get_total != null) {
            sb.append(", get_total=");
            sb.append(this.get_total);
        }
        List<Long> list = this.tags;
        if (list != null && !list.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        return DIX.LIZLLL(sb, 0, 2, "MarkMsgGetUnreadCountRequestBody{", '}');
    }

    public MarkMsgGetUnreadCountRequestBody(String str, Integer num, Long l, Boolean bool, List<Long> list) {
        this(str, num, l, bool, list, C64537PUn.EMPTY);
    }

    public MarkMsgGetUnreadCountRequestBody(String str, Integer num, Long l, Boolean bool, List<Long> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.get_total = bool;
        this.tags = C63685Oz3.LJFF("tags", list);
    }
}
