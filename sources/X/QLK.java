package X;

import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes12.dex */
public final class QLK {
    public static volatile QLN LIZ;
    public static volatile QLL LIZIZ;

    public static void LIZ(int i, int i2, Object[] objArr) {
        if (LIZIZ == null) {
            synchronized (QLK.class) {
                if (LIZIZ == null) {
                    HandlerThread handlerThread = new HandlerThread("LogTraceThread");
                    handlerThread.start();
                    LIZIZ = new QLL(handlerThread.getLooper());
                }
            }
        }
        QLL qll = LIZIZ;
        if (qll != null) {
            Message obtainMessage = qll.obtainMessage(i);
            obtainMessage.arg1 = i2;
            obtainMessage.obj = objArr;
            qll.sendMessage(obtainMessage);
        }
    }
}
