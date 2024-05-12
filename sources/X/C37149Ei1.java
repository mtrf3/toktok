package X;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import org.json.JSONObject;

/* renamed from: X.Ei1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37149Ei1 {
    public static void LIZ(String str, String str2, boolean z, boolean z2) {
        String str3;
        String str4;
        C79605VMb c79605VMb = new C79605VMb("hybrid_ecom_mask_load");
        c79605VMb.LIZIZ = "tiktok_hybrid_ecom_timecost";
        JSONObject LIZJ = C65232Piu.LIZJ("url", str);
        if (z2) {
            str3 = "success";
        } else {
            str3 = "failed";
        }
        LIZJ.put("state", str3);
        if (z) {
            str4 = "spark";
        } else {
            str4 = "bullet";
        }
        LIZJ.put("container", str4);
        if (str2 != null) {
            LIZJ.put("reason", str2);
        }
        c79605VMb.LIZLLL = LIZJ;
        c79605VMb.LIZIZ(0);
        HybridMultiMonitor.getInstance().customReport(c79605VMb.LIZ());
    }
}
