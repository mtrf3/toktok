package com.bytedance.im.core.proto;

import X.C63473Ovd;
import X.C63474Ove;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class ClientBatchACKRequestBody extends Message<ClientBatchACKRequestBody, C63473Ovd> {
    public static final ProtoAdapter<ClientBatchACKRequestBody> ADAPTER = new C63474Ove();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("ack_list")
    public final List<ClientACKRequestBody> ack_list;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ClientBatchACKRequestBody, C63473Ovd> newBuilder2() {
        C63473Ovd c63473Ovd = new C63473Ovd();
        c63473Ovd.LIZLLL = C63685Oz3.LIZJ("ack_list", this.ack_list);
        c63473Ovd.addUnknownFields(unknownFields());
        return c63473Ovd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ClientACKRequestBody> list = this.ack_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", ack_list=");
            sb.append(this.ack_list);
        }
        return DIX.LIZLLL(sb, 0, 2, "ClientBatchACKRequestBody{", '}');
    }

    public ClientBatchACKRequestBody(List<ClientACKRequestBody> list) {
        this(list, C64537PUn.EMPTY);
    }

    public ClientBatchACKRequestBody(List<ClientACKRequestBody> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.ack_list = C63685Oz3.LJFF("ack_list", list);
    }
}
