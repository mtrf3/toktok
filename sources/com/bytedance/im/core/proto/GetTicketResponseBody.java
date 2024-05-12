package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RSI;
import X.RSJ;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class GetTicketResponseBody extends Message<GetTicketResponseBody, RSJ> {
    public static final ProtoAdapter<GetTicketResponseBody> ADAPTER = new RSI();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("ticket")
    public final String ticket;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetTicketResponseBody, RSJ> newBuilder2() {
        RSJ rsj = new RSJ();
        rsj.LIZLLL = this.ticket;
        rsj.addUnknownFields(unknownFields());
        return rsj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetTicketResponseBody{", '}');
    }

    public GetTicketResponseBody(String str) {
        this(str, C64537PUn.EMPTY);
    }

    public GetTicketResponseBody(String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.ticket = str;
    }
}
