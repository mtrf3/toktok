package X;

import com.bytedance.android.livesdk.dataChannel.MuteDurationEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMuteCommentsDefaultSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.BIq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC28556BIq<V> implements Callable {
    public final /* synthetic */ long LJLIL;

    public CallableC28556BIq(long j) {
        this.LJLIL = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C48459J0d LIZ = C28557BIr.LIZ();
        if (LIZ.LIZJ() == null) {
            LIZ.LIZ(Long.valueOf(LiveMuteCommentsDefaultSetting.INSTANCE.getValue()));
        }
        Object LIZJ = LIZ.LIZJ();
        o.LJIIIIZZ(LIZJ, "property.value");
        C05490Jl c05490Jl = new C05490Jl(((Number) LIZJ).longValue());
        C28557BIr.LIZ.put(Long.valueOf(this.LJLIL), c05490Jl);
        DataChannelGlobal.LJLJJI.sv0(MuteDurationEvent.class, c05490Jl);
        return c05490Jl;
    }
}
