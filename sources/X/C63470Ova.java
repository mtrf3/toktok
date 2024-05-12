package X;

import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ova, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63470Ova extends ProtoAdapter<MessagesInConversationRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ MessagesInConversationRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63470Ova() {
        super(FieldEncoding.LENGTH_DELIMITED, MessagesInConversationRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessagesInConversationRequestBody messagesInConversationRequestBody) {
        MessagesInConversationRequestBody messagesInConversationRequestBody2 = messagesInConversationRequestBody;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, messagesInConversationRequestBody2.conversation_id);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, messagesInConversationRequestBody2.conversation_type) + encodedSizeWithTag;
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        return messagesInConversationRequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, messagesInConversationRequestBody2.limit) + protoAdapter2.encodedSizeWithTag(5, messagesInConversationRequestBody2.anchor_index) + EnumC63513OwH.ADAPTER.encodedSizeWithTag(4, messagesInConversationRequestBody2.direction) + protoAdapter2.encodedSizeWithTag(3, messagesInConversationRequestBody2.conversation_short_id) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessagesInConversationRequestBody messagesInConversationRequestBody) {
        MessagesInConversationRequestBody messagesInConversationRequestBody2 = messagesInConversationRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messagesInConversationRequestBody2.conversation_id);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, messagesInConversationRequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, messagesInConversationRequestBody2.conversation_short_id);
        EnumC63513OwH.ADAPTER.encodeWithTag(protoWriter, 4, messagesInConversationRequestBody2.direction);
        protoAdapter2.encodeWithTag(protoWriter, 5, messagesInConversationRequestBody2.anchor_index);
        protoAdapter.encodeWithTag(protoWriter, 6, messagesInConversationRequestBody2.limit);
        protoWriter.writeBytes(messagesInConversationRequestBody2.unknownFields());
    }
}
