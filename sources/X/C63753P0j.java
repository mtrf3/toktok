package X;

import com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.P0j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63753P0j extends ProtoAdapter<UpdateConversationParticipantRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ UpdateConversationParticipantRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63753P0j() {
        super(FieldEncoding.LENGTH_DELIMITED, UpdateConversationParticipantRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody) {
        UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody2 = updateConversationParticipantRequestBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, updateConversationParticipantRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, updateConversationParticipantRequestBody2.conversation_short_id) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        return updateConversationParticipantRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(11, updateConversationParticipantRequestBody2.biz_ext) + ProtoAdapter.BOOL.encodedSizeWithTag(7, updateConversationParticipantRequestBody2.is_alias_set) + protoAdapter.encodedSizeWithTag(6, updateConversationParticipantRequestBody2.alias) + protoAdapter3.encodedSizeWithTag(5, updateConversationParticipantRequestBody2.role) + protoAdapter2.encodedSizeWithTag(4, updateConversationParticipantRequestBody2.user_id) + protoAdapter3.encodedSizeWithTag(3, updateConversationParticipantRequestBody2.conversation_type) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody) {
        UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody2 = updateConversationParticipantRequestBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, updateConversationParticipantRequestBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, updateConversationParticipantRequestBody2.conversation_short_id);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 3, updateConversationParticipantRequestBody2.conversation_type);
        protoAdapter2.encodeWithTag(protoWriter, 4, updateConversationParticipantRequestBody2.user_id);
        protoAdapter3.encodeWithTag(protoWriter, 5, updateConversationParticipantRequestBody2.role);
        protoAdapter.encodeWithTag(protoWriter, 6, updateConversationParticipantRequestBody2.alias);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, updateConversationParticipantRequestBody2.is_alias_set);
        this.LJ.encodeWithTag(protoWriter, 11, updateConversationParticipantRequestBody2.biz_ext);
        protoWriter.writeBytes(updateConversationParticipantRequestBody2.unknownFields());
    }
}
