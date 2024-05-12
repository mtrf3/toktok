package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class J7V {
    public final java.util.Set<WeakReference<IHO>> LIZ = Q4K.LIZLLL();
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final Context LIZJ;

    public J7V(Context context) {
        this.LIZJ = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZ(X.IHO r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Set<java.lang.ref.WeakReference<X.IHO>> r0 = r2.LIZ     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L26
        L7:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L26
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L19
            r1.remove()     // Catch: java.lang.Throwable -> L26
            goto L7
        L19:
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L26
            X.IHO r0 = (X.IHO) r0     // Catch: java.lang.Throwable -> L26
            if (r0 != r3) goto L7
            r1.remove()     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r2)
            return
        L26:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J7V.LIZ(X.IHO):void");
    }
}
