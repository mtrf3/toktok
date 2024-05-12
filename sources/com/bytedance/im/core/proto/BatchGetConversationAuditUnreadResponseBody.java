package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C89452Z8u;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RRX;
import X.RRY;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes13.dex */
public final class BatchGetConversationAuditUnreadResponseBody extends Message<BatchGetConversationAuditUnreadResponseBody, RRY> {
    public static final ProtoAdapter<BatchGetConversationAuditUnreadResponseBody> ADAPTER;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("unread_count")
    public final Map<Long, Long> unread_count;

    static {
        RRX rrx = new RRX();
        ADAPTER = rrx;
        C89452Z8u.LJ.put(2042, rrx);
    }

    public static void registerAdapter() {
        C89452Z8u.LJ.put(2042, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BatchGetConversationAuditUnreadResponseBody, RRY> newBuilder2() {
        RRY rry = new RRY();
        rry.LIZLLL = C63685Oz3.LIZLLL("unread_count", this.unread_count);
        rry.addUnknownFields(unknownFields());
        return rry;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Map<Long, Long> map = this.unread_count;
        if (map != null && !map.isEmpty()) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        return DIX.LIZLLL(sb, 0, 2, "BatchGetConversationAuditUnreadResponseBody{", '}');
    }

    public BatchGetConversationAuditUnreadResponseBody(Map<Long, Long> map) {
        this(map, C64537PUn.EMPTY);
    }

    public BatchGetConversationAuditUnreadResponseBody(Map<Long, Long> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.unread_count = C63685Oz3.LJI("unread_count", map);
    }
}
