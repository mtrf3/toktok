package X;

import com.bytedance.im.core.proto.RecallMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RR2 extends ProtoAdapter<RecallMessageRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ RecallMessageRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RR2() {
        super(FieldEncoding.LENGTH_DELIMITED, RecallMessageRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RecallMessageRequestBody recallMessageRequestBody) {
        RecallMessageRequestBody recallMessageRequestBody2 = recallMessageRequestBody;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, recallMessageRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return recallMessageRequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, recallMessageRequestBody2.server_message_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, recallMessageRequestBody2.conversation_type) + protoAdapter.encodedSizeWithTag(2, recallMessageRequestBody2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RecallMessageRequestBody recallMessageRequestBody) {
        RecallMessageRequestBody recallMessageRequestBody2 = recallMessageRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recallMessageRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, recallMessageRequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, recallMessageRequestBody2.conversation_type);
        protoAdapter.encodeWithTag(protoWriter, 4, recallMessageRequestBody2.server_message_id);
        protoWriter.writeBytes(recallMessageRequestBody2.unknownFields());
    }
}
