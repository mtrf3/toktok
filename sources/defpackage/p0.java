package defpackage;

import X.BZI;
import X.C28787BRn;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class p0 {
    public static final Map<String, Long> LIZ = new LinkedHashMap();

    public static void LIZ(long j, String str) {
        Long valueOf = Long.valueOf(j);
        Map<String, Long> map = LIZ;
        map.put(str, valueOf);
        if (map.size() == 6) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_game_partnership_pf_intro_card");
            LIZ2.LJJII(map);
            LIZ2.LJJIIJZLJL();
            ((LinkedHashMap) map).clear();
        }
    }
}
