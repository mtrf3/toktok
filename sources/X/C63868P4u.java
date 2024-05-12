package X;

import Y.ARunnableS1S3100000_11;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ttve.monitor.IMonitor;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.P4u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63868P4u {
    public static WeakReference<IMonitor> LIZ = null;
    public static String LIZIZ = "";

    public static void LIZIZ(int i) {
        if (i == 0) {
            LJ(0, 0L, "te_record_err_code");
        } else {
            if (i != 1) {
                return;
            }
            LJ(1, 0L, "te_edit_err_code");
            LJ(1, 0L, "te_composition_err_code");
        }
    }

    public static void LIZ(Context context, String str) {
        TEMonitorInvoker.nativeInit();
        Context LLLLL = C16880lQ.LLLLL(context);
        SDKMonitorUtils.LIZLLL("1357", new ArrayList(Arrays.asList("https://mon-sg.tiktokv.com/monitor/appmonitor/v2/settings", "https://mon.tiktokv.com/monitor/appmonitor/v2/settings", "https://mon.tiktokv.com/monitor/appmonitor/v2/settings")));
        SDKMonitorUtils.LJ("1357", new ArrayList(Arrays.asList("https://mon-sg.tiktokv.com/monitor/collect/", "https://mon-sg.tiktokv.com/monitor/collect/", "https://mon-sg.tiktokv.com/monitor/collect/", "https://mon-sg.tiktokv.com/monitor/collect/")));
        if (C63867P4t.LIZLLL) {
            if (!C63867P4t.LIZIZ && C63867P4t.LIZ == null) {
                Thread thread = new Thread(new ARunnableS1S3100000_11(LLLLL, str, 1));
                C63867P4t.LIZ = thread;
                thread.start();
                return;
            }
            return;
        }
        C64017PAn.LIZIZ(LLLLL, str, null, null);
        C63867P4t.LIZIZ = true;
    }

    public static void LIZLLL(String str, double d) {
        if (TextUtils.isEmpty(str)) {
            P4Q.LJII("TEMonitor", "perfDouble: key is null");
        } else {
            TEMonitorInvoker.nativePerfDouble(0, str, d);
        }
    }

    public static boolean LIZJ(String str, String str2, java.util.Map map) {
        int LIZ2;
        WeakReference<IMonitor> weakReference = LIZ;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException unused) {
            P4Q.LIZ("TEMonitor", "No monitor callback, skip");
            return false;
        }
        if (str2.equals("iesve_veeditor_record_finish") || str2.equals("iesve_veeditor_composition_finish") || str2.equals("iesve_veeditor_edit") || str2.equals("iesve_veeditor_cut") || str2.equals("iesve_veeditor_frame_report")) {
            LJI(jSONObject, str2, map);
        } else {
            for (String str3 : map.keySet()) {
                if (str3.startsWith("iesve_")) {
                    LIZ2 = C63866P4s.LIZ(str3);
                } else {
                    LIZ2 = C63866P4s.LIZ(str3);
                }
                if (LIZ2 == 1) {
                    try {
                        jSONObject.put(str3, CastIntegerProtector.parseInt(String.valueOf(map.get(str3))));
                    } catch (Exception unused2) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("Parse int error:");
                        LIZ3.append(map.get(str3));
                        P4Q.LIZJ("TEMonitor", X1D.LIZIZ(LIZ3));
                    }
                } else if (LIZ2 == 2) {
                    try {
                        jSONObject.put(str3, CastFloatProtector.parseFloat(String.valueOf(map.get(str3))));
                    } catch (Exception unused3) {
                        P4Q.LIZJ("TEMonitor", "Parse float error");
                    }
                } else {
                    jSONObject.put(str3, map.get(str3));
                }
                P4Q.LIZ("TEMonitor", "No monitor callback, skip");
                return false;
            }
        }
        LJII(weakReference, str, jSONObject);
        return true;
    }

    public static void LJ(int i, long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TEMonitorInvoker.nativePerfLong(i, str, j);
    }

    public static void LJFF(int i, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            P4Q.LJII("TEMonitor", "perfString: key is null");
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        TEMonitorInvoker.nativePerfString(i, str, str2);
    }

    public static void LJI(JSONObject jSONObject, String str, java.util.Map map) {
        int LIZ2;
        for (String str2 : map.keySet()) {
            if (str.equals("iesve_veeditor_record_finish") || str.equals("iesve_veeditor_composition_finish") || str.equals("iesve_veeditor_edit") || str.equals("iesve_veeditor_cut")) {
                LIZ2 = C63866P4s.LIZ(str2);
            } else {
                LIZ2 = C63866P4s.LIZ(str2);
            }
            if (LIZ2 == 1) {
                try {
                    jSONObject.put(str2, CastIntegerProtector.parseInt(String.valueOf(map.get(str2))));
                } catch (Exception unused) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Parse int error:");
                    LIZ3.append(map.get(str2));
                    P4Q.LIZJ("TEMonitor", X1D.LIZIZ(LIZ3));
                }
            } else if (LIZ2 == 2) {
                try {
                    jSONObject.put(str2, CastFloatProtector.parseFloat(String.valueOf(map.get(str2))));
                } catch (Exception unused2) {
                    P4Q.LIZJ("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject.put(str2, map.get(str2));
            }
        }
    }

    public static void LJII(WeakReference<IMonitor> weakReference, String str, JSONObject jSONObject) {
        int i = 0;
        String str2 = "sdk_video_edit_compose";
        if (jSONObject != null) {
            try {
                if (jSONObject.has("completed")) {
                    i = JSONObjectProtectorUtils.getInt(jSONObject, "completed");
                }
            } catch (JSONException e) {
                P4Q.LIZJ("TEMonitor", "get complete filed error!");
                C16880lQ.LLLLIIL(e);
            }
            try {
                if (jSONObject.has("service")) {
                    str2 = JSONObjectProtectorUtils.getString(jSONObject, "service");
                }
                if (str2.equals("iesve_veeditor_record_finish") || str2.equals("iesve_veeditor_composition_finish")) {
                    if ("".equals(LIZIZ)) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(C63867P4t.LIZJ("device_id"));
                        LIZ2.append("_");
                        LIZ2.append(System.currentTimeMillis());
                        LIZIZ = X1D.LIZIZ(LIZ2);
                    }
                    jSONObject.put("te_record_compose_vid", LIZIZ);
                }
                if (str2.equals("iesve_veeditor_composition_finish")) {
                    LIZIZ = "";
                }
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            C63867P4t.LIZ();
            if (TextUtils.isEmpty(C63867P4t.LIZJ("device_id"))) {
                C63867P4t.LJFF("device_id", "Unknown");
            }
            if (TextUtils.isEmpty(C63867P4t.LIZJ("user_id"))) {
                C63867P4t.LJFF("user_id", "Unknown");
            }
            if (TextUtils.isEmpty(C63867P4t.LIZJ("app_version"))) {
                C63867P4t.LJFF("app_version", "Unknown");
            }
            try {
                for (Map.Entry entry : ((HashMap) C39700Fi4.LIZIZ()).entrySet()) {
                    String str3 = (String) entry.getValue();
                    if (C39700Fi4.LIZJ.contains(entry.getKey())) {
                        if (!TextUtils.isEmpty(str3)) {
                            try {
                                float parseFloat = CastFloatProtector.parseFloat(str3);
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("te_device_info_");
                                LIZ3.append((String) entry.getKey());
                                jSONObject.put(X1D.LIZIZ(LIZ3), parseFloat);
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("te_device_info_");
                        LIZ4.append((String) entry.getKey());
                        jSONObject.put(X1D.LIZIZ(LIZ4), str3);
                    }
                }
            } catch (JSONException unused2) {
            }
            if (C64017PAn.LIZ() != null) {
                C64017PAn.LIZ().LJIILIIL(str2, i, jSONObject, null);
            }
        }
        if (weakReference != null && weakReference.get() != null) {
            try {
                weakReference.get().monitorLog(str, jSONObject);
            } catch (Exception unused3) {
            }
        }
    }
}
