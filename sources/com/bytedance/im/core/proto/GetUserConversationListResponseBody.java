package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RSE;
import X.RSF;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class GetUserConversationListResponseBody extends Message<GetUserConversationListResponseBody, RSF> {
    public static final ProtoAdapter<GetUserConversationListResponseBody> ADAPTER = new RSE();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("list")
    public final List<ConversationInfoV2> list;

    @InterfaceC65349Pkn("next_cursor")
    public final Long next_cursor;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetUserConversationListResponseBody, RSF> newBuilder2() {
        RSF rsf = new RSF();
        rsf.LIZLLL = C63685Oz3.LIZJ("list", this.list);
        rsf.LJ = this.has_more;
        rsf.LJFF = this.next_cursor;
        rsf.addUnknownFields(unknownFields());
        return rsf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationInfoV2> list = this.list;
        if (list != null && !list.isEmpty()) {
            sb.append(", list=");
            sb.append(this.list);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetUserConversationListResponseBody{", '}');
    }

    public GetUserConversationListResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l) {
        this(list, bool, l, C64537PUn.EMPTY);
    }

    public GetUserConversationListResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.list = C63685Oz3.LJFF("list", list);
        this.has_more = bool;
        this.next_cursor = l;
    }
}
