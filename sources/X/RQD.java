package X;

import com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQD extends ProtoAdapter<ConversationsPerUserByFavoriteV2RequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ ConversationsPerUserByFavoriteV2RequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RQD() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationsPerUserByFavoriteV2RequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody) {
        ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody2 = conversationsPerUserByFavoriteV2RequestBody;
        return conversationsPerUserByFavoriteV2RequestBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationsPerUserByFavoriteV2RequestBody2.limit) + ProtoAdapter.INT64.encodedSizeWithTag(1, conversationsPerUserByFavoriteV2RequestBody2.cursor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody) {
        ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody2 = conversationsPerUserByFavoriteV2RequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationsPerUserByFavoriteV2RequestBody2.cursor);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationsPerUserByFavoriteV2RequestBody2.limit);
        protoWriter.writeBytes(conversationsPerUserByFavoriteV2RequestBody2.unknownFields());
    }
}
