package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.Ern, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37755Ern {
    public static final Handler LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("ssp_thread");
        handlerThread.start();
        LIZ = new Handler(handlerThread.getLooper());
    }

    public static void LIZ(Runnable runnable) {
        try {
            Handler handler = LIZ;
            if (o.LJ(handler.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        } catch (Throwable th) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            c39048FUe.LIZ(C03090Af.LIZJ(LIZ2, "ssp thread exception: ", th, LIZ2), EnumC39866Fkk.E, "SspLifeCycle");
        }
    }
}
