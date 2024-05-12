package X;

import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RSB extends Message.Builder<PreviewerGetConversationInfoListRequestBody, RSB> {
    public List<GetConversationInfoV2RequestBody> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    public final PreviewerGetConversationInfoListRequestBody build() {
        return new PreviewerGetConversationInfoListRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
