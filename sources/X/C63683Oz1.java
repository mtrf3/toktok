package X;

import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Oz1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63683Oz1 extends ProtoAdapter<MessageIDIndexEntry> {
    public C63683Oz1() {
        super(FieldEncoding.LENGTH_DELIMITED, MessageIDIndexEntry.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessageIDIndexEntry decode(ProtoReader protoReader) {
        C63684Oz2 c63684Oz2 = new C63684Oz2();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63684Oz2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c63684Oz2.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c63684Oz2.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63684Oz2.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessageIDIndexEntry messageIDIndexEntry) {
        MessageIDIndexEntry messageIDIndexEntry2 = messageIDIndexEntry;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return messageIDIndexEntry2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, messageIDIndexEntry2.index_in_conversation) + protoAdapter.encodedSizeWithTag(1, messageIDIndexEntry2.server_message_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessageIDIndexEntry messageIDIndexEntry) {
        MessageIDIndexEntry messageIDIndexEntry2 = messageIDIndexEntry;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, messageIDIndexEntry2.server_message_id);
        protoAdapter.encodeWithTag(protoWriter, 2, messageIDIndexEntry2.index_in_conversation);
        protoWriter.writeBytes(messageIDIndexEntry2.unknownFields());
    }
}
