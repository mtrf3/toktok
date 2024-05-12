package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.IwI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48226IwI {
    public static final Handler LIZ;
    public static final Handler LIZIZ;
    public static final Handler LIZJ;
    public static final Handler LIZLLL;
    public static final long LJ;

    static {
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJFF(LLJJJJ, "Looper.getMainLooper()");
        Thread thread = LLJJJJ.getThread();
        o.LJFF(thread, "Looper.getMainLooper().thread");
        LJ = thread.getId();
        HandlerThread handlerThread = new HandlerThread("RulerMainBackThread");
        HandlerThread handlerThread2 = new HandlerThread("RulerBackThread");
        handlerThread.start();
        handlerThread2.start();
        LIZ = new Handler(handlerThread.getLooper());
        LIZIZ = new Handler(handlerThread2.getLooper());
        HandlerThread handlerThread3 = new HandlerThread("RulerLogThread");
        HandlerThread handlerThread4 = new HandlerThread("RulerMainLogThread");
        handlerThread3.start();
        handlerThread4.start();
        LIZJ = new Handler(handlerThread3.getLooper());
        LIZLLL = new Handler(handlerThread4.getLooper());
    }

    public static void LIZIZ(InterfaceC65784Pro interfaceC65784Pro) {
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        o.LJFF(LLLLIIIILLL, "Thread.currentThread()");
        if (LLLLIIIILLL.getId() == LJ) {
            Handler handler = LIZLLL;
            if (handler != null) {
                handler.post(new ARunnableS44S0100000_8(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 108));
                return;
            } else {
                o.LJIJI("mainLogHandler");
                throw null;
            }
        }
        Handler handler2 = LIZJ;
        if (handler2 != null) {
            handler2.post(new ARunnableS44S0100000_8(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 108));
        } else {
            o.LJIJI("logHandler");
            throw null;
        }
    }

    public static void LIZ(InterfaceC65784Pro interfaceC65784Pro, long j) {
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        o.LJFF(LLLLIIIILLL, "Thread.currentThread()");
        if (LLLLIIIILLL.getId() == LJ) {
            Handler handler = LIZ;
            if (handler != null) {
                handler.postDelayed(new ARunnableS44S0100000_8(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 108), j);
                return;
            } else {
                o.LJIJI("mainHandler");
                throw null;
            }
        }
        Handler handler2 = LIZIZ;
        if (handler2 != null) {
            handler2.postDelayed(new ARunnableS44S0100000_8(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 108), j);
        } else {
            o.LJIJI("backHandler");
            throw null;
        }
    }
}
