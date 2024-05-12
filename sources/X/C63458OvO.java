package X;

import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OvO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63458OvO extends ProtoAdapter<DeleteMessageRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ DeleteMessageRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63458OvO() {
        super(FieldEncoding.LENGTH_DELIMITED, DeleteMessageRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(DeleteMessageRequestBody deleteMessageRequestBody) {
        DeleteMessageRequestBody deleteMessageRequestBody2 = deleteMessageRequestBody;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteMessageRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return deleteMessageRequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, deleteMessageRequestBody2.message_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, deleteMessageRequestBody2.conversation_type) + protoAdapter.encodedSizeWithTag(2, deleteMessageRequestBody2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, DeleteMessageRequestBody deleteMessageRequestBody) {
        DeleteMessageRequestBody deleteMessageRequestBody2 = deleteMessageRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteMessageRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, deleteMessageRequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, deleteMessageRequestBody2.conversation_type);
        protoAdapter.encodeWithTag(protoWriter, 4, deleteMessageRequestBody2.message_id);
        protoWriter.writeBytes(deleteMessageRequestBody2.unknownFields());
    }
}
