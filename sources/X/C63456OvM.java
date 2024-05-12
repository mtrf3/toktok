package X;

import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OvM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63456OvM extends ProtoAdapter<DeleteConversationRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ DeleteConversationRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63456OvM() {
        super(FieldEncoding.LENGTH_DELIMITED, DeleteConversationRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(DeleteConversationRequestBody deleteConversationRequestBody) {
        DeleteConversationRequestBody deleteConversationRequestBody2 = deleteConversationRequestBody;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteConversationRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, deleteConversationRequestBody2.conversation_short_id) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return deleteConversationRequestBody2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(6, deleteConversationRequestBody2.badge_count) + protoAdapter.encodedSizeWithTag(5, deleteConversationRequestBody2.last_message_index_v2) + protoAdapter.encodedSizeWithTag(4, deleteConversationRequestBody2.last_message_index) + protoAdapter2.encodedSizeWithTag(3, deleteConversationRequestBody2.conversation_type) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, DeleteConversationRequestBody deleteConversationRequestBody) {
        DeleteConversationRequestBody deleteConversationRequestBody2 = deleteConversationRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteConversationRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, deleteConversationRequestBody2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, deleteConversationRequestBody2.conversation_type);
        protoAdapter.encodeWithTag(protoWriter, 4, deleteConversationRequestBody2.last_message_index);
        protoAdapter.encodeWithTag(protoWriter, 5, deleteConversationRequestBody2.last_message_index_v2);
        protoAdapter2.encodeWithTag(protoWriter, 6, deleteConversationRequestBody2.badge_count);
        protoWriter.writeBytes(deleteConversationRequestBody2.unknownFields());
    }
}
