package X;

import Y.IDRunnableS6S0101000;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class HWC {
    public static final ExecutorService LIZ = C38995FSd.LJFF();
    public static volatile java.util.Map<W5E, WeakReference<HWB>> LIZIZ = new LinkedHashMap(80, 0.75f, false);

    public static void LIZIZ(W5E w5e) {
        LIZ.execute(new IDRunnableS6S0101000(2, w5e, 25));
    }

    public static void LIZ(W5E w5e, HW9 hw9) {
        if (w5e != null) {
            LIZ.execute(new HWA(1, w5e, hw9));
        }
    }
}
