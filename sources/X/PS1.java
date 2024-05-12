package X;

import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes12.dex */
public class PS1 {
    public static final Looper LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("DownloadWatchDog");
        handlerThread.start();
        LIZ = handlerThread.getLooper();
    }
}
