package X;

import com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ovz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63495Ovz extends ProtoAdapter<MarkStrangerConversationReadRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ MarkStrangerConversationReadRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63495Ovz() {
        super(FieldEncoding.LENGTH_DELIMITED, MarkStrangerConversationReadRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody) {
        MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody2 = markStrangerConversationReadRequestBody;
        return markStrangerConversationReadRequestBody2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(1, markStrangerConversationReadRequestBody2.conversation_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody) {
        MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody2 = markStrangerConversationReadRequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, markStrangerConversationReadRequestBody2.conversation_short_id);
        protoWriter.writeBytes(markStrangerConversationReadRequestBody2.unknownFields());
    }
}
