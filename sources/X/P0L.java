package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.StrangerConversation;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0L extends ProtoAdapter<StrangerConversation> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    public P0L() {
        super(FieldEncoding.LENGTH_DELIMITED, StrangerConversation.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final StrangerConversation decode(ProtoReader protoReader) {
        P0M p0m = new P0M();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        p0m.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        p0m.LJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        p0m.LJFF = MessageBody.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        p0m.LJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        p0m.LJII.add(Participant.ADAPTER.decode(protoReader));
                        break;
                    case 6:
                        p0m.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        p0m.LJIIIZ.putAll(this.LJ.decode(protoReader));
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        p0m.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p0m.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(StrangerConversation strangerConversation) {
        StrangerConversation strangerConversation2 = strangerConversation;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, strangerConversation2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return strangerConversation2.unknownFields().size() + this.LJ.encodedSizeWithTag(7, strangerConversation2.ext) + protoAdapter.encodedSizeWithTag(6, strangerConversation2.badge_count) + Participant.ADAPTER.asRepeated().encodedSizeWithTag(5, strangerConversation2.participants) + ProtoAdapter.STRING.encodedSizeWithTag(4, strangerConversation2.conversation_id) + MessageBody.ADAPTER.encodedSizeWithTag(3, strangerConversation2.last_message) + protoAdapter.encodedSizeWithTag(2, strangerConversation2.unread) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, StrangerConversation strangerConversation) {
        StrangerConversation strangerConversation2 = strangerConversation;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, strangerConversation2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, strangerConversation2.unread);
        MessageBody.ADAPTER.encodeWithTag(protoWriter, 3, strangerConversation2.last_message);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, strangerConversation2.conversation_id);
        Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, strangerConversation2.participants);
        protoAdapter.encodeWithTag(protoWriter, 6, strangerConversation2.badge_count);
        this.LJ.encodeWithTag(protoWriter, 7, strangerConversation2.ext);
        protoWriter.writeBytes(strangerConversation2.unknownFields());
    }
}
