package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import X.C0RN;
import X.C16880lQ;
import X.C25620zW;
import X.C34179DbD;
import X.C36093EEn;
import X.C36922EeM;
import X.C40328FsC;
import X.C56574MIg;
import X.C61139Nz5;
import X.C61140Nz6;
import X.C63081OpJ;
import X.C78983UzD;
import X.C84763XOl;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EI0;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.EnumC56571MId;
import X.F9J;
import X.JBR;
import X.NPQ;
import X.NPX;
import X.NPY;
import X.NPZ;
import X.X1D;
import Y.IDxS309S0100000_10;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAweme;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.e1;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class TopViewJsonManager {
    public static final long LJI;
    public static final long LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static boolean LJIIJ;
    public final SharedPreferences LIZJ;
    public volatile Map<String, Aweme> LIZLLL;
    public final Object LIZ = new Object();
    public final ConcurrentHashMap<String, NPX> LJ = new ConcurrentHashMap<>();
    public long LJFF = 0;
    public final Gson LIZIZ = new Gson();

    public final synchronized Map<String, NPX> LJFF() {
        String LJII2;
        if (!this.LJ.isEmpty()) {
            return this.LJ;
        }
        try {
            try {
                LJII2 = LJII(null);
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
        } catch (OutOfMemoryError e2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AwesomeSplash OutOfMemoryError:");
            LIZ.append(e2.toString());
            C36922EeM.LJ(X1D.LIZIZ(LIZ));
            C36922EeM.LJFF(e2);
            LIZIZ();
        }
        if (TextUtils.isEmpty(LJII2) || !LIZ(LJII2)) {
            return this.LJ;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        JSONObject jSONObject = new JSONObject(LJII2);
        Gson LIZ2 = GsonHolder.LIZLLL().LIZ();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.LJ.put(next, LJI(JSONObjectProtectorUtils.getJSONObject(jSONObject, next), LIZ2));
        }
        C56574MIg.LJJII(EnumC56571MId.PARTIAL_LOAD, SystemClock.elapsedRealtime() - elapsedRealtime);
        return this.LJ;
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        LJI = timeUnit.toMillis(3L);
        LJII = timeUnit.toMillis(14L);
        LJIIJ = false;
    }

    public static void LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        File file = new File(JBR.LJFF(LIZ, LJIIIZ, "awemes.json", LIZ));
        if (file.exists()) {
            C16880lQ.LLLZZIL(file);
        }
    }

    public final void LJIIIIZZ() {
        File file = new File(LJIIIZ);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            Map<String, Aweme> LJ = LJ(null);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJIIIZ);
            LIZ.append("awemes.json");
            File file2 = new File(X1D.LIZIZ(LIZ));
            if (LJ == null || LJ.size() == 0) {
                if (file2.exists()) {
                    C16880lQ.LLLZZIL(file2);
                    return;
                }
                return;
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
            bufferedWriter.write(GsonProtectorUtils.toJson(this.LIZIZ, LJ, new NPY().getType()));
            bufferedWriter.close();
            if (!C34179DbD.LIZ()) {
                return;
            }
            for (Map.Entry<String, Aweme> entry : LJ.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LJIIIZ);
                    LIZ2.append(key);
                    LIZ2.append(".json");
                    File file3 = new File(X1D.LIZIZ(LIZ2));
                    if (!file3.exists()) {
                        file3.createNewFile();
                    }
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file3));
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    concurrentHashMap.put(key, entry.getValue());
                    bufferedWriter2.write(GsonProtectorUtils.toJson(this.LIZIZ, concurrentHashMap, new NPZ().getType()));
                    bufferedWriter2.close();
                }
            }
        } catch (IOException e) {
            C78983UzD.LJIIZILJ(e);
        } catch (OutOfMemoryError e2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("AwesomeSplash OutOfMemoryError:");
            LIZ3.append(e2.toString());
            C36922EeM.LJ(X1D.LIZIZ(LIZ3));
            C36922EeM.LJFF(e2);
        }
    }

    public final void LJIIIZ() {
        if (LJIIJ) {
            return;
        }
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new EE1() { // from class: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager.3
            @Override // X.EEY
            public final String key() {
                return "TopViewJsonManager$3";
            }

            @Override // X.EEY
            public final /* synthetic */ boolean meetTrigger() {
                return true;
            }

            @Override // X.EEY
            public final /* synthetic */ String prefix() {
                return "task_";
            }

            @Override // X.EE1
            public final /* synthetic */ boolean serialExecute() {
                return false;
            }

            @Override // X.EEY
            public final /* synthetic */ int targetProcess() {
                return C0RN.LIZ();
            }

            @Override // X.EEY
            public final /* synthetic */ List triggerOtherLegoComponents() {
                return null;
            }

            @Override // X.EEY
            public final /* synthetic */ EnumC36103EEx triggerType() {
                return C0RN.LIZIZ(this);
            }

            @Override // X.EEY
            public final EnumC36092EEm scenesType() {
                return EnumC36092EEm.DEFAULT;
            }

            @Override // X.EE1
            public final EFK type() {
                return EFK.BACKGROUND;
            }

            @Override // X.EEY
            public final void run(Context context) {
                TopViewJsonManager.this.LIZIZ.LJIIJ(Aweme.class);
            }
        }, true);
        LIZJ.LIZJ();
        LJIIJ = true;
    }

    public TopViewJsonManager(String str) {
        LJIIIIZZ = str;
        StringBuilder LIZ = X1D.LIZ();
        LJIIIZ = JBR.LJFF(LIZ, LJIIIIZZ, "awemeJson/", LIZ);
        this.LIZJ = F9J.LIZIZ(EF7.LIZIZ(), 0, "awesome_splash");
        C84763XOl.LJI().LIZ(new IDxS309S0100000_10(this, 0));
    }

    public static boolean LIZ(String str) {
        if (!e1.LIZ(31744, "Awesome_filter_splash_data_optimize_enable_new", true, true)) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && str.length() >= 3) {
            return true;
        }
        return false;
    }

    public static String LJII(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (C34179DbD.LIZ() && !TextUtils.isEmpty(str)) {
            str2 = i0.LJFF(str, ".json");
        } else {
            str2 = "awemes.json";
        }
        StringBuilder LIZ = X1D.LIZ();
        File file = new File(JBR.LJFF(LIZ, LJIIIZ, str2, LIZ));
        if (!file.exists()) {
            return sb.toString();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            C78983UzD.LJIIZILJ(e);
        }
        return sb.toString();
    }

    public final Aweme LIZJ(String str) {
        Aweme aweme;
        if (C34179DbD.LIZ()) {
            Map<String, Aweme> LJ = LJ(str);
            if (LJ == null || LJ.size() == 0 || !LJ.containsKey(str)) {
                aweme = null;
            } else {
                aweme = LJ.get(str);
            }
        } else {
            Map<String, Aweme> LJ2 = LJ(null);
            if (LJ2 == null || LJ2.size() == 0) {
                return null;
            }
            aweme = LJ2.get(str);
        }
        if (C63081OpJ.LLIIIZ(aweme)) {
            return null;
        }
        return aweme;
    }

    public final Map<String, Aweme> LIZLLL(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        NPQ.LIZIZ().getClass();
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (C34179DbD.LIZ() && !TextUtils.isEmpty(str)) {
                String LJII2 = LJII(str);
                if (!TextUtils.isEmpty(LJII2)) {
                    Map<String, Aweme> map = (Map) this.LIZIZ.LJII(LJII2, new C61139Nz5().getType());
                    C56574MIg.LJJII(EnumC56571MId.TOPVIEW_JSON_SPILT, SystemClock.elapsedRealtime() - elapsedRealtime);
                    return map;
                }
            }
            String LJII3 = LJII(null);
            if (!TextUtils.isEmpty(LJII3)) {
                if (!LIZ(LJII3)) {
                    return concurrentHashMap;
                }
                Map<String, Aweme> map2 = (Map) this.LIZIZ.LJII(LJII3, new C61140Nz6().getType());
                C56574MIg.LJJII(EnumC56571MId.DEFAULT, SystemClock.elapsedRealtime() - elapsedRealtime);
                if (map2 != null && map2.size() != 0) {
                    concurrentHashMap.putAll(map2);
                }
                return map2;
            }
            LJIIIZ();
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        } catch (OutOfMemoryError e2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AwesomeSplash OutOfMemoryError:");
            LIZ.append(e2.toString());
            C36922EeM.LJ(X1D.LIZIZ(LIZ));
            C36922EeM.LJFF(e2);
            LIZIZ();
        }
        return concurrentHashMap;
    }

    public final Map<String, Aweme> LJ(String str) {
        boolean z;
        StringBuilder LIZIZ = C25620zW.LIZIZ("call getMap, splashAdId: ", str, " isMainThread: ");
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ.append(z);
        X1D.LIZIZ(LIZIZ);
        if (C34179DbD.LIZ() && !TextUtils.isEmpty(str)) {
            if (this.LIZLLL != null && this.LIZLLL.containsKey(str)) {
                return this.LIZLLL;
            }
            if (this.LIZLLL == null) {
                synchronized (this.LIZ) {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = LIZLLL(str);
                    }
                }
            } else {
                this.LIZLLL.putAll(LIZLLL(str));
            }
        } else if (this.LIZLLL == null) {
            synchronized (this.LIZ) {
                if (this.LIZLLL == null) {
                    this.LIZLLL = LIZLLL(null);
                }
            }
        }
        return this.LIZLLL;
    }

    public static TopViewAweme LJI(JSONObject jSONObject, Gson gson) {
        String jSONObject2;
        String optString = jSONObject.optString("aweme_id");
        boolean optBoolean = jSONObject.optBoolean("is_ads", false);
        JSONObject optJSONObject = jSONObject.optJSONObject("raw_ad_data");
        String str = null;
        if (optJSONObject == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = optJSONObject.toString();
        }
        TopViewAwemeRawAd topViewAwemeRawAd = (TopViewAwemeRawAd) GsonProtectorUtils.fromJson(gson, jSONObject2, TopViewAwemeRawAd.class);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("video");
        if (optJSONObject2 != null) {
            str = optJSONObject2.toString();
        }
        return new TopViewAweme(optString, optBoolean, topViewAwemeRawAd, (Video) GsonProtectorUtils.fromJson(gson, str, Video.class));
    }
}
