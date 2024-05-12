package X;

import Y.IDHandlerS8S0000000_8;
import android.os.HandlerThread;
import android.os.Message;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;

/* renamed from: X.IeM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47114IeM {
    public final HandlerThread LIZ;
    public final IDHandlerS8S0000000_8 LIZIZ;

    public C47114IeM() {
        try {
            HandlerThread handlerThread = new HandlerThread("vclould.engine.preload.media");
            this.LIZ = handlerThread;
            handlerThread.start();
            this.LIZIZ = new IDHandlerS8S0000000_8(handlerThread.getLooper(), 0);
        } catch (Throwable th) {
            TTVideoEngineLog.d(th);
            this.LIZ = null;
            this.LIZIZ = null;
        }
    }

    public final void LIZ(int i, ArrayList arrayList) {
        if (this.LIZIZ != null && this.LIZ != null) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.obj = arrayList;
            this.LIZIZ.sendMessage(obtain);
        }
    }
}
