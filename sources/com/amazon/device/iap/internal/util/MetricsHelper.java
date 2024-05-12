package com.amazon.device.iap.internal.util;

import X.C16880lQ;
import X.X1D;
import com.amazon.device.iap.model.RequestId;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MetricsHelper {
    public static final String TAG = C16880lQ.LJLLJ(MetricsHelper.class);

    public static void submitExceptionMetrics(String str, String str2, Exception exc) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exceptionMessage", exc.getMessage());
            jSONObject.put("description", str2);
            submitMetric(str, "GenericException", jSONObject);
        } catch (Exception e) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error calling submitMetric: ");
            LIZ.append(e);
            e.b(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void submitJsonParsingExceptionMetrics(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("jsonString", str2);
            jSONObject.put("description", str3);
            submitMetric(str, "JsonParsingFailed", jSONObject);
        } catch (Exception e) {
            String str4 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error calling submitMetric: ");
            LIZ.append(e);
            e.b(str4, X1D.LIZIZ(LIZ));
        }
    }

    public static void submitMetric(String str, String str2, JSONObject jSONObject) {
        new com.amazon.device.iap.internal.b.h.a(new com.amazon.device.iap.internal.b.e(RequestId.fromString(str)), str2, jSONObject.toString()).a_();
    }

    public static void submitReceiptVerificationFailureMetrics(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stringToSign", str2);
            jSONObject.put("signature", str3);
            submitMetric(str, "IapReceiptVerificationFailed", jSONObject);
        } catch (Exception e) {
            String str4 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error calling submitMetric: ");
            LIZ.append(e);
            e.b(str4, X1D.LIZIZ(LIZ));
        }
    }
}
