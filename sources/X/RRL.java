package X;

import com.bytedance.im.core.proto.InboxMessagesPerUser;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RRL extends Message.Builder<InboxMessagesPerUser, RRL> {
    public Integer LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final InboxMessagesPerUser build() {
        return new InboxMessagesPerUser(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
