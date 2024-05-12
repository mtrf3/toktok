package X;

import android.os.Process;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayThreadPrioritySettings;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VCD implements Runnable {
    public final Runnable LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            int threadPriority = LivePlayThreadPrioritySettings.INSTANCE.getThreadPriority(VCI.ENABLE_DOWN_VLM_EXE);
            if (Process.getThreadPriority(Process.myTid()) != threadPriority) {
                Process.setThreadPriority(Process.myTid(), threadPriority);
            }
            this.LJLIL.run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public VCD(Runnable origin) {
        o.LJIIIZ(origin, "origin");
        this.LJLIL = origin;
    }
}
