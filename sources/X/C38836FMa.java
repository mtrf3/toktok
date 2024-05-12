package X;

import Y.ARunnableS7S1100000_6;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.FMa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38836FMa {
    public static boolean LIZ;

    public static void LIZ(String str, java.util.Map<String, String> map) {
        java.util.Set<Map.Entry<String, String>> entrySet;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(null)) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("launch_from", null);
        }
        FMS fms = FMR.LIZ;
        fms.getClass();
        HashMap hashMap = new HashMap();
        if (map != null && (entrySet = map.entrySet()) != null) {
            for (Map.Entry<String, String> entry : entrySet) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        fms.LIZJ(new FMU(16, str, hashMap));
    }

    public static void LIZLLL(String str, java.util.Map<String, String> map) {
        ARunnableS7S1100000_6 aRunnableS7S1100000_6 = new ARunnableS7S1100000_6(map, str, 11);
        if (LIZ && Looper.myLooper() == C16880lQ.LLJJJJ()) {
            FMX.LIZIZ().execute(aRunnableS7S1100000_6);
        } else {
            aRunnableS7S1100000_6.run();
        }
    }

    public static void LIZIZ(Context context, String str, String str2, long j, long j2, JSONObject jSONObject) {
        LIZJ(context, "event_v1", str, str2, j, j2, jSONObject);
    }

    public static void LIZJ(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        RunnableC38837FMb runnableC38837FMb = new RunnableC38837FMb(context, str, str2, str3, j, j2, jSONObject);
        if (LIZ && Looper.myLooper() == C16880lQ.LLJJJJ()) {
            FMX.LIZIZ().execute(runnableC38837FMb);
        } else {
            runnableC38837FMb.run();
        }
    }
}
