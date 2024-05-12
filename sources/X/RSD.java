package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RSD extends Message.Builder<GetConversationInfoV2ResponseBody, RSD> {
    public ConversationInfoV2 LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationInfoV2ResponseBody build() {
        return new GetConversationInfoV2ResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
