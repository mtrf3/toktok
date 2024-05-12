package X;

import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RSM extends ProtoAdapter<ConversationParticipantReadIndex> {
    public RSM() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationParticipantReadIndex.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationParticipantReadIndex decode(ProtoReader protoReader) {
        RSN rsn = new RSN();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            rsn.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            rsn.LJFF.add(ParticipantReadIndex.ADAPTER.decode(protoReader));
                        }
                    } else {
                        rsn.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rsn.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rsn.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationParticipantReadIndex conversationParticipantReadIndex) {
        ConversationParticipantReadIndex conversationParticipantReadIndex2 = conversationParticipantReadIndex;
        return conversationParticipantReadIndex2.unknownFields().size() + ParticipantReadIndex.ADAPTER.asRepeated().encodedSizeWithTag(3, conversationParticipantReadIndex2.participantReadIndex) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationParticipantReadIndex2.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(1, conversationParticipantReadIndex2.conversation_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationParticipantReadIndex conversationParticipantReadIndex) {
        ConversationParticipantReadIndex conversationParticipantReadIndex2 = conversationParticipantReadIndex;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationParticipantReadIndex2.conversation_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationParticipantReadIndex2.conversation_short_id);
        ParticipantReadIndex.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, conversationParticipantReadIndex2.participantReadIndex);
        protoWriter.writeBytes(conversationParticipantReadIndex2.unknownFields());
    }
}
