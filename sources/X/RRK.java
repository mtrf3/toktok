package X;

import com.bytedance.im.core.proto.InboxMessagesPerUser;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRK extends ProtoAdapter<InboxMessagesPerUser> {
    public RRK() {
        super(FieldEncoding.LENGTH_DELIMITED, InboxMessagesPerUser.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final InboxMessagesPerUser decode(ProtoReader protoReader) {
        RRL rrl = new RRL();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        rrl.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        rrl.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rrl.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rrl.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(InboxMessagesPerUser inboxMessagesPerUser) {
        InboxMessagesPerUser inboxMessagesPerUser2 = inboxMessagesPerUser;
        return inboxMessagesPerUser2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(2, inboxMessagesPerUser2.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(1, inboxMessagesPerUser2.inbox_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, InboxMessagesPerUser inboxMessagesPerUser) {
        InboxMessagesPerUser inboxMessagesPerUser2 = inboxMessagesPerUser;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, inboxMessagesPerUser2.inbox_type);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, inboxMessagesPerUser2.cursor);
        protoWriter.writeBytes(inboxMessagesPerUser2.unknownFields());
    }
}
