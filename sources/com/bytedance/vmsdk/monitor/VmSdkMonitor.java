package com.bytedance.vmsdk.monitor;

import X.C36903Ee3;
import X.C39134FXm;
import X.C39135FXn;
import X.C39136FXo;
import X.C64009PAf;
import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.vmsdk.log.VLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class VmSdkMonitor {
    public static volatile C64009PAf LIZ;

    public static boolean getSettings(String str) {
        return C36903Ee3.LIZJ().LIZ(str);
    }

    public static synchronized void LIZ(Context context, C39136FXo c39136FXo) {
        synchronized (VmSdkMonitor.class) {
            C36903Ee3.LIZJ().LIZIZ(context);
            VLog.init();
            if (LIZ != null) {
                return;
            }
            SDKMonitorUtils.LIZLLL("8398", C39135FXn.LIZ);
            SDKMonitorUtils.LJ("8398", C39135FXn.LIZIZ);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device_id", c39136FXo.LIZ);
                jSONObject.put("channel", c39136FXo.LIZIZ);
                jSONObject.put("host_aid", c39136FXo.LIZJ);
                jSONObject.put("app_version", c39136FXo.LIZLLL);
                jSONObject.put("update_version_code", c39136FXo.LJ);
            } catch (JSONException e) {
                e.getMessage();
            }
            SDKMonitorUtils.LIZJ(context, "8398", jSONObject, new C39134FXm());
            LIZ = SDKMonitorUtils.LIZIZ("8398");
        }
    }

    public static synchronized void LIZIZ(Context context, C39136FXo c39136FXo) {
        synchronized (VmSdkMonitor.class) {
            LIZ(context, c39136FXo);
        }
    }

    public static void monitorEvent(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("biz_name", str2);
            jSONObject.put(str3, str4);
            if (LIZ != null) {
                LIZ.LJIIJ(str, jSONObject, null, null);
            }
        } catch (Throwable unused) {
        }
    }
}
