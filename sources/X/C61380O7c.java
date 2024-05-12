package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.text.DecimalFormat;
import org.json.JSONObject;

/* renamed from: X.O7c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61380O7c {
    public static volatile C61380O7c LJ;
    public C61385O7h LIZ;
    public PthreadTimer LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    public static C61380O7c LIZ() {
        if (LJ == null) {
            synchronized (C61380O7c.class) {
                if (LJ == null) {
                    LJ = new C61380O7c();
                }
            }
        }
        return LJ;
    }

    public static void LIZIZ(O7E o7e) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", 0);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", o7e.LJLZ);
            jSONObject.put("ad_fetch_time", o7e.LJLILLLLZI);
            O79.LIZIZ().LIZLLL("splash_ad", "mute", jSONObject, o7e.LJLL);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZJ(O7E o7e, float f) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", new DecimalFormat("0.0000").format(f));
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", o7e.LJLZ);
            jSONObject.put("ad_fetch_time", o7e.LJLILLLLZI);
            O79.LIZIZ().LIZLLL("splash_ad", "unmute", jSONObject, o7e.LJLL);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
