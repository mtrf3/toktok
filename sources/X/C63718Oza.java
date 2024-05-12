package X;

import com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Oza, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63718Oza extends ProtoAdapter<GetConversationInfoListV2RequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetConversationInfoListV2RequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63718Oza() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListV2RequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody) {
        GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody2 = getConversationInfoListV2RequestBody;
        return getConversationInfoListV2RequestBody2.unknownFields().size() + GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListV2RequestBody2.conversation_info_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody) {
        GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody2 = getConversationInfoListV2RequestBody;
        GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListV2RequestBody2.conversation_info_list);
        protoWriter.writeBytes(getConversationInfoListV2RequestBody2.unknownFields());
    }
}
