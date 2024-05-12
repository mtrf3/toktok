package X;

import com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69552RRk extends ProtoAdapter<MarkMsgUnreadCountReportResponseBody> {
    public C69552RRk() {
        super(FieldEncoding.LENGTH_DELIMITED, MarkMsgUnreadCountReportResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MarkMsgUnreadCountReportResponseBody decode(ProtoReader protoReader) {
        C69553RRl c69553RRl = new C69553RRl();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c69553RRl.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c69553RRl.LJ.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    c69553RRl.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69553RRl.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody) {
        MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody2 = markMsgUnreadCountReportResponseBody;
        return markMsgUnreadCountReportResponseBody2.unknownFields().size() + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, markMsgUnreadCountReportResponseBody2.failed_tag_list) + ProtoAdapter.BOOL.encodedSizeWithTag(1, markMsgUnreadCountReportResponseBody2.set_total_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody) {
    }
}
