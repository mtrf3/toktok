package X;

import java.lang.ref.WeakReference;

/* renamed from: X.J9y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48714J9y {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static WeakReference<JA0> LIZJ;

    public static void LIZ() {
        JA0 ja0;
        if (((Number) C34313DdN.LIZ.getValue()).intValue() > 0) {
            FAJ.LIZ("feed_cache_trigger_preload_async", false);
            C38995FSd.LIZJ().execute(RunnableC48715J9z.LJLIL);
            return;
        }
        FAJ.LIZ("feed_cache_trigger_preload", false);
        WeakReference<JA0> weakReference = LIZJ;
        if (weakReference != null && (ja0 = weakReference.get()) != null) {
            ja0.x2();
        }
        FAJ.LJFF("feed_cache_trigger_preload", false);
    }
}
