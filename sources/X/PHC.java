package X;

import Y.ARunnableS12S1100000_11;
import Y.ARunnableS3S1110000_11;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PHC implements PHP, InterfaceC64217PIf {
    public static String LJZL = "bg_never_front";
    public volatile boolean LJLIL;
    public volatile boolean LJLILLLLZI;
    public java.util.Map<String, PI9<Long, Long>> LJLJJL;
    public java.util.Map<String, PI9<Long, Long>> LJLJJLL;
    public java.util.Map<String, PI9<Long, Long>> LJLJL;
    public long LJLJLJ;
    public long LJLLL;
    public final PHF LJLLLLLL;
    public volatile PGK LJLZ;
    public final PHD LJZ;
    public final C64049PBt<PCB> LJLJI = new C64049PBt<>(20);
    public final C64049PBt<String> LJLJJI = new C64049PBt<>(20);
    public long LJLJLLL = -1;
    public long LJLL = 0;
    public long LJLLI = 0;
    public long LJLLILLLL = 0;
    public long LJLLJ = 0;
    public long LJLLLL = 0;
    public final PG9 LJZI = (PG9) PGH.LIZ(PG9.class);

    @Override // X.InterfaceC64217PIf
    public final void LIZLLL(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void LJFF(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void LJI(Activity activity) {
    }

    public final synchronized void LJIIL() {
        if (this.LJLZ != null && !this.LJLILLLLZI) {
            this.LJLILLLLZI = true;
            this.LJLLLLLL.LIZIZ();
            PD6 pd6 = PD6.LIGHT_WEIGHT;
            C64071PCp.LIZ(pd6).LIZIZ(this.LJZ);
            C64071PCp.LIZ(pd6).LIZJ(this.LJZ);
        }
    }

    @Override // X.InterfaceC64217PIf
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // X.InterfaceC64217PIf
    public final void onActivityStarted(Activity activity) {
    }

    public PHC() {
        PHF phf = PHR.LIZ;
        this.LJLLLLLL = phf;
        phf.LIZIZ();
        phf.LIZ.LIZIZ(LJIIIIZZ());
        this.LJZ = new PHD(this);
    }

    public static boolean LJIIIIZZ() {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isBackground(): ");
            LIZ.append(!ActivityLifeObserver.getInstance().isForeground());
            X1D.LIZIZ(LIZ);
        }
        return !ActivityLifeObserver.getInstance().isForeground();
    }

    public static final void LJIIJJI(PEF pef) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sendPerfLog[");
            LIZ.append(pef.LIZ);
            LIZ.append("] = ");
            LIZ.append(pef.LIZ().toString());
            X1D.LIZIZ(LIZ);
        }
        String LJ = PGQ.LIZ().LJ();
        JSONObject jSONObject = pef.LJ;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(LJ)) {
                LJ = ActivityLifeObserver.getInstance().getTopActivityClassName();
            }
            jSONObject.put(WM7.SCENE_SERVICE, LJ);
            jSONObject.put("process_name", C09970aH.LIZIZ());
            jSONObject.put("is_main_process", C09970aH.LJIIIIZZ());
            if (jSONObject.isNull("is_front")) {
                jSONObject.put("is_front", ActivityLifeObserver.getInstance().isForeground());
            }
            pef.LJ = jSONObject;
        } catch (JSONException unused) {
        }
        C78866UxK.LJLI(pef, TextUtils.equals(pef.LIZ, "memory"));
        C64089PDh.LJIIJ().LIZLLL(pef);
    }

    @Override // X.PHP
    public final synchronized void LIZIZ(PGK pgk) {
        C78248UnM.LJIIJ();
        this.LJLZ = pgk;
        if (!this.LJLIL) {
            C78248UnM.LJIIJ();
            return;
        }
        if (pgk.LIZIZ) {
            PHK phk = EGD.LIZ;
            phk.start();
            phk.LJIIJJI(pgk.LJFF);
            phk.LIZLLL(pgk.LJI);
        }
        JSONObject jSONObject = pgk.LIZ;
        while (!this.LJLJI.LIZ()) {
            LJ(this.LJLJI.LIZIZ(), jSONObject, this.LJLJJI.LIZIZ());
        }
        LJIIL();
    }

    @Override // X.InterfaceC64217PIf
    public final void LIZJ(Activity activity) {
        C78248UnM.LJIIJ();
        if (this.LJLZ != null) {
            LJIIL();
        }
        LJZL = "bg_ever_front";
        this.LJLLLLLL.LIZ.LIZIZ(false);
    }

    @Override // X.InterfaceC64217PIf
    public final void LJII(Activity activity) {
        C78248UnM.LJIIJ();
        C78248UnM.LJIIJ();
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZIZ(this.LJZ);
        }
        this.LJLLLLLL.LIZ.LIZIZ(true);
    }

    @Override // X.PHP
    public final synchronized void LJJJJJ(String str) {
        F9U.LIZ.LIZJ(new ARunnableS12S1100000_11(this, str, 10));
    }

    @Override // X.PHP
    public final void LIZ(boolean z, boolean z2) {
        PGK config;
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        PGH.LIZ(PHB.class);
        C78248UnM.LJIIJ();
        ActivityLifeObserver.getInstance().register(this);
        this.LJLLLLLL.LIZIZ();
        SharedPreferences LIZIZ = F9J.LIZIZ(C78248UnM.LJLJJI, 0, "traffic_monitor_info");
        long j = LIZIZ.getLong("init", -1L);
        long j2 = LIZIZ.getLong("init_ts", 0L);
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initTraffic==");
            LIZ.append(j);
            X1D.LIZIZ(LIZ);
        }
        if (j > -1) {
            long j3 = LIZIZ.getLong("usage", 0L);
            long j4 = LIZIZ.getLong("usage_ts", 0L);
            long j5 = j3 - j;
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("statsUsageTraffic==");
                LIZ2.append(j3);
                X1D.LIZIZ(LIZ2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("statsUsageTrafficTs==");
                LIZ3.append(j4);
                X1D.LIZIZ(LIZ3);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("lastUsageTraffic==");
                LIZ4.append(j5);
                X1D.LIZIZ(LIZ4);
            }
            if (j5 > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("total_usage", j5);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("total_usage_duration", ((j4 - j2) / 1000) / 60);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("init_ts", j2);
                    jSONObject3.put("usage_ts", j4);
                    jSONObject3.put("biz_usage", LIZIZ.getLong("biz_usage", 0L));
                    jSONObject3.put("init", j);
                    jSONObject3.put("usage", j3);
                    String string = LIZIZ.getString("biz_json", "");
                    if (C78248UnM.LJIIJ()) {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("detailUsage==");
                        LIZ5.append(string);
                        X1D.LIZIZ(LIZ5);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("usage", new JSONArray(string));
                        jSONObject3.put("detail", jSONObject4);
                    }
                    String str = this.LJLLLLLL.LIZIZ;
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject3.put("traffic_impl", str);
                    }
                    PEF pef = new PEF();
                    pef.LIZ = "traffic";
                    pef.LIZLLL = jSONObject;
                    pef.LJ = jSONObject2;
                    pef.LJI = jSONObject3;
                    LJIIJJI(pef);
                } catch (JSONException unused) {
                }
            }
        }
        this.LJLLLL = this.LJLLLLLL.LIZ();
        SharedPreferences.Editor edit = LIZIZ.edit();
        edit.putLong("init", this.LJLLLL);
        edit.putLong("init_ts", System.currentTimeMillis());
        edit.putLong("usage", 0L);
        edit.apply();
        PHB phb = (PHB) PGH.LIZ(PHB.class);
        if (phb != null && (config = phb.getConfig()) != null) {
            LIZIZ(config);
        }
    }

    @Override // X.PHP
    public final synchronized void LJJJLIIL(String str, boolean z) {
        F9U.LIZ.LIZJ(new ARunnableS3S1110000_11(this, z, str, 1));
    }

    public static void LJ(PCB pcb, JSONObject jSONObject, String str) {
        boolean LIZ = C64099PDr.LIZ("traffic");
        boolean z = false;
        if (jSONObject.optInt(str, 0) == 1) {
            z = true;
        }
        if ((LIZ || z) && pcb != null) {
            PC2.LIZ(pcb);
        }
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("isSampled=");
            LIZ2.append(LIZ);
            LIZ2.append(" + metricEnabled=");
            LIZ2.append(z);
            X1D.LIZIZ(LIZ2);
        }
    }

    public final void LJIIIZ(long j, boolean z, boolean z2) {
        if (j > this.LJLZ.LIZJ) {
            C80036Vb6.LJIIIIZZ("APM-TrafficInfo", C16880lQ.LLLZ("periodTrafficBytes: %d, isWifi: %b, isFront: %b", new Object[]{Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2)}));
        }
        if (C78248UnM.LJIIJ()) {
            C16880lQ.LLLZ("periodTrafficBytes: %d, isWifi: %b, isFront: %b", new Object[]{Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2)});
        }
    }

    public final void LJIIJ(java.util.Map map, String str, JSONArray jSONArray) {
        if (map == null || map.size() == 0) {
            return;
        }
        try {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                JSONObject LIZIZ = ((J8T) ((Map.Entry) it.next()).getValue()).LIZIZ(this.LJLZ.LJII);
                if (!TextUtils.isEmpty(str)) {
                    LIZIZ.put("traffic_category", str);
                }
                jSONArray.put(LIZIZ);
            }
        } catch (Exception unused) {
        }
    }
}
