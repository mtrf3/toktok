package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.aNe, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93238aNe {
    public static Handler LIZ;
    public static final C93238aNe LIZJ = new C93238aNe();
    public static final ConcurrentHashMap<String, Runnable> LIZIZ = new ConcurrentHashMap<>();

    public final String LIZ(Runnable runnable, int i) {
        String obj;
        if (LIZ == null) {
            synchronized (this) {
                if (LIZ == null) {
                    LIZ = ExecutorC93235aNb.LIZ("timer_thread");
                }
            }
        }
        try {
            obj = String.valueOf(Math.random() * Integer.MAX_VALUE);
        } catch (Throwable unused) {
            obj = runnable.toString();
        }
        RunnableC93237aNd runnableC93237aNd = new RunnableC93237aNd(obj, runnable);
        LIZIZ.put(obj, runnableC93237aNd);
        Handler handler = LIZ;
        if (handler != null) {
            handler.postDelayed(runnableC93237aNd, i);
        }
        return obj;
    }
}
