package X;

import com.bytedance.im.core.proto.AckMessage;
import com.bytedance.im.core.proto.BatchAckMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OyJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63639OyJ extends ProtoAdapter<BatchAckMessageRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ BatchAckMessageRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63639OyJ() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchAckMessageRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchAckMessageRequestBody batchAckMessageRequestBody) {
        BatchAckMessageRequestBody batchAckMessageRequestBody2 = batchAckMessageRequestBody;
        return batchAckMessageRequestBody2.unknownFields().size() + AckMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, batchAckMessageRequestBody2.ack_msgs);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BatchAckMessageRequestBody batchAckMessageRequestBody) {
        BatchAckMessageRequestBody batchAckMessageRequestBody2 = batchAckMessageRequestBody;
        AckMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchAckMessageRequestBody2.ack_msgs);
        protoWriter.writeBytes(batchAckMessageRequestBody2.unknownFields());
    }
}
