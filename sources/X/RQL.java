package X;

import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQL extends ProtoAdapter<BatchGetConversationParticipantsReadIndexRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ BatchGetConversationParticipantsReadIndexRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RQL() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchGetConversationParticipantsReadIndexRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody) {
        BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody2 = batchGetConversationParticipantsReadIndexRequestBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return batchGetConversationParticipantsReadIndexRequestBody2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(4, batchGetConversationParticipantsReadIndexRequestBody2.min_index_required) + protoAdapter.encodedSizeWithTag(3, batchGetConversationParticipantsReadIndexRequestBody2.request_from) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, batchGetConversationParticipantsReadIndexRequestBody2.conversation_short_id) + protoAdapter.asRepeated().encodedSizeWithTag(1, batchGetConversationParticipantsReadIndexRequestBody2.conversation_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody) {
        BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody2 = batchGetConversationParticipantsReadIndexRequestBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, batchGetConversationParticipantsReadIndexRequestBody2.conversation_id);
        ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, batchGetConversationParticipantsReadIndexRequestBody2.conversation_short_id);
        protoAdapter.encodeWithTag(protoWriter, 3, batchGetConversationParticipantsReadIndexRequestBody2.request_from);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, batchGetConversationParticipantsReadIndexRequestBody2.min_index_required);
        protoWriter.writeBytes(batchGetConversationParticipantsReadIndexRequestBody2.unknownFields());
    }
}
