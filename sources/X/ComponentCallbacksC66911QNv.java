package X;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QNv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class ComponentCallbacksC66911QNv implements ComponentCallbacks {
    public final /* synthetic */ DialogC66909QNt LJLIL;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public ComponentCallbacksC66911QNv(DialogC66909QNt dialogC66909QNt) {
        this.LJLIL = dialogC66909QNt;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        boolean z;
        int i2 = configuration.orientation;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            } else {
                i = 1;
            }
        } else {
            i = 2;
        }
        if (this.LJLIL.LJZL.LJ() == 2) {
            z = true;
        } else {
            z = false;
        }
        C07670Rv.LIZLLL("canOrientation: ", z);
        if (!z) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        String LIZIZ = OCR.LIZIZ("bytedcert.orientation_changing", "bytedcert.orientation_changing", jSONObject);
        DialogC66909QNt dialogC66909QNt = this.LJLIL;
        dialogC66909QNt.LJLLILLLL = true;
        OCP ocp = dialogC66909QNt.LJLIL;
        if (ocp != null) {
            ocp.LIZ(LIZIZ);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("result", i);
            jSONObject2.put("key", "orientation_change");
            QN2.LIZJ("turing_verify_sdk", jSONObject2);
        } catch (JSONException e2) {
            if (C61349O5x.LIZ < 3) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }
}
