package com.bytedance.bdlocation.monitor;

import X.C64009PAf;
import X.InterfaceC64016PAm;
import android.content.Context;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.utils.json.JsonUtil;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes24.dex */
public class LocationMonitorUtil {
    public static boolean sIsInit;
    public static C64009PAf sSDKMonitor;

    public static JSONObject getHeader() {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutString(jSONObject, "device_id", BDLocationConfig.getDeviceId());
        JsonUtil.safePutString(jSONObject, "host_aid", BDLocationConfig.getAppId());
        JsonUtil.safePutString(jSONObject, "sdk_version", BDLocationConfig.getSdkVersion());
        JsonUtil.safePutString(jSONObject, "channel", BDLocationConfig.getChannel());
        JsonUtil.safePutString(jSONObject, "app_version", BDLocationConfig.getAppVersion());
        JsonUtil.safePutString(jSONObject, "update_version_code", BDLocationConfig.getUpdateVersionCode());
        JsonUtil.safePutString(jSONObject, "package_name", BDLocationConfig.getPackageName());
        return jSONObject;
    }

    public static void init(Context context) {
        if (sIsInit || context == null) {
            return;
        }
        SDKMonitorUtils.LIZLLL(BDLocationConfig.getSlardarAid(), Arrays.asList(BDLocationConfig.getMonitorConfigUrl()));
        SDKMonitorUtils.LJ(BDLocationConfig.getSlardarAid(), Arrays.asList(BDLocationConfig.getMonitorReportUrl()));
        SDKMonitorUtils.LIZJ(context, BDLocationConfig.getSlardarAid(), getHeader(), new InterfaceC64016PAm() { // from class: com.bytedance.bdlocation.monitor.LocationMonitorUtil.1
            @Override // X.InterfaceC64016PAm
            public Map<String, String> getCommonParams() {
                Map<String, String> commonParams = BDLocationConfig.getCommonParams();
                if (BDLocationConfig.isOverSeas()) {
                    if (commonParams == null) {
                        commonParams = new HashMap<>();
                    }
                    commonParams.put("oversea", "1");
                }
                return commonParams;
            }

            @Override // X.InterfaceC64016PAm
            public String getSessionId() {
                return BDLocationConfig.getSessionId();
            }
        });
        sSDKMonitor = SDKMonitorUtils.LIZIZ(BDLocationConfig.getSlardarAid());
        sIsInit = true;
    }

    public static void monitorEvent(String str) {
        monitorEvent(str, null, null, null);
    }

    public static void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        monitorEvent(str, jSONObject, jSONObject2, null);
    }

    public static void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C64009PAf c64009PAf = sSDKMonitor;
        if (c64009PAf != null) {
            c64009PAf.LJIIJ(str, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
