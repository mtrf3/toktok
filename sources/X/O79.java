package X;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O79 {
    public static volatile O79 LIZIZ;
    public final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static O79 LIZIZ() {
        if (LIZIZ == null) {
            synchronized (O79.class) {
                if (LIZIZ == null) {
                    LIZIZ = new O79();
                }
            }
        }
        return LIZIZ;
    }

    public O79() {
        new ArrayList();
    }

    public final void LJ(boolean z) {
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            jSONObject2.putOpt("is_empty_data", Integer.valueOf(i));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", O7I.LIZIZ().LIZJ());
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        LIZLLL("splash_ad", "parse_finished", jSONObject, 84378473382L);
    }

    public final void LJFF(boolean z) {
        int i;
        HashMap<String, Object> hashMap = new HashMap<>();
        if (C61359O6h.LJJIJIIJI == 0) {
            i = 1;
        } else {
            i = 0;
        }
        hashMap.put("is_hot_launch", Integer.valueOf(i));
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap.put("status", Integer.valueOf(z ? 1 : 0));
        hashMap2.put("log_extra", O7I.LIZIZ().LIZJ());
        LJI(null, 84378473382L, "response", hashMap2, hashMap);
    }

    public static void LIZ(JSONObject jSONObject, HashMap hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(str) && value != null) {
                jSONObject.putOpt(str, value);
            }
        }
    }

    public final void LJII(O7E o7e, String str) {
        if (o7e == null || C78983UzD.LJJJI(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(o7e.LJLZ)) {
                jSONObject.put("log_extra", o7e.LJLZ);
            }
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("ad_fetch_time", o7e.LJLILLLLZI);
        } catch (Exception unused) {
            C61476OAu.LIZ("error in putting log_extra into json");
        }
        LIZLLL("splash_ad", str, jSONObject, o7e.LJLL);
    }

    public final void LJIIIIZZ(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("diff", Long.valueOf(O77.LJII() - System.currentTimeMillis()));
            jSONObject2.putOpt("server_time", Long.valueOf(O77.LJII()));
            jSONObject2.putOpt("device_time", Long.valueOf(System.currentTimeMillis()));
            jSONObject2.putOpt("is_time_valid", Integer.valueOf(i));
            jSONObject2.putOpt("invalid_reason", Integer.valueOf(i2));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("is_ad_event", "1");
            jSONObject.putOpt("log_extra", O7I.LIZIZ().LIZJ());
        } catch (Exception unused) {
            C61476OAu.LIZ("error in putting data into json");
        }
        LIZLLL("splash_ad", "valid_time", jSONObject, 84378473382L);
    }

    public final void LIZLLL(final String str, final String str2, final JSONObject jSONObject, final long j) {
        Runnable runnable = new Runnable() { // from class: X.N2g
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject2 = jSONObject;
                String str3 = str;
                String str4 = str2;
                long j2 = j;
                if (jSONObject2 != null) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject("ad_extra_data");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    long optLong = jSONObject2.optLong("ad_fetch_time", 0L);
                    if (optLong != 0) {
                        try {
                            optJSONObject.putOpt("ad_fetch_time", Long.valueOf(optLong));
                        } catch (JSONException unused) {
                            C61476OAu.LIZ("error in transferring ad fetch time");
                        }
                    }
                    optJSONObject.putOpt("current_time", O7K.LIZ(System.currentTimeMillis()));
                    jSONObject2.putOpt("ad_extra_data", optJSONObject);
                    jSONObject2.put("is_ad_event", "1");
                }
                if (C61359O6h.LIZIZ != null) {
                    EF7.LIZIZ();
                    if (TextUtils.equals(str4, "click")) {
                        FMX.LJI(0L, str3, str4, String.valueOf(j2), jSONObject2);
                        return;
                    }
                    C58655N0h LJ = C58704N2e.LJ(str3, str4, String.valueOf(j2), "", String.valueOf(0L));
                    if (jSONObject2 != null) {
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            LJ.LIZJ(jSONObject2.opt(next), next);
                        }
                    }
                    LJ.LJII();
                    if (C58704N2e.LIZJ()) {
                        FMX.LJI(0L, str3, str4, String.valueOf(j2), jSONObject2);
                    } else {
                        if (!C58704N2e.LIZIZ()) {
                            return;
                        }
                        try {
                            jSONObject2.put("_ad_staging_flag", "1");
                        } catch (JSONException e) {
                            C78983UzD.LJIIZILJ(e);
                        }
                        FMX.LJI(0L, str3, str4, String.valueOf(j2), jSONObject2);
                    }
                }
            }
        };
        if (C61359O6h.LJII().LJ) {
            C61359O6h.LJFF.execute(runnable);
        } else {
            this.LIZ.post(runnable);
        }
    }

    public final void LIZJ(int i, final long j, final String str, final String str2, final JSONObject jSONObject) {
        if (i > 5) {
            return;
        }
        if (C61359O6h.LJFF == null) {
            final int i2 = i + 1;
            this.LIZ.postDelayed(new Runnable() { // from class: X.O85
                @Override // java.lang.Runnable
                public final void run() {
                    O79 o79 = O79.this;
                    long j2 = j;
                    String str3 = str;
                    String str4 = str2;
                    JSONObject jSONObject2 = jSONObject;
                    int i3 = i2;
                    o79.getClass();
                    try {
                        o79.LIZJ(i3, j2, str3, str4, jSONObject2);
                    } catch (Throwable unused) {
                    }
                }
            }, 5000L);
        } else {
            LIZLLL(str, str2, jSONObject, j);
        }
    }

    public final void LJI(O7E o7e, long j, String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        String str2;
        long j2 = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            LIZ(jSONObject, hashMap);
            LIZ(jSONObject2, hashMap2);
            if (o7e != null) {
                if (!TextUtils.isEmpty(o7e.LJLZ)) {
                    jSONObject.put("log_extra", o7e.LJLZ);
                }
                jSONObject.put("ad_fetch_time", o7e.LJLILLLLZI);
                jSONObject2.putOpt("load_type", Integer.valueOf(o7e.LLII));
                if (o7e.LJIIIZ()) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject2.putOpt("is_topview", str2);
            }
            jSONObject.put("is_ad_event", "1");
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            if (o7e != null) {
                j2 = o7e.LJLL;
            }
            LIZJ(0, j2, "splash_ad", str, jSONObject);
        } catch (Exception unused) {
            C61476OAu.LIZ("error in putting log_extra into json");
        }
    }
}
