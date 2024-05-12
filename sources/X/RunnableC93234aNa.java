package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.aNa, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93234aNa implements Runnable {
    public final /* synthetic */ String LJLIL;

    public RunnableC93234aNa(String str) {
        this.LJLIL = str;
    }

    public final void LIZ() {
        ConcurrentHashMap<String, Handler> concurrentHashMap;
        Object obj = ExecutorC93235aNb.LJLJJI;
        synchronized (obj) {
            concurrentHashMap = ExecutorC93235aNb.LJLJJL;
            if (concurrentHashMap.get(this.LJLIL) == null) {
                Looper.prepare();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    concurrentHashMap.put(this.LJLIL, new Handler(myLooper));
                    obj.notifyAll();
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        if (concurrentHashMap.get(this.LJLIL) != null) {
            Looper.loop();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
