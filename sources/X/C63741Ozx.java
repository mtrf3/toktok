package X;

import com.bytedance.im.core.proto.GetConversationAuditListRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ozx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63741Ozx extends ProtoAdapter<GetConversationAuditListRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetConversationAuditListRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63741Ozx() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationAuditListRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationAuditListRequestBody getConversationAuditListRequestBody) {
        GetConversationAuditListRequestBody getConversationAuditListRequestBody2 = getConversationAuditListRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return getConversationAuditListRequestBody2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(4, getConversationAuditListRequestBody2.no_clear_unread) + protoAdapter.encodedSizeWithTag(3, getConversationAuditListRequestBody2.conv_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getConversationAuditListRequestBody2.limit) + protoAdapter.encodedSizeWithTag(1, getConversationAuditListRequestBody2.cursor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetConversationAuditListRequestBody getConversationAuditListRequestBody) {
        GetConversationAuditListRequestBody getConversationAuditListRequestBody2 = getConversationAuditListRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, getConversationAuditListRequestBody2.cursor);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getConversationAuditListRequestBody2.limit);
        protoAdapter.encodeWithTag(protoWriter, 3, getConversationAuditListRequestBody2.conv_short_id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getConversationAuditListRequestBody2.no_clear_unread);
        protoWriter.writeBytes(getConversationAuditListRequestBody2.unknownFields());
    }
}
