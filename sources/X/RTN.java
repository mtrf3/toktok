package X;

import com.bytedance.im.core.proto.BroadcastUserInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RTN extends ProtoAdapter<BroadcastUserInfo> {
    public RTN() {
        super(FieldEncoding.LENGTH_DELIMITED, BroadcastUserInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BroadcastUserInfo decode(ProtoReader protoReader) {
        RTO rto = new RTO();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            rto.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            rto.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        rto.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rto.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rto.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BroadcastUserInfo broadcastUserInfo) {
        BroadcastUserInfo broadcastUserInfo2 = broadcastUserInfo;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, broadcastUserInfo2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return broadcastUserInfo2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, broadcastUserInfo2.conversation_type) + protoAdapter.encodedSizeWithTag(2, broadcastUserInfo2.counter) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BroadcastUserInfo broadcastUserInfo) {
        BroadcastUserInfo broadcastUserInfo2 = broadcastUserInfo;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, broadcastUserInfo2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, broadcastUserInfo2.counter);
        protoAdapter.encodeWithTag(protoWriter, 3, broadcastUserInfo2.conversation_type);
        protoWriter.writeBytes(broadcastUserInfo2.unknownFields());
    }
}
