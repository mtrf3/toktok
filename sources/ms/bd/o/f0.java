package ms.bd.o;

import android.os.Handler;
import android.os.HandlerThread;
import ms.bd.o.b;
import ms.bd.o.c2;

/* loaded from: classes7.dex */
public final class f0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        c2 LIZ = c2.LIZ(a.LIZIZ.LIZ);
        synchronized (LIZ) {
            LIZ.LJLJLJ = j;
            LIZ.LJLJLLL = i;
            LIZ.LJLJL = false;
            LIZ.LJLJJLL.clear();
            HandlerThread handlerThread = new HandlerThread((String) k.a(16777217, 0, 0L, "7e5a17", new byte[]{43, 126, 110, 20, 0, 36, 56, 65, 118, 5, 46, 117, 67, 20, 10}));
            LIZ.LJLILLLLZI = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(LIZ.LJLILLLLZI.getLooper());
            LIZ.LJLIL = handler;
            if (LIZ.LJLJI) {
                handler.postDelayed(new c2.a(), 10000L);
            } else {
                LIZ.LIZLLL();
            }
        }
        return null;
    }
}
