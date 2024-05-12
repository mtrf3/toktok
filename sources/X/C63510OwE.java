package X;

import com.bytedance.im.core.proto.BatchDeleteConversationRequestBody;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OwE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63510OwE extends ProtoAdapter<BatchDeleteConversationRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ BatchDeleteConversationRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63510OwE() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchDeleteConversationRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchDeleteConversationRequestBody batchDeleteConversationRequestBody) {
        BatchDeleteConversationRequestBody batchDeleteConversationRequestBody2 = batchDeleteConversationRequestBody;
        return batchDeleteConversationRequestBody2.unknownFields().size() + DeleteConversationRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchDeleteConversationRequestBody2.delete_requests);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BatchDeleteConversationRequestBody batchDeleteConversationRequestBody) {
        BatchDeleteConversationRequestBody batchDeleteConversationRequestBody2 = batchDeleteConversationRequestBody;
        DeleteConversationRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchDeleteConversationRequestBody2.delete_requests);
        protoWriter.writeBytes(batchDeleteConversationRequestBody2.unknownFields());
    }
}
