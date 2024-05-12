package X;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import org.json.JSONObject;

/* renamed from: X.Ei0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37148Ei0 {
    public static void LIZIZ(boolean z, String str, boolean z2, String str2, boolean z3) {
        LIZ(null, str, null, str2, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    public static void LIZ(C37147Ehz c37147Ehz, String str, Object obj, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        Integer num;
        int i;
        boolean z;
        C79605VMb c79605VMb = new C79605VMb(str);
        c79605VMb.LIZIZ = "tiktok_hybrid_ecom_timecost";
        c79605VMb.LIZ = str2;
        JSONObject jSONObject = new JSONObject();
        if (c37147Ehz != null) {
            num = Integer.valueOf(c37147Ehz.LJLIL);
        } else {
            num = null;
        }
        JSONObject put = jSONObject.put("status", num);
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        JSONObject put2 = put.put("view_hash", i);
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        c79605VMb.LIZLLL = put2.put("view_status", z).put("trigger_card_event", bool).put("isPageReady", bool2).put("isLoadSuccess", bool3).put("from", "spark").put("url", str2);
        c79605VMb.LIZIZ(0);
        HybridMultiMonitor.getInstance().customReport(c79605VMb.LIZ());
    }
}
