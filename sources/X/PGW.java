package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PGW extends PEG {
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;
    public final double LJIIIIZZ;
    public final JSONArray LJIIIZ;
    public final JSONArray LJIIJ;
    public final JSONArray LJIIJJI;
    public final JSONArray LJIIL;

    @Override // X.InterfaceC64036PBg
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.PEG
    public final String LJII() {
        return "disk";
    }

    @Override // X.InterfaceC64036PBg
    public final boolean isValid() {
        return true;
    }

    @Override // X.PEG
    public final JSONObject LIZLLL() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.LJIIL;
            if (jSONArray != null) {
                jSONObject.put("disk_info", jSONArray);
            }
            JSONArray jSONArray2 = this.LJIIIZ;
            if (jSONArray2 != null) {
                jSONObject.put("top_usage", jSONArray2);
            }
            JSONArray jSONArray3 = this.LJIIJ;
            if (jSONArray3 != null) {
                jSONObject.put("exception_folders", jSONArray3);
            }
            JSONArray jSONArray4 = this.LJIIJJI;
            if (jSONArray4 != null) {
                jSONObject.put("outdated_files", jSONArray4);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // X.PEG
    public final JSONObject LJ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(WM7.SCENE_SERVICE, PGQ.LIZ().LJ());
            jSONObject.put("process_name", PC5.LJIJJ());
            jSONObject.put("is_front", false);
            jSONObject.put("is_main_process", PC5.LJJIIZ());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.PEG
    public final JSONObject LJFF() {
        JSONObject jSONObject = new JSONObject();
        try {
            long j = this.LIZIZ;
            if (j > 0) {
                jSONObject.put("data", j);
            }
            long j2 = this.LIZJ;
            if (j2 > 0) {
                jSONObject.put("cache", j2);
            }
            long j3 = this.LIZLLL;
            if (j3 > 0) {
                jSONObject.put("total", j3);
            }
            long j4 = this.LJ;
            if (j4 > 0) {
                jSONObject.put("rom_free", j4);
            }
            long j5 = this.LJFF;
            if (j5 > 0) {
                jSONObject.put("app_usage", j5);
            }
            long j6 = this.LJI;
            if (j6 > 0) {
                jSONObject.put("total_capacity", j6);
            }
            long j7 = this.LJII;
            if (j7 > 0) {
                jSONObject.put("free_capacity", j7);
            }
            double d = this.LJIIIIZZ;
            if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                jSONObject.put("app_occupied_rate", d);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // X.PEG
    public final JSONObject LJI() {
        JSONObject LIZIZ = PGQ.LIZ().LIZIZ();
        try {
            C64055PBz.LIZ(LIZIZ, PGQ.LIZ().LIZLLL());
        } catch (Exception unused) {
        }
        return LIZIZ;
    }

    public PGW(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4) {
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = j5;
        this.LJI = j6;
        this.LJII = j7;
        this.LJIIIIZZ = d;
        this.LJIIIZ = jSONArray;
        this.LJIIJ = jSONArray2;
        this.LJIIJJI = jSONArray3;
        this.LJIIL = jSONArray4;
    }
}
