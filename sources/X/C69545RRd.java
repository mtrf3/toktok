package X;

import com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69545RRd extends ProtoAdapter<MarkMsgUnreadCountReportRequestBody> {
    public final ProtoAdapter<java.util.Map<Long, Long>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ MarkMsgUnreadCountReportRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C69545RRd() {
        super(FieldEncoding.LENGTH_DELIMITED, MarkMsgUnreadCountReportRequestBody.class);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody) {
        MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody2 = markMsgUnreadCountReportRequestBody;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, markMsgUnreadCountReportRequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, markMsgUnreadCountReportRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return markMsgUnreadCountReportRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(5, markMsgUnreadCountReportRequestBody2.tag_unread_count) + protoAdapter.encodedSizeWithTag(4, markMsgUnreadCountReportRequestBody2.total_unread_count) + protoAdapter.encodedSizeWithTag(3, markMsgUnreadCountReportRequestBody2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody) {
        MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody2 = markMsgUnreadCountReportRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markMsgUnreadCountReportRequestBody2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markMsgUnreadCountReportRequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, markMsgUnreadCountReportRequestBody2.conversation_short_id);
        protoAdapter.encodeWithTag(protoWriter, 4, markMsgUnreadCountReportRequestBody2.total_unread_count);
        this.LJ.encodeWithTag(protoWriter, 5, markMsgUnreadCountReportRequestBody2.tag_unread_count);
        protoWriter.writeBytes(markMsgUnreadCountReportRequestBody2.unknownFields());
    }
}
