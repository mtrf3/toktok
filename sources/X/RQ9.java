package X;

import com.bytedance.im.core.proto.MarkMultiStrangerConversationReadRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQ9 extends ProtoAdapter<MarkMultiStrangerConversationReadRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ MarkMultiStrangerConversationReadRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RQ9() {
        super(FieldEncoding.LENGTH_DELIMITED, MarkMultiStrangerConversationReadRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MarkMultiStrangerConversationReadRequestBody markMultiStrangerConversationReadRequestBody) {
        MarkMultiStrangerConversationReadRequestBody markMultiStrangerConversationReadRequestBody2 = markMultiStrangerConversationReadRequestBody;
        return markMultiStrangerConversationReadRequestBody2.unknownFields().size() + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, markMultiStrangerConversationReadRequestBody2.conversation_short_ids);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MarkMultiStrangerConversationReadRequestBody markMultiStrangerConversationReadRequestBody) {
        MarkMultiStrangerConversationReadRequestBody markMultiStrangerConversationReadRequestBody2 = markMultiStrangerConversationReadRequestBody;
        ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, markMultiStrangerConversationReadRequestBody2.conversation_short_ids);
        protoWriter.writeBytes(markMultiStrangerConversationReadRequestBody2.unknownFields());
    }
}
