package X;

import android.content.Context;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public final class PMM {
    public static HandlerThread LIZ;
    public static PMN LIZIZ;
    public static PMO LIZJ;
    public static int LIZLLL;

    static {
        new AtomicInteger(0);
    }

    public static void LIZ(Context context, C33641Ts c33641Ts, int i) {
        if (LIZ == null) {
            HandlerThread handlerThread = new HandlerThread("Thor-Handler-Thread");
            LIZ = handlerThread;
            handlerThread.start();
            LIZIZ = new PMN(LIZ.getLooper());
            LIZJ = c33641Ts;
            c33641Ts.LIZ.LJIILLIIL();
            LIZLLL = i;
        }
        PMN pmn = LIZIZ;
        pmn.sendMessage(pmn.obtainMessage(5, context));
    }
}
