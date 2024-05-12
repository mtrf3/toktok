package X;

import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RSA extends ProtoAdapter<PreviewerGetConversationInfoListRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ PreviewerGetConversationInfoListRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RSA() {
        super(FieldEncoding.LENGTH_DELIMITED, PreviewerGetConversationInfoListRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody) {
        PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody2 = previewerGetConversationInfoListRequestBody;
        return previewerGetConversationInfoListRequestBody2.unknownFields().size() + GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, previewerGetConversationInfoListRequestBody2.conversation_info_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody) {
        PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody2 = previewerGetConversationInfoListRequestBody;
        GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, previewerGetConversationInfoListRequestBody2.conversation_info_list);
        protoWriter.writeBytes(previewerGetConversationInfoListRequestBody2.unknownFields());
    }
}
