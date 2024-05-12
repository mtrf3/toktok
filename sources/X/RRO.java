package X;

import com.bytedance.im.core.proto.BroadcastUserCounterRequestBody;
import com.bytedance.im.core.proto.ConversationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRO extends ProtoAdapter<BroadcastUserCounterRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ BroadcastUserCounterRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RRO() {
        super(FieldEncoding.LENGTH_DELIMITED, BroadcastUserCounterRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BroadcastUserCounterRequestBody broadcastUserCounterRequestBody) {
        BroadcastUserCounterRequestBody broadcastUserCounterRequestBody2 = broadcastUserCounterRequestBody;
        return broadcastUserCounterRequestBody2.unknownFields().size() + ConversationRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, broadcastUserCounterRequestBody2.conversations);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BroadcastUserCounterRequestBody broadcastUserCounterRequestBody) {
        BroadcastUserCounterRequestBody broadcastUserCounterRequestBody2 = broadcastUserCounterRequestBody;
        ConversationRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, broadcastUserCounterRequestBody2.conversations);
        protoWriter.writeBytes(broadcastUserCounterRequestBody2.unknownFields());
    }
}
