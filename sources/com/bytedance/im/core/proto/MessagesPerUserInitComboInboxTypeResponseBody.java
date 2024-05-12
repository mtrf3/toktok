package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C69556RRo;
import X.C69557RRp;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public final class MessagesPerUserInitComboInboxTypeResponseBody extends Message<MessagesPerUserInitComboInboxTypeResponseBody, C69557RRp> {
    public static final ProtoAdapter<MessagesPerUserInitComboInboxTypeResponseBody> ADAPTER = new C69556RRo();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("inboxTypes")
    public final List<Integer> inboxTypes;

    @InterfaceC65349Pkn("messages")
    public final Map<Integer, MessagesPerUserInitV2ResponseBody> messages;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessagesPerUserInitComboInboxTypeResponseBody, C69557RRp> newBuilder2() {
        C69557RRp c69557RRp = new C69557RRp();
        c69557RRp.LIZLLL = C63685Oz3.LIZJ("inboxTypes", this.inboxTypes);
        c69557RRp.LJ = C63685Oz3.LIZLLL("messages", this.messages);
        c69557RRp.addUnknownFields(unknownFields());
        return c69557RRp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = this.inboxTypes;
        if (list != null && !list.isEmpty()) {
            sb.append(", inboxTypes=");
            sb.append(this.inboxTypes);
        }
        Map<Integer, MessagesPerUserInitV2ResponseBody> map = this.messages;
        if (map != null && !map.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessagesPerUserInitComboInboxTypeResponseBody{", '}');
    }

    public MessagesPerUserInitComboInboxTypeResponseBody(List<Integer> list, Map<Integer, MessagesPerUserInitV2ResponseBody> map) {
        this(list, map, C64537PUn.EMPTY);
    }

    public MessagesPerUserInitComboInboxTypeResponseBody(List<Integer> list, Map<Integer, MessagesPerUserInitV2ResponseBody> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.inboxTypes = C63685Oz3.LJFF("inboxTypes", list);
        this.messages = C63685Oz3.LJI("messages", map);
    }
}
