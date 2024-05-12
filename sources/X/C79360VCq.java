package X;

import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.ss.videoarch.strategy.NativeObject;
import org.json.JSONObject;

/* renamed from: X.VCq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79360VCq extends NativeObject {
    public static String MONITOR_QUERY_OPERATE = "Query";
    public static String MONITOR_UPDATE_OPERATE = "Update";
    public JSONObject mCategoryLog;
    public JSONObject mLogExtrLog;
    public JSONObject mMetricLog;
    public String mServiceName;

    public JSONObject createCategory() {
        return null;
    }

    public JSONObject createLogExtrLog() {
        return null;
    }

    public JSONObject createMetric() {
        return null;
    }

    public void uploadMonitorLog() {
        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableUploadStrategyMonitorLog != 1) {
            return;
        }
        this.mCategoryLog = createCategory();
        JSONObject createMetric = createMetric();
        this.mMetricLog = createMetric;
        String str = this.mServiceName;
        if (str != null) {
            JSONObject jSONObject = this.mCategoryLog;
            JSONObject jSONObject2 = this.mLogExtrLog;
            if (!VDH.LIZ) {
                return;
            }
            VDC.LIZ();
            SDKMonitorUtils.LIZIZ(VDC.LIZIZ).LJIIJ(str, jSONObject, createMetric, jSONObject2);
        }
    }
}
