package X;

import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Qlo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67960Qlo {
    public C64009PAf LIZ;

    public final void LIZ(C67964Qls c67964Qls) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paymentResult", c67964Qls.toString());
            LIZIZ("pipo_googlepayapi_request_payment_end", jSONObject, new JSONObject());
        } catch (Throwable unused) {
        }
    }

    public C67960Qlo(Context ctx, C67966Qlu appInfo) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(appInfo, "appInfo");
        SDKMonitorUtils.LIZLLL("4108", C47261Igj.LJJIJ("https://mon.isnssdk.com/monitor/appmonitor/v2/settings"));
        SDKMonitorUtils.LJ("4108", C47261Igj.LJJIJ("https://mon.isnssdk.com/monitor/collect/"));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("device_id", appInfo.LIZ);
        jSONObject.put("host_aid", appInfo.LIZIZ);
        jSONObject.put("sdk_version", "0.0.1-rc.3");
        jSONObject.put("channel", appInfo.LIZJ);
        jSONObject.put("app_version", appInfo.LIZLLL);
        jSONObject.put("update_version_code", appInfo.LJ);
        SDKMonitorUtils.LIZJ(ctx, "4108", jSONObject, new C67962Qlq());
    }

    public final void LIZIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.LIZ == null) {
            this.LIZ = SDKMonitorUtils.LIZIZ("4108");
        }
        try {
            C64009PAf c64009PAf = this.LIZ;
            if (c64009PAf != null) {
                c64009PAf.LJIIJ(str, jSONObject, jSONObject2, null);
            }
        } catch (Throwable unused) {
        }
    }
}
