package X;

import com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RRH extends Message.Builder<GetStrangerUnreadCountResponseBody, RRH> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetStrangerUnreadCountResponseBody build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new GetStrangerUnreadCountResponseBody(this.LIZLLL, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "user_unread_count");
        throw null;
    }
}
