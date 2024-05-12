package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69562RRu;
import X.C69563RRv;
import X.C89452Z8u;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class GetConversationAuditListResponseBody extends Message<GetConversationAuditListResponseBody, C69563RRv> {
    public static final ProtoAdapter<GetConversationAuditListResponseBody> ADAPTER;
    public static final Boolean DEFAULT_HAS_MORE;
    public static final Long DEFAULT_NEXT_CURSOR;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("apply_info_list")
    public final List<ConversationApplyInfo> apply_info_list;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("next_cursor")
    public final Long next_cursor;

    static {
        C69562RRu c69562RRu = new C69562RRu();
        ADAPTER = c69562RRu;
        DEFAULT_NEXT_CURSOR = 0L;
        DEFAULT_HAS_MORE = Boolean.FALSE;
        C89452Z8u.LJ.put(2027, c69562RRu);
    }

    public static void registerAdapter() {
        C89452Z8u.LJ.put(2027, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConversationAuditListResponseBody, C69563RRv> newBuilder2() {
        C69563RRv c69563RRv = new C69563RRv();
        c69563RRv.LIZLLL = C63685Oz3.LIZJ("apply_info_list", this.apply_info_list);
        c69563RRv.LJ = this.next_cursor;
        c69563RRv.LJFF = this.has_more;
        c69563RRv.addUnknownFields(unknownFields());
        return c69563RRv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationApplyInfo> list = this.apply_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", apply_info_list=");
            sb.append(this.apply_info_list);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConversationAuditListResponseBody{", '}');
    }

    public GetConversationAuditListResponseBody(List<ConversationApplyInfo> list, Long l, Boolean bool) {
        this(list, l, bool, C64537PUn.EMPTY);
    }

    public GetConversationAuditListResponseBody(List<ConversationApplyInfo> list, Long l, Boolean bool, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.apply_info_list = C63685Oz3.LJFF("apply_info_list", list);
        this.next_cursor = l;
        this.has_more = bool;
    }
}
