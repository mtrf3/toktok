package com.bytedance.im.core.proto;

import X.C63667Oyl;
import X.C63668Oym;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class ReportClientMetricsRequestBody extends Message<ReportClientMetricsRequestBody, C63667Oyl> {
    public static final ProtoAdapter<ReportClientMetricsRequestBody> ADAPTER = new C63668Oym();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("report_metrics_list")
    public final List<ClientMetric> report_metrics_list;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ReportClientMetricsRequestBody, C63667Oyl> newBuilder2() {
        C63667Oyl c63667Oyl = new C63667Oyl();
        c63667Oyl.LIZLLL = C63685Oz3.LIZJ("report_metrics_list", this.report_metrics_list);
        c63667Oyl.addUnknownFields(unknownFields());
        return c63667Oyl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ClientMetric> list = this.report_metrics_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", report_metrics_list=");
            sb.append(this.report_metrics_list);
        }
        return DIX.LIZLLL(sb, 0, 2, "ReportClientMetricsRequestBody{", '}');
    }

    public ReportClientMetricsRequestBody(List<ClientMetric> list) {
        this(list, C64537PUn.EMPTY);
    }

    public ReportClientMetricsRequestBody(List<ClientMetric> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.report_metrics_list = C63685Oz3.LJFF("report_metrics_list", list);
    }
}
