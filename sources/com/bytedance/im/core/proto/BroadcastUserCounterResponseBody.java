package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RTL;
import X.RTM;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class BroadcastUserCounterResponseBody extends Message<BroadcastUserCounterResponseBody, RTM> {
    public static final ProtoAdapter<BroadcastUserCounterResponseBody> ADAPTER = new RTL();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("infos")
    public final List<BroadcastUserInfo> infos;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<BroadcastUserCounterResponseBody, RTM> newBuilder2() {
        RTM rtm = new RTM();
        rtm.LIZLLL = C63685Oz3.LIZJ("infos", this.infos);
        rtm.addUnknownFields(unknownFields());
        return rtm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<BroadcastUserInfo> list = this.infos;
        if (list != null && !list.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        return DIX.LIZLLL(sb, 0, 2, "BroadcastUserCounterResponseBody{", '}');
    }

    public BroadcastUserCounterResponseBody(List<BroadcastUserInfo> list) {
        this(list, C64537PUn.EMPTY);
    }

    public BroadcastUserCounterResponseBody(List<BroadcastUserInfo> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.infos = C63685Oz3.LJFF("infos", list);
    }
}
