package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchLayoutPreloadLogOpt;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.0rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20800rk {
    public static final ConcurrentHashSet<Integer> LIZ = new ConcurrentHashSet<>();
    public static final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LIZJ = new ConcurrentHashMap<>();

    public static void LIZJ(int i) {
        if (LiveWatchLayoutPreloadLogOpt.INSTANCE.isEnable()) {
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(i);
        LIZ2.append('_');
        LIZ2.append(C16880lQ.LLLLIIIILLL().getId());
        concurrentHashMap.put(X1D.LIZIZ(LIZ2), Long.valueOf(SystemClock.uptimeMillis()));
    }

    public static void LIZLLL(int i) {
        if (LiveWatchLayoutPreloadLogOpt.INSTANCE.isEnable()) {
            return;
        }
        LIZ.add(Integer.valueOf(i));
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(i);
        LIZ2.append('_');
        LIZ2.append(C16880lQ.LLLLIIIILLL().getId());
        concurrentHashMap.put(X1D.LIZIZ(LIZ2), Long.valueOf(SystemClock.uptimeMillis()));
    }

    public static void LIZ(Context context, int i, boolean z) {
        String str;
        Resources resources;
        if (LiveWatchLayoutPreloadLogOpt.INSTANCE.isEnable()) {
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(i);
        LIZ2.append('_');
        LIZ2.append(C16880lQ.LLLLIIIILLL().getId());
        Long remove = concurrentHashMap.remove(X1D.LIZIZ(LIZ2));
        if (remove == null) {
            remove = 0L;
        }
        long longValue = remove.longValue();
        if (!LIZ.contains(Integer.valueOf(i)) || !LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_inflate_getview_report")) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - longValue;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fromCache", C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("duration", uptimeMillis);
            if (context != null && (resources = context.getResources()) != null) {
                str = resources.getResourceEntryName(i);
            } else {
                str = null;
            }
            jSONObject2.put("layout", str);
            C0K2.LJI("ttlive_inflate_getview_report", jSONObject, jSONObject2, new JSONObject());
        } catch (Exception e) {
            C0NB.LJII(e);
        }
    }

    public static void LIZIZ(Context context, int i, boolean z) {
        String str;
        Resources resources;
        if (LiveWatchLayoutPreloadLogOpt.INSTANCE.isEnable() || !LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_inflate_preload_report", 0.001d)) {
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(i);
        LIZ2.append('_');
        LIZ2.append(C16880lQ.LLLLIIIILLL().getId());
        Long remove = concurrentHashMap.remove(X1D.LIZIZ(LIZ2));
        if (remove == null) {
            remove = 0L;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - remove.longValue();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fromX2C", C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("duration", uptimeMillis);
            if (context != null && (resources = context.getResources()) != null) {
                str = resources.getResourceEntryName(i);
            } else {
                str = null;
            }
            jSONObject2.put("layout", str);
            C0K2.LJI("ttlive_inflate_preload_report", jSONObject, jSONObject2, new JSONObject());
        } catch (Exception e) {
            C0NB.LJII(e);
        }
    }
}
