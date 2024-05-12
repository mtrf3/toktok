package X;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class FLI<V> implements Callable {
    public static final FLI<V> LJLIL = new FLI<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        if (FIZ.LIZ().getLong("active_time", 0L) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            FIZ.LIZ().edit().putLong("active_time", System.currentTimeMillis()).apply();
            FLJ.LIZ("fb_mobile_achievement_unlocked", null, null);
        } else if (!FIZ.LIZ().getBoolean("has_2d_rr_use", false)) {
            long j = FIZ.LIZ().getLong("active_time", 0L);
            long currentTimeMillis = System.currentTimeMillis();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (timeUnit.toDays(j) + 1 == timeUnit.toDays(currentTimeMillis)) {
                FLJ.LIZ("2d_rr_user", null, null);
                FLJ.LIZIZ("d2_rr_user", null, null);
                FIZ.LIZ().edit().putBoolean("has_2d_rr_use", true).apply();
            }
        }
        return null;
    }
}
