package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RS5 extends Message.Builder<GetConversationInfoListV2ResponseBody, RS5> {
    public List<ConversationInfoV2> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationInfoListV2ResponseBody build() {
        return new GetConversationInfoListV2ResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
