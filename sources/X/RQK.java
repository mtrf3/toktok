package X;

import com.bytedance.im.core.proto.DissolveConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQK extends ProtoAdapter<DissolveConversationRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ DissolveConversationRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RQK() {
        super(FieldEncoding.LENGTH_DELIMITED, DissolveConversationRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(DissolveConversationRequestBody dissolveConversationRequestBody) {
        DissolveConversationRequestBody dissolveConversationRequestBody2 = dissolveConversationRequestBody;
        return dissolveConversationRequestBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(3, dissolveConversationRequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, dissolveConversationRequestBody2.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(1, dissolveConversationRequestBody2.conversation_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, DissolveConversationRequestBody dissolveConversationRequestBody) {
        DissolveConversationRequestBody dissolveConversationRequestBody2 = dissolveConversationRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dissolveConversationRequestBody2.conversation_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, dissolveConversationRequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, dissolveConversationRequestBody2.conversation_type);
        protoWriter.writeBytes(dissolveConversationRequestBody2.unknownFields());
    }
}
