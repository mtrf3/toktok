package X;

import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OvN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63457OvN extends ProtoAdapter<GetMessagesCheckInfoInConversationRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetMessagesCheckInfoInConversationRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63457OvN() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessagesCheckInfoInConversationRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody) {
        GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody2 = getMessagesCheckInfoInConversationRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(5, getMessagesCheckInfoInConversationRequestBody2.conversation_id) + protoAdapter.encodedSizeWithTag(2, getMessagesCheckInfoInConversationRequestBody2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return getMessagesCheckInfoInConversationRequestBody2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(4, getMessagesCheckInfoInConversationRequestBody2.expect_msg_total_count) + protoAdapter.encodedSizeWithTag(7, getMessagesCheckInfoInConversationRequestBody2.cursor_reverse_end) + protoAdapter.encodedSizeWithTag(3, getMessagesCheckInfoInConversationRequestBody2.cursor_reverse_begin) + protoAdapter2.encodedSizeWithTag(6, getMessagesCheckInfoInConversationRequestBody2.conversation_type) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody) {
        GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody2 = getMessagesCheckInfoInConversationRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, getMessagesCheckInfoInConversationRequestBody2.conversation_short_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getMessagesCheckInfoInConversationRequestBody2.conversation_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 6, getMessagesCheckInfoInConversationRequestBody2.conversation_type);
        protoAdapter.encodeWithTag(protoWriter, 3, getMessagesCheckInfoInConversationRequestBody2.cursor_reverse_begin);
        protoAdapter.encodeWithTag(protoWriter, 7, getMessagesCheckInfoInConversationRequestBody2.cursor_reverse_end);
        protoAdapter2.encodeWithTag(protoWriter, 4, getMessagesCheckInfoInConversationRequestBody2.expect_msg_total_count);
        protoWriter.writeBytes(getMessagesCheckInfoInConversationRequestBody2.unknownFields());
    }
}
