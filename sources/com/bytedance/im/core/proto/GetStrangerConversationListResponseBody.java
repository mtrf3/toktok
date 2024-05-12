package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P0J;
import X.P0K;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class GetStrangerConversationListResponseBody extends Message<GetStrangerConversationListResponseBody, P0K> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conversation_list")
    public final List<StrangerConversation> conversation_list;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("next_cursor")
    public final Long next_cursor;

    @InterfaceC65349Pkn("total_unread")
    public final Integer total_unread;
    public static final ProtoAdapter<GetStrangerConversationListResponseBody> ADAPTER = new P0J();
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Integer DEFAULT_TOTAL_UNREAD = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetStrangerConversationListResponseBody, P0K> newBuilder2() {
        P0K p0k = new P0K();
        p0k.LIZLLL = this.next_cursor;
        p0k.LJ = this.has_more;
        p0k.LJFF = this.total_unread;
        p0k.LJI = C63685Oz3.LIZJ("conversation_list", this.conversation_list);
        p0k.addUnknownFields(unknownFields());
        return p0k;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.total_unread != null) {
            sb.append(", total_unread=");
            sb.append(this.total_unread);
        }
        List<StrangerConversation> list = this.conversation_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_list=");
            sb.append(this.conversation_list);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetStrangerConversationListResponseBody{", '}');
    }

    public GetStrangerConversationListResponseBody(Long l, Boolean bool, Integer num, List<StrangerConversation> list) {
        this(l, bool, num, list, C64537PUn.EMPTY);
    }

    public GetStrangerConversationListResponseBody(Long l, Boolean bool, Integer num, List<StrangerConversation> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.next_cursor = l;
        this.has_more = bool;
        this.total_unread = num;
        this.conversation_list = C63685Oz3.LJFF("conversation_list", list);
    }
}
