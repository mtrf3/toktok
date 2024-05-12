package X;

import com.bytedance.im.core.proto.DeleteMultiStrangerConversationResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RR6 extends ProtoAdapter<DeleteMultiStrangerConversationResponseBody> {
    public RR6() {
        super(FieldEncoding.LENGTH_DELIMITED, DeleteMultiStrangerConversationResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final DeleteMultiStrangerConversationResponseBody decode(ProtoReader protoReader) {
        RR7 rr7 = new RR7();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rr7.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rr7.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rr7.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(DeleteMultiStrangerConversationResponseBody deleteMultiStrangerConversationResponseBody) {
        DeleteMultiStrangerConversationResponseBody deleteMultiStrangerConversationResponseBody2 = deleteMultiStrangerConversationResponseBody;
        return deleteMultiStrangerConversationResponseBody2.unknownFields().size() + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, deleteMultiStrangerConversationResponseBody2.failed_conversation_short_ids);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, DeleteMultiStrangerConversationResponseBody deleteMultiStrangerConversationResponseBody) {
    }
}
