package X;

import com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RPW extends ProtoAdapter<UpdateConversationAuditSwitchRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ UpdateConversationAuditSwitchRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RPW() {
        super(FieldEncoding.LENGTH_DELIMITED, UpdateConversationAuditSwitchRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(UpdateConversationAuditSwitchRequestBody updateConversationAuditSwitchRequestBody) {
        UpdateConversationAuditSwitchRequestBody updateConversationAuditSwitchRequestBody2 = updateConversationAuditSwitchRequestBody;
        return updateConversationAuditSwitchRequestBody2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(3, updateConversationAuditSwitchRequestBody2.switch_status) + ProtoAdapter.INT32.encodedSizeWithTag(2, updateConversationAuditSwitchRequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(1, updateConversationAuditSwitchRequestBody2.conv_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, UpdateConversationAuditSwitchRequestBody updateConversationAuditSwitchRequestBody) {
        UpdateConversationAuditSwitchRequestBody updateConversationAuditSwitchRequestBody2 = updateConversationAuditSwitchRequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, updateConversationAuditSwitchRequestBody2.conv_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, updateConversationAuditSwitchRequestBody2.conversation_type);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, updateConversationAuditSwitchRequestBody2.switch_status);
        protoWriter.writeBytes(updateConversationAuditSwitchRequestBody2.unknownFields());
    }
}
