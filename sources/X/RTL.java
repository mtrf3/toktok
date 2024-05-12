package X;

import com.bytedance.im.core.proto.BroadcastUserCounterResponseBody;
import com.bytedance.im.core.proto.BroadcastUserInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RTL extends ProtoAdapter<BroadcastUserCounterResponseBody> {
    public RTL() {
        super(FieldEncoding.LENGTH_DELIMITED, BroadcastUserCounterResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BroadcastUserCounterResponseBody decode(ProtoReader protoReader) {
        RTM rtm = new RTM();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rtm.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rtm.LIZLLL.add(BroadcastUserInfo.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rtm.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BroadcastUserCounterResponseBody broadcastUserCounterResponseBody) {
        BroadcastUserCounterResponseBody broadcastUserCounterResponseBody2 = broadcastUserCounterResponseBody;
        return broadcastUserCounterResponseBody2.unknownFields().size() + BroadcastUserInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, broadcastUserCounterResponseBody2.infos);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, BroadcastUserCounterResponseBody broadcastUserCounterResponseBody) {
    }
}
