package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.EnumC69908Rc8;
import X.InterfaceC65349Pkn;
import X.RTD;
import X.RTE;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes13.dex */
public final class SendInputStatusResponseBody extends Message<SendInputStatusResponseBody, RTE> {
    public static final ProtoAdapter<SendInputStatusResponseBody> ADAPTER = new RTD();
    public static final EnumC69908Rc8 DEFAULT_STATUS = EnumC69908Rc8.Success;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("extra")
    public final Map<String, String> extra;

    @InterfaceC65349Pkn("status")
    public final EnumC69908Rc8 status;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<SendInputStatusResponseBody, RTE> newBuilder2() {
        RTE rte = new RTE();
        rte.LIZLLL = this.status;
        rte.LJ = C63685Oz3.LIZLLL("extra", this.extra);
        rte.addUnknownFields(unknownFields());
        return rte;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        Map<String, String> map = this.extra;
        if (map != null && !map.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        return DIX.LIZLLL(sb, 0, 2, "SendInputStatusResponseBody{", '}');
    }

    public SendInputStatusResponseBody(EnumC69908Rc8 enumC69908Rc8, Map<String, String> map) {
        this(enumC69908Rc8, map, C64537PUn.EMPTY);
    }

    public SendInputStatusResponseBody(EnumC69908Rc8 enumC69908Rc8, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.status = enumC69908Rc8;
        this.extra = C63685Oz3.LJI("extra", map);
    }
}
