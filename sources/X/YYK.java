package X;

import com.bytedance.im.core.proto.MarkMessageResponseBody;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YYK extends Message.Builder<MarkMessageResponseBody, YYK> {
    public Long LIZLLL;
    public Long LJ;
    public String LJFF;
    public EnumC63552Owu LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkMessageResponseBody build() {
        return new MarkMessageResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
