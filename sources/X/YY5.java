package X;

import com.bytedance.im.core.proto.PullMarkMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YY5 extends ProtoAdapter<PullMarkMessageRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ PullMarkMessageRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public YY5() {
        super(FieldEncoding.LENGTH_DELIMITED, PullMarkMessageRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(PullMarkMessageRequestBody pullMarkMessageRequestBody) {
        PullMarkMessageRequestBody pullMarkMessageRequestBody2 = pullMarkMessageRequestBody;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, pullMarkMessageRequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, pullMarkMessageRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, pullMarkMessageRequestBody2.limit) + protoAdapter.encodedSizeWithTag(4, pullMarkMessageRequestBody2.cursor) + protoAdapter.encodedSizeWithTag(3, pullMarkMessageRequestBody2.conversation_short_id) + encodedSizeWithTag;
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        return pullMarkMessageRequestBody2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(9, pullMarkMessageRequestBody2.clear_unread_count) + protoAdapter.encodedSizeWithTag(8, pullMarkMessageRequestBody2.tag) + EnumC87558YXy.ADAPTER.encodedSizeWithTag(7, pullMarkMessageRequestBody2.action_type) + protoAdapter2.encodedSizeWithTag(6, pullMarkMessageRequestBody2.asc) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, PullMarkMessageRequestBody pullMarkMessageRequestBody) {
        PullMarkMessageRequestBody pullMarkMessageRequestBody2 = pullMarkMessageRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullMarkMessageRequestBody2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pullMarkMessageRequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, pullMarkMessageRequestBody2.conversation_short_id);
        protoAdapter.encodeWithTag(protoWriter, 4, pullMarkMessageRequestBody2.cursor);
        protoAdapter.encodeWithTag(protoWriter, 5, pullMarkMessageRequestBody2.limit);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 6, pullMarkMessageRequestBody2.asc);
        EnumC87558YXy.ADAPTER.encodeWithTag(protoWriter, 7, pullMarkMessageRequestBody2.action_type);
        protoAdapter.encodeWithTag(protoWriter, 8, pullMarkMessageRequestBody2.tag);
        protoAdapter2.encodeWithTag(protoWriter, 9, pullMarkMessageRequestBody2.clear_unread_count);
        protoWriter.writeBytes(pullMarkMessageRequestBody2.unknownFields());
    }
}
