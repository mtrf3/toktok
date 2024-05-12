package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PHD extends AbstractRunnableC64070PCo {
    public final /* synthetic */ PHC LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    public final void LIZ() {
        ?? r12;
        boolean z;
        java.util.Map<String, PHI> map;
        PHC phc = this.LJLJJI;
        if (C78248UnM.LJIIJ()) {
            phc.getClass();
        }
        phc.getClass();
        if (!PHC.LJIIIIZZ()) {
            PHC.LJZL = "bg_ever_front";
        }
        long currentTimeMillis = System.currentTimeMillis();
        long LIZ = phc.LJLLLLLL.LIZ();
        long LJIILLIIL = phc.LJLLLLLL.LIZ.LJIILLIIL();
        long LJJL = phc.LJLLLLLL.LIZ.LJJL();
        long LJFF = phc.LJLLLLLL.LIZ.LJFF();
        long LJJIIJZLJL = phc.LJLLLLLL.LIZ.LJJIIJZLJL();
        if (phc.LJLJLLL == -1) {
            phc.LJLJLLL = LIZ;
            phc.LJLL = LJIILLIIL;
            phc.LJLLI = LJJL;
            phc.LJLLILLLL = LJFF;
            phc.LJLLJ = LJJIIJZLJL;
            phc.LJLLL = currentTimeMillis;
            return;
        }
        JSONArray jSONArray = new JSONArray();
        long j = LIZ - phc.LJLJLLL;
        long j2 = LJIILLIIL - phc.LJLL;
        long j3 = LJJL - phc.LJLLI;
        long j4 = LJFF - phc.LJLLILLLL;
        long j5 = LJJIIJZLJL - phc.LJLLJ;
        if (j > phc.LJLZ.LIZJ) {
            r12 = 0;
            C80036Vb6.LJIIIIZZ("APM-TrafficInfo", C16880lQ.LLLZ("periodTrafficBytes in total: %d", new Object[]{Long.valueOf(j)}));
        } else {
            r12 = 0;
        }
        if (C78248UnM.LJIIJ()) {
            z = true;
            Object[] objArr = new Object[1];
            objArr[r12] = Long.valueOf(j);
            C16880lQ.LLLZ("periodTrafficBytes in total: %d", objArr);
        } else {
            z = true;
        }
        phc.LJIIIZ(j5, z, z);
        phc.LJIIIZ(j4, z, r12);
        phc.LJIIIZ(j3, r12, z);
        phc.LJIIIZ(j2, r12, r12);
        if (phc.LJLZ.LIZJ > 0 && j > phc.LJLZ.LIZJ) {
            jSONArray.put("total_usage_abnormal");
        } else if (phc.LJLZ.LIZLLL > 0 && j2 + j4 > phc.LJLZ.LIZLLL) {
            if (TextUtils.equals(PHC.LJZL, "bg_never_front")) {
                jSONArray.put("never_front_usage_abnormal");
            } else {
                jSONArray.put("bg_usage_abnormal");
            }
        }
        PHK phk = EGD.LIZ;
        C65548Po0<PHI> LIZ2 = phk.LIZ();
        if (LIZ2 != null && LIZ2.LIZ.size() > 0) {
            jSONArray.put("large_request");
        }
        if (PHQ.LIZ.LIZLLL > phc.LJLZ.LJ) {
            jSONArray.put("high_feq_request");
        }
        phc.LJLJLLL = LIZ;
        phc.LJLLJ = LJJIIJZLJL;
        phc.LJLLILLLL = LJFF;
        phc.LJLL = LJIILLIIL;
        phc.LJLLI = LJJL;
        java.util.Map<String, J8T> LJIIIZ = phk.LJIIIZ();
        if (LJIIIZ != null) {
            try {
                Iterator<Map.Entry<String, J8T>> it = LJIIIZ.entrySet().iterator();
                while (it.hasNext()) {
                    J8T value = it.next().getValue();
                    if (value != null) {
                        for (Map.Entry entry : ((HashMap) value.LIZIZ).entrySet()) {
                            if (((Long) entry.getValue()).longValue() > phc.LJLZ.LIZLLL / 10) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("MobileBackBytes=");
                                LIZ3.append(entry.getValue());
                                LIZ3.append(" sourceId=");
                                LIZ3.append((String) entry.getKey());
                                C80036Vb6.LJIIIIZZ("APM-TrafficInfo", X1D.LIZIZ(LIZ3));
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        PHK phk2 = EGD.LIZ;
        phc.LJIIJ(phk2.LJIIL(), "usage_10_minutes", jSONArray2);
        phc.LJIIJ(phk2.LJII(), "wifi_front", jSONArray2);
        phc.LJIIJ(phk2.LIZIZ(), "wifi_back", jSONArray2);
        phc.LJIIJ(phk2.LIZJ(), "mobile_front", jSONArray2);
        phc.LJIIJ(LJIIIZ, "mobile_back", jSONArray2);
        JSONObject jSONObject = new JSONObject();
        if (jSONArray2.length() > 0) {
            try {
                jSONObject.put("usage", jSONArray2);
            } catch (Exception unused2) {
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("usage_10_minutes", j);
            jSONObject2.put("mobile_back", j2);
            jSONObject2.put("mobile_front", j3);
            jSONObject2.put("wifi_back", j4);
            jSONObject2.put("wifi_front", j5);
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("detail", jSONObject);
            jSONObject4.put("biz_usage", EGD.LIZ.LJFF());
            jSONObject4.put("init_ts", phc.LJLLL);
            jSONObject4.put("usage_ts", currentTimeMillis);
            String str = phc.LJLLLLLL.LIZIZ;
            if (!TextUtils.isEmpty(str)) {
                jSONObject4.put("traffic_impl", str);
            }
            PEF pef = new PEF();
            pef.LIZ = "traffic";
            pef.LJ = jSONObject3;
            pef.LIZLLL = jSONObject2;
            pef.LJI = jSONObject4;
            PHC.LJIIJJI(pef);
            phc.LJLLL = currentTimeMillis;
            if (jSONArray.length() > 0) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("exception", true);
                jSONObject5.put("exception_type", jSONArray);
                PHE phe = PHQ.LIZ;
                synchronized (phe) {
                    map = phe.LIZIZ;
                }
                if (map != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (Map.Entry entry2 : ((HashMap) map).entrySet()) {
                        if (((PHI) entry2.getValue()).LJLJJI > phc.LJLZ.LJ) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("path", ((PHI) entry2.getValue()).LJLIL);
                            jSONObject6.put("freq", ((PHI) entry2.getValue()).LJLJJI);
                            jSONObject6.put("biz", ((PHI) entry2.getValue()).LJLILLLLZI);
                            jSONArray3.put(jSONObject6);
                        }
                    }
                    jSONObject.put("high_freq", jSONArray3);
                }
                if (LIZ2 != null) {
                    ArrayList arrayList = (ArrayList) LIZ2.LIZIZ();
                    if (arrayList.size() > 0) {
                        JSONArray jSONArray4 = new JSONArray();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            PHI phi = (PHI) it2.next();
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("path", phi.LJLIL);
                            jSONObject7.put("usage", phi.LJLJI);
                            jSONObject7.put("biz", phi.LJLILLLLZI);
                            jSONArray4.put(jSONObject7);
                        }
                        jSONObject.put("large_usage", jSONArray4);
                    }
                }
                jSONObject5.put("biz_usage", EGD.LIZ.LJFF());
                jSONObject5.put("detail", jSONObject);
                if (!TextUtils.isEmpty(str)) {
                    jSONObject5.put("traffic_impl", str);
                }
                PEF pef2 = new PEF();
                pef2.LIZ = "traffic";
                pef2.LJ = jSONObject3;
                pef2.LIZLLL = jSONObject2;
                pef2.LJI = jSONObject5;
                PHC.LJIIJJI(pef2);
            }
        } catch (JSONException unused3) {
        }
        SharedPreferences.Editor edit = F9J.LIZIZ(C78248UnM.LJLJJI, 0, "traffic_monitor_info").edit();
        edit.putLong("usage", LIZ);
        long j6 = phc.LJLJLJ;
        PHK phk3 = EGD.LIZ;
        long LJFF2 = phk3.LJFF() + j6;
        phc.LJLJLJ = LJFF2;
        edit.putLong("biz_usage", LJFF2);
        edit.putLong("usage_ts", System.currentTimeMillis());
        java.util.Map<String, J8T> LJIILJJIL = phk3.LJIILJJIL();
        if (LJIILJJIL != null && LJIILJJIL.size() > 0) {
            JSONArray jSONArray5 = new JSONArray();
            Iterator<Map.Entry<String, J8T>> it3 = LJIILJJIL.entrySet().iterator();
            while (it3.hasNext()) {
                JSONObject LIZ4 = it3.next().getValue().LIZ();
                try {
                    LIZ4.put("traffic_category", "total_usage");
                } catch (Exception unused4) {
                }
                jSONArray5.put(LIZ4);
            }
            edit.putString("biz_json", jSONArray5.toString());
        }
        edit.apply();
        EGD.LIZ.clear();
        PHE phe2 = PHQ.LIZ;
        phe2.getClass();
        phe2.LIZLLL = 0;
        java.util.Map<String, PHI> map2 = phe2.LIZ;
        if (map2 != null) {
            ((HashMap) map2).clear();
            phe2.LIZ = null;
        }
        java.util.Map<String, PHI> map3 = phe2.LIZIZ;
        if (map3 == null) {
            return;
        }
        ((HashMap) map3).clear();
        phe2.LIZIZ = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PHD(PHC phc) {
        super(0L, 600000L);
        this.LJLJJI = phc;
    }
}
