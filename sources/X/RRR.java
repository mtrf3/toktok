package X;

import com.bytedance.im.core.proto.MessagesPerUserPaginationInfo;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RRR extends Message.Builder<MessagesPerUserPaginationInfo, RRR> {
    public Long LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserPaginationInfo build() {
        return new MessagesPerUserPaginationInfo(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
