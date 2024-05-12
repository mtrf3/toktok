package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.VDw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79392VDw {
    public static volatile C79392VDw LIZIZ;
    public volatile EnumC35472Dw4 LIZ = EnumC35472Dw4.NOT_INIT;

    public static C79392VDw LIZ() {
        if (LIZIZ == null) {
            synchronized (C79392VDw.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C79392VDw();
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ(Context context) {
        try {
            String[] strArr = C68021Qmn.LIZ;
            String[] strArr2 = C68021Qmn.LIZIZ;
            if (Boolean.TRUE == null) {
                return;
            }
            String num = Integer.toString(2891);
            JSONObject jSONObject = new JSONObject();
            InterfaceC79393VDx interfaceC79393VDx = C79391VDv.LIZIZ().LIZ;
            if (interfaceC79393VDx == null) {
                return;
            }
            jSONObject.put("device_id", interfaceC79393VDx.getDeviceId());
            jSONObject.put("channel", interfaceC79393VDx.getChannel());
            jSONObject.put("app_version", interfaceC79393VDx.getAppVersionName());
            jSONObject.put("update_version_code", interfaceC79393VDx.getUpdateVersionCode());
            jSONObject.put("package_name", interfaceC79393VDx.getPackageName());
            jSONObject.put("oversea", "1");
            SDKMonitorUtils.LIZLLL(num, Arrays.asList(strArr));
            SDKMonitorUtils.LJ(num, Arrays.asList(strArr2));
            SDKMonitorUtils.LIZJ(context, num, jSONObject, new C79394VDy());
            this.LIZ = EnumC35472Dw4.HAS_INIT;
        } catch (Throwable unused) {
        }
    }

    public final void LIZJ(String str, JSONObject jSONObject) {
        synchronized (this) {
            if (this.LIZ == EnumC35472Dw4.NOT_INIT) {
                LIZIZ(C84212X3g.LJ());
            }
        }
        if (jSONObject != null) {
            try {
                jSONObject.put("monitor_version", 1);
                if (TextUtils.isEmpty(jSONObject.optString("sdk_app_id"))) {
                    jSONObject.put("sdk_app_id", 2891);
                }
                if (TextUtils.isEmpty(jSONObject.optString("event_page"))) {
                    jSONObject.put("event_page", "UNKNOWN");
                }
            } catch (Throwable unused) {
            }
        }
        try {
            if (this.LIZ == EnumC35472Dw4.HAS_INIT) {
                if (str.equals("download_failed")) {
                    jSONObject.put("status", "download_fail");
                    SDKMonitorUtils.LIZIZ(Integer.toString(2891)).LJIIJ("download_common", jSONObject, null, null);
                }
                SDKMonitorUtils.LIZIZ(Integer.toString(2891)).LJIIJ(str, jSONObject, null, null);
            }
        } catch (Throwable unused2) {
        }
    }
}
