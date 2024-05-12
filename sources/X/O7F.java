package X;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O7F implements InterfaceC61356O6e {
    public final O86 LIZ;
    public volatile boolean LIZIZ;
    public long LIZJ;
    public final View LIZLLL;

    public final void LIZIZ() {
        this.LIZIZ = true;
        C61360O6i.LIZJ().getClass();
    }

    public final void LIZJ() {
        if (this.LIZIZ) {
            return;
        }
        LIZIZ();
        C61352O6a.LIZ().LIZIZ();
        O86 o86 = this.LIZ;
        O8I o8i = new O8I();
        o8i.LIZ = 0;
        o86.LIZJ(o8i);
    }

    public final void LJ() {
        this.LIZ.LIZIZ();
    }

    public final void LJFF(O7E o7e) {
        if (this.LIZIZ) {
            return;
        }
        int i = o7e.LLFZ;
        int i2 = 1;
        if (i == 0 || i == 1) {
            HashMap<String, Object> hashMap = new HashMap<>();
            HashMap<String, Object> hashMap2 = new HashMap<>();
            int i3 = C61359O6h.LJJIJIIJI;
            if (i3 != -1) {
                if (i3 != 1) {
                    i2 = 2;
                }
                hashMap2.put("awemelaunch", Integer.valueOf(i2));
            }
            hashMap2.put("show_type", "not_real_time");
            hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - this.LIZJ));
            hashMap.put("is_ad_event", "1");
            if (!TextUtils.isEmpty(o7e.LJLZ)) {
                hashMap.put("log_extra", o7e.LJLZ);
            }
            hashMap.put("ad_fetch_time", Long.valueOf(o7e.LJLILLLLZI));
            O79.LIZIZ().LJI(o7e, 0L, "show_over", hashMap, hashMap2);
        }
        LIZIZ();
        C61352O6a.LIZ().LIZIZ();
        O86 o86 = this.LIZ;
        O8I o8i = new O8I();
        o8i.LIZ = 2;
        o86.LIZJ(o8i);
    }

    public O7F(O7W o7w, O86 o86) {
        this.LIZLLL = o7w;
        this.LIZ = o86;
    }

    public final boolean LIZLLL(O7E o7e, C61395O7r c61395O7r) {
        String str;
        int i;
        if (o7e.LLD == 3 && c61395O7r.LIZ < 0) {
            if (O77.LIZIZ(o7e.LJLLJ)) {
                str = o7e.LJLLJ;
                new O8L();
            } else {
                str = o7e.LJLLILLLL;
            }
        } else {
            str = o7e.LJLLILLLL;
        }
        String str2 = o7e.LJZ;
        if (c61395O7r.LJ) {
            String str3 = c61395O7r.LIZLLL;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ad_fetch_time", o7e.LJLILLLLZI);
                if (!C78886Uxe.LJJIIZI(o7e.LJLZ)) {
                    jSONObject.put("log_extra", o7e.LJLZ);
                }
                jSONObject.put("is_ad_event", "1");
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                jSONObject = null;
            }
            O79.LIZIZ().LIZLLL("splash_ad", str3, jSONObject, o7e.LJLL);
        }
        List<C59762Ncs> LIZ = LIZ(str, o7e.LJLLL, str2);
        if (C30591Hz.LJIJJ(LIZ)) {
            C59760Ncq LJFF = o7e.LJFF();
            LJFF.LIZLLL = LIZ;
            if (c61395O7r.LIZ > 0) {
                LJFF.LJ.getClass();
            }
            this.LIZ.LIZLLL(LJFF);
            JSONObject jSONObject2 = new JSONObject();
            try {
                Point point = c61395O7r.LIZJ;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.putOpt("click_x", Integer.valueOf(point.x));
                jSONObject3.putOpt("click_y", Integer.valueOf(point.y));
                jSONObject2.putOpt("ad_extra_data", jSONObject3);
                if (c61395O7r.LIZ >= 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                jSONObject2.putOpt("area", Integer.valueOf(i));
                jSONObject2.putOpt("log_extra", o7e.LJLZ);
                jSONObject2.putOpt("is_ad_event", "1");
                jSONObject2.putOpt("show_time", Long.valueOf(System.currentTimeMillis() - this.LIZJ));
                jSONObject2.put("ad_fetch_time", o7e.LJLILLLLZI);
            } catch (Exception unused) {
            }
            O79.LIZIZ().LIZLLL("splash_ad", "click", jSONObject2, o7e.LJLL);
            C61404O8a.LJFF().LIZIZ(null, o7e.LJLL, o7e.LLIIIILZ, o7e.LJLZ, true, -1L, null);
            LIZIZ();
            return true;
        }
        return false;
    }

    public static List<C59762Ncs> LIZ(String str, String str2, String str3) {
        int LJIILLIIL;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && O77.LIZIZ(str) && (LJIILLIIL = O77.LJIILLIIL(str)) != 0 && LJIILLIIL != 5) {
            arrayList.add(new C59762Ncs(str, LJIILLIIL));
        }
        if (C78977Uz7.LJJJJZI(str2)) {
        }
        if (!TextUtils.isEmpty(str3) && (str3.startsWith("http://") || str3.startsWith("https://"))) {
            arrayList.add(new C59762Ncs(str3, 2));
        }
        return arrayList;
    }
}
