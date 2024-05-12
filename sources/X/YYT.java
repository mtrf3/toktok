package X;

import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYT extends ProtoAdapter<UpdateConversationParticipantResponseBody> {
    public YYT() {
        super(FieldEncoding.LENGTH_DELIMITED, UpdateConversationParticipantResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final UpdateConversationParticipantResponseBody decode(ProtoReader protoReader) {
        YYU yyu = new YYU();
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
                                    yyu.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    yyu.LJII = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                yyu.LJI = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            yyu.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        yyu.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    yyu.LIZLLL = Participant.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return yyu.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody) {
        UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody2 = updateConversationParticipantResponseBody;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, updateConversationParticipantResponseBody2.status) + Participant.ADAPTER.encodedSizeWithTag(1, updateConversationParticipantResponseBody2.participant);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return updateConversationParticipantResponseBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, updateConversationParticipantResponseBody2.check_message) + ProtoAdapter.INT64.encodedSizeWithTag(4, updateConversationParticipantResponseBody2.check_code) + protoAdapter.encodedSizeWithTag(3, updateConversationParticipantResponseBody2.extra_info) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody) {
    }
}
