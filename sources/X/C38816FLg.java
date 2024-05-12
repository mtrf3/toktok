package X;

import android.os.AsyncTask;
import android.os.Handler;
import java.util.concurrent.ExecutorService;

/* renamed from: X.FLg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38816FLg {
    public static ExecutorService LIZ;
    public static Handler LIZIZ;

    public static void LIZIZ() {
        ExecutorService executorService = LIZ;
        if (executorService == null || executorService.isTerminated() || LIZIZ == null) {
            LIZ = (ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR;
            LIZIZ = new Handler(C16880lQ.LLJJJJ());
        }
    }

    public static void LIZ(Runnable runnable) {
        LIZIZ();
        LIZIZ.removeCallbacks(runnable);
    }

    public static void LIZJ(Runnable runnable) {
        LIZIZ();
        Handler handler = LIZIZ;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public static void LJ(Runnable runnable) {
        LIZIZ();
        try {
            LIZ.execute(runnable);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZLLL(Runnable runnable, int i) {
        LIZIZ();
        Handler handler = LIZIZ;
        if (handler != null) {
            handler.postDelayed(runnable, i);
        }
    }
}
