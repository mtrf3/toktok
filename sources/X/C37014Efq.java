package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Efq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37014Efq extends AbstractC38123Exj<JSONObject, JSONObject> {
    public final C37005Efh LJLIL;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        C37005Efh c37005Efh = this.LJLIL;
        C36760Ebk c36760Ebk = c37005Efh.LIZ;
        if (c36760Ebk != null) {
            c36760Ebk.LIZ.remove(c37005Efh);
        }
    }

    public C37014Efq() {
        C37013Efp c37013Efp = new C37013Efp(this);
        C36991EfT c36991EfT = C36991EfT.LJ;
        if (c36991EfT != null) {
            this.LJLIL = new C37005Efh(c36991EfT, c37013Efp);
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }

    public final void LJJI(int i) {
        char c;
        String str;
        View view = this.callContext.LJ;
        int i2 = 0;
        if (view instanceof WebView) {
            c = 0;
        } else if (view instanceof VNS) {
            c = 1;
        } else {
            c = 65535;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cached", i);
            View view2 = this.callContext.LJ;
            if (view2 instanceof WebView) {
                str = "webview";
            } else if (view2 instanceof VNS) {
                str = "lynx";
            } else {
                str = "unknown";
            }
            jSONObject.put("live_container_type", str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (c != 0) {
            if (c != 1) {
                i2 = -1;
            } else {
                i2 = 3;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("platform", i2);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        if (c != 0) {
            if (c != 1) {
                return;
            }
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
            C38131Exr c38131Exr = this.callContext;
            lynxViewMonitor.reportCustom((VNS) c38131Exr.LJ, "prefetch_cached", c38131Exr.LIZIZ, jSONObject, null, null, jSONObject2, 0);
            return;
        }
        VMI vmi = VMI.LJ;
        C38131Exr c38131Exr2 = this.callContext;
        vmi.LJIILLIIL((WebView) c38131Exr2.LJ, c38131Exr2.LIZIZ, "prefetch_cached", jSONObject, null, null, jSONObject2);
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr context) {
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        this.LJLIL.LIZIZ(params);
    }
}
