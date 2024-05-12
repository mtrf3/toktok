package X;

import com.bytedance.im.core.proto.GetTicketResponseBody;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RSJ extends Message.Builder<GetTicketResponseBody, RSJ> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetTicketResponseBody build() {
        return new GetTicketResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
