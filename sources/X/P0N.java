package X;

import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0N extends ProtoAdapter<ConversationRecentMessage> {
    public P0N() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationRecentMessage.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationRecentMessage decode(ProtoReader protoReader) {
        P0O p0o = new P0O();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        p0o.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        p0o.LJ.add(MessageBody.ADAPTER.decode(protoReader));
                        break;
                    case 3:
                        p0o.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        p0o.LJI = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        p0o.LJII = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        p0o.LJIIIIZZ.add(MessageBody.ADAPTER.decode(protoReader));
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        p0o.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p0o.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationRecentMessage conversationRecentMessage) {
        ConversationRecentMessage conversationRecentMessage2 = conversationRecentMessage;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, conversationRecentMessage2.conversation_short_id);
        ProtoAdapter<MessageBody> protoAdapter2 = MessageBody.ADAPTER;
        return conversationRecentMessage2.unknownFields().size() + protoAdapter2.asRepeated().encodedSizeWithTag(6, conversationRecentMessage2.ext_messages) + ProtoAdapter.STRING.encodedSizeWithTag(5, conversationRecentMessage2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(4, conversationRecentMessage2.badge_count) + protoAdapter.encodedSizeWithTag(3, conversationRecentMessage2.version) + protoAdapter2.asRepeated().encodedSizeWithTag(2, conversationRecentMessage2.messages) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationRecentMessage conversationRecentMessage) {
        ConversationRecentMessage conversationRecentMessage2 = conversationRecentMessage;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, conversationRecentMessage2.conversation_short_id);
        ProtoAdapter<MessageBody> protoAdapter2 = MessageBody.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, conversationRecentMessage2.messages);
        protoAdapter.encodeWithTag(protoWriter, 3, conversationRecentMessage2.version);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, conversationRecentMessage2.badge_count);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, conversationRecentMessage2.conversation_id);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, conversationRecentMessage2.ext_messages);
        protoWriter.writeBytes(conversationRecentMessage2.unknownFields());
    }
}
