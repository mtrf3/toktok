package X;

import com.ss.android.ttve.nativePort.VEBingoManager;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class P69 {
    public final AtomicInteger LIZ = new AtomicInteger(0);
    public volatile boolean LIZIZ = false;

    public final synchronized void LIZ() {
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            throw null;
        }
    }

    public P69(VEBingoManager vEBingoManager, int i) {
    }
}
