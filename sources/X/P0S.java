package X;

import com.bytedance.im.core.proto.GetCmdMessageRespBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes11.dex */
public final class P0S extends Message.Builder<GetCmdMessageRespBody, P0S> {
    public List<MessageBody> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetCmdMessageRespBody build() {
        Boolean bool = this.LJ;
        if (bool != null) {
            return new GetCmdMessageRespBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C63685Oz3.LJII(bool, "has_more");
        throw null;
    }
}
