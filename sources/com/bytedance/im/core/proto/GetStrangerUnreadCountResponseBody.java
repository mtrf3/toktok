package com.bytedance.im.core.proto;

import X.C278817o;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RRG;
import X.RRH;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class GetStrangerUnreadCountResponseBody extends Message<GetStrangerUnreadCountResponseBody, RRH> {
    public static final ProtoAdapter<GetStrangerUnreadCountResponseBody> ADAPTER = new RRG();
    public static final Long DEFAULT_USER_UNREAD_COUNT = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("user_unread_count")
    public final Long user_unread_count;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetStrangerUnreadCountResponseBody, RRH> newBuilder2() {
        RRH rrh = new RRH();
        rrh.LIZLLL = this.user_unread_count;
        rrh.addUnknownFields(unknownFields());
        return rrh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", user_unread_count=");
        LIZJ.append(this.user_unread_count);
        return DIX.LIZLLL(LIZJ, 0, 2, "GetStrangerUnreadCountResponseBody{", '}');
    }

    public GetStrangerUnreadCountResponseBody(Long l) {
        this(l, C64537PUn.EMPTY);
    }

    public GetStrangerUnreadCountResponseBody(Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.user_unread_count = l;
    }
}
