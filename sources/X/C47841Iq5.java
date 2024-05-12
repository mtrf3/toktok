package X;

import Y.IDHandlerS8S0000000_8;
import android.os.HandlerThread;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: X.Iq5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47841Iq5 {
    public final HandlerThread LIZ;
    public final IDHandlerS8S0000000_8 LIZIZ;

    public C47841Iq5() {
        try {
            HandlerThread handlerThread = new HandlerThread("vcloud.engine.download.tasks");
            this.LIZ = handlerThread;
            handlerThread.start();
            this.LIZIZ = new IDHandlerS8S0000000_8(handlerThread.getLooper(), 1);
        } catch (Throwable th) {
            TTVideoEngineLog.d(th);
            this.LIZ = null;
            this.LIZIZ = null;
        }
    }
}
