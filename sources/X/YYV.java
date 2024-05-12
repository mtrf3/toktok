package X;

import com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody;
import com.bytedance.im.core.proto.SecUidPair;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYV extends ProtoAdapter<ConversationRemoveParticipantsResponseBody> {
    public YYV() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationRemoveParticipantsResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationRemoveParticipantsResponseBody decode(ProtoReader protoReader) {
        YYW yyw = new YYW();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        yyw.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 2:
                        yyw.LJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        yyw.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        yyw.LJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        yyw.LJII = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        yyw.LJIIIIZZ.add(SecUidPair.ADAPTER.decode(protoReader));
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        yyw.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return yyw.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody) {
        ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody2 = conversationRemoveParticipantsResponseBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, conversationRemoveParticipantsResponseBody2.status) + protoAdapter.asRepeated().encodedSizeWithTag(1, conversationRemoveParticipantsResponseBody2.failed_participants);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return conversationRemoveParticipantsResponseBody2.unknownFields().size() + SecUidPair.ADAPTER.asRepeated().encodedSizeWithTag(6, conversationRemoveParticipantsResponseBody2.failed_sec_participants) + protoAdapter2.encodedSizeWithTag(5, conversationRemoveParticipantsResponseBody2.check_message) + protoAdapter.encodedSizeWithTag(4, conversationRemoveParticipantsResponseBody2.check_code) + protoAdapter2.encodedSizeWithTag(3, conversationRemoveParticipantsResponseBody2.extra_info) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody) {
    }
}
