package X;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.o;

/* renamed from: X.2aN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60992aN {
    public static volatile Handler LIZ;
    public static final C60992aN LIZIZ = new C60992aN();

    static {
        new Handler(C16880lQ.LLJJJJ());
    }

    public final Handler LIZ() {
        if (LIZ == null) {
            synchronized (this) {
                if (LIZ == null) {
                    HandlerThread handlerThread = new HandlerThread("SExecutor");
                    handlerThread.start();
                    LIZ = new Handler(handlerThread.getLooper());
                }
            }
        }
        Handler handler = LIZ;
        o.LJI(handler);
        return handler;
    }
}
