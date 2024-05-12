package X;

import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody;
import com.bytedance.im.core.proto.ParticipantMinIndex;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RSQ extends ProtoAdapter<GetConversationParticipantsMinIndexV3ResponseBody> {
    public RSQ() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationParticipantsMinIndexV3ResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetConversationParticipantsMinIndexV3ResponseBody decode(ProtoReader protoReader) {
        RSR rsr = new RSR();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rsr.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rsr.LIZLLL.add(ParticipantMinIndex.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rsr.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody) {
        GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody2 = getConversationParticipantsMinIndexV3ResponseBody;
        return getConversationParticipantsMinIndexV3ResponseBody2.unknownFields().size() + ParticipantMinIndex.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationParticipantsMinIndexV3ResponseBody2.indexes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody) {
    }
}
