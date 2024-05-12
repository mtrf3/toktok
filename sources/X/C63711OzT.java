package X;

import com.bytedance.im.core.proto.ConversationCheckInfoV2;
import com.bytedance.im.core.proto.GetConversationsCheckInfoV2ResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.OzT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63711OzT extends Message.Builder<GetConversationsCheckInfoV2ResponseBody, C63711OzT> {
    public List<ConversationCheckInfoV2> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Boolean LJ;
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationsCheckInfoV2ResponseBody build() {
        return new GetConversationsCheckInfoV2ResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
