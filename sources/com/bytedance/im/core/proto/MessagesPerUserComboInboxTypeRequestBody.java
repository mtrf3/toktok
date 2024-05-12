package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RRV;
import X.RRW;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public final class MessagesPerUserComboInboxTypeRequestBody extends Message<MessagesPerUserComboInboxTypeRequestBody, RRW> {
    public static final ProtoAdapter<MessagesPerUserComboInboxTypeRequestBody> ADAPTER = new RRV();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("inboxTypes")
    public final List<Integer> inboxTypes;

    @InterfaceC65349Pkn("pagination")
    public final Map<Integer, MessagesPerUserPaginationInfo> pagination;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessagesPerUserComboInboxTypeRequestBody, RRW> newBuilder2() {
        RRW rrw = new RRW();
        rrw.LIZLLL = C63685Oz3.LIZJ("inboxTypes", this.inboxTypes);
        rrw.LJ = C63685Oz3.LIZLLL("pagination", this.pagination);
        rrw.addUnknownFields(unknownFields());
        return rrw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = this.inboxTypes;
        if (list != null && !list.isEmpty()) {
            sb.append(", inboxTypes=");
            sb.append(this.inboxTypes);
        }
        Map<Integer, MessagesPerUserPaginationInfo> map = this.pagination;
        if (map != null && !map.isEmpty()) {
            sb.append(", pagination=");
            sb.append(this.pagination);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessagesPerUserComboInboxTypeRequestBody{", '}');
    }

    public MessagesPerUserComboInboxTypeRequestBody(List<Integer> list, Map<Integer, MessagesPerUserPaginationInfo> map) {
        this(list, map, C64537PUn.EMPTY);
    }

    public MessagesPerUserComboInboxTypeRequestBody(List<Integer> list, Map<Integer, MessagesPerUserPaginationInfo> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.inboxTypes = C63685Oz3.LJFF("inboxTypes", list);
        this.pagination = C63685Oz3.LJI("pagination", map);
    }
}
