package X;

import com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYD extends ProtoAdapter<PreviewerMessagesInConversationRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ PreviewerMessagesInConversationRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public YYD() {
        super(FieldEncoding.LENGTH_DELIMITED, PreviewerMessagesInConversationRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody) {
        PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody2 = previewerMessagesInConversationRequestBody;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, previewerMessagesInConversationRequestBody2.conversation_id);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, previewerMessagesInConversationRequestBody2.conversation_type) + encodedSizeWithTag;
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        return previewerMessagesInConversationRequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, previewerMessagesInConversationRequestBody2.limit) + protoAdapter2.encodedSizeWithTag(5, previewerMessagesInConversationRequestBody2.anchor_index) + EnumC63513OwH.ADAPTER.encodedSizeWithTag(4, previewerMessagesInConversationRequestBody2.direction) + protoAdapter2.encodedSizeWithTag(3, previewerMessagesInConversationRequestBody2.conversation_short_id) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody) {
        PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody2 = previewerMessagesInConversationRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, previewerMessagesInConversationRequestBody2.conversation_id);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, previewerMessagesInConversationRequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, previewerMessagesInConversationRequestBody2.conversation_short_id);
        EnumC63513OwH.ADAPTER.encodeWithTag(protoWriter, 4, previewerMessagesInConversationRequestBody2.direction);
        protoAdapter2.encodeWithTag(protoWriter, 5, previewerMessagesInConversationRequestBody2.anchor_index);
        protoAdapter.encodeWithTag(protoWriter, 6, previewerMessagesInConversationRequestBody2.limit);
        protoWriter.writeBytes(previewerMessagesInConversationRequestBody2.unknownFields());
    }
}
