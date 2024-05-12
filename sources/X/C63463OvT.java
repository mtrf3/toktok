package X;

import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OvT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63463OvT extends ProtoAdapter<MarkConversationReadRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ MarkConversationReadRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63463OvT() {
        super(FieldEncoding.LENGTH_DELIMITED, MarkConversationReadRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MarkConversationReadRequestBody markConversationReadRequestBody) {
        MarkConversationReadRequestBody markConversationReadRequestBody2 = markConversationReadRequestBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, markConversationReadRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, markConversationReadRequestBody2.conversation_short_id) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        return markConversationReadRequestBody2.unknownFields().size() + protoAdapter3.encodedSizeWithTag(11, markConversationReadRequestBody2.read_badge_count_v2) + protoAdapter2.encodedSizeWithTag(10, markConversationReadRequestBody2.server_message_id) + protoAdapter.encodedSizeWithTag(9, markConversationReadRequestBody2.ticket) + protoAdapter3.encodedSizeWithTag(8, markConversationReadRequestBody2.read_badge_count) + protoAdapter2.encodedSizeWithTag(7, markConversationReadRequestBody2.read_message_index_v2) + protoAdapter2.encodedSizeWithTag(6, markConversationReadRequestBody2.total_unread_count) + protoAdapter2.encodedSizeWithTag(5, markConversationReadRequestBody2.conv_unread_count) + protoAdapter2.encodedSizeWithTag(4, markConversationReadRequestBody2.read_message_index) + protoAdapter3.encodedSizeWithTag(3, markConversationReadRequestBody2.conversation_type) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MarkConversationReadRequestBody markConversationReadRequestBody) {
        MarkConversationReadRequestBody markConversationReadRequestBody2 = markConversationReadRequestBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, markConversationReadRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, markConversationReadRequestBody2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 3, markConversationReadRequestBody2.conversation_type);
        protoAdapter2.encodeWithTag(protoWriter, 4, markConversationReadRequestBody2.read_message_index);
        protoAdapter2.encodeWithTag(protoWriter, 5, markConversationReadRequestBody2.conv_unread_count);
        protoAdapter2.encodeWithTag(protoWriter, 6, markConversationReadRequestBody2.total_unread_count);
        protoAdapter2.encodeWithTag(protoWriter, 7, markConversationReadRequestBody2.read_message_index_v2);
        protoAdapter3.encodeWithTag(protoWriter, 8, markConversationReadRequestBody2.read_badge_count);
        protoAdapter.encodeWithTag(protoWriter, 9, markConversationReadRequestBody2.ticket);
        protoAdapter2.encodeWithTag(protoWriter, 10, markConversationReadRequestBody2.server_message_id);
        protoAdapter3.encodeWithTag(protoWriter, 11, markConversationReadRequestBody2.read_badge_count_v2);
        protoWriter.writeBytes(markConversationReadRequestBody2.unknownFields());
    }
}
