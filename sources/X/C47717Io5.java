package X;

import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.TimerTask;

/* renamed from: X.Io5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47717Io5 extends TimerTask {
    public final AVMDLDataLoader LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                AVMDLDataLoader aVMDLDataLoader = this.LJLIL;
                if (aVMDLDataLoader != null) {
                    aVMDLDataLoader.onLogInfo(70, 0, aVMDLDataLoader.getStringValue(1011));
                }
            } catch (Exception e) {
                TTVideoEngineLog.d(e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public C47717Io5(AVMDLDataLoader aVMDLDataLoader) {
        this.LJLIL = aVMDLDataLoader;
    }
}
