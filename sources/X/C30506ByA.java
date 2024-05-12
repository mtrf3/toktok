package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoreInitOptSetting;

/* renamed from: X.ByA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30506ByA {
    public static final Handler LIZ;
    public static final HandlerThread LIZIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("Live-core-Thread", LiveCoreInitOptSetting.INSTANCE.liveCoreInitPriority());
        handlerThread.start();
        LIZ = new Handler(handlerThread.getLooper());
        LIZIZ = handlerThread;
    }
}
