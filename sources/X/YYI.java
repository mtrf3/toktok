package X;

import com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody;
import com.squareup.wire.Message;

/* loaded from: classes17.dex */
public final class YYI extends Message.Builder<BatchUnmarkMessageResponseBody, YYI> {
    public Long LIZLLL;
    public Long LJ;
    public String LJFF;
    public EnumC63552Owu LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchUnmarkMessageResponseBody build() {
        return new BatchUnmarkMessageResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
