package X;

import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import java.util.TimerTask;

/* loaded from: classes9.dex */
public final class J96 extends TimerTask {
    public final /* synthetic */ C64907Pdf LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            SpeedModeServiceImpl.LJII().LJ(J92.API, C78939UyV.LJIIZILJ(this.LJLIL));
        } finally {
            if (LIZ) {
            }
        }
    }

    public J96(C64907Pdf c64907Pdf) {
        this.LJLIL = c64907Pdf;
    }
}
