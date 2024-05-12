package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ConversationMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RS2 extends ProtoAdapter<ConversationMessage> {
    public RS2() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationMessage.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationMessage decode(ProtoReader protoReader) {
        RS3 rs3 = new RS3();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        rs3.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        rs3.LJ.add(MessageBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    rs3.LIZLLL = ConversationInfoV2.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rs3.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationMessage conversationMessage) {
        ConversationMessage conversationMessage2 = conversationMessage;
        return conversationMessage2.unknownFields().size() + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(2, conversationMessage2.messages) + ConversationInfoV2.ADAPTER.encodedSizeWithTag(1, conversationMessage2.conversations);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationMessage conversationMessage) {
        ConversationMessage conversationMessage2 = conversationMessage;
        ConversationInfoV2.ADAPTER.encodeWithTag(protoWriter, 1, conversationMessage2.conversations);
        MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, conversationMessage2.messages);
        protoWriter.writeBytes(conversationMessage2.unknownFields());
    }
}
