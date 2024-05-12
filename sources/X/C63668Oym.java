package X;

import com.bytedance.im.core.proto.ClientMetric;
import com.bytedance.im.core.proto.ReportClientMetricsRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Oym, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63668Oym extends ProtoAdapter<ReportClientMetricsRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ ReportClientMetricsRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63668Oym() {
        super(FieldEncoding.LENGTH_DELIMITED, ReportClientMetricsRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ReportClientMetricsRequestBody reportClientMetricsRequestBody) {
        ReportClientMetricsRequestBody reportClientMetricsRequestBody2 = reportClientMetricsRequestBody;
        return reportClientMetricsRequestBody2.unknownFields().size() + ClientMetric.ADAPTER.asRepeated().encodedSizeWithTag(1, reportClientMetricsRequestBody2.report_metrics_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ReportClientMetricsRequestBody reportClientMetricsRequestBody) {
        ReportClientMetricsRequestBody reportClientMetricsRequestBody2 = reportClientMetricsRequestBody;
        ClientMetric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, reportClientMetricsRequestBody2.report_metrics_list);
        protoWriter.writeBytes(reportClientMetricsRequestBody2.unknownFields());
    }
}
