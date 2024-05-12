package X;

import android.os.Process;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayThreadPrioritySettings;

/* loaded from: classes15.dex */
public final class VCE implements VCF {
    public volatile boolean LIZ;
    public volatile int LIZIZ;
    public int LIZJ;

    @Override // X.VCF
    public final void LIZ(boolean z) {
        if (this.LIZ == z || !HandlerThreadC36423ERf.LIZJ().isAlive()) {
            return;
        }
        this.LIZ = z;
        try {
            if (z) {
                this.LIZIZ = HandlerThreadC36423ERf.LIZJ().getThreadId();
                this.LIZJ = Process.getThreadPriority(this.LIZIZ);
                Process.setThreadPriority(this.LIZIZ, LivePlayThreadPrioritySettings.INSTANCE.getThreadPriority(VCI.ENABLE_DOWN_TEA));
            } else {
                Process.setThreadPriority(this.LIZIZ, this.LIZJ);
            }
        } catch (IllegalArgumentException e) {
            C16880lQ.LLLLIIL(e);
        } catch (SecurityException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
