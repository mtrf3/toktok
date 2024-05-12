package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RS9 extends Message.Builder<GetConversationInfoListByTopV2ResponseBody, RS9> {
    public List<ConversationInfoV2> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationInfoListByTopV2ResponseBody build() {
        return new GetConversationInfoListByTopV2ResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
