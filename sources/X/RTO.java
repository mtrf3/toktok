package X;

import com.bytedance.im.core.proto.BroadcastUserInfo;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RTO extends Message.Builder<BroadcastUserInfo, RTO> {
    public Long LIZLLL;
    public Integer LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BroadcastUserInfo build() {
        return new BroadcastUserInfo(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
