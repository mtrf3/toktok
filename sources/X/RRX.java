package X;

import com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRX extends ProtoAdapter<BatchGetConversationAuditUnreadResponseBody> {
    public final ProtoAdapter<java.util.Map<Long, Long>> LJ;

    public RRX() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchGetConversationAuditUnreadResponseBody.class);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BatchGetConversationAuditUnreadResponseBody decode(ProtoReader protoReader) {
        RRY rry = new RRY();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rry.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rry.LIZLLL.putAll(this.LJ.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rry.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchGetConversationAuditUnreadResponseBody batchGetConversationAuditUnreadResponseBody) {
        BatchGetConversationAuditUnreadResponseBody batchGetConversationAuditUnreadResponseBody2 = batchGetConversationAuditUnreadResponseBody;
        return batchGetConversationAuditUnreadResponseBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(1, batchGetConversationAuditUnreadResponseBody2.unread_count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, BatchGetConversationAuditUnreadResponseBody batchGetConversationAuditUnreadResponseBody) {
    }
}
