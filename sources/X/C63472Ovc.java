package X;

import com.bytedance.im.core.proto.BatchGetMessagesRequestBody;
import com.bytedance.im.core.proto.MessageKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ovc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63472Ovc extends ProtoAdapter<BatchGetMessagesRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ BatchGetMessagesRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63472Ovc() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchGetMessagesRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchGetMessagesRequestBody batchGetMessagesRequestBody) {
        BatchGetMessagesRequestBody batchGetMessagesRequestBody2 = batchGetMessagesRequestBody;
        return batchGetMessagesRequestBody2.unknownFields().size() + MessageKey.ADAPTER.asRepeated().encodedSizeWithTag(1, batchGetMessagesRequestBody2.keys);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BatchGetMessagesRequestBody batchGetMessagesRequestBody) {
        BatchGetMessagesRequestBody batchGetMessagesRequestBody2 = batchGetMessagesRequestBody;
        MessageKey.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchGetMessagesRequestBody2.keys);
        protoWriter.writeBytes(batchGetMessagesRequestBody2.unknownFields());
    }
}
