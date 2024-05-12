package X;

import android.os.HandlerThread;

/* loaded from: classes9.dex */
public final class IH6 {
    public static final HandlerThread LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("AVUtilThread");
        LIZ = handlerThread;
        handlerThread.start();
    }
}
