package X;

import com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69548RRg extends ProtoAdapter<BatchUpdateConversationParticipantRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ BatchUpdateConversationParticipantRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C69548RRg() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchUpdateConversationParticipantRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody) {
        BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody2 = batchUpdateConversationParticipantRequestBody;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, batchUpdateConversationParticipantRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, batchUpdateConversationParticipantRequestBody2.conversation_short_id) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return batchUpdateConversationParticipantRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(6, batchUpdateConversationParticipantRequestBody2.biz_ext) + protoAdapter2.encodedSizeWithTag(5, batchUpdateConversationParticipantRequestBody2.role) + protoAdapter.asRepeated().encodedSizeWithTag(4, batchUpdateConversationParticipantRequestBody2.participants) + protoAdapter2.encodedSizeWithTag(3, batchUpdateConversationParticipantRequestBody2.conversation_type) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody) {
        BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody2 = batchUpdateConversationParticipantRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, batchUpdateConversationParticipantRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, batchUpdateConversationParticipantRequestBody2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, batchUpdateConversationParticipantRequestBody2.conversation_type);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, batchUpdateConversationParticipantRequestBody2.participants);
        protoAdapter2.encodeWithTag(protoWriter, 5, batchUpdateConversationParticipantRequestBody2.role);
        this.LJ.encodeWithTag(protoWriter, 6, batchUpdateConversationParticipantRequestBody2.biz_ext);
        protoWriter.writeBytes(batchUpdateConversationParticipantRequestBody2.unknownFields());
    }
}
