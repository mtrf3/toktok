package X;

import com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YY3 extends ProtoAdapter<BatchUnmarkMessageRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ BatchUnmarkMessageRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public YY3() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchUnmarkMessageRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody) {
        BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody2 = batchUnmarkMessageRequestBody;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, batchUnmarkMessageRequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, batchUnmarkMessageRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return batchUnmarkMessageRequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, batchUnmarkMessageRequestBody2.tag) + EnumC87558YXy.ADAPTER.encodedSizeWithTag(5, batchUnmarkMessageRequestBody2.action_type) + protoAdapter.asRepeated().encodedSizeWithTag(4, batchUnmarkMessageRequestBody2.server_message_ids) + protoAdapter.encodedSizeWithTag(3, batchUnmarkMessageRequestBody2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody) {
        BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody2 = batchUnmarkMessageRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, batchUnmarkMessageRequestBody2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, batchUnmarkMessageRequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, batchUnmarkMessageRequestBody2.conversation_short_id);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, batchUnmarkMessageRequestBody2.server_message_ids);
        EnumC87558YXy.ADAPTER.encodeWithTag(protoWriter, 5, batchUnmarkMessageRequestBody2.action_type);
        protoAdapter.encodeWithTag(protoWriter, 6, batchUnmarkMessageRequestBody2.tag);
        protoWriter.writeBytes(batchUnmarkMessageRequestBody2.unknownFields());
    }
}
