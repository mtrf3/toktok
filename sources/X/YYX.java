package X;

import com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody;
import com.bytedance.im.core.proto.SecUidPair;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYX extends ProtoAdapter<ConversationAddParticipantsResponseBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;
    public final ProtoAdapter<java.util.Map<String, String>> LJFF;

    public YYX() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationAddParticipantsResponseBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        this.LJFF = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationAddParticipantsResponseBody decode(ProtoReader protoReader) {
        YYY yyy = new YYY();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        yyy.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 2:
                        yyy.LJ.add(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 3:
                        yyy.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        yyy.LJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        yyy.LJII = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        yyy.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        yyy.LJIIIZ.add(SecUidPair.ADAPTER.decode(protoReader));
                        break;
                    case 8:
                        yyy.LJIIJ.add(SecUidPair.ADAPTER.decode(protoReader));
                        break;
                    case 9:
                        yyy.LJIIJJI.putAll(this.LJ.decode(protoReader));
                        break;
                    case 10:
                        yyy.LJIIL.putAll(this.LJFF.decode(protoReader));
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        yyy.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return yyy.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) {
        ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody2 = conversationAddParticipantsResponseBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(3, conversationAddParticipantsResponseBody2.status) + protoAdapter.asRepeated().encodedSizeWithTag(2, conversationAddParticipantsResponseBody2.failed_participants) + protoAdapter.asRepeated().encodedSizeWithTag(1, conversationAddParticipantsResponseBody2.success_participants);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(6, conversationAddParticipantsResponseBody2.check_message) + protoAdapter.encodedSizeWithTag(5, conversationAddParticipantsResponseBody2.check_code) + protoAdapter2.encodedSizeWithTag(4, conversationAddParticipantsResponseBody2.extra_info) + encodedSizeWithTag;
        ProtoAdapter<SecUidPair> protoAdapter3 = SecUidPair.ADAPTER;
        return conversationAddParticipantsResponseBody2.unknownFields().size() + this.LJFF.encodedSizeWithTag(10, conversationAddParticipantsResponseBody2.ext) + this.LJ.encodedSizeWithTag(9, conversationAddParticipantsResponseBody2.biz_ext) + protoAdapter3.asRepeated().encodedSizeWithTag(8, conversationAddParticipantsResponseBody2.sec_failed_participants) + protoAdapter3.asRepeated().encodedSizeWithTag(7, conversationAddParticipantsResponseBody2.sec_success_participants) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) {
    }
}
