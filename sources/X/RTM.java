package X;

import com.bytedance.im.core.proto.BroadcastUserCounterResponseBody;
import com.bytedance.im.core.proto.BroadcastUserInfo;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RTM extends Message.Builder<BroadcastUserCounterResponseBody, RTM> {
    public List<BroadcastUserInfo> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BroadcastUserCounterResponseBody build() {
        return new BroadcastUserCounterResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
