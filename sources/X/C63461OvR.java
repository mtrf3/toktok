package X;

import com.bytedance.im.core.proto.MessageKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OvR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63461OvR extends ProtoAdapter<MessageKey> {
    public C63461OvR() {
        super(FieldEncoding.LENGTH_DELIMITED, MessageKey.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessageKey decode(ProtoReader protoReader) {
        C63460OvQ c63460OvQ = new C63460OvQ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c63460OvQ.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c63460OvQ.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c63460OvQ.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c63460OvQ.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63460OvQ.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessageKey messageKey) {
        MessageKey messageKey2 = messageKey;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, messageKey2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return messageKey2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, messageKey2.server_message_id) + protoAdapter.encodedSizeWithTag(2, messageKey2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessageKey messageKey) {
        MessageKey messageKey2 = messageKey;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageKey2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, messageKey2.conversation_short_id);
        protoAdapter.encodeWithTag(protoWriter, 3, messageKey2.server_message_id);
        protoWriter.writeBytes(messageKey2.unknownFields());
    }
}
