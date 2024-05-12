package X;

import com.bytedance.im.core.proto.UnReadCountReportResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69554RRm extends ProtoAdapter<UnReadCountReportResponseBody> {
    public C69554RRm() {
        super(FieldEncoding.LENGTH_DELIMITED, UnReadCountReportResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final UnReadCountReportResponseBody decode(ProtoReader protoReader) {
        C69555RRn c69555RRn = new C69555RRn();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c69555RRn.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c69555RRn.LJ.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    c69555RRn.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69555RRn.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(UnReadCountReportResponseBody unReadCountReportResponseBody) {
        UnReadCountReportResponseBody unReadCountReportResponseBody2 = unReadCountReportResponseBody;
        return unReadCountReportResponseBody2.unknownFields().size() + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, unReadCountReportResponseBody2.failed_conv_list) + ProtoAdapter.BOOL.encodedSizeWithTag(1, unReadCountReportResponseBody2.set_total_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, UnReadCountReportResponseBody unReadCountReportResponseBody) {
    }
}
