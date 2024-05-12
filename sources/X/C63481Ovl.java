package X;

import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ovl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63481Ovl extends ProtoAdapter<GetConversationInfoV2RequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetConversationInfoV2RequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63481Ovl() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoV2RequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationInfoV2RequestBody getConversationInfoV2RequestBody) {
        GetConversationInfoV2RequestBody getConversationInfoV2RequestBody2 = getConversationInfoV2RequestBody;
        return getConversationInfoV2RequestBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(3, getConversationInfoV2RequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, getConversationInfoV2RequestBody2.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(1, getConversationInfoV2RequestBody2.conversation_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetConversationInfoV2RequestBody getConversationInfoV2RequestBody) {
        GetConversationInfoV2RequestBody getConversationInfoV2RequestBody2 = getConversationInfoV2RequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getConversationInfoV2RequestBody2.conversation_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getConversationInfoV2RequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getConversationInfoV2RequestBody2.conversation_type);
        protoWriter.writeBytes(getConversationInfoV2RequestBody2.unknownFields());
    }
}
