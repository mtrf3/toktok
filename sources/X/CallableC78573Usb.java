package X;

import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLogFilterSwitchAbSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.Usb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class CallableC78573Usb implements Callable {
    public final JSONObject LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL = "ttls_push_event";
    public final boolean LJLJL;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        float f;
        try {
            if (this.LJLJL) {
                java.util.Map LIZ = C31023CFn.LIZ("live_client_monitor_log");
                if (LIZ != null && LIZ.size() > 0) {
                    this.LJLIL.put("cpu_speed_rate", LIZ.get("cpu_speed"));
                    this.LJLIL.put("cpu", LIZ.get("cpu_rate"));
                }
                java.util.Map LIZIZ = C31023CFn.LIZIZ("live_client_monitor_log");
                Long l = (Long) LIZIZ.get("mem_pss_dalvik");
                if (l != null && l.longValue() > 0) {
                    this.LJLIL.put("dalvik_pss", l);
                }
                Long l2 = (Long) LIZIZ.get("mem_pss_total");
                if (l2 != null) {
                    f = (((float) l2.longValue()) / 1024.0f) / 1024.0f;
                } else {
                    f = -1.0f;
                }
                this.LJLIL.put("memory", (int) f);
            }
            this.LJLIL.put("product_line", "live");
            Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", this.LJLIL);
            jSONObject.put("did", AppLog.getServerDeviceId());
            jSONObject.put("uid", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            jSONObject.put("net_type", C16880lQ.LLJILJILJ(context));
            jSONObject.put("net_des", C78579Ush.LIZIZ(context));
            LiveLogFilterSwitchAbSetting liveLogFilterSwitchAbSetting = LiveLogFilterSwitchAbSetting.INSTANCE;
            if (!liveLogFilterSwitchAbSetting.printLogSwitch()) {
                int LIZLLL = C78579Ush.LIZLLL(context);
                if (LIZLLL > 0) {
                    jSONObject.put("app_version_four", LIZLLL);
                }
            } else if (C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData != null) {
                jSONObject.put("app_version_four", C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData.getInt("UPDATE_VERSION_CODE"));
            }
            if (!InterfaceC30442Bx8.LJJJJZI.LIZJ().booleanValue() && liveLogFilterSwitchAbSetting.printLogSwitch()) {
                C0NB.LJIIIZ("LivePlayerLog", jSONObject.toString());
            }
            this.LJLIL.put("channel", ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getChannel());
            this.LJLIL.put("device_name", Build.MODEL);
            this.LJLIL.put("screen_height", this.LJLILLLLZI);
            this.LJLIL.put("screen_width", this.LJLJI);
            String str = this.LJLJJI;
            String str2 = this.LJLJJL;
            JSONObject jSONObject2 = this.LJLIL;
            if (str != null) {
                jSONObject2.put("cpu_soc", str);
            }
            if (str2 != null) {
                jSONObject2.put("gpu_name", str2);
            }
        } catch (Throwable th) {
            C0NB.LJI("LivePlayerLog", th);
            C78579Ush.LJ(3, th);
        }
        try {
            AppLogNewUtils.onEventV3(this.LJLJJLL, this.LJLIL);
            return null;
        } catch (Throwable th2) {
            if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS42S0100000_6(th2, 68));
                return null;
            }
            C78579Ush.LJ(4, th2);
            return null;
        }
    }

    public CallableC78573Usb(int i, int i2, String str, String str2, JSONObject jSONObject, boolean z) {
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLIL = jSONObject;
        this.LJLJL = z;
    }
}
