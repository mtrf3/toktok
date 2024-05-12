package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PKY {
    public final PL0 LIZ = new PL0();
    public final HashMap<String, String> LIZIZ = new HashMap<>();
    public final HashMap<String, String> LIZJ = new HashMap<>();
    public final HashMap<String, Long> LIZLLL = new HashMap<>();
    public final HashMap<String, Float> LJ = new HashMap<>();
    public final HashMap<String, String> LJFF = new HashMap<>();
    public final PLK LJI = new PLK(this);
    public final int[] LJII = {0, 0, 0};
    public String LJIIIIZZ = "unknown";
    public String LJIIIZ = "unknown";
    public String LJIIJ = "unknown";
    public List<Pattern> LJIIJJI;

    public final JSONObject LJ() {
        PL0 pl0 = this.LIZ;
        pl0.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("kswapd", pl0.LIZ);
            jSONObject2.put("mmcqd", pl0.LIZIZ);
            jSONObject2.put("kwork", pl0.LIZJ);
            jSONObject2.put("system_server", pl0.LIZLLL);
            jSONObject2.put("lmkd", pl0.LJ);
            jSONObject2.put("user", pl0.LJFF);
            jSONObject2.put("sys", pl0.LJI);
            jSONObject2.put("iowait", pl0.LJII);
            jSONObject2.put("minor", pl0.LJIIIIZZ);
            jSONObject2.put("major", pl0.LJIIIZ);
            jSONObject2.put("user2", pl0.LJIIJ);
            jSONObject2.put("sys2", pl0.LJIIJJI);
            jSONObject2.put("iowait2", pl0.LJIIL);
            jSONObject2.put("minor2", pl0.LJIILIIL);
            jSONObject2.put("major2", pl0.LJIILJJIL);
            jSONObject2.put("process_name", pl0.LJIILL);
            jSONObject2.put("top_cpu_process_name", pl0.LJIILLIIL);
            jSONObject2.put("top_cpu_process_is_anrapp", pl0.LJIIZILJ);
            jSONObject2.put("load", pl0.LJIJ);
            jSONObject2.put("before_cpu_list", pl0.LJIJI);
            jSONObject2.put("after_cpu_list", pl0.LJIJJ);
            jSONObject2.put("cpu_thread_list", pl0.LJIL);
            jSONObject2.put("dex2oat", pl0.LJJ);
            jSONObject2.put("main_thread_cpu", pl0.LJJI);
            jSONObject.put("cpu", jSONObject2);
        } catch (Throwable unused) {
        }
        pl0.LIZ = 0.0f;
        pl0.LIZIZ = 0.0f;
        pl0.LIZJ = 0.0f;
        pl0.LIZLLL = 0.0f;
        pl0.LJ = 0.0f;
        pl0.LJFF = 0.0f;
        pl0.LJI = 0.0f;
        pl0.LJII = 0.0f;
        pl0.LJIIZILJ = -1;
        pl0.LJIILLIIL = null;
        pl0.LJIJ = null;
        pl0.LJIJI = null;
        pl0.LJIJJ = null;
        pl0.LJIL = null;
        pl0.LJJ = null;
        pl0.LJJI = 0.0f;
        return jSONObject;
    }

    public final void LIZ(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.LJFF.entrySet()) {
            PJC.LJIIJ(jSONObject, entry.getKey(), entry.getValue());
        }
    }

    public final void LIZIZ(JSONObject jSONObject) {
        for (Map.Entry<String, Long> entry : this.LIZLLL.entrySet()) {
            PJC.LJIIJ(jSONObject, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Float> entry2 : this.LJ.entrySet()) {
            PJC.LJIIJ(jSONObject, entry2.getKey(), entry2.getValue());
        }
    }

    public final void LIZJ(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.LIZJ.entrySet()) {
            PJC.LJIIJ(jSONObject, entry.getKey(), entry.getValue());
        }
    }

    public final void LIZLLL(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.LIZIZ.entrySet()) {
            PJC.LJIIJ(jSONObject, entry.getKey(), entry.getValue());
        }
    }

    public final void LJFF(String str, String str2, int i, int i2, int i3, long j, long j2, long j3) {
        String str3;
        if (this.LJIIJJI == null) {
            JSONArray LIZJ = PJC.LIZJ(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore");
            if (LIZJ != null) {
                this.LJIIJJI = new LinkedList();
                str3 = LIZJ.optString(0);
                for (int i4 = 1; i4 < LIZJ.length(); i4++) {
                    try {
                        ((LinkedList) this.LJIIJJI).add(PatternProtector.compile(LIZJ.optString(i4)));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                str3 = "npth_inner_default";
            }
            if (this.LJIIJJI == null) {
                LinkedList linkedList = new LinkedList();
                this.LJIIJJI = linkedList;
                linkedList.add(PatternProtector.compile("^main$"));
                ((LinkedList) this.LJIIJJI).add(PatternProtector.compile("^default_npth_thread$"));
                ((LinkedList) this.LJIIJJI).add(PatternProtector.compile("^RenderThread$"));
                ((LinkedList) this.LJIIJJI).add(PatternProtector.compile("^Jit thread pool worker thread.*$"));
            }
            this.LJI.LIZIZ("max_utm_thread_version", str3);
        }
        Iterator<Pattern> it = this.LJIIJJI.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().matcher(str2).matches()) {
                    break;
                }
            } else {
                int[] iArr = this.LJII;
                if (i > iArr[0]) {
                    iArr[0] = i;
                    this.LJIIIIZZ = str2;
                }
                if (i2 > iArr[1]) {
                    iArr[1] = i2;
                    this.LJIIIZ = str2;
                }
                int i5 = i + i2;
                if (i5 > iArr[2]) {
                    iArr[2] = i5;
                    this.LJIIJ = str2;
                }
            }
        }
        PL0 pl0 = this.LIZ;
        int intValue = CastIntegerProtector.valueOf(str).intValue();
        int i6 = i + i2;
        if (pl0.LJIL == null) {
            pl0.LJIL = new JSONObject();
        }
        if ("main".equals(str2)) {
            pl0.LJJI = i6;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("thread_name", str2);
            jSONObject.put("cpu", i6);
            jSONObject.put("nice", i3);
            jSONObject.put("runTime", j);
            jSONObject.put("waitTime", j2);
            jSONObject.put("switchCount", j3);
            pl0.LJIL.put(String.valueOf(intValue), jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
