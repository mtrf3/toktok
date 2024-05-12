package X;

import Y.ARunnableS50S0100000_14;
import android.view.View;
import com.ss.videoarch.strategy.strategy.networkStrategy.SettingsManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.VCp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79359VCp implements VDQ {
    public Object LIZ;
    public Object LIZIZ;

    public final void LIZIZ() {
        Object obj = this.LIZIZ;
        if (obj != null) {
            VD4 vd4 = (VD4) obj;
            vd4.getClass();
            if (C79346VCc.LIZLLL().LJJIJL == 1) {
                if (C79346VCc.LIZLLL().LJIIIZ == null) {
                    return;
                }
                SettingsManager.getInstance().getFeatureConfig(String.valueOf(C79346VCc.LIZLLL().LJIIIZ), vd4);
                return;
            }
            if (C79346VCc.LIZLLL().LJIIIZ == null) {
                return;
            }
            if (C79346VCc.LIZLLL().LJIIIZ.has(vd4.LIZ)) {
                JSONObject optJSONObject = C79346VCc.LIZLLL().LJIIIZ.optJSONObject(vd4.LIZ);
                if (optJSONObject != null) {
                    if (optJSONObject.has("FeatureList")) {
                        vd4.LIZIZ = optJSONObject.optJSONArray("FeatureList");
                    } else {
                        vd4.LIZIZ = null;
                    }
                    if (optJSONObject.has("RTFeatureList")) {
                        vd4.LIZJ = optJSONObject.optJSONArray("RTFeatureList");
                    } else {
                        vd4.LIZJ = null;
                    }
                    JSONArray jSONArray = vd4.LIZJ;
                    if (jSONArray != null) {
                        vd4.LIZLLL = jSONArray.toString();
                    }
                    if (optJSONObject.has("FeaturesCollectRules")) {
                        vd4.LJ = optJSONObject.optJSONObject("FeaturesCollectRules");
                        return;
                    } else {
                        vd4.LJ = null;
                        return;
                    }
                }
                vd4.LIZIZ = null;
                vd4.LJ = null;
                return;
            }
            vd4.LIZIZ = null;
            vd4.LJ = null;
        }
    }

    public C79359VCp(int i) {
        if (i != 3) {
            return;
        }
        this.LIZ = "BaseType";
        this.LIZIZ = new VD4();
    }

    @Override // X.VDQ
    public final void LIZ(ARunnableS50S0100000_14 aRunnableS50S0100000_14) {
        View view = (View) this.LIZ;
        if (view != null) {
            view.requestLayout();
        }
        this.LIZIZ = aRunnableS50S0100000_14;
    }

    public /* synthetic */ C79359VCp(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
