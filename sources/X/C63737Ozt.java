package X;

import com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ozt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63737Ozt extends ProtoAdapter<ConversationAddParticipantsRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ ConversationAddParticipantsRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63737Ozt() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationAddParticipantsRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody) {
        ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody2 = conversationAddParticipantsRequestBody;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, conversationAddParticipantsRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return conversationAddParticipantsRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(5, conversationAddParticipantsRequestBody2.biz_ext) + protoAdapter.asRepeated().encodedSizeWithTag(4, conversationAddParticipantsRequestBody2.participants) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationAddParticipantsRequestBody2.conversation_type) + protoAdapter.encodedSizeWithTag(2, conversationAddParticipantsRequestBody2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody) {
        ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody2 = conversationAddParticipantsRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationAddParticipantsRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, conversationAddParticipantsRequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationAddParticipantsRequestBody2.conversation_type);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, conversationAddParticipantsRequestBody2.participants);
        this.LJ.encodeWithTag(protoWriter, 5, conversationAddParticipantsRequestBody2.biz_ext);
        protoWriter.writeBytes(conversationAddParticipantsRequestBody2.unknownFields());
    }
}
