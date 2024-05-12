package X;

import com.bytedance.im.core.proto.GetMessageByIdRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ovi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63478Ovi extends ProtoAdapter<GetMessageByIdRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetMessageByIdRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63478Ovi() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessageByIdRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessageByIdRequestBody getMessageByIdRequestBody) {
        GetMessageByIdRequestBody getMessageByIdRequestBody2 = getMessageByIdRequestBody;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageByIdRequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageByIdRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return getMessageByIdRequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, getMessageByIdRequestBody2.server_message_id) + protoAdapter.encodedSizeWithTag(3, getMessageByIdRequestBody2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetMessageByIdRequestBody getMessageByIdRequestBody) {
        GetMessageByIdRequestBody getMessageByIdRequestBody2 = getMessageByIdRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageByIdRequestBody2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageByIdRequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, getMessageByIdRequestBody2.conversation_short_id);
        protoAdapter.encodeWithTag(protoWriter, 4, getMessageByIdRequestBody2.server_message_id);
        protoWriter.writeBytes(getMessageByIdRequestBody2.unknownFields());
    }
}
