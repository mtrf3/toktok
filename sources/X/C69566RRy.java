package X;

import com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69566RRy extends ProtoAdapter<ConversationMessagePreViewResponseBody> {
    public C69566RRy() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationMessagePreViewResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationMessagePreViewResponseBody decode(ProtoReader protoReader) {
        C69567RRz c69567RRz = new C69567RRz();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    c69567RRz.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    c69567RRz.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69567RRz.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody) {
        ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody2 = conversationMessagePreViewResponseBody;
        return conversationMessagePreViewResponseBody2.unknownFields().size() + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, conversationMessagePreViewResponseBody2.message_result);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody) {
    }
}
