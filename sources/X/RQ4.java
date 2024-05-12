package X;

import com.bytedance.im.core.proto.GetStrangerMessagesRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQ4 extends ProtoAdapter<GetStrangerMessagesRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetStrangerMessagesRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RQ4() {
        super(FieldEncoding.LENGTH_DELIMITED, GetStrangerMessagesRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetStrangerMessagesRequestBody getStrangerMessagesRequestBody) {
        GetStrangerMessagesRequestBody getStrangerMessagesRequestBody2 = getStrangerMessagesRequestBody;
        return getStrangerMessagesRequestBody2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(2, getStrangerMessagesRequestBody2.reset_unread_count) + ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerMessagesRequestBody2.conversation_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetStrangerMessagesRequestBody getStrangerMessagesRequestBody) {
        GetStrangerMessagesRequestBody getStrangerMessagesRequestBody2 = getStrangerMessagesRequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getStrangerMessagesRequestBody2.conversation_short_id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getStrangerMessagesRequestBody2.reset_unread_count);
        protoWriter.writeBytes(getStrangerMessagesRequestBody2.unknownFields());
    }
}
