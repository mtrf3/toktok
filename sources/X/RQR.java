package X;

import com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQR extends ProtoAdapter<MarkMsgGetUnreadCountRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ MarkMsgGetUnreadCountRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RQR() {
        super(FieldEncoding.LENGTH_DELIMITED, MarkMsgGetUnreadCountRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody) {
        MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody2 = markMsgGetUnreadCountRequestBody;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, markMsgGetUnreadCountRequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, markMsgGetUnreadCountRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return markMsgGetUnreadCountRequestBody2.unknownFields().size() + protoAdapter.asRepeated().encodedSizeWithTag(5, markMsgGetUnreadCountRequestBody2.tags) + ProtoAdapter.BOOL.encodedSizeWithTag(4, markMsgGetUnreadCountRequestBody2.get_total) + protoAdapter.encodedSizeWithTag(3, markMsgGetUnreadCountRequestBody2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody) {
        MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody2 = markMsgGetUnreadCountRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markMsgGetUnreadCountRequestBody2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markMsgGetUnreadCountRequestBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, markMsgGetUnreadCountRequestBody2.conversation_short_id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, markMsgGetUnreadCountRequestBody2.get_total);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, markMsgGetUnreadCountRequestBody2.tags);
        protoWriter.writeBytes(markMsgGetUnreadCountRequestBody2.unknownFields());
    }
}
