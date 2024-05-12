package X;

import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRZ extends ProtoAdapter<UpsertConversationCoreExtInfoRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ UpsertConversationCoreExtInfoRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RRZ() {
        super(FieldEncoding.LENGTH_DELIMITED, UpsertConversationCoreExtInfoRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody) {
        UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody2 = upsertConversationCoreExtInfoRequestBody;
        return upsertConversationCoreExtInfoRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(4, upsertConversationCoreExtInfoRequestBody2.ext) + ProtoAdapter.INT32.encodedSizeWithTag(3, upsertConversationCoreExtInfoRequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, upsertConversationCoreExtInfoRequestBody2.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(1, upsertConversationCoreExtInfoRequestBody2.conversation_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody) {
        UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody2 = upsertConversationCoreExtInfoRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, upsertConversationCoreExtInfoRequestBody2.conversation_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, upsertConversationCoreExtInfoRequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, upsertConversationCoreExtInfoRequestBody2.conversation_type);
        this.LJ.encodeWithTag(protoWriter, 4, upsertConversationCoreExtInfoRequestBody2.ext);
        protoWriter.writeBytes(upsertConversationCoreExtInfoRequestBody2.unknownFields());
    }
}
