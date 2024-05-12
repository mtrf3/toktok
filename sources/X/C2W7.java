package X;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.LinkedHashMap;

/* renamed from: X.2W7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2W7 {
    public static final C2W7 LIZIZ = new C2W7();
    public final java.util.Map<String, Long> LIZ = new LinkedHashMap();

    public final void LIZ(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                ((LinkedHashMap) this.LIZ).clear();
                java.util.Map<String, Long> map = this.LIZ;
                if (map != null) {
                    map.put("player_try_play", Long.valueOf(elapsedRealtime));
                }
            }
        }
    }
}
