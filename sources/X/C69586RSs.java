package X;

import com.bytedance.im.core.proto.ConversationMessage;
import com.bytedance.im.core.proto.MessageByInitResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RSs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69586RSs extends ProtoAdapter<MessageByInitResponseBody> {
    public C69586RSs() {
        super(FieldEncoding.LENGTH_DELIMITED, MessageByInitResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessageByInitResponseBody decode(ProtoReader protoReader) {
        C69587RSt c69587RSt = new C69587RSt();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69587RSt.LIZLLL.add(ConversationMessage.ADAPTER.decode(protoReader));
                        break;
                    case 2:
                        c69587RSt.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 3:
                        c69587RSt.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        c69587RSt.LJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        c69587RSt.LJII = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        c69587RSt.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c69587RSt.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69587RSt.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessageByInitResponseBody messageByInitResponseBody) {
        MessageByInitResponseBody messageByInitResponseBody2 = messageByInitResponseBody;
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(2, messageByInitResponseBody2.has_more) + ConversationMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, messageByInitResponseBody2.messages);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return messageByInitResponseBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, messageByInitResponseBody2.cmd_index) + protoAdapter.encodedSizeWithTag(5, messageByInitResponseBody2.user_cursor) + protoAdapter.encodedSizeWithTag(4, messageByInitResponseBody2.version) + protoAdapter.encodedSizeWithTag(3, messageByInitResponseBody2.next_init_version) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, MessageByInitResponseBody messageByInitResponseBody) {
    }
}
