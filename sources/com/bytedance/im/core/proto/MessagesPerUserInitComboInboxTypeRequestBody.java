package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.C66643QDn;
import X.C66644QDo;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class MessagesPerUserInitComboInboxTypeRequestBody extends Message<MessagesPerUserInitComboInboxTypeRequestBody, C66644QDo> {
    public static final ProtoAdapter<MessagesPerUserInitComboInboxTypeRequestBody> ADAPTER = new C66643QDn();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cursors")
    public final Map<Integer, Long> cursors;

    @InterfaceC65349Pkn("inboxTypes")
    public final List<Integer> inboxTypes;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MessagesPerUserInitComboInboxTypeRequestBody, C66644QDo> newBuilder2() {
        C66644QDo c66644QDo = new C66644QDo();
        c66644QDo.LIZLLL = C63685Oz3.LIZJ("inboxTypes", this.inboxTypes);
        c66644QDo.LJ = C63685Oz3.LIZLLL("cursors", this.cursors);
        c66644QDo.addUnknownFields(unknownFields());
        return c66644QDo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = this.inboxTypes;
        if (list != null && !list.isEmpty()) {
            sb.append(", inboxTypes=");
            sb.append(this.inboxTypes);
        }
        Map<Integer, Long> map = this.cursors;
        if (map != null && !map.isEmpty()) {
            sb.append(", cursors=");
            sb.append(this.cursors);
        }
        return DIX.LIZLLL(sb, 0, 2, "MessagesPerUserInitComboInboxTypeRequestBody{", '}');
    }

    public MessagesPerUserInitComboInboxTypeRequestBody(List<Integer> list, Map<Integer, Long> map) {
        this(list, map, C64537PUn.EMPTY);
    }

    public MessagesPerUserInitComboInboxTypeRequestBody(List<Integer> list, Map<Integer, Long> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.inboxTypes = C63685Oz3.LJFF("inboxTypes", list);
        this.cursors = C63685Oz3.LJI("cursors", map);
    }
}
