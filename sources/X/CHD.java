package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CHD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String openSource, String str) {
        String str2;
        o.LJIIIZ(openSource, "openSource");
        HashMap hashMap = new HashMap();
        hashMap.put("type", "gifting");
        if (o.LJ(openSource, "reject")) {
            str2 = "dark_pattern_group";
        } else {
            str2 = "frequency";
        }
        hashMap.put("risk_control_scenario", str2);
        hashMap.put("click_type", str);
        C29822Bn8.LIZIZ("livesdk_hit_risk_control_popup_click", hashMap);
    }
}
