package X;

import com.bytedance.im.core.proto.GetMessageByKeyError;
import com.bytedance.im.core.proto.MessageKey;
import com.squareup.wire.Message;

/* renamed from: X.RSp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69583RSp extends Message.Builder<GetMessageByKeyError, C69583RSp> {
    public MessageKey LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageByKeyError build() {
        MessageKey messageKey = this.LIZLLL;
        if (messageKey != null && this.LJ != null) {
            return new GetMessageByKeyError(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C63685Oz3.LJII(messageKey, "key", this.LJ, "status_code");
        throw null;
    }
}
