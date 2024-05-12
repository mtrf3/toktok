package X;

import com.lynx.tasm.base.TraceController;
import java.util.TimerTask;

/* renamed from: X.OJs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61708OJs extends TimerTask {
    public final /* synthetic */ TraceController LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C61708OJs(TraceController traceController) {
        this.LJLIL = traceController;
    }
}
