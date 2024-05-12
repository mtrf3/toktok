package X;

import Y.IDRunnableS0S1200000;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.g0;
import defpackage.i0;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Js, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31041Js implements C0RE {
    public java.util.Map<String, String> LIZ = new ConcurrentHashMap();
    public String LIZIZ;

    public final void LIZ(String str, final C37611dl c37611dl, String str2) {
        if (!TextUtils.equals(this.LIZIZ, str)) {
            this.LIZIZ = str;
            C0RD c0rd = new C0RD() { // from class: X.1Jr
                @Override // X.C0RD
                public final void LIZ(java.util.Map<String, String> map) {
                    C31041Js.this.LIZ = map;
                    C0RD c0rd2 = c37611dl;
                    if (c0rd2 != null) {
                        c0rd2.LIZ(map);
                    }
                }
            };
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                RunnableC39007FSp.LIZIZ(new IDRunnableS0S1200000(this, str2, c0rd, 9));
                return;
            } else {
                LIZIZ(this.LIZIZ, c0rd, str2);
                return;
            }
        }
        if (c37611dl == null) {
            return;
        }
        c37611dl.LIZ(this.LIZ);
    }

    public final void LIZIZ(String str, C0RD c0rd, String str2) {
        String LJFF;
        HashMap hashMap = new HashMap();
        try {
            java.util.Map LJJIJIIJIL = g0.LJJIJIIJIL(new JSONObject(C77125UOr.LJIL(C276216o.LJIIL.LIZ.LIZ)));
            if (LJJIJIIJIL != null) {
                hashMap.putAll(LJJIJIIJIL);
            }
        } catch (Throwable unused) {
        }
        C276216o c276216o = C276216o.LJIIL;
        if (c276216o.LJFF == null) {
            synchronized (c276216o) {
                if (c276216o.LJFF == null) {
                    c276216o.LJFF = new C31021Jq(c276216o.LIZ.LIZ);
                }
            }
        }
        C31021Jq c31021Jq = c276216o.LJFF;
        SharedPreferences sharedPreferences = c31021Jq.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sp_key_starling_data_");
        LIZ.append(str);
        String string = sharedPreferences.getString(X1D.LIZIZ(LIZ), "");
        if (!TextUtils.isEmpty(string)) {
            try {
                hashMap.putAll(g0.LJJIJIIJIL(new JSONObject(string)));
            } catch (Throwable unused2) {
            }
        }
        SharedPreferences sharedPreferences2 = c31021Jq.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("sp_key_starling_version_");
        LIZ2.append(str);
        long j = sharedPreferences2.getLong(X1D.LIZIZ(LIZ2), 0L);
        if (TextUtils.isEmpty(str2)) {
            LJFF = C48559J3z.LIZ("/payment/v1/cashier_starling");
        } else {
            LJFF = i0.LJFF(str2, "/payment/v1/cashier_starling");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", j);
            jSONObject.put("language", str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        QKY qky = new QKY();
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("Content-Type", "application/json");
            C276216o c276216o2 = C276216o.LJIIL;
            String LJ = c276216o2.LIZ.LJIIJJI.LJ(LJFF, jSONObject.toString().getBytes(), hashMap2, qky);
            JSONObject jSONObject2 = new JSONObject(LJ);
            if (TextUtils.equals(jSONObject2.optString("result_code"), "success")) {
                JSONObject optJSONObject = jSONObject2.optJSONObject("text_package");
                if (optJSONObject != null) {
                    java.util.Map LJJIJIIJIL2 = g0.LJJIJIIJIL(optJSONObject);
                    if (((HashMap) LJJIJIIJIL2).size() > 0) {
                        hashMap.putAll(LJJIJIIJIL2);
                        this.LIZ.putAll(hashMap);
                        C0RC LIZLLL = c276216o2.LIZLLL();
                        Long valueOf = Long.valueOf(jSONObject2.optLong("version"));
                        SharedPreferences.Editor edit = ((C31021Jq) LIZLLL).LIZ.edit();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("sp_key_starling_version_");
                        LIZ3.append(str);
                        edit.putLong(X1D.LIZIZ(LIZ3), valueOf.longValue()).apply();
                        String jSONObject3 = optJSONObject.toString();
                        SharedPreferences.Editor edit2 = ((C31021Jq) LIZLLL).LIZ.edit();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("sp_key_starling_data_");
                        LIZ4.append(str);
                        edit2.putString(X1D.LIZIZ(LIZ4), jSONObject3).apply();
                        if (c0rd != null) {
                            c0rd.LIZ(this.LIZ);
                            return;
                        }
                        return;
                    }
                }
            } else {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("request starling data error:");
                LIZ5.append(LJ);
                X1D.LIZIZ(LIZ5);
            }
        } catch (Throwable th) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("request starling data exception:");
            LIZ6.append(th.getLocalizedMessage());
            X1D.LIZIZ(LIZ6);
        }
        this.LIZ.putAll(hashMap);
        if (c0rd != null) {
            c0rd.LIZ(this.LIZ);
        }
    }
}
