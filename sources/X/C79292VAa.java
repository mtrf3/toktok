package X;

import ccb.t;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.VAa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79292VAa {
    public Integer[] LIZ = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
    public boolean LIZIZ = false;
    public boolean LIZJ = false;
    public double LIZLLL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public boolean LJ = false;
    public int LJFF = 0;
    public boolean LJI = false;
    public double LJII = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public final VB4 LJIIIIZZ = new VB4();
    public final /* synthetic */ t LJIIIZ;

    public final String LIZ() {
        return this.LJIIIIZZ.LIZLLL;
    }

    public final double LIZIZ() {
        return this.LJIIIIZZ.LIZIZ;
    }

    public final int LIZJ() {
        return this.LJIIIIZZ.LIZJ;
    }

    public final int LJ() {
        return this.LJIIIIZZ.LIZ;
    }

    public C79292VAa(t tVar) {
        this.LJIIIZ = tVar;
    }

    public final void LIZLLL(JSONArray jSONArray) {
        JSONObject optJSONObject;
        VB4 vb4 = this.LJIIIIZZ;
        vb4.LIZ = -1;
        vb4.LIZIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        int i = 0;
        vb4.LIZJ = 0;
        vb4.LIZLLL = "";
        if (jSONArray != null && jSONArray.length() > 0 && (optJSONObject = jSONArray.optJSONObject(0)) != null) {
            if (optJSONObject.has("result")) {
                VB4 vb42 = this.LJIIIIZZ;
                if (optJSONObject.optBoolean("result")) {
                    i = 3;
                }
                vb42.LIZ = i;
            }
            if (optJSONObject.has(C63832P3k.LIZ)) {
                this.LJIIIIZZ.LIZLLL = optJSONObject.optString(C63832P3k.LIZ);
            }
            if (optJSONObject.has("lossrate")) {
                this.LJIIIIZZ.LIZIZ = optJSONObject.optDouble("lossrate");
            }
            if (optJSONObject.has("rtt_min")) {
                this.LJIIIIZZ.LIZJ = optJSONObject.optInt("rtt_min");
            }
        }
    }
}
