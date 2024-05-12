package com.bytedance.im.core.proto;

import X.C120574oH;
import X.C63533Owb;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class UnReadCountReportRequestBody extends Message<UnReadCountReportRequestBody, C120574oH> {
    public static final ProtoAdapter<UnReadCountReportRequestBody> ADAPTER = new C63533Owb();
    public static final Long DEFAULT_TOTAL_UNREAD_COUNT = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conv_unread_count")
    public final List<ConvCountReport> conv_unread_count;

    @InterfaceC65349Pkn("total_unread_count")
    public final Long total_unread_count;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<UnReadCountReportRequestBody, C120574oH> newBuilder2() {
        C120574oH c120574oH = new C120574oH();
        c120574oH.LIZLLL = this.total_unread_count;
        c120574oH.LJ = C63685Oz3.LIZJ("conv_unread_count", this.conv_unread_count);
        c120574oH.addUnknownFields(unknownFields());
        return c120574oH;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.total_unread_count != null) {
            sb.append(", total_unread_count=");
            sb.append(this.total_unread_count);
        }
        List<ConvCountReport> list = this.conv_unread_count;
        if (list != null && !list.isEmpty()) {
            sb.append(", conv_unread_count=");
            sb.append(this.conv_unread_count);
        }
        return DIX.LIZLLL(sb, 0, 2, "UnReadCountReportRequestBody{", '}');
    }

    public UnReadCountReportRequestBody(Long l, List<ConvCountReport> list) {
        this(l, list, C64537PUn.EMPTY);
    }

    public UnReadCountReportRequestBody(Long l, List<ConvCountReport> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.total_unread_count = l;
        this.conv_unread_count = C63685Oz3.LJFF("conv_unread_count", list);
    }
}
