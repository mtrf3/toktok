package X;

import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69543RRb extends ProtoAdapter<UpsertConversationSettingExtInfoRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ UpsertConversationSettingExtInfoRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C69543RRb() {
        super(FieldEncoding.LENGTH_DELIMITED, UpsertConversationSettingExtInfoRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody) {
        UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody2 = upsertConversationSettingExtInfoRequestBody;
        return upsertConversationSettingExtInfoRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(4, upsertConversationSettingExtInfoRequestBody2.ext) + ProtoAdapter.INT32.encodedSizeWithTag(3, upsertConversationSettingExtInfoRequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, upsertConversationSettingExtInfoRequestBody2.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(1, upsertConversationSettingExtInfoRequestBody2.conversation_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody) {
        UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody2 = upsertConversationSettingExtInfoRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, upsertConversationSettingExtInfoRequestBody2.conversation_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, upsertConversationSettingExtInfoRequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, upsertConversationSettingExtInfoRequestBody2.conversation_type);
        this.LJ.encodeWithTag(protoWriter, 4, upsertConversationSettingExtInfoRequestBody2.ext);
        protoWriter.writeBytes(upsertConversationSettingExtInfoRequestBody2.unknownFields());
    }
}
