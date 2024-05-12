package com.bytedance.im.core.proto;

import X.C63530OwY;
import X.C63531OwZ;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class GetStrangerConversationListRequestBody extends Message<GetStrangerConversationListRequestBody, C63530OwY> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("biz_info")
    public final String biz_info;

    @InterfaceC65349Pkn("count")
    public final Long count;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("show_total_unread")
    public final Boolean show_total_unread;
    public static final ProtoAdapter<GetStrangerConversationListRequestBody> ADAPTER = new C63531OwZ();
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Long DEFAULT_COUNT = 50L;
    public static final Boolean DEFAULT_SHOW_TOTAL_UNREAD = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetStrangerConversationListRequestBody, C63530OwY> newBuilder2() {
        C63530OwY c63530OwY = new C63530OwY();
        c63530OwY.LIZLLL = this.cursor;
        c63530OwY.LJ = this.count;
        c63530OwY.LJFF = this.show_total_unread;
        c63530OwY.LJI = this.biz_info;
        c63530OwY.addUnknownFields(unknownFields());
        return c63530OwY;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.show_total_unread != null) {
            sb.append(", show_total_unread=");
            sb.append(this.show_total_unread);
        }
        if (this.biz_info != null) {
            sb.append(", biz_info=");
            sb.append(this.biz_info);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetStrangerConversationListRequestBody{", '}');
    }

    public GetStrangerConversationListRequestBody(Long l, Long l2, Boolean bool, String str) {
        this(l, l2, bool, str, C64537PUn.EMPTY);
    }

    public GetStrangerConversationListRequestBody(Long l, Long l2, Boolean bool, String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.cursor = l;
        this.count = l2;
        this.show_total_unread = bool;
        this.biz_info = str;
    }
}
