package X;

import android.text.TextUtils;
import java.util.LinkedHashMap;

/* renamed from: X.Dz6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35660Dz6 {
    public static final C35660Dz6 LIZIZ = new C35660Dz6();
    public final C35659Dz5 LIZ = new C35659Dz5();

    public static C35660Dz6 LIZ() {
        return LIZIZ;
    }

    public final void LIZIZ(String str, String str2) {
        java.util.Map<String, Long> map;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                if ("player_try_play".equals(str2)) {
                    this.LIZ.remove(str);
                    map = new LinkedHashMap<>();
                    this.LIZ.put(str, map);
                } else {
                    map = this.LIZ.get(str);
                    if (map == null || map.containsKey(str2)) {
                        return;
                    }
                }
                map.put(str2, Long.valueOf(currentTimeMillis));
            }
        }
    }
}
