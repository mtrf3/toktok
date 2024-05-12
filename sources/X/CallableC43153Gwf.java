package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.Callable;

/* renamed from: X.Gwf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC43153Gwf<V> implements Callable {
    public static final CallableC43153Gwf<V> LJLIL = new CallableC43153Gwf<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!C43152Gwe.LIZ) {
            C43152Gwe.LIZ();
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            Keva keva = C43152Gwe.LIZIZ;
            if (currentTimeMillis - keva.getLong("last_mob_time", 0L) >= 259200000) {
                C43152Gwe.LIZ();
                keva.storeLong("last_mob_time", currentTimeMillis);
            }
        }
        return C76800UCe.LIZ;
    }
}
