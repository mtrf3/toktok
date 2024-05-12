package X;

import com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ovx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63493Ovx extends ProtoAdapter<DeleteStrangerConversationRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ DeleteStrangerConversationRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63493Ovx() {
        super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerConversationRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody) {
        DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody2 = deleteStrangerConversationRequestBody;
        return deleteStrangerConversationRequestBody2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(1, deleteStrangerConversationRequestBody2.conversation_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody) {
        DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody2 = deleteStrangerConversationRequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, deleteStrangerConversationRequestBody2.conversation_short_id);
        protoWriter.writeBytes(deleteStrangerConversationRequestBody2.unknownFields());
    }
}
