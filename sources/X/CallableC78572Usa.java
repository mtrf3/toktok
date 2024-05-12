package X;

import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLogFilterSwitchAbSetting;
import com.bytedance.android.livesdk.livesetting.performance.CollectPerformanceAfterEnterRoomSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.common.applog.AppLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.Usa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class CallableC78572Usa implements Callable {
    public static final C78577Usf LJLJLJ = new C78577Usf();
    public final JSONObject LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final HashMap<String, Object> LJLJL;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        float f;
        JSONObject jSONObject = this.LJLIL;
        if (jSONObject != null) {
            String optString = jSONObject.optString("event_key");
            try {
                if (TextUtils.equals(optString, "play_stop") && UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_play_sr_support")) {
                    BZI LIZ = C28787BRn.LIZ("livesdk_play_sr_support");
                    LIZ.LJIJJ(Integer.valueOf(this.LJLIL.optInt("sr_used", -1)), "sr_used");
                    LIZ.LJJIIJZLJL();
                }
                if (!LIZ(optString)) {
                    boolean equals = TextUtils.equals(optString, "playing");
                    if (TextUtils.equals(optString, "first_frame") || TextUtils.equals(optString, "render_stall") || TextUtils.equals(optString, "decode_stall") || equals) {
                        if (CollectPerformanceAfterEnterRoomSetting.INSTANCE.getEnable()) {
                            LivePerformanceManager LIZ2 = B4U.LIZ();
                            if (!LIZ2.LLIILII) {
                                if (LIZ2.LLIILZL) {
                                }
                            }
                        }
                        if (((Boolean) C30922CBq.LIZJ("live_setting_applog_key", Boolean.FALSE)).booleanValue()) {
                            java.util.Map LIZ3 = C31023CFn.LIZ("livesdk_live_playing");
                            if (LIZ3 != null && LIZ3.size() > 0) {
                                this.LJLIL.put("cpu_speed_rate", LIZ3.get("cpu_speed"));
                                this.LJLIL.put("cpu", LIZ3.get("cpu_rate"));
                            }
                            java.util.Map LIZIZ = C31023CFn.LIZIZ("livesdk_live_playing");
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
                    }
                    Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
                    this.LJLIL.put("channel", ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getChannel());
                    this.LJLIL.put("device_name", Build.MODEL);
                    this.LJLIL.put("did", AppLog.getServerDeviceId());
                    this.LJLIL.put("uid", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                    this.LJLIL.put("net_type", C16880lQ.LLJILJILJ(context));
                    this.LJLIL.put("net_des", C78579Ush.LIZIZ(context));
                    if (LiveLogFilterSwitchAbSetting.INSTANCE.printLogSwitch()) {
                        if (C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData != null) {
                            this.LJLIL.put("app_version_four", C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData.getInt("UPDATE_VERSION_CODE"));
                        }
                    } else {
                        int LIZLLL = C78579Ush.LIZLLL(context);
                        if (LIZLLL > 0) {
                            this.LJLIL.put("app_version_four", LIZLLL);
                        }
                    }
                    this.LJLIL.put("ttlive_sdk_version", C30443Bx9.LIZ());
                    this.LJLIL.put("screen_height", this.LJLILLLLZI);
                    this.LJLIL.put("screen_width", this.LJLJI);
                    HashMap<String, Object> hashMap = this.LJLJL;
                    if (hashMap != null) {
                        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                            this.LJLIL.put(entry.getKey(), entry.getValue());
                        }
                    }
                    String str = this.LJLJJI;
                    String str2 = this.LJLJJL;
                    JSONObject jSONObject2 = this.LJLIL;
                    if (str != null) {
                        jSONObject2.put("cpu_soc", str);
                    }
                    if (str2 != null) {
                        jSONObject2.put("gpu_name", str2);
                    }
                }
            } catch (Throwable th) {
                C0NB.LJI("LivePlayerLog", th);
                C78579Ush.LJ(1, th);
            }
            try {
                if (!LIZ(optString)) {
                    C0K2.LIZJ(this.LJLJJLL, null, this.LJLIL);
                }
            } catch (Throwable th2) {
                if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS42S0100000_6(th2, 70));
                } else {
                    C78579Ush.LJ(2, th2);
                }
            }
        }
        return null;
    }

    public static boolean LIZ(String str) {
        int i;
        boolean booleanValue = ((Boolean) C30922CBq.LIZJ("live_setting_applog_key", Boolean.FALSE)).booleanValue();
        int intValue = ((Integer) C30922CBq.LIZJ("live_setting_enable_applog_event_key", 0)).intValue();
        if (!booleanValue) {
            return false;
        }
        if (intValue == 0) {
            return true;
        }
        Integer num = LJLJLJ.get(str);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if ((i & intValue) == 0) {
            return false;
        }
        return true;
    }

    public CallableC78572Usa(int i, int i2, String str, String str2, JSONObject jSONObject, String str3, HashMap hashMap) {
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLIL = jSONObject;
        this.LJLJJLL = str3;
        this.LJLJL = hashMap;
    }
}
