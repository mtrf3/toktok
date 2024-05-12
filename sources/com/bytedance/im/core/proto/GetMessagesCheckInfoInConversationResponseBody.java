package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69611RTr;
import X.C69612RTs;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class GetMessagesCheckInfoInConversationResponseBody extends Message<GetMessagesCheckInfoInConversationResponseBody, C69612RTs> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cursor_reverse_next")
    public final Long cursor_reverse_next;

    @InterfaceC65349Pkn("msgs_checkinfo_list")
    public final List<MessagesCheckInfo> msgs_checkinfo_list;

    @InterfaceC65349Pkn("real_msg_total_count")
    public final Integer real_msg_total_count;
    public static final ProtoAdapter<GetMessagesCheckInfoInConversationResponseBody> ADAPTER = new C69611RTr();
    public static final Integer DEFAULT_REAL_MSG_TOTAL_COUNT = 0;
    public static final Long DEFAULT_CURSOR_REVERSE_NEXT = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessagesCheckInfoInConversationResponseBody, C69612RTs> newBuilder2() {
        C69612RTs c69612RTs = new C69612RTs();
        c69612RTs.LIZLLL = C63685Oz3.LIZJ("msgs_checkinfo_list", this.msgs_checkinfo_list);
        c69612RTs.LJ = this.real_msg_total_count;
        c69612RTs.LJFF = this.cursor_reverse_next;
        c69612RTs.addUnknownFields(unknownFields());
        return c69612RTs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessagesCheckInfo> list = this.msgs_checkinfo_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", msgs_checkinfo_list=");
            sb.append(this.msgs_checkinfo_list);
        }
        if (this.real_msg_total_count != null) {
            sb.append(", real_msg_total_count=");
            sb.append(this.real_msg_total_count);
        }
        if (this.cursor_reverse_next != null) {
            sb.append(", cursor_reverse_next=");
            sb.append(this.cursor_reverse_next);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetMessagesCheckInfoInConversationResponseBody{", '}');
    }

    public GetMessagesCheckInfoInConversationResponseBody(List<MessagesCheckInfo> list, Integer num, Long l) {
        this(list, num, l, C64537PUn.EMPTY);
    }

    public GetMessagesCheckInfoInConversationResponseBody(List<MessagesCheckInfo> list, Integer num, Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.msgs_checkinfo_list = C63685Oz3.LJFF("msgs_checkinfo_list", list);
        this.real_msg_total_count = num;
        this.cursor_reverse_next = l;
    }
}
