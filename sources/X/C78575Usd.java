package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLogFilterSwitchAbSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: X.Usd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78575Usd {
    public InterfaceC78578Usg LIZ;
    public HashMap<String, Object> LIZIZ;
    public ExecutorService LIZJ;
    public InterfaceC48269Iwz LIZLLL;

    public final HashMap<String, Object> LIZ(String str) {
        InterfaceC78578Usg interfaceC78578Usg;
        if ((this.LIZIZ == null || TextUtils.equals(str, "first_frame") || TextUtils.equals(str, "render_stall") || TextUtils.equals(str, "decode_stall")) && (interfaceC78578Usg = this.LIZ) != null) {
            C78579Ush c78579Ush = ((C78576Use) interfaceC78578Usg).LIZ.LL;
            c78579Ush.getClass();
            HashMap<String, Object> hashMap = new HashMap<>();
            try {
                hashMap.putAll(c78579Ush.LIZJ());
                Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
                hashMap.put("channel", ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getChannel());
                hashMap.put("device_name", Build.MODEL);
                hashMap.put("did", AppLog.getServerDeviceId());
                hashMap.put("uid", Long.valueOf(B83.LIZ().LIZIZ().getCurrentUserId()));
                hashMap.put("net_type", C16880lQ.LLJILJILJ(context));
                hashMap.put("net_des", C78579Ush.LIZIZ(context));
                if (!LiveLogFilterSwitchAbSetting.INSTANCE.printLogSwitch()) {
                    int LIZLLL = C78579Ush.LIZLLL(context);
                    if (LIZLLL > 0) {
                        hashMap.put("app_version_four", Integer.valueOf(LIZLLL));
                    }
                } else if (C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData != null) {
                    hashMap.put("app_version_four", Integer.valueOf(C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData.getInt("UPDATE_VERSION_CODE")));
                }
                hashMap.put("ttlive_sdk_version", C30443Bx9.LIZ());
                hashMap.put("screen_height", Integer.valueOf(c78579Ush.LIZIZ));
                hashMap.put("screen_width", Integer.valueOf(c78579Ush.LIZJ));
                String str2 = c78579Ush.LIZLLL;
                if (str2 != null) {
                    hashMap.put("cpu_soc", str2);
                }
                String str3 = c78579Ush.LJ;
                if (str3 != null) {
                    hashMap.put("gpu_name", str3);
                }
            } catch (Throwable th) {
                C0NB.LJI("LivePlayerLog", th);
                C78579Ush.LJ(1, th);
            }
            this.LIZIZ = hashMap;
        }
        return this.LIZIZ;
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        String str2;
        try {
            HashMap<String, Object> LIZ = LIZ(str);
            if (LIZ != null) {
                for (Map.Entry<String, Object> entry : LIZ.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            InterfaceC48269Iwz interfaceC48269Iwz = this.LIZLLL;
            if (interfaceC48269Iwz != null) {
                ((VBU) interfaceC48269Iwz).LIZLLL(str, jSONObject);
            }
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onMonitorLog common params ex=");
            LIZ2.append(th.toString());
            X1D.LIZIZ(LIZ2);
            C46496IMq.LIZIZ();
        }
        if (str.equals("live_webrtc_monitor_log")) {
            str2 = "livesdk_live_client_applog_webrtc_monitor_log";
        } else {
            str2 = "livesdk_live_client_applog_monitor_log";
        }
        AppLogNewUtils.onEventV3(str2, jSONObject);
    }
}
