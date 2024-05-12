package X;

import com.bytedance.im.core.proto.ConversationParticipantsListRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ovg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63476Ovg extends ProtoAdapter<ConversationParticipantsListRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ ConversationParticipantsListRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63476Ovg() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationParticipantsListRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationParticipantsListRequestBody conversationParticipantsListRequestBody) {
        ConversationParticipantsListRequestBody conversationParticipantsListRequestBody2 = conversationParticipantsListRequestBody;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, conversationParticipantsListRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, conversationParticipantsListRequestBody2.conversation_short_id) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return conversationParticipantsListRequestBody2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(5, conversationParticipantsListRequestBody2.limit) + protoAdapter.encodedSizeWithTag(4, conversationParticipantsListRequestBody2.cursor) + protoAdapter2.encodedSizeWithTag(3, conversationParticipantsListRequestBody2.conversation_type) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationParticipantsListRequestBody conversationParticipantsListRequestBody) {
        ConversationParticipantsListRequestBody conversationParticipantsListRequestBody2 = conversationParticipantsListRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationParticipantsListRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, conversationParticipantsListRequestBody2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, conversationParticipantsListRequestBody2.conversation_type);
        protoAdapter.encodeWithTag(protoWriter, 4, conversationParticipantsListRequestBody2.cursor);
        protoAdapter2.encodeWithTag(protoWriter, 5, conversationParticipantsListRequestBody2.limit);
        protoWriter.writeBytes(conversationParticipantsListRequestBody2.unknownFields());
    }
}
