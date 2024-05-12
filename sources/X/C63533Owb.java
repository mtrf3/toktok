package X;

import com.bytedance.im.core.proto.ConvCountReport;
import com.bytedance.im.core.proto.UnReadCountReportRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Owb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63533Owb extends ProtoAdapter<UnReadCountReportRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ UnReadCountReportRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63533Owb() {
        super(FieldEncoding.LENGTH_DELIMITED, UnReadCountReportRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(UnReadCountReportRequestBody unReadCountReportRequestBody) {
        UnReadCountReportRequestBody unReadCountReportRequestBody2 = unReadCountReportRequestBody;
        return unReadCountReportRequestBody2.unknownFields().size() + ConvCountReport.ADAPTER.asRepeated().encodedSizeWithTag(2, unReadCountReportRequestBody2.conv_unread_count) + ProtoAdapter.INT64.encodedSizeWithTag(1, unReadCountReportRequestBody2.total_unread_count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, UnReadCountReportRequestBody unReadCountReportRequestBody) {
        UnReadCountReportRequestBody unReadCountReportRequestBody2 = unReadCountReportRequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, unReadCountReportRequestBody2.total_unread_count);
        ConvCountReport.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, unReadCountReportRequestBody2.conv_unread_count);
        protoWriter.writeBytes(unReadCountReportRequestBody2.unknownFields());
    }
}
