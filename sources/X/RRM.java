package X;

import com.bytedance.im.core.proto.ConversationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRM extends ProtoAdapter<ConversationRequest> {
    public RRM() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationRequest.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationRequest decode(ProtoReader protoReader) {
        RRN rrn = new RRN();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        rrn.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        rrn.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rrn.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rrn.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationRequest conversationRequest) {
        ConversationRequest conversationRequest2 = conversationRequest;
        return conversationRequest2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationRequest2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(1, conversationRequest2.conversation_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationRequest conversationRequest) {
        ConversationRequest conversationRequest2 = conversationRequest;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationRequest2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationRequest2.conversation_type);
        protoWriter.writeBytes(conversationRequest2.unknownFields());
    }
}
