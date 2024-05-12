package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RRK;
import X.RRL;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class InboxMessagesPerUser extends Message<InboxMessagesPerUser, RRL> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("inbox_type")
    public final Integer inbox_type;
    public static final ProtoAdapter<InboxMessagesPerUser> ADAPTER = new RRK();
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_CURSOR = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<InboxMessagesPerUser, RRL> newBuilder2() {
        RRL rrl = new RRL();
        rrl.LIZLLL = this.inbox_type;
        rrl.LJ = this.cursor;
        rrl.addUnknownFields(unknownFields());
        return rrl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        return DIX.LIZLLL(sb, 0, 2, "InboxMessagesPerUser{", '}');
    }

    public InboxMessagesPerUser(Integer num, Long l) {
        this(num, l, C64537PUn.EMPTY);
    }

    public InboxMessagesPerUser(Integer num, Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.inbox_type = num;
        this.cursor = l;
    }
}
