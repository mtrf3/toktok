package X;

import com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRC extends ProtoAdapter<ConversationMessagePreViewRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ ConversationMessagePreViewRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RRC() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationMessagePreViewRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody) {
        ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody2 = conversationMessagePreViewRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return conversationMessagePreViewRequestBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(4, conversationMessagePreViewRequestBody2.inbox_type) + protoAdapter.encodedSizeWithTag(3, conversationMessagePreViewRequestBody2.conversation_index) + protoAdapter.encodedSizeWithTag(2, conversationMessagePreViewRequestBody2.message_id) + protoAdapter.encodedSizeWithTag(1, conversationMessagePreViewRequestBody2.conv_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody) {
        ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody2 = conversationMessagePreViewRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, conversationMessagePreViewRequestBody2.conv_short_id);
        protoAdapter.encodeWithTag(protoWriter, 2, conversationMessagePreViewRequestBody2.message_id);
        protoAdapter.encodeWithTag(protoWriter, 3, conversationMessagePreViewRequestBody2.conversation_index);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, conversationMessagePreViewRequestBody2.inbox_type);
        protoWriter.writeBytes(conversationMessagePreViewRequestBody2.unknownFields());
    }
}
