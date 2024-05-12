package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69584RSq;
import X.C69585RSr;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public final class MessagesPerUserComboInboxTypeResponseBody extends Message<MessagesPerUserComboInboxTypeResponseBody, C69585RSr> {
    public static final ProtoAdapter<MessagesPerUserComboInboxTypeResponseBody> ADAPTER = new C69584RSq();
    public static final Long DEFAULT_INTERVAL = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("interval")
    public final Long interval;

    @InterfaceC65349Pkn("messages")
    public final Map<Integer, MessagesPerUserResponseBody> messages;

    @InterfaceC65349Pkn("validInboxTypes")
    public final List<Integer> validInboxTypes;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessagesPerUserComboInboxTypeResponseBody, C69585RSr> newBuilder2() {
        C69585RSr c69585RSr = new C69585RSr();
        c69585RSr.LIZLLL = C63685Oz3.LIZJ("validInboxTypes", this.validInboxTypes);
        c69585RSr.LJ = C63685Oz3.LIZLLL("messages", this.messages);
        c69585RSr.LJFF = this.interval;
        c69585RSr.addUnknownFields(unknownFields());
        return c69585RSr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = this.validInboxTypes;
        if (list != null && !list.isEmpty()) {
            sb.append(", validInboxTypes=");
            sb.append(this.validInboxTypes);
        }
        Map<Integer, MessagesPerUserResponseBody> map = this.messages;
        if (map != null && !map.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.interval != null) {
            sb.append(", interval=");
            sb.append(this.interval);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessagesPerUserComboInboxTypeResponseBody{", '}');
    }

    public MessagesPerUserComboInboxTypeResponseBody(List<Integer> list, Map<Integer, MessagesPerUserResponseBody> map, Long l) {
        this(list, map, l, C64537PUn.EMPTY);
    }

    public MessagesPerUserComboInboxTypeResponseBody(List<Integer> list, Map<Integer, MessagesPerUserResponseBody> map, Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.validInboxTypes = C63685Oz3.LJFF("validInboxTypes", list);
        this.messages = C63685Oz3.LJI("messages", map);
        this.interval = l;
    }
}
