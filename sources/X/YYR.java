package X;

import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.UpdateConversationParticipantResult;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYR extends ProtoAdapter<UpdateConversationParticipantResult> {
    public YYR() {
        super(FieldEncoding.LENGTH_DELIMITED, UpdateConversationParticipantResult.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final UpdateConversationParticipantResult decode(ProtoReader protoReader) {
        YYS yys = new YYS();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    yys.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    yys.LJII = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                yys.LJI = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            yys.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        yys.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    yys.LIZLLL = Participant.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return yys.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(UpdateConversationParticipantResult updateConversationParticipantResult) {
        UpdateConversationParticipantResult updateConversationParticipantResult2 = updateConversationParticipantResult;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, updateConversationParticipantResult2.status) + Participant.ADAPTER.encodedSizeWithTag(1, updateConversationParticipantResult2.participant);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return updateConversationParticipantResult2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, updateConversationParticipantResult2.check_message) + ProtoAdapter.INT64.encodedSizeWithTag(4, updateConversationParticipantResult2.check_code) + protoAdapter.encodedSizeWithTag(3, updateConversationParticipantResult2.extra_info) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, UpdateConversationParticipantResult updateConversationParticipantResult) {
        UpdateConversationParticipantResult updateConversationParticipantResult2 = updateConversationParticipantResult;
        Participant.ADAPTER.encodeWithTag(protoWriter, 1, updateConversationParticipantResult2.participant);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, updateConversationParticipantResult2.status);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, updateConversationParticipantResult2.extra_info);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, updateConversationParticipantResult2.check_code);
        protoAdapter.encodeWithTag(protoWriter, 5, updateConversationParticipantResult2.check_message);
        protoWriter.writeBytes(updateConversationParticipantResult2.unknownFields());
    }
}
