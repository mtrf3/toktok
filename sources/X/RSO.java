package X;

import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RSO extends ProtoAdapter<GetConversationParticipantsReadIndexV3ResponseBody> {
    public RSO() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationParticipantsReadIndexV3ResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetConversationParticipantsReadIndexV3ResponseBody decode(ProtoReader protoReader) {
        RSP rsp = new RSP();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rsp.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rsp.LIZLLL.add(ParticipantReadIndex.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rsp.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody) {
        GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody2 = getConversationParticipantsReadIndexV3ResponseBody;
        return getConversationParticipantsReadIndexV3ResponseBody2.unknownFields().size() + ParticipantReadIndex.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationParticipantsReadIndexV3ResponseBody2.indexes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody) {
    }
}
