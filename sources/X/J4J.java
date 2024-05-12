package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J4J {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final String LIZ = "har_android";
    public boolean LIZIZ = false;
    public float LIZJ = 1.0f;
    public final J4Q LIZLLL = new J4Q();
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -999;
    public final J4Q LJII = new J4Q();
    public final J4Q LJIIIIZZ = new J4Q();
    public final J4Q LJIIIZ = new J4Q();
    public int LJIIJ = -1;
    public int LJIIJJI = -1;
    public String LJIIL;
    public Float LJIILIIL;

    public final void LIZ(int i, int i2, java.util.Map<String, Float> map) {
        if (!this.LIZIZ) {
            return;
        }
        this.LJII.LIZIZ = System.currentTimeMillis();
        String valueOf = String.valueOf(i2);
        if (map != null && (!map.isEmpty())) {
            this.LJIIL = valueOf;
            if (map.containsKey(valueOf)) {
                this.LJIILIIL = map.get(valueOf);
            }
        }
        this.LJIIJ = i;
        V0R v0r = V0Q.Default;
        if (v0r.nextFloat() < J53.LIZLLL && v0r.nextFloat() < this.LIZJ) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(WM7.SCENE_SERVICE, this.LIZ);
                jSONObject.put("duration", Float.valueOf(this.LJII.LIZ()));
                jSONObject.put("pre_cost", Float.valueOf(this.LJIIIIZZ.LIZ()));
                jSONObject.put("infer_cost", Float.valueOf(this.LJIIIZ.LIZ()));
                jSONObject.put("success", this.LJIIJ);
                jSONObject.put("sdk_success", this.LJIIJJI);
                String str = this.LJIIL;
                if (str != null) {
                    jSONObject.put("s_result", str);
                }
                Float f = this.LJIILIIL;
                if (f != null) {
                    jSONObject.put("f_result", Float.valueOf(f.floatValue()));
                }
            } catch (JSONException unused) {
            }
            FMX.LJIILJJIL("ml_scene_run", jSONObject);
        }
        J4Q j4q = this.LJII;
        j4q.LIZIZ = -1L;
        j4q.LIZ = -1L;
        J4Q j4q2 = this.LJIIIIZZ;
        j4q2.LIZIZ = -1L;
        j4q2.LIZ = -1L;
        J4Q j4q3 = this.LJIIIZ;
        j4q3.LIZIZ = -1L;
        j4q3.LIZ = -1L;
        this.LJIIJ = -1;
        this.LJIIL = null;
        this.LJIILIIL = null;
    }
}
