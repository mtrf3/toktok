package X;

import com.bytedance.im.core.proto.BlockMembersRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RT3 extends ProtoAdapter<BlockMembersRequestBody> {
    public final ProtoAdapter<java.util.Map<Long, Long>> LJ;
    public final ProtoAdapter<java.util.Map<String, String>> LJFF;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ BlockMembersRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RT3() {
        super(FieldEncoding.LENGTH_DELIMITED, BlockMembersRequestBody.class);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        this.LJFF = ProtoAdapter.newMapAdapter(protoAdapter2, protoAdapter2);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BlockMembersRequestBody blockMembersRequestBody) {
        BlockMembersRequestBody blockMembersRequestBody2 = blockMembersRequestBody;
        return blockMembersRequestBody2.unknownFields().size() + this.LJFF.encodedSizeWithTag(11, blockMembersRequestBody2.biz_ext) + ProtoAdapter.STRING.encodedSizeWithTag(5, blockMembersRequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(4, blockMembersRequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, blockMembersRequestBody2.conv_short_id) + this.LJ.encodedSizeWithTag(2, blockMembersRequestBody2.block_time) + EnumC63751P0h.ADAPTER.encodedSizeWithTag(1, blockMembersRequestBody2.block_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BlockMembersRequestBody blockMembersRequestBody) {
        BlockMembersRequestBody blockMembersRequestBody2 = blockMembersRequestBody;
        EnumC63751P0h.ADAPTER.encodeWithTag(protoWriter, 1, blockMembersRequestBody2.block_status);
        this.LJ.encodeWithTag(protoWriter, 2, blockMembersRequestBody2.block_time);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, blockMembersRequestBody2.conv_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, blockMembersRequestBody2.conversation_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, blockMembersRequestBody2.conversation_id);
        this.LJFF.encodeWithTag(protoWriter, 11, blockMembersRequestBody2.biz_ext);
        protoWriter.writeBytes(blockMembersRequestBody2.unknownFields());
    }
}
