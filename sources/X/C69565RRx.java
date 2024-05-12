package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PullMarkMessageResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.RRx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69565RRx extends Message.Builder<PullMarkMessageResponseBody, C69565RRx> {
    public List<MessageBody> LIZLLL = C63685Oz3.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PullMarkMessageResponseBody build() {
        return new PullMarkMessageResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
