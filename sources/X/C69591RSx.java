package X;

import com.bytedance.im.core.proto.ConversationMessageSearchRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RSx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69591RSx extends ProtoAdapter<ConversationMessageSearchRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ ConversationMessageSearchRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C69591RSx() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationMessageSearchRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationMessageSearchRequestBody conversationMessageSearchRequestBody) {
        ConversationMessageSearchRequestBody conversationMessageSearchRequestBody2 = conversationMessageSearchRequestBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, conversationMessageSearchRequestBody2.search_query);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        return conversationMessageSearchRequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, conversationMessageSearchRequestBody2.scroll_id) + ProtoAdapter.INT32.encodedSizeWithTag(5, conversationMessageSearchRequestBody2.frag_size) + protoAdapter2.encodedSizeWithTag(4, conversationMessageSearchRequestBody2.end_time) + protoAdapter2.encodedSizeWithTag(3, conversationMessageSearchRequestBody2.start_time) + protoAdapter2.encodedSizeWithTag(2, conversationMessageSearchRequestBody2.conv_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationMessageSearchRequestBody conversationMessageSearchRequestBody) {
        ConversationMessageSearchRequestBody conversationMessageSearchRequestBody2 = conversationMessageSearchRequestBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, conversationMessageSearchRequestBody2.search_query);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, conversationMessageSearchRequestBody2.conv_short_id);
        protoAdapter2.encodeWithTag(protoWriter, 3, conversationMessageSearchRequestBody2.start_time);
        protoAdapter2.encodeWithTag(protoWriter, 4, conversationMessageSearchRequestBody2.end_time);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, conversationMessageSearchRequestBody2.frag_size);
        protoAdapter.encodeWithTag(protoWriter, 6, conversationMessageSearchRequestBody2.scroll_id);
        protoWriter.writeBytes(conversationMessageSearchRequestBody2.unknownFields());
    }
}
