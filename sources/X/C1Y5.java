package X;

import android.os.Handler;
import com.bytedance.android.live.broadcast.setting.MobileHighPingOptimizeInfo;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Y5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y5 implements InterfaceC21070sB {
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public final ArrayBlockingQueue<Long> LIZ = new ArrayBlockingQueue<>(LIZLLL);
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());

    static {
        MobileHighPingOptimizeInfo mobileHighPingOptimizeInfo = MobileHighPingOptimizeInfo.INSTANCE;
        LIZLLL = mobileHighPingOptimizeInfo.getValue().getValid_high_ping_reference_count();
        LJ = mobileHighPingOptimizeInfo.getValue().getHigh_ping_tips_trigger_count();
        LJFF = mobileHighPingOptimizeInfo.getValue().getHigh_ping_value();
    }

    @Override // X.InterfaceC21070sB
    public final void LIZ() {
        this.LIZ.clear();
    }

    @Override // X.InterfaceC21070sB
    public final void LIZIZ() {
        this.LIZIZ.set(false);
        this.LIZ.clear();
    }
}
