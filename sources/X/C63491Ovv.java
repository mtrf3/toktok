package X;

import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ovv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63491Ovv extends ProtoAdapter<DeleteStrangerMessageRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ DeleteStrangerMessageRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63491Ovv() {
        super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerMessageRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
        DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody2 = deleteStrangerMessageRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return deleteStrangerMessageRequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, deleteStrangerMessageRequestBody2.conversation_short_id) + protoAdapter.encodedSizeWithTag(1, deleteStrangerMessageRequestBody2.server_message_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
        DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody2 = deleteStrangerMessageRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, deleteStrangerMessageRequestBody2.server_message_id);
        protoAdapter.encodeWithTag(protoWriter, 2, deleteStrangerMessageRequestBody2.conversation_short_id);
        protoWriter.writeBytes(deleteStrangerMessageRequestBody2.unknownFields());
    }
}
