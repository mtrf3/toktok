package com.ss.android.ttve.monitor;

import X.C16880lQ;
import X.C63868P4u;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class TEMonitorInvoker {
    public static native Map<String, String> nativeGetMap();

    public static native Map<String, String> nativeGetMapByType(int i);

    public static native void nativeInit();

    public static native void nativeMonitorPerf(int i);

    public static native void nativeMonitorPerfWithType(int i);

    public static native void nativePerfDouble(int i, String str, double d);

    public static native void nativePerfDouble(String str, double d);

    public static native void nativePerfLong(int i, String str, long j);

    public static native void nativePerfLong(String str, long j);

    public static native void nativePerfRational(String str, float f, float f2);

    public static native void nativePerfString(int i, String str, String str2);

    public static native void nativePerfString(String str, String str2);

    public static native void nativeReset();

    public static native void nativeReset(int i);

    static {
        TENativeLibsLoader.loadBase();
    }

    public static void onNativeCallback_onMonitorLogFloat(String str, String str2, float f) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Float.valueOf(f));
        C63868P4u.LIZJ(str, str2, hashMap);
    }

    public static void onNativeCallback_onMonitorLogInt(String str, String str2, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Long.valueOf(j));
        C63868P4u.LIZJ(str, str2, hashMap);
    }

    public static void onNativeCallback_onMonitorLogJson(String str, String str2, String str3) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str3);
        } catch (JSONException e) {
            e = e;
            jSONObject = null;
        }
        try {
            jSONObject.put("service", str2);
        } catch (JSONException e2) {
            e = e2;
            C16880lQ.LLLLIIL(e);
            C63868P4u.LJII(C63868P4u.LIZ, str, jSONObject);
        }
        C63868P4u.LJII(C63868P4u.LIZ, str, jSONObject);
    }

    public static void onNativeCallback_onMonitorLogMap(String str, String str2, HashMap hashMap) {
        C63868P4u.LIZJ(str, str2, hashMap);
    }
}
