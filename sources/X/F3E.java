package X;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F3E implements F3F {
    @Override // X.F3F
    public final void LIZ(String str, String eventType, JSONObject data) {
        boolean z;
        if (HybridMultiMonitor.isOutputFile()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fileRecord, outputFile: ");
            LIZ.append(HybridMultiMonitor.isOutputFile());
            LIZ.append(", service: ");
            LIZ.append(str);
            LIZ.append(", eventType: ");
            LIZ.append(eventType);
            X1D.LIZIZ(LIZ);
            o.LJIIJ(eventType, "eventType");
            o.LJIIJ(data, "data");
            if (o.LJ("samplecustom", eventType) || o.LJ("newcustom", eventType) || o.LJ("custom", eventType)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    String optString = JSONObjectProtectorUtils.getJSONObject(data, "extra").optString("url", "");
                    HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
                    o.LJFF(hybridMultiMonitor, "HybridMultiMonitor.getInstance()");
                    File LJJII = UC0.LJJII(hybridMultiMonitor.getApplication(), "monitor_data_debug");
                    if (LJJII != null && LJJII.exists()) {
                        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(optString), "bytest_case_id");
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("custom_with_");
                        LIZ2.append(queryParameter);
                        String absolutePath = new File(LJJII, X1D.LIZIZ(LIZ2)).getAbsolutePath();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("\n     ");
                        LIZ3.append(data);
                        LIZ3.append("\n     \n     ");
                        UC0.LJJLIIIJJIZ(absolutePath, C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ3)));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
            try {
                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(data, "extra"), "nativeBase");
                String string = JSONObjectProtectorUtils.getString(jSONObject, "navigation_id");
                String optString2 = jSONObject.optString("url", "");
                HybridMultiMonitor hybridMultiMonitor2 = HybridMultiMonitor.getInstance();
                o.LJFF(hybridMultiMonitor2, "HybridMultiMonitor.getInstance()");
                File LJJII2 = UC0.LJJII(hybridMultiMonitor2.getApplication(), "monitor_data_debug");
                if (LJJII2 != null && LJJII2.exists()) {
                    String queryParameter2 = UriProtector.getQueryParameter(UriProtector.parse(optString2), "bytest_case_id");
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(string);
                    LIZ4.append("_with_");
                    LIZ4.append(queryParameter2);
                    String absolutePath2 = new File(LJJII2, X1D.LIZIZ(LIZ4)).getAbsolutePath();
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("\n     ");
                    LIZ5.append(data);
                    LIZ5.append("\n     \n     ");
                    UC0.LJJLIIIJJIZ(absolutePath2, C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ5)));
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }
}
