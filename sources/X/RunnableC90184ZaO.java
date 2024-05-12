package X;

import com.byted.cast.common.CastLogger;
import com.byted.cast.common.performance.CrashUtil;
import com.byted.cast.sdk.core.RTCEventNotifier;

/* renamed from: X.ZaO, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final /* synthetic */ class RunnableC90184ZaO implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                RTCEventNotifier.LJIIIIZZ((RTCEventNotifier) this.LJLILLLLZI);
                return;
            default:
                CastLogger castLogger = ((C90801ZkL) this.LJLILLLLZI).LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Current process fds info:");
                LIZ.append(CrashUtil.getFds());
                castLogger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
                return;
        }
    }

    public /* synthetic */ RunnableC90184ZaO(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
