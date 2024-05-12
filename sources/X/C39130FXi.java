package X;

import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FXi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39130FXi {
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public final C64009PAf LIZ;

    public final void LIZ(C39131FXj c39131FXj) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("code", c39131FXj.LIZIZ);
        jSONObject.put("app_id", c39131FXj.LIZJ);
        jSONObject.put("url", c39131FXj.LJI);
        jSONObject.put("channel", c39131FXj.LIZLLL);
        jSONObject.put("method", c39131FXj.LIZ);
        jSONObject.put("container_type", c39131FXj.LJ);
        jSONObject2.put("duration", c39131FXj.LJFF);
        jSONObject2.put("request_data_length", c39131FXj.LJII);
        jSONObject2.put("request_send_timestamp", c39131FXj.LJIIIIZZ);
        jSONObject2.put("request_receive_timestamp", c39131FXj.LJIIIZ);
        jSONObject2.put("request_decode_duration", c39131FXj.LJIIJ);
        jSONObject2.put("request_duration", c39131FXj.LJIIJJI);
        jSONObject2.put("response_data_length", c39131FXj.LJIIL);
        jSONObject2.put("response_send_timestamp", c39131FXj.LJIILJJIL);
        jSONObject2.put("response_receive_timestamp", c39131FXj.LJIILL);
        jSONObject2.put("response_encode_duration", c39131FXj.LJIILIIL);
        jSONObject2.put("response_duration", c39131FXj.LJIILLIIL);
        this.LIZ.LJIIJ("bdxbridge_performance", jSONObject, jSONObject2, null);
    }

    public C39130FXi(Context context, C39132FXk c39132FXk, List<String> list, List<String> list2) {
        String str;
        String str2 = c39132FXk.LIZ;
        String str3 = c39132FXk.LIZJ;
        String str4 = c39132FXk.LIZIZ;
        String str5 = c39132FXk.LIZLLL;
        String str6 = c39132FXk.LJ;
        String str7 = c39132FXk.LJFF;
        if (str4 == null) {
            str = "";
        } else {
            str = str4;
        }
        LIZIZ = str;
        LIZJ = str6 != null ? str6 : "";
        JSONObject LIZJ2 = C65232Piu.LIZJ("device_id", str2);
        if (str2 == null || str2.length() == 0) {
            C37887Etv.LIZIZ("BDXBridgeSDKMonitor", "did is empty! check it!");
        }
        LIZJ2.put("host_aid", str4);
        LIZJ2.put("app_version", str3);
        LIZJ2.put("update_version_code", str5);
        LIZJ2.put("channel", str6);
        LIZJ2.put("sdk_version", str7);
        SDKMonitorUtils.LJ("292472", list);
        SDKMonitorUtils.LIZLLL("292472", list2);
        SDKMonitorUtils.LIZJ(C16880lQ.LLLLL(context), "292472", LIZJ2, new C39129FXh(str4));
        C64009PAf LIZIZ2 = SDKMonitorUtils.LIZIZ("292472");
        o.LJFF(LIZIZ2, "SDKMonitorUtils.getInstance(BDXBridge_SDK_AID)");
        this.LIZ = LIZIZ2;
    }
}
