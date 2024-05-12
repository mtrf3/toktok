package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes10.dex */
public final class LFV {
    public static final boolean LIZ(Aweme aweme) {
        if (aweme == null || aweme.getFilterDuplicateTime() <= 0 || (SystemClock.uptimeMillis() - aweme.getFilterDuplicateTime()) / 1000 >= C012403c.LIZIZ(31744, 900L, "live_dedup_time_interval")) {
            return false;
        }
        return true;
    }
}
