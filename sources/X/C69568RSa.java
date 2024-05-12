package X;

import com.bytedance.im.core.proto.ConversationCheckInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RSa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69568RSa extends ProtoAdapter<ConversationCheckInfo> {
    public C69568RSa() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationCheckInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationCheckInfo decode(ProtoReader protoReader) {
        C69569RSb c69569RSb = new C69569RSb();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c69569RSb.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c69569RSb.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c69569RSb.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69569RSb.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69569RSb.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationCheckInfo conversationCheckInfo) {
        ConversationCheckInfo conversationCheckInfo2 = conversationCheckInfo;
        return conversationCheckInfo2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationCheckInfo2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, conversationCheckInfo2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(1, conversationCheckInfo2.conversation_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationCheckInfo conversationCheckInfo) {
        ConversationCheckInfo conversationCheckInfo2 = conversationCheckInfo;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationCheckInfo2.conversation_short_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, conversationCheckInfo2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationCheckInfo2.conversation_type);
        protoWriter.writeBytes(conversationCheckInfo2.unknownFields());
    }
}
