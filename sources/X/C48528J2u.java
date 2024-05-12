package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.J2u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48528J2u {
    public final String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public boolean LIZ = C40507Fv5.LIZ;
    public final C48529J2v LJ = new C48529J2v();
    public final C48529J2v LJFF = new C48529J2v();
    public final C48529J2v LJI = new C48529J2v();
    public boolean LJII = false;
    public boolean LJIIIIZZ = false;
    public boolean LJIIIZ = false;
    public final C48529J2v LJIIJ = new C48529J2v();
    public final C48529J2v LJIIJJI = new C48529J2v();
    public final C48529J2v LJIIL = new C48529J2v();
    public final C48529J2v LJIILIIL = new C48529J2v();
    public boolean LJIILJJIL = false;
    public String LJIILL = null;
    public Float LJIILLIIL = null;

    public final void LIZ() {
        this.LJIIJ.LIZ();
        this.LJIIJJI.LIZ();
        this.LJIIL.LIZ();
        this.LJIILIIL.LIZ();
        this.LJIILJJIL = false;
        this.LJIILL = null;
        this.LJIILLIIL = null;
    }

    public final String toString() {
        int i;
        int i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(WM7.SCENE_SERVICE, this.LIZIZ);
            jSONObject.put("model_name", this.LIZJ);
            jSONObject.put("sdk_duration", this.LJ.LIZIZ());
            jSONObject.put("download_cost", this.LJFF.LIZIZ());
            jSONObject.put("model_cost", this.LJI.LIZIZ());
            int i3 = 1;
            if (this.LJII) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("sdk_success", i);
            if (this.LJIIIIZZ) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("download_suc", i2);
            if (!this.LJIIIZ) {
                i3 = 0;
            }
            jSONObject.put("model_load_suc", i3);
        } catch (JSONException e) {
            C44384HbQ.LJJ("ml#evaluator", "getSdkInitMonitorData error!", e);
        }
        this.LJ.LIZ();
        this.LJFF.LIZ();
        this.LJI.LIZ();
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        try {
            jSONObject.put(WM7.SCENE_SERVICE, this.LIZIZ);
            jSONObject.put("model_name", this.LIZJ);
            jSONObject.put("sdk_duration", this.LJIIJ.LIZIZ());
            jSONObject.put("pre_cost", this.LJIIJJI.LIZIZ());
            jSONObject.put("infer_cost", this.LJIIL.LIZIZ());
            jSONObject.put("post_cost", this.LJIILIIL.LIZIZ());
            jSONObject.put("sdk_success", this.LJIILJJIL ? 1 : 0);
            String str = this.LJIILL;
            if (str != null) {
                jSONObject.put("s_result", str);
            }
            if (this.LJIILLIIL != null) {
                jSONObject.put("f_result", r0.floatValue());
            }
        } catch (JSONException e2) {
            C44384HbQ.LJJ("ml#evaluator", "getSdkRunMonitorData error!", e2);
        }
        LIZ();
        return jSONObject.toString();
    }

    public C48528J2u(String str) {
        this.LIZIZ = str;
    }

    public final void LIZIZ(boolean z) {
        if (!this.LIZ || this.LIZLLL) {
            return;
        }
        this.LJ.LIZIZ = System.currentTimeMillis();
        this.LJII = z;
        this.LIZLLL = true;
    }

    public final void LIZJ(boolean z) {
        if (!this.LIZ || this.LIZLLL) {
            return;
        }
        this.LJI.LIZIZ = System.currentTimeMillis();
        this.LJIIIZ = z;
    }
}
