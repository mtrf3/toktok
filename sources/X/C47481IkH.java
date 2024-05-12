package X;

import android.os.Looper;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashSet;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.IkH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47481IkH {
    public static volatile C47481IkH LJ;
    public final AtomicInteger LIZ = new AtomicInteger(2);
    public final Queue<TTVideoEngine> LIZIZ = new LinkedBlockingQueue();
    public final java.util.Set<TTVideoEngine> LIZJ = new HashSet();
    public final WeakHashMap<TTVideoEngine, Integer> LIZLLL = new WeakHashMap<>();

    public static C47481IkH LIZ() {
        if (LJ == null) {
            synchronized (C47481IkH.class) {
                if (LJ == null) {
                    LJ = new C47481IkH();
                    C78253UnR.LJI("TTVideoEnginePool", "Construct TTVideoEnginePool");
                }
            }
        }
        return LJ;
    }

    public final void LIZIZ(TTVideoEngine tTVideoEngine) {
        boolean z;
        int size;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("giveBackEngine resetFinish Enter, Engine:");
        LIZ.append(tTVideoEngine);
        LIZ.append(", curLooper:");
        LIZ.append(Looper.myLooper());
        LIZ.append(", corePool.size = ");
        LIZ.append(((LinkedBlockingQueue) this.LIZIZ).size());
        C78253UnR.LJI("TTVideoEnginePool", X1D.LIZIZ(LIZ));
        synchronized (this) {
            if (((LinkedBlockingQueue) this.LIZIZ).size() < this.LIZ.get()) {
                if (((LinkedBlockingQueue) this.LIZIZ).offer(tTVideoEngine)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("giveBackEngine Engine:");
                    LIZ2.append(tTVideoEngine);
                    LIZ2.append(" give back to corePool");
                    C78253UnR.LJI("TTVideoEnginePool", X1D.LIZIZ(LIZ2));
                    z = false;
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("giveBackEngine Engine:");
                    LIZ3.append(tTVideoEngine);
                    LIZ3.append(" , Warning:give back to corePool failed!");
                    C78253UnR.LJI("TTVideoEnginePool", X1D.LIZIZ(LIZ3));
                }
            }
            z = true;
        }
        if (z) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("giveBackEngine Engine:");
            LIZ4.append(tTVideoEngine);
            LIZ4.append(" need release");
            TTVideoEngineLog.d("TTVideoEnginePool", X1D.LIZIZ(LIZ4));
            tTVideoEngine.LJJLIIIJILLIZJL();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("giveBackEngine Engine:");
            LIZ5.append(tTVideoEngine);
            JBR.LJIIIZ(LIZ5, " released by TTVideoEnginePool", LIZ5, "TTVideoEnginePool");
        }
        synchronized (this) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("giveBackEngine Engine:");
            LIZ6.append(tTVideoEngine);
            LIZ6.append(" remove...");
            TTVideoEngineLog.d("TTVideoEnginePool", X1D.LIZIZ(LIZ6));
            this.LIZLLL.remove(tTVideoEngine);
            size = this.LIZLLL.size();
            ((HashSet) this.LIZJ).remove(tTVideoEngine);
            notify();
        }
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("giveBackEngine resetFinish End, Engine:");
        LIZ7.append(tTVideoEngine);
        LIZ7.append(", corePool.size = ");
        LIZ7.append(((LinkedBlockingQueue) this.LIZIZ).size());
        LIZ7.append(", countOfEngineInUse:");
        LIZ7.append(size);
        C78253UnR.LJI("TTVideoEnginePool", X1D.LIZIZ(LIZ7));
    }
}
