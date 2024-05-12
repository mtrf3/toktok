package X;

import com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody;
import com.squareup.wire.Message;

/* renamed from: X.RRt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69561RRt extends Message.Builder<InboxMessagesPerUserResponseBody, C69561RRt> {
    public Integer LIZLLL;
    public Boolean LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final InboxMessagesPerUserResponseBody build() {
        return new InboxMessagesPerUserResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
