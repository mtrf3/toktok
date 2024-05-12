package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.RRI;
import X.RRJ;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class CheckMessagePerUserRequestBody extends Message<CheckMessagePerUserRequestBody, RRJ> {
    public static final ProtoAdapter<CheckMessagePerUserRequestBody> ADAPTER = new RRI();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("checks")
    public final List<InboxMessagesPerUser> checks;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<CheckMessagePerUserRequestBody, RRJ> newBuilder2() {
        RRJ rrj = new RRJ();
        rrj.LIZLLL = C63685Oz3.LIZJ("checks", this.checks);
        rrj.addUnknownFields(unknownFields());
        return rrj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<InboxMessagesPerUser> list = this.checks;
        if (list != null && !list.isEmpty()) {
            sb.append(", checks=");
            sb.append(this.checks);
        }
        return DIX.LIZLLL(sb, 0, 2, "CheckMessagePerUserRequestBody{", '}');
    }

    public CheckMessagePerUserRequestBody(List<InboxMessagesPerUser> list) {
        this(list, C64537PUn.EMPTY);
    }

    public CheckMessagePerUserRequestBody(List<InboxMessagesPerUser> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.checks = C63685Oz3.LJFF("checks", list);
    }
}
