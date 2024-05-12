package X;

import Y.ARunnableS46S0100000_10;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.O4z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61325O4z {
    public static MessageQueue LIZIZ;
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(O50.INSTANCE);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(FBR.LJLIL);

    public static Handler LIZ() {
        return (Handler) LIZJ.getValue();
    }

    public static boolean LIZIZ() {
        return o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ());
    }

    public static void LIZJ(Runnable runnable) {
        o.LJIIJ(runnable, "runnable");
        MessageQueue messageQueue = LIZIZ;
        if (messageQueue != null) {
            C16880lQ.LJLI(messageQueue, new O51(runnable));
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            Looper looper = LIZ().getLooper();
            o.LJFF(looper, "forestHandler.looper");
            LIZIZ = looper.getQueue();
            LIZJ(runnable);
            return;
        }
        LIZ().post(new ARunnableS46S0100000_10(runnable, 149));
    }

    public static void LIZLLL(Runnable runnable) {
        if (o.LJ(Looper.myLooper(), LIZ().getLooper())) {
            runnable.run();
        } else {
            LIZ().post(runnable);
        }
    }

    public static void LJ(InterfaceC65784Pro interfaceC65784Pro) {
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new ARunnableS46S0100000_10(interfaceC65784Pro, 148));
    }

    public static void LJFF(Runnable runnable) {
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            runnable.run();
        } else {
            ((Handler) LIZ.getValue()).post(runnable);
        }
    }
}
