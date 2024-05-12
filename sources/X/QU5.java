package X;

import Y.ARunnableS15S0100100_11;
import Y.ARunnableS47S0100000_11;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.sync.v2.WsMonitor;

/* loaded from: classes12.dex */
public final class QU5 implements InterfaceC67071QTz {
    public final /* synthetic */ InterfaceC67063QTr LJLIL;
    public final /* synthetic */ WsMonitor LJLILLLLZI;

    @Override // X.InterfaceC67071QTz
    public final void LJJJLZIJ(boolean z) {
        synchronized (this) {
            WsMonitor wsMonitor = this.LJLILLLLZI;
            long j = wsMonitor.LJLIL;
            if (z && j > 0) {
                wsMonitor.LJLIL = 0L;
                this.LJLIL.LJIIZILJ(this);
                new Handler(((QU4) QPG.LIZ(QU4.class)).get(), null).post(new ARunnableS15S0100100_11(SystemClock.elapsedRealtime() - j, this, 2));
                WsMonitor wsMonitor2 = this.LJLILLLLZI;
                ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(this, 8);
                wsMonitor2.getClass();
                if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                    aRunnableS47S0100000_11.run();
                } else {
                    new Handler(C16880lQ.LLJJJJ()).post(aRunnableS47S0100000_11);
                }
            }
        }
    }

    public QU5(WsMonitor wsMonitor, InterfaceC67063QTr interfaceC67063QTr) {
        this.LJLILLLLZI = wsMonitor;
        this.LJLIL = interfaceC67063QTr;
    }
}
