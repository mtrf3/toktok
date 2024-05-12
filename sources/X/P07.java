package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P07 extends ProtoAdapter<MessagesPerUserInitV2ResponseBody> {
    public P07() {
        super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserInitV2ResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessagesPerUserInitV2ResponseBody decode(ProtoReader protoReader) {
        P08 p08 = new P08();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        p08.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                        break;
                    case 2:
                        p08.LJ.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                        break;
                    case 3:
                        p08.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        p08.LJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        p08.LJII = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 6:
                        try {
                            p08.LJIIIIZZ = P09.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            p08.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 7:
                        p08.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        p08.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 9:
                        p08.LJIIJJI.add(ProtoAdapter.BYTES.decode(protoReader));
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        p08.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p08.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
        MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody2 = messagesPerUserInitV2ResponseBody;
        int encodedSizeWithTag = ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(2, messagesPerUserInitV2ResponseBody2.conversations) + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesPerUserInitV2ResponseBody2.messages);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return messagesPerUserInitV2ResponseBody2.unknownFields().size() + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(9, messagesPerUserInitV2ResponseBody2.messages_pb) + protoAdapter.encodedSizeWithTag(8, messagesPerUserInitV2ResponseBody2.next_conversation_version) + protoAdapter.encodedSizeWithTag(7, messagesPerUserInitV2ResponseBody2.cmd_start_index) + P09.ADAPTER.encodedSizeWithTag(6, messagesPerUserInitV2ResponseBody2.init_type) + ProtoAdapter.BOOL.encodedSizeWithTag(5, messagesPerUserInitV2ResponseBody2.has_more) + protoAdapter.encodedSizeWithTag(4, messagesPerUserInitV2ResponseBody2.next_cursor) + protoAdapter.encodedSizeWithTag(3, messagesPerUserInitV2ResponseBody2.per_user_cursor) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
    }
}
