package X;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.PwF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66059PwF {
    public static final HandlerC66060PwG LIZIZ;
    public static InterfaceC66066PwM LIZJ;
    public static AbstractC66064PwK LIZLLL;
    public static final C66059PwF LJ = new C66059PwF();
    public static final java.util.Map<String, java.util.Set<InterfaceC66066PwM>> LIZ = new HashMap();

    static {
        HandlerThread handlerThread = new HandlerThread("helios.consumer", 0);
        handlerThread.start();
        handlerThread.setUncaughtExceptionHandler(C64483PSl.LIZ);
        Looper looper = handlerThread.getLooper();
        o.LJIIIIZZ(looper, "thread.looper");
        LIZIZ = new HandlerC66060PwG(looper);
    }

    public static final void LIZIZ(InterfaceC66068PwO event) {
        o.LJIIIZ(event, "event");
        LIZJ(event, 0L);
    }

    public final synchronized void LIZ(InterfaceC66066PwM consumer) {
        o.LJIIIZ(consumer, "consumer");
        String type = consumer.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("addConsumer ");
        LIZ2.append(type);
        LIZ2.append(" --> ");
        LIZ2.append(consumer);
        C66063PwJ.LIZIZ("Reporter", X1D.LIZIZ(LIZ2));
        java.util.Map<String, java.util.Set<InterfaceC66066PwM>> map = LIZ;
        java.util.Set set = (java.util.Set) ((HashMap) map).get(type);
        if (set == null) {
            set = new C0M4();
        }
        set.add(consumer);
        o.LJIIIIZZ(type, "type");
        ((HashMap) map).put(type, set);
        if (o.LJ(type, "ExceptionEvent")) {
            LIZJ = consumer;
        }
    }

    public static final void LIZJ(InterfaceC66068PwO event, long j) {
        o.LJIIIZ(event, "event");
        Message obtain = Message.obtain();
        obtain.what = 1000;
        obtain.obj = event;
        LIZIZ.sendMessageDelayed(obtain, j);
    }
}
