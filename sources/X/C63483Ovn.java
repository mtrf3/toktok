package X;

import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ovn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63483Ovn extends ProtoAdapter<GetConversationParticipantsMinIndexV3RequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetConversationParticipantsMinIndexV3RequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63483Ovn() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationParticipantsMinIndexV3RequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody) {
        GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody2 = getConversationParticipantsMinIndexV3RequestBody;
        return getConversationParticipantsMinIndexV3RequestBody2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(3, getConversationParticipantsMinIndexV3RequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getConversationParticipantsMinIndexV3RequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(1, getConversationParticipantsMinIndexV3RequestBody2.conversation_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody) {
        GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody2 = getConversationParticipantsMinIndexV3RequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getConversationParticipantsMinIndexV3RequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getConversationParticipantsMinIndexV3RequestBody2.conversation_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getConversationParticipantsMinIndexV3RequestBody2.conversation_id);
        protoWriter.writeBytes(getConversationParticipantsMinIndexV3RequestBody2.unknownFields());
    }
}
