package X;

import com.bytedance.pia.core.plugins.BridgeDowngradePlugin;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import org.json.JSONObject;

/* renamed from: X.Ep4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37586Ep4<T> implements BQ6<JSONObject> {
    public final /* synthetic */ C37584Ep2 LIZ;
    public final /* synthetic */ C37587Ep5 LIZIZ;

    public C37586Ep4(C37584Ep2 c37584Ep2, C37587Ep5 c37587Ep5) {
        this.LIZ = c37584Ep2;
        this.LIZIZ = c37587Ep5;
    }

    @Override // X.BQ6
    public final void accept(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        Callback callback = this.LIZIZ.LIZJ;
        if (callback != null) {
            this.LIZ.LIZ.getClass();
            callback.invoke(BridgeDowngradePlugin.LJIIIIZZ(jSONObject2));
        }
    }
}
