package X;

import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQP extends ProtoAdapter<GetMessageInfoByIndexV2RequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetMessageInfoByIndexV2RequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RQP() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessageInfoByIndexV2RequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody) {
        GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody2 = getMessageInfoByIndexV2RequestBody;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageInfoByIndexV2RequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageInfoByIndexV2RequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return getMessageInfoByIndexV2RequestBody2.unknownFields().size() + protoAdapter.asRepeated().encodedSizeWithTag(4, getMessageInfoByIndexV2RequestBody2.index_in_conversation_v2) + protoAdapter.encodedSizeWithTag(3, getMessageInfoByIndexV2RequestBody2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody) {
        GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody2 = getMessageInfoByIndexV2RequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageInfoByIndexV2RequestBody2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageInfoByIndexV2RequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, getMessageInfoByIndexV2RequestBody2.conversation_short_id);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, getMessageInfoByIndexV2RequestBody2.index_in_conversation_v2);
        protoWriter.writeBytes(getMessageInfoByIndexV2RequestBody2.unknownFields());
    }
}
