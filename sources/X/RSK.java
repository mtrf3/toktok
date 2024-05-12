package X;

import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody;
import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RSK extends ProtoAdapter<BatchGetConversationParticipantsReadIndexResponseBody> {
    public RSK() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchGetConversationParticipantsReadIndexResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BatchGetConversationParticipantsReadIndexResponseBody decode(ProtoReader protoReader) {
        RSL rsl = new RSL();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rsl.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rsl.LIZLLL.add(ConversationParticipantReadIndex.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rsl.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody) {
        BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody2 = batchGetConversationParticipantsReadIndexResponseBody;
        return batchGetConversationParticipantsReadIndexResponseBody2.unknownFields().size() + ConversationParticipantReadIndex.ADAPTER.asRepeated().encodedSizeWithTag(1, batchGetConversationParticipantsReadIndexResponseBody2.conversationParticipantsReadIndex);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody) {
    }
}
