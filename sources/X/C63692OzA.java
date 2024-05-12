package X;

import com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OzA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63692OzA extends ProtoAdapter<BatchGetConversationAuditUnreadRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ BatchGetConversationAuditUnreadRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63692OzA() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchGetConversationAuditUnreadRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchGetConversationAuditUnreadRequestBody batchGetConversationAuditUnreadRequestBody) {
        BatchGetConversationAuditUnreadRequestBody batchGetConversationAuditUnreadRequestBody2 = batchGetConversationAuditUnreadRequestBody;
        return batchGetConversationAuditUnreadRequestBody2.unknownFields().size() + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, batchGetConversationAuditUnreadRequestBody2.conv_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BatchGetConversationAuditUnreadRequestBody batchGetConversationAuditUnreadRequestBody) {
        BatchGetConversationAuditUnreadRequestBody batchGetConversationAuditUnreadRequestBody2 = batchGetConversationAuditUnreadRequestBody;
        ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, batchGetConversationAuditUnreadRequestBody2.conv_short_id);
        protoWriter.writeBytes(batchGetConversationAuditUnreadRequestBody2.unknownFields());
    }
}
