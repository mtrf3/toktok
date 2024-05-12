package X;

import Y.ARunnableS9S1100000_8;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.preload.BuildConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.ttm.player.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IoN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47735IoN {
    public final C47736IoO LIZ;
    public Context LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public int LJFF;
    public C47985IsP LJI;

    public final void LIZIZ() {
        if (!TextUtils.isEmpty(C146165oS.LJFF)) {
            if (C146165oS.LJFF.equals("cn-north-1")) {
                C47566Ile.LIZLLL = "cn-north-1";
            } else if (C146165oS.LJFF.equals("singapore")) {
                C47566Ile.LIZLLL = "ap-singapore-1";
            } else {
                C47566Ile.LIZLLL = C146165oS.LJFF;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aid", Integer.valueOf(C146165oS.LIZ));
        hashMap.put("app_name", C146165oS.LIZIZ);
        String str = C146165oS.LJ;
        if (str == null) {
            str = "";
        }
        hashMap.put("device_id", str);
        hashMap.put("app_channel", C146165oS.LIZJ);
        hashMap.put("app_version", C146165oS.LIZLLL);
        C47566Ile.LJ = hashMap;
        HashMap LIZJ = C03660Ck.LIZJ("sdk_version", "1.10.149.1-mt");
        if (this.LIZJ == null) {
            this.LIZJ = u.LIZJ(14, "");
        }
        LIZJ.put("player_version", this.LIZJ);
        if (this.LIZLLL == null) {
            this.LIZLLL = C47148Ieu.LIZ.LJJIJ(6);
        }
        LIZJ.put("mdl_version", this.LIZLLL);
        LIZJ.put("st_version", BuildConfig.VERSION_NAME);
        LIZJ.put("settings_version", "2.1.1");
        C47566Ile.LJFF = LIZJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r2 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJ() {
        /*
            r6 = this;
            int r0 = r6.LJFF
            java.lang.String r3 = ""
            if (r0 != 0) goto L7
            return r3
        L7:
            X.IoO r0 = r6.LIZ
            java.util.HashMap<java.lang.String, X.IoP> r1 = r0.LJ
            java.lang.String r0 = "vod"
            java.lang.Object r5 = r1.get(r0)
            X.IoP r5 = (X.C47737IoP) r5
            r5.getClass()
            java.lang.String r4 = "vs_impression_id"
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L1f
        L1e:
            return r3
        L1f:
            android.content.Context r0 = r5.LIZJ
            r5.LJI(r0)
            int r0 = r5.LJ
            r0 = r0 & 1
            r2 = 0
            r1 = 0
            if (r0 <= 0) goto L58
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.LIZ
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            org.json.JSONObject r0 = r5.LIZIZ
            if (r0 == 0) goto L4b
            boolean r0 = r0.isNull(r4)
            if (r0 != 0) goto L4b
            org.json.JSONObject r0 = r5.LIZIZ
            java.lang.String r2 = r0.optString(r4)
            org.json.JSONObject r0 = r5.LIZIZ
            int r1 = r0.length()
        L4b:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.LIZ
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            if (r1 != 0) goto L7e
            if (r2 != 0) goto L7e
        L58:
            int r0 = r5.LJ
            r0 = r0 & 2
            if (r0 <= 0) goto L7e
            android.content.SharedPreferences r0 = r5.LJFF
            if (r0 == 0) goto L7e
            java.lang.String r3 = r0.getString(r4, r3)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "get string from SP, key = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", retValue = "
            r1.append(r0)
            r1.append(r3)
            X.X1D.LIZIZ(r1)
            goto L1e
        L7e:
            r3 = r2
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47735IoN.LJ():java.lang.String");
    }

    public final void LJI() {
        C47736IoO c47736IoO;
        if (this.LJFF != 0 && this.LIZIZ != null && (c47736IoO = this.LIZ) != null) {
            new PthreadThread(new ARunnableS9S1100000_8(c47736IoO, 17), "SettingsManager").start();
        }
    }

    public C47735IoN() {
        C47736IoO c47736IoO;
        synchronized (C47736IoO.class) {
            if (C47736IoO.LJIIJJI == null) {
                C47736IoO.LJIIJJI = new C47736IoO();
            }
            c47736IoO = C47736IoO.LJIIJJI;
        }
        this.LIZ = c47736IoO;
        C47536IlA c47536IlA = new C47536IlA(C47736IoO.LJ());
        c47736IoO.LIZ.writeLock().lock();
        c47736IoO.LIZIZ.add(c47536IlA);
        c47736IoO.LIZ.writeLock().unlock();
    }

    public static C47735IoN LJFF() {
        return C47538IlC.LIZ;
    }

    public final JSONObject LIZLLL(String str) {
        JSONObject jSONObject;
        SharedPreferences sharedPreferences;
        if (this.LJFF == 0) {
            return null;
        }
        C47737IoP c47737IoP = this.LIZ.LJ.get("vod");
        c47737IoP.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        c47737IoP.LJI(c47737IoP.LIZJ);
        if ((c47737IoP.LJ & 1) > 0) {
            c47737IoP.LIZ.readLock().lock();
            JSONObject jSONObject2 = c47737IoP.LIZIZ;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.optJSONObject(str);
            } else {
                jSONObject = null;
            }
            c47737IoP.LIZ.readLock().unlock();
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            try {
                if ((c47737IoP.LJ & 2) > 0 && (sharedPreferences = c47737IoP.LJFF) != null) {
                    String string = sharedPreferences.getString(str, "");
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject = new JSONObject(string);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("get jsonObject from SP, key = ");
                        LIZ.append(str);
                        LIZ.append(", retValue = ");
                        LIZ.append(jSONObject);
                        X1D.LIZIZ(LIZ);
                    }
                }
            } catch (JSONException e) {
                e.toString();
                return null;
            }
        }
        return jSONObject;
    }

    public final void LJII(Context context) {
        this.LIZIZ = context;
        C47736IoO c47736IoO = this.LIZ;
        if (c47736IoO != null) {
            if (c47736IoO.LIZJ == null) {
                c47736IoO.LIZJ = context;
                Iterator<C47737IoP> it = c47736IoO.LJ.values().iterator();
                while (it.hasNext()) {
                    it.next().LIZJ = context;
                }
                C16880lQ.LLLLL(context);
                c47736IoO.LIZLLL = new C47739IoR(new C47738IoQ(c47736IoO, c47736IoO));
            }
            C47736IoO c47736IoO2 = this.LIZ;
            boolean z = this.LJ;
            C47739IoR c47739IoR = c47736IoO2.LIZLLL;
            c47739IoR.LIZIZ = z;
            c47739IoR.LJFF = new C47744IoW(this);
        }
    }

    public final void LJIIIIZZ(int i) {
        this.LJFF = i;
        if (C47566Ile.LIZLLL != null) {
            LIZIZ();
            LJI();
        }
    }

    public static String LIZ(String str, java.util.Map map) {
        if (str != null) {
            HashMap hashMap = (HashMap) map;
            if (hashMap.isEmpty()) {
                return str;
            }
            Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
            for (Map.Entry entry : hashMap.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            return buildUpon.build().toString();
        }
        return str;
    }

    public final int LIZJ(int i, String str) {
        if (this.LJFF == 0) {
            return i;
        }
        return this.LIZ.LJ.get("vod").LIZ(str, i);
    }
}
