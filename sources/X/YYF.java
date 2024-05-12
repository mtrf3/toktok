package X;

import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYF extends ProtoAdapter<GetMessageInfoByIndexV2RangeRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetMessageInfoByIndexV2RangeRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public YYF() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessageInfoByIndexV2RangeRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody) {
        GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody2 = getMessageInfoByIndexV2RangeRequestBody;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageInfoByIndexV2RangeRequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageInfoByIndexV2RangeRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return getMessageInfoByIndexV2RangeRequestBody2.unknownFields().size() + EnumC63513OwH.ADAPTER.encodedSizeWithTag(6, getMessageInfoByIndexV2RangeRequestBody2.direction) + protoAdapter.encodedSizeWithTag(5, getMessageInfoByIndexV2RangeRequestBody2.max_index_in_conversation_v2) + protoAdapter.encodedSizeWithTag(4, getMessageInfoByIndexV2RangeRequestBody2.min_index_in_conversation_v2) + protoAdapter.encodedSizeWithTag(3, getMessageInfoByIndexV2RangeRequestBody2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody) {
        GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody2 = getMessageInfoByIndexV2RangeRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageInfoByIndexV2RangeRequestBody2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageInfoByIndexV2RangeRequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, getMessageInfoByIndexV2RangeRequestBody2.conversation_short_id);
        protoAdapter.encodeWithTag(protoWriter, 4, getMessageInfoByIndexV2RangeRequestBody2.min_index_in_conversation_v2);
        protoAdapter.encodeWithTag(protoWriter, 5, getMessageInfoByIndexV2RangeRequestBody2.max_index_in_conversation_v2);
        EnumC63513OwH.ADAPTER.encodeWithTag(protoWriter, 6, getMessageInfoByIndexV2RangeRequestBody2.direction);
        protoWriter.writeBytes(getMessageInfoByIndexV2RangeRequestBody2.unknownFields());
    }
}
