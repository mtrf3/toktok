package X;

import Y.ARunnableS6S1100100_6;
import android.os.SystemClock;
import com.ss.android.common.lib.AppLogNewUtils;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FAK {
    public static final C62822Ol8 LJJIJIL = C221108m2.LIZIZ(FAO.LJLIL);
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public volatile boolean LJJIFFI;
    public int LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public final java.util.Map<String, Long> LIZ = new ConcurrentHashMap();
    public final java.util.Map<String, Long> LIZIZ = new ConcurrentHashMap();
    public final java.util.Map<String, Long> LIZJ = new ConcurrentHashMap();
    public final java.util.Map<String, Long> LIZLLL = new ConcurrentHashMap();
    public final java.util.Map<String, Long> LJ = new ConcurrentHashMap();
    public final java.util.Map<String, Long> LJFF = new ConcurrentHashMap();
    public final java.util.Map<String, Long> LJI = new ConcurrentHashMap();
    public final java.util.Map<String, Long> LJII = new ConcurrentHashMap();
    public final java.util.Map<String, Long> LJIIIIZZ = new ConcurrentHashMap();
    public final java.util.Map<String, Long> LJIIIZ = new ConcurrentHashMap();
    public final java.util.Map<String, Float> LJIIJ = new ConcurrentHashMap();
    public final java.util.Map<String, Long> LJIIJJI = new ConcurrentHashMap();
    public final List<String> LJIIL = FII.LIZ();
    public final java.util.Map<String, Long> LJIILIIL = new ConcurrentHashMap();
    public final java.util.Map<String, Long> LJIILJJIL = new ConcurrentHashMap();
    public final java.util.Map<String, Long> LJIILL = new ConcurrentHashMap();
    public final java.util.Map<String, Integer> LJIILLIIL = new ConcurrentHashMap(4);
    public final java.util.Map<Integer, String> LJIIZILJ = new HashMap();
    public final C62822Ol8 LJJI = C221108m2.LIZIZ(FAL.LJLIL);
    public long LJJII = 120;
    public EHX LJJIII = EHX.APPLICATION_ATTACH;
    public EHW LJJIIJ = EHW.APPLICATION_BEFORE_ATTACH;
    public FAV LJJIJIIJI = FAV.OTHER;
    public final ArrayList<String> LJJIJIIJIL = C47261Igj.LJII(FAV.FEED_UI_TO_VIDEO.getValue());

    public final void LJIL() {
        this.LJIJI = false;
        ((ConcurrentHashMap) this.LIZ).clear();
        ((ConcurrentHashMap) this.LJI).clear();
    }

    public final void LJJ() {
        this.LJIL = false;
        ((ConcurrentHashMap) this.LJ).clear();
        ((ConcurrentHashMap) this.LJIIJJI).clear();
    }

    public final void LJJI() {
        this.LJIJJ = false;
        ((ConcurrentHashMap) this.LIZJ).clear();
        ((ConcurrentHashMap) this.LJIIIIZZ).clear();
    }

    public final void LJJIFFI() {
        this.LJIJJLI = false;
        ((ConcurrentHashMap) this.LIZLLL).clear();
        ((ConcurrentHashMap) this.LJIIIZ).clear();
        ((ConcurrentHashMap) this.LJIIJ).clear();
    }

    public final void LJJII() {
        this.LJJ = false;
        ((ConcurrentHashMap) this.LJIILJJIL).clear();
    }

    public final boolean LJIIL() {
        if (this.LJIJ || LJIILIIL()) {
            return true;
        }
        return false;
    }

    public final boolean LJIILIIL() {
        return ((Boolean) this.LJJI.getValue()).booleanValue();
    }

    public final void LJIILJJIL() {
        if (LJIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJIIJJI).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), (Long) entry.getValue());
                }
                jSONObject.put("metric", jSONObject2);
                if (this.LJIL) {
                    C09900aA.LJFF("assem_event_name", null, jSONObject);
                }
            } catch (Throwable unused) {
            }
            LJJ();
        }
    }

    public final void LJIILL() {
        if (LJIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJIIIIZZ).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), (Long) entry.getValue());
                }
                jSONObject.put("metric", jSONObject2);
                if (this.LJIJJ) {
                    C09900aA.LJFF("boot_finish_task_event_v3", null, jSONObject);
                }
            } catch (Throwable unused) {
            }
            LJJI();
        }
    }

    public final void LJIILLIIL() {
        List list;
        if (LJIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (String key : this.LJIIL) {
                    o.LJIIIIZZ(key, "key");
                    List<String> split = new OJD(":").split(key, 0);
                    if (!split.isEmpty()) {
                        ListIterator<String> listIterator = split.listIterator(split.size());
                        while (listIterator.hasPrevious()) {
                            if (listIterator.previous().length() != 0) {
                                list = ORZ.LLILLL(split, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    list = C61878OQg.INSTANCE;
                    String[] strArr = (String[]) list.toArray(new String[0]);
                    if (strArr.length == 2) {
                        Long l = (Long) ((ConcurrentHashMap) this.LJII).remove(strArr[1]);
                        if (l != null) {
                            jSONObject2.put(key, l.longValue());
                        }
                    }
                }
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJIILIIL).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
                }
                jSONObject.put("metric", jSONObject2);
                if (this.LJIJI) {
                    C09900aA.LJFF("boot_task_coordinate_event_v3", null, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void LJIIZILJ() {
        if (LJIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJI).entrySet()) {
                    String str = (String) entry.getKey();
                    Long l = (Long) entry.getValue();
                    jSONObject2.put(str, l);
                    if (l != null && LJIILIIL() && C38647FEt.LIZJ.contains(str)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str);
                        LIZ.append(':');
                        LIZ.append((float) l.longValue());
                        C74242vk.LIZ(X1D.LIZIZ(LIZ));
                        jSONObject3.put(str, l.longValue());
                    }
                }
                jSONObject.put("metric", jSONObject2);
                if (LJIILIIL()) {
                    AppLogNewUtils.onEventV3("boot_core_event_v3", jSONObject3);
                }
                if (this.LJIJI) {
                    C09900aA.LJFF("boot_core_event_v3", null, jSONObject);
                }
            } catch (Throwable unused) {
            }
            LJIL();
        }
    }

    public final void LJIJ() {
        if (LJIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJIIIZ).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), (Long) entry.getValue());
                }
                for (Map.Entry entry2 : ((ConcurrentHashMap) this.LJIIJ).entrySet()) {
                    jSONObject2.put((String) entry2.getKey(), Float.valueOf(((Number) entry2.getValue()).floatValue()));
                }
                jSONObject.put("metric", jSONObject2);
                if (this.LJIJJLI) {
                    C09900aA.LJFF("custom_event_name_v3", null, jSONObject);
                }
            } catch (Throwable unused) {
            }
            LJJIFFI();
        }
    }

    public final void LJIJJ() {
        if (LJIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJIILJJIL).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
                }
                jSONObject.put("metric", jSONObject2);
                if (this.LJJ) {
                    C09900aA.LJFF("repo_loaded_event_name", null, jSONObject);
                }
            } catch (Throwable unused) {
            }
            LJJII();
        }
    }

    public final void LJIJJLI() {
        if (LJIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJII).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), (Long) entry.getValue());
                }
                jSONObject.put("metric", jSONObject2);
                if (this.LJIJI) {
                    C09900aA.LJFF("boot_task_event_v4", null, jSONObject);
                }
                LJIILLIIL();
            } catch (Throwable unused) {
            }
            LJIL();
        }
    }

    public final void LIZJ(String str) {
        if (this.LJJIFFI || ((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            return;
        }
        if (C38647FEt.LIZ.contains(str) || C38647FEt.LIZIZ.contains(str)) {
            ((ConcurrentHashMap) this.LIZ).put(i0.LJFF(str, "(cpu)"), Long.valueOf(SystemClock.currentThreadTimeMillis()));
        }
        ((ConcurrentHashMap) this.LIZ).put(str, Long.valueOf(SystemClock.uptimeMillis()));
    }

    public final void LIZLLL(String str) {
        if (((ConcurrentHashMap) this.LIZLLL).containsKey(str)) {
            return;
        }
        ((ConcurrentHashMap) this.LIZLLL).put(str, Long.valueOf(SystemClock.uptimeMillis()));
    }

    public final void LJIIJ(String str) {
        if (C38647FEt.LIZ.contains(str) || C38647FEt.LIZIZ.contains(str)) {
            LJIIIZ(SystemClock.currentThreadTimeMillis(), i0.LJFF(str, "(cpu)"));
        }
        LJIIIZ(SystemClock.uptimeMillis(), str);
    }

    public final void LJJIII(int i) {
        try {
            if (((HashMap) this.LJIIZILJ).isEmpty()) {
                return;
            }
            String str = (String) ((HashMap) this.LJIIZILJ).get(Integer.valueOf(i));
            if (str == null || ((ConcurrentHashMap) this.LJFF).containsKey(str)) {
                return;
            }
            ((ConcurrentHashMap) this.LJFF).put(str, Long.valueOf(SystemClock.uptimeMillis()));
        } catch (Throwable unused) {
        }
    }

    public final void LJJIIJ(int i) {
        Long l;
        try {
            if (((HashMap) this.LJIIZILJ).isEmpty()) {
                return;
            }
            String str = (String) ((HashMap) this.LJIIZILJ).get(Integer.valueOf(i));
            if (str != null && ((ConcurrentHashMap) this.LJFF).containsKey(str) && (l = (Long) ((ConcurrentHashMap) this.LJFF).get(str)) != null) {
                C38995FSd.LJFF().execute(new ARunnableS6S1100100_6(SystemClock.uptimeMillis() - l.longValue(), this, str, 2));
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJJIIJZLJL(EHW ehw) {
        if (ehw != null) {
            this.LJJIIJ = ehw;
            ((ConcurrentHashMap) this.LJII).put("main_task_stage_total_duration_temp", 0L);
        }
    }

    public static /* synthetic */ void LJI(FAK fak, String str) {
        fak.LJFF(SystemClock.uptimeMillis(), str);
    }

    public final void LIZ(long j, String str) {
        ((ConcurrentHashMap) this.LJIILL).put(str, Long.valueOf(j));
    }

    public final void LIZIZ(String str, String str2) {
        if (this.LJJIFFI || !((ConcurrentHashMap) this.LJI).containsKey(str)) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LJI;
        concurrentHashMap.put(str2, concurrentHashMap.get(str));
    }

    public final void LJ(long j, String name) {
        o.LJIIIZ(name, "name");
        if (((ConcurrentHashMap) this.LJIIIZ).containsKey(name)) {
            return;
        }
        ((ConcurrentHashMap) this.LJIIIZ).put(name, Long.valueOf(j));
    }

    public final void LJFF(long j, String str) {
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(str)) {
            return;
        }
        Long l = (Long) ((ConcurrentHashMap) this.LIZLLL).get(str);
        if (l == null) {
            ((ConcurrentHashMap) this.LJIIIZ).put(str, 0L);
        } else if (((ConcurrentHashMap) this.LJIIIZ).get(str) == null) {
            ((ConcurrentHashMap) this.LJIIIZ).put(str, C0EM.LIZIZ(l, j));
        }
    }

    public final void LJII(float f, String key) {
        o.LJIIIZ(key, "key");
        ((ConcurrentHashMap) this.LJIIJ).put(key, Float.valueOf(f));
    }

    public final void LJIIIIZZ(long j, String name) {
        o.LJIIIZ(name, "name");
        if (this.LJJIFFI || ((ConcurrentHashMap) this.LJI).containsKey(name)) {
            return;
        }
        ((ConcurrentHashMap) this.LJI).put(name, Long.valueOf(j));
    }

    public final void LJIIIZ(long j, String name) {
        o.LJIIIZ(name, "name");
        if (this.LJJIFFI || !((ConcurrentHashMap) this.LIZ).containsKey(name)) {
            return;
        }
        Long l = (Long) ((ConcurrentHashMap) this.LIZ).get(name);
        if (l == null) {
            ((ConcurrentHashMap) this.LJI).put(name, 0L);
        } else {
            if (((ConcurrentHashMap) this.LJI).get(name) != null) {
                return;
            }
            ((ConcurrentHashMap) this.LJI).put(name, C0EM.LIZIZ(l, j));
        }
    }

    public final void LJIJI(float f, String scene) {
        o.LJIIIZ(scene, "scene");
        if (LJIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(scene, Float.valueOf(f));
                AppLogNewUtils.onEventV3("boot_core_event_v3", jSONObject);
            } catch (Throwable unused) {
            }
        }
    }
}
