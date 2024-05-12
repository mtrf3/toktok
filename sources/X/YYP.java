package X;

import com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantResult;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYP extends ProtoAdapter<BatchUpdateConversationParticipantResponseBody> {
    public YYP() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchUpdateConversationParticipantResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BatchUpdateConversationParticipantResponseBody decode(ProtoReader protoReader) {
        YYQ yyq = new YYQ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            yyq.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            yyq.LJFF.add(ProtoAdapter.INT64.decode(protoReader));
                        }
                    } else {
                        yyq.LJ.add(UpdateConversationParticipantResult.ADAPTER.decode(protoReader));
                    }
                } else {
                    yyq.LIZLLL.add(UpdateConversationParticipantResult.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return yyq.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody) {
        BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody2 = batchUpdateConversationParticipantResponseBody;
        ProtoAdapter<UpdateConversationParticipantResult> protoAdapter = UpdateConversationParticipantResult.ADAPTER;
        return batchUpdateConversationParticipantResponseBody2.unknownFields().size() + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(3, batchUpdateConversationParticipantResponseBody2.failed_participants) + protoAdapter.asRepeated().encodedSizeWithTag(2, batchUpdateConversationParticipantResponseBody2.callback_failed_participants) + protoAdapter.asRepeated().encodedSizeWithTag(1, batchUpdateConversationParticipantResponseBody2.success_participants);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody) {
    }
}
