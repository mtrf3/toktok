package X;

import com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ozu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63738Ozu extends ProtoAdapter<ConversationRemoveParticipantsRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ ConversationRemoveParticipantsRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63738Ozu() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationRemoveParticipantsRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody) {
        ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody2 = conversationRemoveParticipantsRequestBody;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, conversationRemoveParticipantsRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return conversationRemoveParticipantsRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(5, conversationRemoveParticipantsRequestBody2.biz_ext) + protoAdapter.asRepeated().encodedSizeWithTag(4, conversationRemoveParticipantsRequestBody2.participants) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationRemoveParticipantsRequestBody2.conversation_type) + protoAdapter.encodedSizeWithTag(2, conversationRemoveParticipantsRequestBody2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody) {
        ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody2 = conversationRemoveParticipantsRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationRemoveParticipantsRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, conversationRemoveParticipantsRequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationRemoveParticipantsRequestBody2.conversation_type);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, conversationRemoveParticipantsRequestBody2.participants);
        this.LJ.encodeWithTag(protoWriter, 5, conversationRemoveParticipantsRequestBody2.biz_ext);
        protoWriter.writeBytes(conversationRemoveParticipantsRequestBody2.unknownFields());
    }
}
