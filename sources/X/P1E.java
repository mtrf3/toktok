package X;

import com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody;
import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P1E extends ProtoAdapter<BatchMarkConversationReadRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ BatchMarkConversationReadRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public P1E() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchMarkConversationReadRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody) {
        BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody2 = batchMarkConversationReadRequestBody;
        return batchMarkConversationReadRequestBody2.unknownFields().size() + MarkConversationReadRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchMarkConversationReadRequestBody2.mark_read_requests);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody) {
        BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody2 = batchMarkConversationReadRequestBody;
        MarkConversationReadRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchMarkConversationReadRequestBody2.mark_read_requests);
        protoWriter.writeBytes(batchMarkConversationReadRequestBody2.unknownFields());
    }
}
