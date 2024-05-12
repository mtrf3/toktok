package X;

import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: X.JYh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC49347JYh<T> implements Callable<JYV<T>> {
    public final InterfaceC65784Pro<T> LJLIL;
    public String LJLILLLLZI = "AsyncTask";

    @Override // java.util.concurrent.Callable
    public final Object call() {
        T t;
        long j;
        int i;
        Exception exc = null;
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            t = this.LJLIL.invoke();
            j = SystemClock.uptimeMillis() - uptimeMillis;
            i = 0;
        } catch (Exception e) {
            t = null;
            exc = e;
            j = 0;
            i = 1;
        }
        return new JYV(t, i, exc, j, this.LJLILLLLZI);
    }

    public CallableC49347JYh(C49340JYa c49340JYa) {
        this.LJLIL = c49340JYa;
    }
}
