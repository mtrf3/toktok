package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.S3d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71469S3d {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public final C71473S3h LJII = new C71473S3h();
    public HashMap<String, String> LJIIIIZZ;

    public final JSONObject LIZ() {
        JSONObject LJ = C47135Ieh.LJ("EVENT_ORIGIN_FEATURE", "TEMAI", "enter_from_merge", "homepage_hot");
        LJ.put("enter_method", "live_cell");
        LJ.put("action_type", "click");
        LJ.put("source_page_type", "live");
        String str = this.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LJ.put("product_id", str);
        String str3 = this.LIZIZ;
        if (str3 == null) {
            str3 = "";
        }
        LJ.put("author_id", str3);
        String str4 = this.LIZJ;
        if (str4 == null) {
            str4 = "";
        }
        LJ.put("room_id", str4);
        String str5 = this.LIZLLL;
        if (str5 == null) {
            str5 = "";
        }
        LJ.put("request_id", str5);
        String str6 = this.LJ;
        if (str6 == null) {
            str6 = "";
        }
        LJ.put("original_price_value", str6);
        String str7 = this.LJFF;
        if (str7 == null) {
            str7 = "";
        }
        LJ.put("sale_price_value", str7);
        String str8 = this.LJI;
        if (str8 != null) {
            str2 = str8;
        }
        LJ.put("follow_status", str2);
        HashMap<String, String> hashMap = this.LJIIIIZZ;
        if (hashMap != null) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                LJ.put(entry.getKey(), entry.getValue());
            }
        }
        return LJ;
    }

    public final void LIZIZ(String str) {
        long j;
        long j2;
        switch (str.hashCode()) {
            case -245071156:
                if (!str.equals("card_show")) {
                    return;
                }
                this.LJII.LIZJ = SystemClock.elapsedRealtime();
                C71473S3h c71473S3h = this.LJII;
                j2 = c71473S3h.LIZIZ;
                j = c71473S3h.LIZJ;
                break;
            case 3482191:
                if (!str.equals("quit")) {
                    return;
                }
                this.LJII.LIZLLL = SystemClock.elapsedRealtime();
                C71473S3h c71473S3h2 = this.LJII;
                j2 = c71473S3h2.LIZ;
                j = c71473S3h2.LIZLLL;
                break;
            case 1196588850:
                if (!str.equals("network_response")) {
                    return;
                }
                this.LJII.LIZIZ = SystemClock.elapsedRealtime();
                C71473S3h c71473S3h3 = this.LJII;
                j2 = c71473S3h3.LIZ;
                j = c71473S3h3.LIZIZ;
                break;
            case 2115102078:
                if (!str.equals("network_request")) {
                    return;
                }
                this.LJII.LIZ = SystemClock.elapsedRealtime();
                j = 1;
                j2 = 1;
                break;
            default:
                return;
        }
        long j3 = j - j2;
        if (j2 <= 0 || j3 < 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str2 = this.LIZ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("product_id", str2);
        String str4 = this.LIZIZ;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("author_id", str4);
        String str5 = this.LIZJ;
        if (str5 != null) {
            str3 = str5;
        }
        jSONObject.put("room_id", str3);
        jSONObject.put("duration", j3);
        jSONObject.put("step", str);
        C48658J7u.LIZIZ("rd_tiktokec_live_preview_card_event", jSONObject);
    }
}
