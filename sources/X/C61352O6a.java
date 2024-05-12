package X;

import org.json.JSONObject;

/* renamed from: X.O6a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61352O6a {
    public static volatile C61352O6a LIZLLL;
    public volatile long LIZ;
    public volatile boolean LIZIZ = true;
    public volatile long LIZJ;

    public static C61352O6a LIZ() {
        if (LIZLLL == null) {
            synchronized (C61352O6a.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C61352O6a();
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_ad_show_total_time", currentTimeMillis);
            O8O.LIZLLL().LJI("service_splash_ad_show_time", jSONObject, null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
