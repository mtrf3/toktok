package X;

import com.bytedance.im.core.proto.MarkMultiStrangerConversationReadResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RR8 extends ProtoAdapter<MarkMultiStrangerConversationReadResponseBody> {
    public RR8() {
        super(FieldEncoding.LENGTH_DELIMITED, MarkMultiStrangerConversationReadResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MarkMultiStrangerConversationReadResponseBody decode(ProtoReader protoReader) {
        RR9 rr9 = new RR9();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rr9.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rr9.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rr9.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MarkMultiStrangerConversationReadResponseBody markMultiStrangerConversationReadResponseBody) {
        MarkMultiStrangerConversationReadResponseBody markMultiStrangerConversationReadResponseBody2 = markMultiStrangerConversationReadResponseBody;
        return markMultiStrangerConversationReadResponseBody2.unknownFields().size() + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, markMultiStrangerConversationReadResponseBody2.failed_conversation_short_ids);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, MarkMultiStrangerConversationReadResponseBody markMultiStrangerConversationReadResponseBody) {
    }
}
