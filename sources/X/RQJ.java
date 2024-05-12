package X;

import com.bytedance.im.core.proto.ConversationLeaveRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQJ extends ProtoAdapter<ConversationLeaveRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ ConversationLeaveRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RQJ() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationLeaveRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationLeaveRequestBody conversationLeaveRequestBody) {
        ConversationLeaveRequestBody conversationLeaveRequestBody2 = conversationLeaveRequestBody;
        return conversationLeaveRequestBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationLeaveRequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationLeaveRequestBody2.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(1, conversationLeaveRequestBody2.conversation_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationLeaveRequestBody conversationLeaveRequestBody) {
        ConversationLeaveRequestBody conversationLeaveRequestBody2 = conversationLeaveRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationLeaveRequestBody2.conversation_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationLeaveRequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationLeaveRequestBody2.conversation_type);
        protoWriter.writeBytes(conversationLeaveRequestBody2.unknownFields());
    }
}
