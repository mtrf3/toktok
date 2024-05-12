package X;

import com.bytedance.im.core.proto.MarkMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YY7 extends ProtoAdapter<MarkMessageRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ MarkMessageRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public YY7() {
        super(FieldEncoding.LENGTH_DELIMITED, MarkMessageRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MarkMessageRequestBody markMessageRequestBody) {
        MarkMessageRequestBody markMessageRequestBody2 = markMessageRequestBody;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, markMessageRequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, markMessageRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return markMessageRequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(8, markMessageRequestBody2.tag) + protoAdapter.encodedSizeWithTag(7, markMessageRequestBody2.sort_time) + EnumC87558YXy.ADAPTER.encodedSizeWithTag(6, markMessageRequestBody2.action_type) + ProtoAdapter.BOOL.encodedSizeWithTag(5, markMessageRequestBody2.do_action) + protoAdapter.encodedSizeWithTag(4, markMessageRequestBody2.server_message_id) + protoAdapter.encodedSizeWithTag(3, markMessageRequestBody2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MarkMessageRequestBody markMessageRequestBody) {
        MarkMessageRequestBody markMessageRequestBody2 = markMessageRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markMessageRequestBody2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markMessageRequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, markMessageRequestBody2.conversation_short_id);
        protoAdapter.encodeWithTag(protoWriter, 4, markMessageRequestBody2.server_message_id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, markMessageRequestBody2.do_action);
        EnumC87558YXy.ADAPTER.encodeWithTag(protoWriter, 6, markMessageRequestBody2.action_type);
        protoAdapter.encodeWithTag(protoWriter, 7, markMessageRequestBody2.sort_time);
        protoAdapter.encodeWithTag(protoWriter, 8, markMessageRequestBody2.tag);
        protoWriter.writeBytes(markMessageRequestBody2.unknownFields());
    }
}
