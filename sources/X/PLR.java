package X;

import com.bytedance.crash.vmMonitor.VMMonitor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes12.dex */
public final class PLR extends PthreadThread {
    public final /* synthetic */ VMMonitor LJLIL;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.getClass();
            VMMonitor.LJIIJJI(true);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PLR(VMMonitor vMMonitor) {
        super("predump_uploader");
        this.LJLIL = vMMonitor;
    }
}
