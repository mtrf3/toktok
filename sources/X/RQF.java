package X;

import com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQF extends ProtoAdapter<ConversationsPerUserByTopV2RequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ ConversationsPerUserByTopV2RequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RQF() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationsPerUserByTopV2RequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody) {
        ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody2 = conversationsPerUserByTopV2RequestBody;
        return conversationsPerUserByTopV2RequestBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationsPerUserByTopV2RequestBody2.limit) + ProtoAdapter.INT64.encodedSizeWithTag(1, conversationsPerUserByTopV2RequestBody2.cursor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody) {
        ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody2 = conversationsPerUserByTopV2RequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationsPerUserByTopV2RequestBody2.cursor);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationsPerUserByTopV2RequestBody2.limit);
        protoWriter.writeBytes(conversationsPerUserByTopV2RequestBody2.unknownFields());
    }
}
