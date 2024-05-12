package X;

import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.inner.api.bean.SetupInfo;
import com.bytedance.pitaya.log.PitayaLogger;
import com.bytedance.pitaya.thirdcomponent.monitor.Monitor;
import com.bytedance.pitaya.thirdcomponent.stddelegate.PitayaInnerServiceProvider;
import org.json.JSONObject;

/* renamed from: X.aPA, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93332aPA implements InterfaceC93304aOi {
    @Override // X.InterfaceC93304aOi
    public final void onError(String str, Throwable th) {
        String str2;
        String str3;
        String str4;
        Monitor monitor = (Monitor) PitayaInnerServiceProvider.getService(Monitor.class);
        if (monitor != null) {
            JSONObject jSONObject = new JSONObject();
            SetupInfo setupInfo = C93318aOw.LIZ;
            if (setupInfo != null) {
                str2 = setupInfo.getAppVersion();
            } else {
                str2 = null;
            }
            JSONObject put = jSONObject.put("app_ver", str2).put("code", PTYErrorCode.SUB_MODULE_SO_ERROR).put("err", str);
            SetupInfo setupInfo2 = C93318aOw.LIZ;
            if (setupInfo2 != null) {
                str3 = setupInfo2.getPluginVersion();
            } else {
                str3 = null;
            }
            JSONObject put2 = put.put("plugin", str3);
            SetupInfo setupInfo3 = C93318aOw.LIZ;
            if (setupInfo3 != null) {
                str4 = setupInfo3.getSdkBuildVersion();
            } else {
                str4 = null;
            }
            monitor.monitorEvent("pitaya2_submodule_load_error", put2.put("sdk_build_ver", str4).put("sdk_ver", "2.8.0"), null, new JSONObject().put("error_detail", th.toString()).put("extra_info", (Object) null));
        }
        PitayaLogger.LJ(th, "", 2);
    }
}
