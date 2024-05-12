package X;

import com.bytedance.im.core.proto.GetMessagesRequestBody;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OvL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63455OvL extends ProtoAdapter<GetMessagesRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetMessagesRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63455OvL() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessagesRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessagesRequestBody getMessagesRequestBody) {
        GetMessagesRequestBody getMessagesRequestBody2 = getMessagesRequestBody;
        return getMessagesRequestBody2.unknownFields().size() + MessageIDIndexEntry.ADAPTER.asRepeated().encodedSizeWithTag(4, getMessagesRequestBody2.entries) + ProtoAdapter.INT64.encodedSizeWithTag(3, getMessagesRequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessagesRequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, getMessagesRequestBody2.conversation_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetMessagesRequestBody getMessagesRequestBody) {
        GetMessagesRequestBody getMessagesRequestBody2 = getMessagesRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessagesRequestBody2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessagesRequestBody2.conversation_type);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getMessagesRequestBody2.conversation_short_id);
        MessageIDIndexEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getMessagesRequestBody2.entries);
        protoWriter.writeBytes(getMessagesRequestBody2.unknownFields());
    }
}
