package com.bytedance.im.core.proto;

import X.C63488Ovs;
import X.C63489Ovt;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class MessagesPerUserRequestBody extends Message<MessagesPerUserRequestBody, C63488Ovs> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("interval")
    public final Long interval;

    @InterfaceC65349Pkn("limit")
    public final Integer limit;

    @InterfaceC65349Pkn("new_user")
    public final Integer new_user;
    public static final ProtoAdapter<MessagesPerUserRequestBody> ADAPTER = new C63489Ovt();
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 50;
    public static final Long DEFAULT_INTERVAL = 0L;
    public static final Integer DEFAULT_NEW_USER = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessagesPerUserRequestBody, C63488Ovs> newBuilder2() {
        C63488Ovs c63488Ovs = new C63488Ovs();
        c63488Ovs.LIZLLL = this.cursor;
        c63488Ovs.LJ = this.limit;
        c63488Ovs.LJFF = this.interval;
        c63488Ovs.LJI = this.new_user;
        c63488Ovs.addUnknownFields(unknownFields());
        return c63488Ovs;
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
        if (this.interval != null) {
            sb.append(", interval=");
            sb.append(this.interval);
        }
        if (this.new_user != null) {
            sb.append(", new_user=");
            sb.append(this.new_user);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessagesPerUserRequestBody{", '}');
    }

    public MessagesPerUserRequestBody(Long l, Integer num, Long l2, Integer num2) {
        this(l, num, l2, num2, C64537PUn.EMPTY);
    }

    public MessagesPerUserRequestBody(Long l, Integer num, Long l2, Integer num2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.cursor = l;
        this.limit = num;
        this.interval = l2;
        this.new_user = num2;
    }
}
