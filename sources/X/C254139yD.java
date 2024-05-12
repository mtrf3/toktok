package X;

import android.content.Intent;
import android.os.SystemClock;
import java.util.LinkedHashSet;

/* renamed from: X.9yD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254139yD {
    public static final java.util.Set<String> LIZ = new LinkedHashSet();

    public static long LIZ(Intent intent) {
        if (intent == null) {
            return 0L;
        }
        long longExtra = intent.getLongExtra("ttrc_session_start_time", 0L);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "ttrc_session_id");
        if (LLJJIJIIJIL == null) {
            return 0L;
        }
        java.util.Set<String> set = LIZ;
        if (set.contains(LLJJIJIIJIL) || longExtra <= 0) {
            return 0L;
        }
        set.add(LLJJIJIIJIL);
        return SystemClock.elapsedRealtime() - longExtra;
    }
}
