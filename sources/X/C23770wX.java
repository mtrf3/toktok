package X;

import Y.IDRunnableS85S0100000;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0wX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23770wX {
    public final C04740Go LIZ;
    public final DisplayMetrics LIZIZ;
    public Handler LIZJ;
    public Float LIZLLL;
    public final IDRunnableS85S0100000 LJ = new IDRunnableS85S0100000(this, 101);
    public final IDRunnableS85S0100000 LJFF = new IDRunnableS85S0100000(this, 102);

    public final void LIZ(ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha) {
        Handler handler;
        this.LIZLLL = Float.valueOf(choreographerFrameCallbackC30341Ha.LIZIZ());
        this.LIZ.invalidateSelf();
        if (this.LIZJ == null) {
            C04740Go lottieDrawable = this.LIZ;
            o.LJIIJ(lottieDrawable, "lottieDrawable");
            ConcurrentHashMap<Integer, Handler> concurrentHashMap = C06220Mg.LIZ;
            synchronized (concurrentHashMap) {
                int hashCode = lottieDrawable.hashCode();
                if (!concurrentHashMap.containsKey(Integer.valueOf(hashCode))) {
                    int max = Math.max(C04010Dt.LIZIZ, 1);
                    long j = C06220Mg.LIZIZ;
                    C06220Mg.LIZIZ = 1 + j;
                    int i = (int) (j % max);
                    ArrayList<Handler> arrayList = C06220Mg.LIZJ;
                    if (arrayList.size() > i) {
                        Integer valueOf = Integer.valueOf(hashCode);
                        Handler handler2 = arrayList.get(i);
                        o.LJFF(handler2, "handlers[groupId]");
                        concurrentHashMap.put(valueOf, handler2);
                        Handler handler3 = concurrentHashMap.get(Integer.valueOf(hashCode));
                        if (handler3 != null) {
                            handler = handler3;
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    } else {
                        System.currentTimeMillis();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("LottieWorkThread-");
                        LIZ.append(i);
                        HandlerThread handlerThread = new HandlerThread(X1D.LIZIZ(LIZ));
                        handlerThread.start();
                        handler = new Handler(handlerThread.getLooper());
                        arrayList.add(handler);
                        concurrentHashMap.put(Integer.valueOf(hashCode), handler);
                    }
                } else {
                    Handler handler4 = concurrentHashMap.get(Integer.valueOf(hashCode));
                    if (handler4 != null) {
                        handler = handler4;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
            }
            this.LIZJ = handler;
        }
        this.LIZJ.post(this.LJ);
    }

    public C23770wX(C04740Go c04740Go, DisplayMetrics displayMetrics) {
        this.LIZ = c04740Go;
        this.LIZIZ = displayMetrics;
    }
}
