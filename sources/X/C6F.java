package X;

import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class C6F {
    public static C6K LIZ;

    public static long LIZ(long j, long j2) {
        if (j == -1 || j2 < j) {
            return -1L;
        }
        return j2 - j;
    }

    public static C6K LIZIZ() {
        C6K c6k = LIZ;
        if (c6k == null) {
            C6K c6k2 = new C6K();
            LIZ = c6k2;
            return c6k2;
        }
        return c6k;
    }

    public static void LIZJ(String str, java.util.Map map) {
        String str2;
        HashMap hashMap = (HashMap) map;
        hashMap.put("action", str);
        BZI LIZ2 = C28787BRn.LIZ("goal_indicator_all_in_one");
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                str2 = value.toString();
            } else {
                str2 = null;
            }
            LIZ2.LJIJJ(str2, str3);
        }
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZI();
        }
    }
}
