package X;

import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ovp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63485Ovp extends ProtoAdapter<GetConversationParticipantsReadIndexV3RequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetConversationParticipantsReadIndexV3RequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63485Ovp() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationParticipantsReadIndexV3RequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody) {
        GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody2 = getConversationParticipantsReadIndexV3RequestBody;
        return getConversationParticipantsReadIndexV3RequestBody2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(3, getConversationParticipantsReadIndexV3RequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getConversationParticipantsReadIndexV3RequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(1, getConversationParticipantsReadIndexV3RequestBody2.conversation_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody) {
        GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody2 = getConversationParticipantsReadIndexV3RequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getConversationParticipantsReadIndexV3RequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getConversationParticipantsReadIndexV3RequestBody2.conversation_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getConversationParticipantsReadIndexV3RequestBody2.conversation_id);
        protoWriter.writeBytes(getConversationParticipantsReadIndexV3RequestBody2.unknownFields());
    }
}
