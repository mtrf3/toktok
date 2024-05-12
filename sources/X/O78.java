package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O78 implements Callable<O80> {
    @Override // java.util.concurrent.Callable
    public final O80 call() {
        int i;
        String sb;
        String str;
        QXX qxx;
        O79 LIZIZ = O79.LIZIZ();
        LIZIZ.getClass();
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap.put("start_time", Long.valueOf(System.currentTimeMillis()));
        if (C61359O6h.LJJIJIIJI == 0) {
            i = 1;
        } else {
            i = 0;
        }
        hashMap.put("is_hot_launch", Integer.valueOf(i));
        hashMap2.put("log_extra", O7I.LIZIZ().LIZJ());
        O80 o80 = null;
        LIZIZ.LJI(null, 84378473382L, "request", hashMap2, hashMap);
        if (C61359O6h.LIZJ == null) {
            return null;
        }
        O7O LIZIZ2 = C61359O6h.LIZIZ();
        LIZIZ2.LJIJI = true;
        if (C61359O6h.LJIIL == null && (qxx = C61359O6h.LJIILIIL) != null) {
            C61359O6h.LJIIL = qxx.LLIL();
        }
        HashMap<String, String> hashMap3 = C61359O6h.LJIIL;
        String LIZJ = LIZIZ2.LIZJ();
        if (C78886Uxe.LJJIIZI(LIZJ)) {
            C1DJ.LJIIJ("app_name is null, please check whether SplashAdSdk is initialized properly!");
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder(5120);
            try {
                sb2.append("/api/ad/splash/");
                sb2.append(LIZJ);
                sb2.append("/v14/");
                sb2.append("?_unused=0");
                sb2.append((CharSequence) O77.LJIIIIZZ());
                sb2.append(LIZIZ2.toString());
                sb2.append("&app_name=");
                sb2.append(LIZJ);
                if (hashMap3 != null) {
                    sb2.append(O77.LJIIIZ(hashMap3));
                }
                sb2.append("&refresh_num=");
                sb2.append(O76.LJI().LJII() + 1);
                if (C61359O6h.LJJIJIIJI != -1) {
                    sb2.append("&is_cold_start=");
                    sb2.append(C61359O6h.LJJIJIIJI);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            sb = sb2.toString();
        }
        O7I LIZIZ3 = O7I.LIZIZ();
        LIZIZ3.getClass();
        StringBuilder sb3 = new StringBuilder();
        Iterator it = ((ArrayList) LIZIZ3.LJIIJ).iterator();
        while (it.hasNext()) {
            sb3.append((String) it.next());
            sb3.append(",");
        }
        if (sb3.length() > 0) {
            sb3.deleteCharAt(sb3.length() - 1);
        }
        String sb4 = sb3.toString();
        ((ArrayList) O7I.LIZIZ().LJIIJ).clear();
        if (C78886Uxe.LJJIIZI(sb)) {
            return null;
        }
        C1DJ.LJIJJ(" sending preload request ");
        C61359O6h.LIZJ.getClass();
        if (C78983UzD.LJJJI(sb) || NW6.LIZ().isChildrenMode()) {
            return null;
        }
        try {
            String LIZJ2 = C61358O6g.LIZJ(sb);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SplashAdResponse_loadAdMessage url = ");
            LIZ.append(LIZJ2);
            C36922EeM.LJ(X1D.LIZIZ(LIZ));
            str = C61367O6p.LIZ().executePost(0, LIZJ2, sb4).execute().LIZIZ;
        } catch (Exception e2) {
            C78983UzD.LJIIZILJ(e2);
            C36922EeM.LJFF(new O8E(e2));
        }
        if (str == null) {
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            O88 o88 = new O88();
            o88.LIZIZ = !TextUtils.isEmpty(str);
            o88.LIZ = jSONObject;
            o80 = new O80(o88);
            return o80;
        } catch (JSONException e3) {
            C78983UzD.LJIIZILJ(e3);
            return o80;
        }
    }
}
