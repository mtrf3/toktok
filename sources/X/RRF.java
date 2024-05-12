package X;

import com.bytedance.im.core.proto.AckMessageResponseBody;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RRF extends Message.Builder<AckMessageResponseBody, RRF> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AckMessageResponseBody build() {
        return new AckMessageResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
