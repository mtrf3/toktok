package X;

import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QT7 extends QT8<C64009PAf> {
    public final C64009PAf LIZ() {
        String str;
        JSONObject jSONObject = new JSONObject();
        C78258UnW c78258UnW = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ;
        QT2 qt2 = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZIZ;
        try {
            jSONObject.put("device_id", c78258UnW.LJIIIZ);
            jSONObject.put("host_aid", qt2.LIZ);
            jSONObject.put("sdk_version", "1.0");
            jSONObject.put("channel", qt2.LIZLLL);
            jSONObject.put("app_version", qt2.LIZIZ);
            jSONObject.put("update_version_code", qt2.LIZJ);
        } catch (Throwable unused) {
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(c78258UnW.LIZJ)) {
            str = "https://mon.isnssdk.com/monitor";
        } else {
            str = c78258UnW.LIZJ;
        }
        sb.append(str);
        sb.append("/monitor/appmonitor/v2/settings");
        SDKMonitorUtils.LIZLLL("4108", Collections.singletonList(sb.toString()));
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://mon.isnssdk.com/monitor/collect/");
        arrayList.add("https://i.isnssdk.com/monitor/collect/");
        SDKMonitorUtils.LJ("4108", arrayList);
        SDKMonitorUtils.LIZJ(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ, "4108", jSONObject, new QT3(qt2));
        return SDKMonitorUtils.LIZIZ("4108");
    }
}
