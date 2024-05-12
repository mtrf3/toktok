package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes11.dex */
public final class P08 extends Message.Builder<MessagesPerUserInitV2ResponseBody, P08> {
    public Long LJFF;
    public Long LJI;
    public Boolean LJII;
    public P09 LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public List<MessageBody> LIZLLL = C63685Oz3.LJIIIIZZ();
    public List<ConversationInfoV2> LJ = C63685Oz3.LJIIIIZZ();
    public List<C64537PUn> LJIIJJI = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserInitV2ResponseBody build() {
        return new MessagesPerUserInitV2ResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
