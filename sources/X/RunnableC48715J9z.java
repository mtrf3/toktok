package X;

import java.lang.ref.WeakReference;

/* renamed from: X.J9z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC48715J9z implements Runnable {
    public static final RunnableC48715J9z LJLIL = new RunnableC48715J9z();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        JA0 ja0;
        try {
            WeakReference<JA0> weakReference = C48714J9y.LIZJ;
            if (weakReference != null && (ja0 = weakReference.get()) != null) {
                ja0.x2();
            }
            FAJ.LJFF("feed_cache_trigger_preload_async", false);
        } finally {
            if (LIZ) {
            }
        }
    }
}
