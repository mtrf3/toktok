package X;

import com.bytedance.im.core.proto.MessagesPerUserPaginationInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRQ extends ProtoAdapter<MessagesPerUserPaginationInfo> {
    public RRQ() {
        super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserPaginationInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessagesPerUserPaginationInfo decode(ProtoReader protoReader) {
        RRR rrr = new RRR();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        rrr.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        rrr.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rrr.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rrr.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessagesPerUserPaginationInfo messagesPerUserPaginationInfo) {
        MessagesPerUserPaginationInfo messagesPerUserPaginationInfo2 = messagesPerUserPaginationInfo;
        return messagesPerUserPaginationInfo2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, messagesPerUserPaginationInfo2.limit) + ProtoAdapter.INT64.encodedSizeWithTag(1, messagesPerUserPaginationInfo2.cursor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessagesPerUserPaginationInfo messagesPerUserPaginationInfo) {
        MessagesPerUserPaginationInfo messagesPerUserPaginationInfo2 = messagesPerUserPaginationInfo;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messagesPerUserPaginationInfo2.cursor);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messagesPerUserPaginationInfo2.limit);
        protoWriter.writeBytes(messagesPerUserPaginationInfo2.unknownFields());
    }
}
