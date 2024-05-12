package X;

import com.bytedance.im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.im.core.proto.StrangerConversation;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes11.dex */
public final class P0K extends Message.Builder<GetStrangerConversationListResponseBody, P0K> {
    public Long LIZLLL;
    public Boolean LJ;
    public Integer LJFF;
    public List<StrangerConversation> LJI = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetStrangerConversationListResponseBody build() {
        return new GetStrangerConversationListResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
