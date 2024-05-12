package X;

import com.bytedance.im.core.proto.BlockMembersResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RR4 extends ProtoAdapter<BlockMembersResponseBody> {
    public RR4() {
        super(FieldEncoding.LENGTH_DELIMITED, BlockMembersResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BlockMembersResponseBody decode(ProtoReader protoReader) {
        RR5 rr5 = new RR5();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rr5.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rr5.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rr5.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BlockMembersResponseBody blockMembersResponseBody) {
        BlockMembersResponseBody blockMembersResponseBody2 = blockMembersResponseBody;
        return blockMembersResponseBody2.unknownFields().size() + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, blockMembersResponseBody2.failed_members);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, BlockMembersResponseBody blockMembersResponseBody) {
    }
}
