package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.2aC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60882aC {
    public static final Handler LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("prefetch_thread");
        handlerThread.start();
        LIZ = new Handler(handlerThread.getLooper());
        new Handler(C16880lQ.LLJJJJ());
    }
}
