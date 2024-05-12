package X;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F3D implements F3B {
    @Override // X.F3B
    public final void LIZ(String str, String eventType, JSONObject data) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fileRecord, outputFile: ");
        LIZ.append(HybridMonitor.isOutputFile());
        LIZ.append(", service: ");
        LIZ.append(str);
        LIZ.append(", eventType: ");
        LIZ.append(eventType);
        C82519Wa3.LIZLLL("HybridMonitor", X1D.LIZIZ(LIZ));
        if (HybridMonitor.isOutputFile()) {
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
                    HybridMonitor hybridMonitor = HybridMonitor.getInstance();
                    o.LJFF(hybridMonitor, "HybridMonitor.getInstance()");
                    File LJIIIIZZ = V2B.LJIIIIZZ(hybridMonitor.getApplication(), "monitor_data_debug");
                    if (LJIIIIZZ != null && LJIIIIZZ.exists()) {
                        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(optString), "bytest_case_id");
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("custom_with_");
                        LIZ2.append(queryParameter);
                        String absolutePath = new File(LJIIIIZZ, X1D.LIZIZ(LIZ2)).getAbsolutePath();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("\n     ");
                        LIZ3.append(data);
                        LIZ3.append("\n     \n     ");
                        V2B.LJIL(absolutePath, C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ3)));
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
                HybridMonitor hybridMonitor2 = HybridMonitor.getInstance();
                o.LJFF(hybridMonitor2, "HybridMonitor.getInstance()");
                File LJIIIIZZ2 = V2B.LJIIIIZZ(hybridMonitor2.getApplication(), "monitor_data_debug");
                if (LJIIIIZZ2 != null && LJIIIIZZ2.exists()) {
                    String queryParameter2 = UriProtector.getQueryParameter(UriProtector.parse(optString2), "bytest_case_id");
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(string);
                    LIZ4.append("_with_");
                    LIZ4.append(queryParameter2);
                    String absolutePath2 = new File(LJIIIIZZ2, X1D.LIZIZ(LIZ4)).getAbsolutePath();
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("\n     ");
                    LIZ5.append(data);
                    LIZ5.append("\n     \n     ");
                    V2B.LJIL(absolutePath2, C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ5)));
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }
}
