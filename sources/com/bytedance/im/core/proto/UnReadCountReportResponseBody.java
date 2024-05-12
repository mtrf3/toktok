package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63685Oz3;
import X.C64537PUn;
import X.C69554RRm;
import X.C69555RRn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class UnReadCountReportResponseBody extends Message<UnReadCountReportResponseBody, C69555RRn> {
    public static final ProtoAdapter<UnReadCountReportResponseBody> ADAPTER = new C69554RRm();
    public static final Boolean DEFAULT_SET_TOTAL_STATUS = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("failed_conv_list")
    public final List<Long> failed_conv_list;

    @InterfaceC65349Pkn("set_total_status")
    public final Boolean set_total_status;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<UnReadCountReportResponseBody, C69555RRn> newBuilder2() {
        C69555RRn c69555RRn = new C69555RRn();
        c69555RRn.LIZLLL = this.set_total_status;
        c69555RRn.LJ = C63685Oz3.LIZJ("failed_conv_list", this.failed_conv_list);
        c69555RRn.addUnknownFields(unknownFields());
        return c69555RRn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", set_total_status=");
        LIZJ.append(this.set_total_status);
        List<Long> list = this.failed_conv_list;
        if (list != null && !list.isEmpty()) {
            LIZJ.append(", failed_conv_list=");
            LIZJ.append(this.failed_conv_list);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "UnReadCountReportResponseBody{", '}');
    }

    public UnReadCountReportResponseBody(Boolean bool, List<Long> list) {
        this(bool, list, C64537PUn.EMPTY);
    }

    public UnReadCountReportResponseBody(Boolean bool, List<Long> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.set_total_status = bool;
        this.failed_conv_list = C63685Oz3.LJFF("failed_conv_list", list);
    }
}
