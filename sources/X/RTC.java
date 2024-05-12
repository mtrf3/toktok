package X;

import com.bytedance.im.core.proto.MsgTrace;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class RTC extends Message.Builder<MsgTrace, RTC> {
    public java.util.Map<Integer, Long> LIZLLL = new LinkedHashMap();
    public EnumC69901Rc1 LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MsgTrace build() {
        return new MsgTrace(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
