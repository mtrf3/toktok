package X;

import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0F extends ProtoAdapter<MessagesPerUserResponseBody> {
    public P0F() {
        super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessagesPerUserResponseBody decode(ProtoReader protoReader) {
        P0G p0g = new P0G();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        p0g.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                        break;
                    case 2:
                        p0g.LJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        p0g.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 4:
                        p0g.LJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        p0g.LJII = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        p0g.LJIIIIZZ.add(ConversationBadgeCountInfo.ADAPTER.decode(protoReader));
                        break;
                    case 7:
                        p0g.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        p0g.LJIIJ.add(ProtoAdapter.BYTES.decode(protoReader));
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        p0g.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p0g.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessagesPerUserResponseBody messagesPerUserResponseBody) {
        MessagesPerUserResponseBody messagesPerUserResponseBody2 = messagesPerUserResponseBody;
        int encodedSizeWithTag = MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesPerUserResponseBody2.messages);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return messagesPerUserResponseBody2.unknownFields().size() + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(8, messagesPerUserResponseBody2.messages_pb) + protoAdapter.encodedSizeWithTag(7, messagesPerUserResponseBody2.next_cmd_index) + ConversationBadgeCountInfo.ADAPTER.asRepeated().encodedSizeWithTag(6, messagesPerUserResponseBody2.conversation_badge_count) + protoAdapter.encodedSizeWithTag(5, messagesPerUserResponseBody2.next_conversation_version) + protoAdapter.encodedSizeWithTag(4, messagesPerUserResponseBody2.next_interval) + ProtoAdapter.BOOL.encodedSizeWithTag(3, messagesPerUserResponseBody2.has_more) + protoAdapter.encodedSizeWithTag(2, messagesPerUserResponseBody2.next_cursor) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, MessagesPerUserResponseBody messagesPerUserResponseBody) {
    }
}
