package X;

import com.byted.cast.common.SourceMonitorUtils;
import com.byted.cast.common.api.PlayerInfo;
import com.ss.chromecast.source.impl.ChromeCastSourceWrapper;

/* renamed from: X.ZeC, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class RunnableC90420ZeC implements Runnable {
    public final /* synthetic */ int LJLIL = 210010;
    public final /* synthetic */ int LJLILLLLZI = 4;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C90780Zk0 LJLJJI;

    public final void LIZ() {
        String playerInfo;
        this.LJLJJI.LIZ.onError(this.LJLIL, this.LJLILLLLZI);
        SourceMonitorUtils sourceMonitor = this.LJLJJI.LIZIZ.LJIIIIZZ.getSourceMonitor();
        StringBuilder LIZ = X1D.LIZ();
        ChromeCastSourceWrapper chromeCastSourceWrapper = this.LJLJJI.LIZIZ;
        PlayerInfo playerInfo2 = chromeCastSourceWrapper.LIZLLL;
        if (playerInfo2 == null) {
            playerInfo = chromeCastSourceWrapper.LJFF;
        } else {
            playerInfo = playerInfo2.toString();
        }
        LIZ.append(playerInfo);
        LIZ.append(this.LJLJI);
        sourceMonitor.trackChromeCastPlayFailureEvent(X1D.LIZIZ(LIZ), this.LJLJJI.LIZIZ.LJ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC90420ZeC(C90780Zk0 c90780Zk0, String str) {
        this.LJLJJI = c90780Zk0;
        this.LJLJI = str;
    }
}
