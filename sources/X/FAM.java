package X;

import Y.ACallableS109S0100000_6;
import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FAM {
    public static final C62822Ol8 LJIILLIIL = C221108m2.LIZIZ(FAN.LJLIL);
    public final java.util.Map<String, Long> LIZ;
    public final java.util.Map<String, Long> LIZIZ;
    public final java.util.Map<String, Long> LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public volatile int LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public final HashMap<String, Long> LJIILJJIL;
    public final java.util.Map<String, Long> LJIILL;

    public final boolean LJIIJ() {
        Long l = this.LIZJ.get("cold_boot_application_to_main");
        if (l != null && l.longValue() > 1000) {
            return false;
        }
        Long l2 = this.LIZJ.get("cold_boot_main_create_to_resume");
        if (l2 != null && l2.longValue() > 1000) {
            return false;
        }
        return true;
    }

    public FAM() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LIZ = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.LIZIZ = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.LIZJ = concurrentHashMap3;
        this.LIZLLL = true;
        this.LJFF = 1;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = true;
        this.LJIIL = -1L;
        this.LJIILJJIL = new HashMap<>();
        new CopyOnWriteArrayList();
        this.LJIILL = new ConcurrentHashMap();
        if (Build.VERSION.SDK_INT < 23) {
            java.util.Map<String, Long> synchronizedMap = Collections.synchronizedMap(concurrentHashMap);
            o.LJIIIIZZ(synchronizedMap, "synchronizedMap(totalCache)");
            this.LIZ = synchronizedMap;
            java.util.Map<String, Long> synchronizedMap2 = Collections.synchronizedMap(concurrentHashMap2);
            o.LJIIIIZZ(synchronizedMap2, "synchronizedMap(coreCache)");
            this.LIZIZ = synchronizedMap2;
            java.util.Map<String, Long> synchronizedMap3 = Collections.synchronizedMap(concurrentHashMap3);
            o.LJIIIIZZ(synchronizedMap3, "synchronizedMap(reportCache)");
            this.LIZJ = synchronizedMap3;
        }
    }

    public static boolean LJIIIZ() {
        String lastVersion = C38776FJs.LJIIL().LJFF(EF7.LIZIZ(), "log_release_build_version_v4");
        o.LJIIIIZZ(lastVersion, "lastVersion");
        if (lastVersion.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIILIIL() {
        Context LIZIZ = EF7.LIZIZ();
        String LJ = EF7.LJ();
        String LJFF = C38776FJs.LJIIL().LJFF(LIZIZ, "log_release_build_version_v4");
        if (LJ.length() == 0) {
            LJ = "default_version";
        }
        if (o.LJ(LJFF, LJ)) {
            return false;
        }
        C38776FJs.LJIIL().LJIIJJI(LIZIZ, "log_release_build_version_v4", LJ);
        return true;
    }

    public final void LJIIJJI() {
        if (!LJIIIZ()) {
            if (!this.LIZLLL) {
                return;
            }
            if ((!this.LIZIZ.isEmpty() && !this.LJ) || !LJIIJ() || LJIILIIL()) {
                return;
            }
            if (this.LJ) {
                LJIIL("first_feed_show_time_v3_cache");
            } else {
                LJIIL("first_feed_show_time_v3");
            }
        } else {
            if (this.LJII) {
                LJIIL("first_feed_show_time_new_user_v4");
            } else {
                LJIIL("first_feed_show_time_new_user");
            }
            LJIILIIL();
        }
        this.LIZLLL = false;
        this.LJIIIZ = false;
        this.LIZ.clear();
        this.LIZIZ.clear();
        this.LIZJ.clear();
    }

    public final boolean LJII(String str) {
        if (this.LIZ.get(str) != null) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIIZZ(String str) {
        if (this.LIZJ.get(str) != null) {
            return true;
        }
        return false;
    }

    public final void LJIIL(String str) {
        int i;
        int i2;
        boolean LJIIIZ = LJIIIZ();
        HashMap<String, Long> hashMap = this.LJIILJJIL;
        if (hashMap != null && !hashMap.isEmpty()) {
            Iterator<Map.Entry<String, Long>> it = hashMap.entrySet().iterator();
            long j = 0;
            while (it.hasNext()) {
                j += it.next().getValue().longValue();
            }
            this.LIZJ.put("load_sp_total", Long.valueOf(j));
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject.put("app2main5s", 1);
            if (o.LJ(str, "first_feed_show_time_new_user") && (!this.LJIIIZ || !LJIIJ())) {
                jSONObject2.put("new_user_report_bad_case", 1);
            } else {
                for (Map.Entry<String, Long> entry : this.LIZJ.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            int i3 = 2;
            if (this.LJ) {
                i = 1;
            } else {
                i = 2;
            }
            jSONObject2.put("cold_boot_use_cache", i);
            jSONObject2.put("cold_boot_type", this.LJFF);
            jSONObject2.put("cold_boot_ad_type", this.LJI);
            FAK LIZ = C56672Kh.LIZ();
            if (this.LJ) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            LIZ.LIZ(i2, "cold_boot_use_cache");
            C56672Kh.LIZ().LIZ(this.LJFF, "cold_boot_type");
            C56672Kh.LIZ().LIZ(this.LJI, "cold_boot_ad_type");
            if (o.LJ(str, "first_feed_show_time_new_user_v4")) {
                i3 = 3;
            } else if (LJIIIZ) {
                i3 = 1;
            }
            jSONObject2.put("is_new_user", i3);
            C56672Kh.LIZ().LIZ(i3, "is_new_user");
            jSONObject2.put("convert_type", this.LJIIIIZZ);
            jSONObject3.put("category", jSONObject);
            FAK LIZ2 = C56672Kh.LIZ();
            LIZ2.getClass();
            for (Map.Entry entry2 : new HashMap(LIZ2.LJIILL).entrySet()) {
                jSONObject2.put((String) entry2.getKey(), ((Number) entry2.getValue()).longValue());
            }
            jSONObject3.put("metric", jSONObject2);
            jSONObject4.put("placeHolder", "1");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        FAK LIZ3 = C56672Kh.LIZ();
        LIZ3.getClass();
        for (Map.Entry entry3 : new HashMap(LIZ3.LJIILL).entrySet()) {
            Object key = entry3.getKey();
            long longValue = ((Number) entry3.getValue()).longValue();
            ((ConcurrentHashMap) LIZ3.LJI).put(key, Long.valueOf(longValue));
            ((ConcurrentHashMap) LIZ3.LJII).put(key, Long.valueOf(longValue));
            ((ConcurrentHashMap) LIZ3.LJIIIIZZ).put(key, Long.valueOf(longValue));
            ((ConcurrentHashMap) LIZ3.LJIIIZ).put(key, Long.valueOf(longValue));
            ((ConcurrentHashMap) LIZ3.LJIIJJI).put(key, Long.valueOf(longValue));
        }
        synchronized (LIZ3) {
            LIZ3.LJIIIIZZ(LIZ3.LJJIIJZLJL, "cold_boot_lego_task_count");
            for (Map.Entry entry4 : ((ConcurrentHashMap) LIZ3.LJIILLIIL).entrySet()) {
                String str2 = (String) entry4.getKey();
                int intValue = ((Number) entry4.getValue()).intValue();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("cold_boot_");
                LIZ4.append(str2);
                LIZ4.append("_task_count");
                LIZ3.LJIIIIZZ(intValue, X1D.LIZIZ(LIZ4));
            }
        }
        LIZ3.LJJIFFI = true;
        if (LIZ3.LJIILIIL()) {
            C38995FSd.LIZJ().execute(new ARunnableS42S0100000_6(LIZ3, 133));
        } else {
            C38995FSd.LIZJ().execute(new ARunnableS42S0100000_6(LIZ3, 136));
            C38995FSd.LIZJ().execute(new ARunnableS42S0100000_6(LIZ3, 139));
            C38995FSd.LJ().execute(new ARunnableS42S0100000_6(LIZ3, 134));
            ScheduledExecutorService LJ = C38995FSd.LJ();
            ARunnableS42S0100000_6 aRunnableS42S0100000_6 = new ARunnableS42S0100000_6(LIZ3, 135);
            long j2 = LIZ3.LJJII;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LJ.schedule(aRunnableS42S0100000_6, j2, timeUnit);
            C38995FSd.LJ().schedule(new ARunnableS42S0100000_6(LIZ3, 137), LIZ3.LJJII, timeUnit);
            C38995FSd.LIZJ().execute(new ARunnableS42S0100000_6(LIZ3, 138));
        }
        C09900aA.LJFF(str, jSONObject4, jSONObject3);
        if (!LJIIIZ) {
            C09900aA.LJFF("first_feed_show_time_v3_all", jSONObject4, jSONObject3);
        }
        C10K.LIZJ(new ACallableS109S0100000_6(jSONObject2, 19));
    }

    public final void LIZ(long j, String name) {
        Long valueOf;
        o.LJIIIZ(name, "name");
        Long l = this.LIZJ.get(name);
        if (l == null) {
            valueOf = Long.valueOf(j);
        } else {
            valueOf = Long.valueOf(l.longValue() + j);
        }
        this.LIZJ.put(name, valueOf);
    }

    public final void LIZJ(String name, boolean z) {
        o.LJIIIZ(name, "name");
        LIZIZ(SystemClock.uptimeMillis(), name, z);
    }

    public final void LIZLLL(long j, String name) {
        o.LJIIIZ(name, "name");
        if (this.LIZJ.get(name) != null) {
            return;
        }
        this.LIZJ.put(name, Long.valueOf(j));
    }

    public final void LJFF(String name, boolean z) {
        o.LJIIIZ(name, "name");
        LJ(SystemClock.uptimeMillis(), name, z);
    }

    public final void LIZIZ(long j, String name, boolean z) {
        o.LJIIIZ(name, "name");
        if (this.LIZ.get(name) != null) {
            if (z) {
                this.LIZLLL = false;
            }
        } else {
            this.LIZ.put(name, Long.valueOf(j));
            if (z) {
                this.LIZIZ.put(name, Long.valueOf(j));
            }
        }
    }

    public final void LJ(long j, String name, boolean z) {
        o.LJIIIZ(name, "name");
        Long l = this.LIZ.get(name);
        if (l == null) {
            if (z) {
                this.LIZLLL = false;
                return;
            } else {
                this.LIZJ.put(name, 0L);
                return;
            }
        }
        if (this.LIZJ.get(name) == null) {
            this.LIZJ.put(name, Long.valueOf(j - l.longValue()));
        }
        if (z) {
            this.LIZIZ.remove(name);
        }
    }
}
