package X;

import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O8P implements O8T {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ JSONObject LIZIZ;
    public final /* synthetic */ JSONObject LIZJ;
    public final /* synthetic */ O8O LIZLLL;

    @Override // X.O8T
    public final void onFail() {
    }

    @Override // X.O8T
    public final void onSuccess() {
        SDKMonitorUtils.LIZIZ("1385").LJIILIIL(this.LIZ, 1, this.LIZIZ, this.LIZJ);
        this.LIZLLL.getClass();
    }

    public O8P(O8O o8o, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.LIZLLL = o8o;
        this.LIZ = str;
        this.LIZIZ = jSONObject;
        this.LIZJ = jSONObject2;
    }
}
