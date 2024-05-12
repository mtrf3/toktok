package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RQD;
import X.RQE;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ConversationsPerUserByFavoriteV2RequestBody extends Message<ConversationsPerUserByFavoriteV2RequestBody, RQE> {
    public static final ProtoAdapter<ConversationsPerUserByFavoriteV2RequestBody> ADAPTER = new RQD();
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = Integer.valueOf(LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("limit")
    public final Integer limit;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ConversationsPerUserByFavoriteV2RequestBody, RQE> newBuilder2() {
        RQE rqe = new RQE();
        rqe.LIZLLL = this.cursor;
        rqe.LJ = this.limit;
        rqe.addUnknownFields(unknownFields());
        return rqe;
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
        return DIX.LIZLLL(sb, 0, 2, "ConversationsPerUserByFavoriteV2RequestBody{", '}');
    }

    public ConversationsPerUserByFavoriteV2RequestBody(Long l, Integer num) {
        this(l, num, C64537PUn.EMPTY);
    }

    public ConversationsPerUserByFavoriteV2RequestBody(Long l, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.cursor = l;
        this.limit = num;
    }
}
