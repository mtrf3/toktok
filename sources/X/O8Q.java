package X;

import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O8Q implements O8T {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ JSONObject LIZIZ;
    public final /* synthetic */ O8O LIZJ;

    @Override // X.O8T
    public final void onFail() {
    }

    @Override // X.O8T
    public final void onSuccess() {
        SDKMonitorUtils.LIZIZ("1385").LJIILIIL(this.LIZ, 1, null, this.LIZIZ);
        this.LIZJ.getClass();
    }

    public O8Q(O8O o8o, String str, JSONObject jSONObject) {
        this.LIZJ = o8o;
        this.LIZ = str;
        this.LIZIZ = jSONObject;
    }
}
