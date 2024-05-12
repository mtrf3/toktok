package X;

import com.bytedance.im.core.proto.BlockConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RT5 extends ProtoAdapter<BlockConversationRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ BlockConversationRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RT5() {
        super(FieldEncoding.LENGTH_DELIMITED, BlockConversationRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BlockConversationRequestBody blockConversationRequestBody) {
        BlockConversationRequestBody blockConversationRequestBody2 = blockConversationRequestBody;
        return blockConversationRequestBody2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(5, blockConversationRequestBody2.block_normal_only) + EnumC63751P0h.ADAPTER.encodedSizeWithTag(4, blockConversationRequestBody2.block_status) + ProtoAdapter.INT32.encodedSizeWithTag(3, blockConversationRequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, blockConversationRequestBody2.conv_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(1, blockConversationRequestBody2.conversation_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BlockConversationRequestBody blockConversationRequestBody) {
        BlockConversationRequestBody blockConversationRequestBody2 = blockConversationRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, blockConversationRequestBody2.conversation_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, blockConversationRequestBody2.conv_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, blockConversationRequestBody2.conversation_type);
        EnumC63751P0h.ADAPTER.encodeWithTag(protoWriter, 4, blockConversationRequestBody2.block_status);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, blockConversationRequestBody2.block_normal_only);
        protoWriter.writeBytes(blockConversationRequestBody2.unknownFields());
    }
}
