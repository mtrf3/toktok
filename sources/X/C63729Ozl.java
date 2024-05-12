package X;

import com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ozl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63729Ozl extends ProtoAdapter<GetConversationAuditSwitchRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetConversationAuditSwitchRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63729Ozl() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationAuditSwitchRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationAuditSwitchRequestBody getConversationAuditSwitchRequestBody) {
        GetConversationAuditSwitchRequestBody getConversationAuditSwitchRequestBody2 = getConversationAuditSwitchRequestBody;
        return getConversationAuditSwitchRequestBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, getConversationAuditSwitchRequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(1, getConversationAuditSwitchRequestBody2.conv_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetConversationAuditSwitchRequestBody getConversationAuditSwitchRequestBody) {
        GetConversationAuditSwitchRequestBody getConversationAuditSwitchRequestBody2 = getConversationAuditSwitchRequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getConversationAuditSwitchRequestBody2.conv_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getConversationAuditSwitchRequestBody2.conversation_type);
        protoWriter.writeBytes(getConversationAuditSwitchRequestBody2.unknownFields());
    }
}
