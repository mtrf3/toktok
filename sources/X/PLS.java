package X;

import com.bytedance.crash.Npth;
import com.ss.android.agilelogger.ALog;

/* loaded from: classes12.dex */
public final class PLS implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (ALog.isInitSuccess()) {
            Npth.enableALogCollector(ALog.sConfig.LJFF, new C64297PLh(), new PKC());
        }
    }
}
