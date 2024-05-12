package X;

import com.bytedance.im.core.proto.DeleteMultiStrangerConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQ7 extends ProtoAdapter<DeleteMultiStrangerConversationRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ DeleteMultiStrangerConversationRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RQ7() {
        super(FieldEncoding.LENGTH_DELIMITED, DeleteMultiStrangerConversationRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(DeleteMultiStrangerConversationRequestBody deleteMultiStrangerConversationRequestBody) {
        DeleteMultiStrangerConversationRequestBody deleteMultiStrangerConversationRequestBody2 = deleteMultiStrangerConversationRequestBody;
        return deleteMultiStrangerConversationRequestBody2.unknownFields().size() + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, deleteMultiStrangerConversationRequestBody2.conversation_short_ids);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, DeleteMultiStrangerConversationRequestBody deleteMultiStrangerConversationRequestBody) {
        DeleteMultiStrangerConversationRequestBody deleteMultiStrangerConversationRequestBody2 = deleteMultiStrangerConversationRequestBody;
        ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, deleteMultiStrangerConversationRequestBody2.conversation_short_ids);
        protoWriter.writeBytes(deleteMultiStrangerConversationRequestBody2.unknownFields());
    }
}
