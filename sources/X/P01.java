package X;

import com.bytedance.im.core.proto.GetMessagesCheckInfoV2ResponseBody;
import com.bytedance.im.core.proto.MessageCheckInfoV2;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes11.dex */
public final class P01 extends Message.Builder<GetMessagesCheckInfoV2ResponseBody, P01> {
    public List<MessageCheckInfoV2> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;
    public Boolean LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagesCheckInfoV2ResponseBody build() {
        return new GetMessagesCheckInfoV2ResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
