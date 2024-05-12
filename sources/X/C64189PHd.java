package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.PHd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64189PHd extends PEG {
    public final EnumC64201PHp LIZIZ;
    public final C46626IRq LIZJ;
    public final String LIZLLL;
    public final double LJ;
    public final double LJFF;
    public final double LJI;
    public final double LJII;
    public float LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final List<PI9<String, Double>> LJIIJJI;

    @Override // X.InterfaceC64036PBg
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC64036PBg
    public final boolean isValid() {
        return true;
    }

    @Override // X.PEG
    public final JSONObject LJ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("process_name", C09970aH.LIZIZ());
            jSONObject.put("is_main_process", C09970aH.LJIIIIZZ());
            jSONObject.put(WM7.SCENE_SERVICE, this.LIZLLL);
            int i = C64204PHs.LIZ[this.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        jSONObject.put("data_type", "front");
                    }
                } else {
                    jSONObject.put("data_type", "back");
                }
            } else {
                jSONObject.put("data_type", "mix");
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.PEG
    public final JSONObject LJFF() {
        boolean z;
        F f;
        S s;
        try {
            JSONObject jSONObject = new JSONObject();
            List<PI9<String, Double>> list = this.LJIIJJI;
            if (list != null && !((ArrayList) list).isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Iterator it = ((ArrayList) this.LJIIJJI).iterator();
                while (it.hasNext()) {
                    PI9 pi9 = (PI9) it.next();
                    if (pi9 != null && (f = pi9.LIZ) != 0 && !((String) f).isEmpty() && (s = pi9.LIZIZ) != 0 && ((Double) s).doubleValue() != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        jSONObject.put((String) pi9.LIZ, pi9.LIZIZ);
                    }
                }
            } else {
                double d = this.LJ;
                if (d > -1.0d && this.LJFF > -1.0d) {
                    jSONObject.put("app_usage_rate", d);
                    jSONObject.put("app_max_usage_rate", this.LJFF);
                }
                double d2 = this.LJI;
                if (d2 > -1.0d && this.LJII > -1.0d) {
                    jSONObject.put("app_stat_speed", d2);
                    jSONObject.put("app_max_stat_speed", this.LJII);
                }
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.PEG
    public final JSONObject LJI() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_auto_sample", this.LJIIIZ);
            if (this.LIZJ != null) {
                jSONObject.put("network_type", C16880lQ.LLJJI(C09970aH.LIZ));
                jSONObject.put("battery_level", this.LIZJ.LIZJ);
                jSONObject.put("cpu_hardware", this.LIZJ.LIZ);
                jSONObject.put("is_charging", this.LIZJ.LIZIZ);
                jSONObject.put("power_save_mode", this.LIZJ.LJ);
                jSONObject.put("thermal_status", this.LIZJ.LIZLLL);
                jSONObject.put("battery_thermal", this.LIZJ.LJFF);
                jSONObject.put("is_normal_sample_state", this.LJIIJ);
            }
            float f = this.LJIIIIZZ;
            if (f > 0.0f) {
                jSONObject.put("battery_current", f);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.PEG
    public final String LJII() {
        List<PI9<String, Double>> list = this.LJIIJJI;
        if (list != null && !((ArrayList) list).isEmpty()) {
            return "cpu_thread";
        }
        return "cpu";
    }

    public C64189PHd(EnumC64201PHp enumC64201PHp, String str, List<PI9<String, Double>> list, C46626IRq c46626IRq) {
        this.LJ = -1.0d;
        this.LJFF = -1.0d;
        this.LJI = -1.0d;
        this.LJII = -1.0d;
        this.LJIIIIZZ = -1.0f;
        this.LJIIIZ = true;
        this.LJIIJ = true;
        this.LJIIJJI = new ArrayList(list);
        this.LIZIZ = enumC64201PHp;
        this.LIZLLL = str;
        this.LIZJ = c46626IRq;
    }

    public C64189PHd(EnumC64201PHp enumC64201PHp, String str, double d, double d2, double d3, double d4, C46626IRq c46626IRq) {
        this.LJ = -1.0d;
        this.LJFF = -1.0d;
        this.LJI = -1.0d;
        this.LJII = -1.0d;
        this.LJIIIIZZ = -1.0f;
        this.LJIIIZ = true;
        this.LJIIJ = true;
        this.LIZIZ = enumC64201PHp;
        this.LIZLLL = str;
        this.LJ = d;
        this.LJFF = d2;
        this.LJI = d3;
        this.LJII = d4;
        this.LIZJ = c46626IRq;
    }
}
