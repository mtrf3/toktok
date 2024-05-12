package X;

import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R28 implements InterfaceC79328VBk {
    @Override // X.InterfaceC79328VBk
    public final <T> T LIZ(String str, T defaultValue) {
        o.LJIIIZ(defaultValue, "defaultValue");
        if (str != null) {
            int i = 0;
            String str2 = null;
            switch (str.hashCode()) {
                case -1874128162:
                    if (str.equals("SCREEN_RESOLTION")) {
                        C0NB.LJ("LiveStrategyManager", "fsllog get SCREEN_RESOLTION");
                        JSONObject jSONObject = new JSONObject();
                        try {
                            C1XD LJ = C15390j1.LJ(GlobalContext.getApplicationContext());
                            jSONObject.put("width", LJ.LJLILLLLZI);
                            jSONObject.put("height", LJ.LJLJI);
                            jSONObject.put("dpi", LJ.LJLIL);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("fsllog deviceInfo: ");
                            LIZ.append(jSONObject);
                            C0NB.LJ("DeviceInfoParams", X1D.LIZIZ(LIZ));
                        } catch (Exception e) {
                            C0NB.LJI("DeviceInfoParams", e);
                        }
                        String jSONObject2 = jSONObject.toString();
                        if (jSONObject2 != null) {
                            str2 = jSONObject2;
                        }
                        if (str2 == null) {
                            return defaultValue;
                        }
                        return (T) str2;
                    }
                    break;
                case -1586779251:
                    if (str.equals("USER-LandScapeSwitch")) {
                        try {
                            if (((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Yy() != 1) {
                                i = 1;
                            }
                            try {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("USER-LandScapeSwitch value:");
                                LIZ2.append(i);
                                C0NB.LJIIIZ("LiveStrategyManager", X1D.LIZIZ(LIZ2));
                                return (T) Integer.valueOf(i);
                            } catch (Exception e2) {
                                e = e2;
                                C0NB.LJII(e);
                                return (T) Integer.valueOf(i);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = -1;
                        }
                    }
                    break;
                case -1176416901:
                    if (str.equals("live_stream_strategy_sr_kernal_bin_path")) {
                        String LIZ3 = C31880CfE.LIZ();
                        if (LIZ3 != null) {
                            str2 = LIZ3;
                        }
                        if (str2 == null) {
                            return defaultValue;
                        }
                        return (T) str2;
                    }
                    break;
                case 22974109:
                    if (str.equals("USER-HumanActivityRecognition")) {
                        try {
                            int k30 = ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).k30();
                            if (k30 >= 0) {
                                i = k30;
                            }
                            return (T) Integer.valueOf(i);
                        } catch (Exception e4) {
                            C0NB.LJII(e4);
                            return defaultValue;
                        }
                    }
                    break;
                case 190548717:
                    if (str.equals("TTNet_NQE_INFO")) {
                        String jSONObject3 = C65197PiL.LIZ().toString();
                        if (jSONObject3 != null) {
                            str2 = jSONObject3;
                        }
                        if (str2 == null) {
                            return defaultValue;
                        }
                        return (T) str2;
                    }
                    break;
                case 1858994758:
                    if (str.equals("DEVICE_PERFORMANCE_INFO")) {
                        JSONObject jSONObject4 = new JSONObject();
                        try {
                            jSONObject4 = B4U.LIZ().LJIILL();
                        } catch (Exception e5) {
                            C0NB.LJI("LivePerformanceInfoParams", e5);
                        }
                        String jSONObject5 = jSONObject4.toString();
                        if (jSONObject5 != null) {
                            str2 = jSONObject5;
                        }
                        if (str2 == null) {
                            return defaultValue;
                        }
                        return (T) str2;
                    }
                    break;
            }
        }
        T t = (T) C30922CBq.LIZJ(str, defaultValue);
        o.LJIIIIZZ(t, "getValue(key, defaultValue)");
        return t;
    }
}
