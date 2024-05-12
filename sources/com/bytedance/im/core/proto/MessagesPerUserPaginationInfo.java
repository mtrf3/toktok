package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RRQ;
import X.RRR;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class MessagesPerUserPaginationInfo extends Message<MessagesPerUserPaginationInfo, RRR> {
    public static final ProtoAdapter<MessagesPerUserPaginationInfo> ADAPTER = new RRQ();
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 50;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("limit")
    public final Integer limit;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessagesPerUserPaginationInfo, RRR> newBuilder2() {
        RRR rrr = new RRR();
        rrr.LIZLLL = this.cursor;
        rrr.LJ = this.limit;
        rrr.addUnknownFields(unknownFields());
        return rrr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessagesPerUserPaginationInfo{", '}');
    }

    public MessagesPerUserPaginationInfo(Long l, Integer num) {
        this(l, num, C64537PUn.EMPTY);
    }

    public MessagesPerUserPaginationInfo(Long l, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.cursor = l;
        this.limit = num;
    }
}
