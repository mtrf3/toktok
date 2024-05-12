package X;

import java.lang.ref.WeakReference;

/* loaded from: classes16.dex */
public final class YM1 {
    public static volatile YM1 LIZIZ;
    public WeakReference<YM4> LIZ;

    public static YM1 LIZIZ() {
        if (LIZIZ == null) {
            synchronized (YM1.class) {
                LIZIZ = new YM1();
            }
        }
        return LIZIZ;
    }

    public final void LIZ() {
        WeakReference<YM4> weakReference = this.LIZ;
        if (weakReference == null) {
            return;
        }
        YM4 ym4 = weakReference.get();
        if (ym4 != null) {
            ym4.LIZIZ();
        }
        this.LIZ = null;
    }
}
