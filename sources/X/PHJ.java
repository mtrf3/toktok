package X;

import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PHJ implements PHL {
    public boolean LIZ;
    public boolean LIZIZ;
    public java.util.Map<String, J8T> LIZJ;
    public java.util.Map<String, J8T> LIZLLL;
    public java.util.Map<String, J8T> LJ;
    public java.util.Map<String, J8T> LJFF;
    public java.util.Map<String, J8T> LJI;
    public java.util.Map<String, J8T> LJII;
    public C65548Po0<PHI> LJIIIIZZ;
    public volatile long LJIIIZ;
    public java.util.Map<String, java.util.Map<String, J8T>> LJIIJ;
    public double LJIIJJI = 102400.0d;
    public double LJIIL = 102400.0d;
    public final PHN LJIILIIL = new PHN(this);

    @Override // X.PHL
    public final void LJIIJ(JSONObject jSONObject) {
    }

    @Override // X.PHL
    public final void start() {
        this.LIZ = true;
        this.LIZIZ = true;
        C80036Vb6.LJLIL = true;
        C64094PDm.LIZ.LJIIJ(this.LJIILIIL);
        C64089PDh.LJIIJ().LJLJLJ = new PHO(this);
    }

    @Override // X.PHL
    public final void clear() {
        java.util.Map<String, J8T> map = this.LIZJ;
        if (map != null) {
            ((HashMap) map).clear();
        }
        java.util.Map<String, J8T> map2 = this.LJ;
        if (map2 != null) {
            ((HashMap) map2).clear();
        }
        java.util.Map<String, J8T> map3 = this.LJFF;
        if (map3 != null) {
            ((HashMap) map3).clear();
        }
        java.util.Map<String, J8T> map4 = this.LJI;
        if (map4 != null) {
            ((HashMap) map4).clear();
        }
        java.util.Map<String, J8T> map5 = this.LJII;
        if (map5 != null) {
            ((HashMap) map5).clear();
        }
        C65548Po0<PHI> c65548Po0 = this.LJIIIIZZ;
        if (c65548Po0 != null) {
            c65548Po0.LIZ.clear();
        }
        this.LJIIIZ = 0L;
    }

    @Override // X.PHL
    public final C65548Po0<PHI> LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LIZIZ() {
        return this.LJ;
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LIZJ() {
        return this.LJII;
    }

    @Override // X.PHL
    public final long LJFF() {
        return this.LJIIIZ;
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJII() {
        return this.LJFF;
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJIIIZ() {
        return this.LJI;
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJIIL() {
        return this.LIZJ;
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJIILJJIL() {
        return this.LIZLLL;
    }

    @Override // X.PHL
    public final void LIZLLL(double d) {
        this.LJIIL = d;
    }

    @Override // X.PHL
    public final void LJI(String str) {
        java.util.Map<String, java.util.Map<String, J8T>> map = this.LJIIJ;
        if (map == null) {
            return;
        }
        ((HashMap) map).remove(str);
    }

    @Override // X.PHL
    public final void LJIIJJI(double d) {
        this.LJIIJJI = d;
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJIILIIL(String str) {
        if (this.LJIIJ == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return (java.util.Map) ((HashMap) this.LJIIJ).get(str);
    }

    @Override // X.PHL
    public final void LJJIZ(String str) {
        if (this.LJIIJ == null) {
            this.LJIIJ = new HashMap();
        }
        this.LJIIJ.put(str, new HashMap());
    }

    @Override // X.PHL
    public final void LJ(String str, JSONObject jSONObject) {
        long j;
        if (!this.LIZ || TextUtils.isEmpty(str) || jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        try {
            String path = new java.net.URL(str).getPath();
            if (!TextUtils.isEmpty(path)) {
                String optString = jSONObject.optString("net_consume_type", "ttnet");
                JSONObject optJSONObject = jSONObject.optJSONObject("request_log");
                if (optJSONObject == null) {
                    String optString2 = jSONObject.optString("request_log");
                    if (!TextUtils.isEmpty(optString2)) {
                        optJSONObject = new JSONObject(optString2);
                    }
                }
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("response");
                if (optJSONObject2 != null) {
                    j = optJSONObject2.optLong("received_bytes") + optJSONObject2.optLong("sent_bytes");
                } else {
                    j = 0;
                }
                this.LJIIIZ += j;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        str = UriProtector.parse(str).buildUpon().clearQuery().build().toString();
                    } catch (Exception unused) {
                    }
                }
                LJIILL(j, optString, str);
                PHQ.LIZ.LIZ(j, path, optString);
            }
        } catch (Throwable unused2) {
        }
    }

    public final void LJIILL(long j, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean LIZIZ = C48168IvM.LIZIZ(C09970aH.LIZ);
        boolean isForeground = ActivityLifeObserver.getInstance().isForeground();
        if (this.LIZIZ && j > this.LJIIL) {
            C80036Vb6.LJIIIIZZ("APM-TrafficInfo", C16880lQ.LLLZ("trafficBytes: %d, sourceId: %s, business: %s, isWifi: %b, isFront: %b", new Object[]{Long.valueOf(j), str2, str, Boolean.valueOf(LIZIZ), Boolean.valueOf(isForeground)}));
        }
        if (C09970aH.LJII()) {
            C16880lQ.LLLZ("recordTrafficBytes: %d, sourceId: %s, business: %s, isWifi: %b, isFront: %b", new Object[]{Long.valueOf(j), str2, str, Boolean.valueOf(LIZIZ), Boolean.valueOf(isForeground)});
            boolean startsWith = str.startsWith("sk__");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bytes", j);
                jSONObject.put("sourceId", str2);
                jSONObject.put("isSocket", startsWith);
            } catch (Exception unused) {
            }
        }
        if (this.LIZJ == null) {
            this.LIZJ = new HashMap();
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new HashMap();
        }
        if (this.LJ == null) {
            this.LJ = new HashMap();
        }
        if (this.LJFF == null) {
            this.LJFF = new HashMap();
        }
        if (this.LJI == null) {
            this.LJI = new HashMap();
        }
        if (this.LJII == null) {
            this.LJII = new HashMap();
        }
        LJIILLIIL(str, j, str2, this.LIZJ);
        LJIILLIIL(str, j, str2, this.LIZLLL);
        if (LIZIZ) {
            if (!isForeground) {
                LJIILLIIL(str, j, str2, this.LJ);
            } else {
                LJIILLIIL(str, j, str2, this.LJFF);
            }
        } else if (!isForeground) {
            LJIILLIIL(str, j, str2, this.LJI);
        } else {
            LJIILLIIL(str, j, str2, this.LJII);
        }
        java.util.Map<String, java.util.Map<String, J8T>> map = this.LJIIJ;
        if (map != null) {
            Iterator it = ((HashMap) map).entrySet().iterator();
            while (it.hasNext()) {
                LJIILLIIL(str, j, str2, (java.util.Map) ((Map.Entry) it.next()).getValue());
            }
        }
        if (j > this.LJIIJJI) {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = new C65548Po0<>(30);
            }
            android.net.Uri parse = UriProtector.parse(str2);
            if (parse.getScheme() != null) {
                str2 = parse.getPath();
            }
            if (C09970aH.LJII()) {
                StringBuilder LIZJ = C06490Nh.LIZJ("record topPathTraffic(path:", str2, ", bytes:", j);
                LIZJ.append(", biz:");
                LIZJ.append(str);
                LIZJ.append(")");
                X1D.LIZIZ(LIZJ);
            }
            this.LJIIIIZZ.LIZ(new PHI(str2, j, str));
        }
    }

    public static void LJIILLIIL(String str, long j, String str2, java.util.Map map) {
        J8T j8t = (J8T) map.get(str);
        if (j8t == null) {
            j8t = new J8T(str);
            map.put(str, j8t);
        }
        if (((HashMap) j8t.LIZIZ).containsKey(str2)) {
            HashMap hashMap = (HashMap) j8t.LIZIZ;
            hashMap.put(str2, Long.valueOf(((Long) hashMap.get(str2)).longValue() + j));
        } else {
            ((HashMap) j8t.LIZIZ).put(str2, Long.valueOf(j));
        }
        j8t.LIZJ += j;
    }

    @Override // X.PHL
    public final void LJIIIIZZ(long j, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        String jSONObject3;
        String str4;
        String jSONObject4;
        String jSONObject5;
        if (!this.LIZ) {
            return;
        }
        F9U.LIZ.LIZJ(new PHM(this, str2, j, str));
        boolean LIZIZ = C48168IvM.LIZIZ(C09970aH.LIZ);
        boolean isForeground = ActivityLifeObserver.getInstance().isForeground();
        String str5 = "";
        if (this.LIZIZ && j > this.LJIIL) {
            Object[] objArr = new Object[8];
            objArr[0] = Long.valueOf(j);
            objArr[1] = str;
            objArr[2] = str2;
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            objArr[3] = str4;
            if (jSONObject == null) {
                jSONObject4 = "";
            } else {
                jSONObject4 = jSONObject.toString();
            }
            objArr[4] = jSONObject4;
            if (jSONObject2 == null) {
                jSONObject5 = "";
            } else {
                jSONObject5 = jSONObject2.toString();
            }
            objArr[5] = jSONObject5;
            objArr[6] = Boolean.valueOf(LIZIZ);
            objArr[7] = Boolean.valueOf(isForeground);
            C80036Vb6.LJIIIIZZ("APM-TrafficInfo", C16880lQ.LLLZ("trafficBytes: %d, sourceId: %s, business: %s, scene: %s, extraStatus: %s, extraLog: %s, isWifi: %b, isFront: %b", objArr));
        }
        if (C09970aH.LJII()) {
            Object[] objArr2 = new Object[8];
            objArr2[0] = Long.valueOf(j);
            objArr2[1] = str;
            objArr2[2] = str2;
            if (str3 == null) {
                str3 = "";
            }
            objArr2[3] = str3;
            if (jSONObject == null) {
                jSONObject3 = "";
            } else {
                jSONObject3 = jSONObject.toString();
            }
            objArr2[4] = jSONObject3;
            if (jSONObject2 != null) {
                str5 = jSONObject2.toString();
            }
            objArr2[5] = str5;
            objArr2[6] = Boolean.valueOf(LIZIZ);
            objArr2[7] = Boolean.valueOf(isForeground);
            C16880lQ.LLLZ("trafficBytes: %d, sourceId: %s, business: %s, scene: %s, extraStatus: %s, extraLog: %s, isWifi: %b, isFront: %b", objArr2);
        }
        this.LJIIIZ += j;
    }
}
