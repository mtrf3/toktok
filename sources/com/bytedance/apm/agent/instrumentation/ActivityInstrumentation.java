package com.bytedance.apm.agent.instrumentation;

import X.WM7;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.apm.agent.helper.PageShowHelper;
import com.bytedance.apm.agent.monitor.MonitorTool;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ActivityInstrumentation {
    public static boolean isFirstWindowFocusChanged;
    public static String sActivityName;
    public static HashSet<String> sMethodSet = new HashSet<>(32);
    public static long sOnCreateEnd;
    public static long sOnCreateStart;
    public static long sOnResumeEnd;
    public static long sOnResumeStart;
    public static long sOnWindowFocusedChangeStart;

    public static boolean isValid(String str) {
        if (!TextUtils.isEmpty(sActivityName) && TextUtils.equals(str, sActivityName)) {
            return true;
        }
        return false;
    }

    public static void onTrace(String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                sActivityName = str;
                sOnCreateStart = System.currentTimeMillis();
                if (!isFirstWindowFocusChanged) {
                    AppInstrumentation.launcherActivityOnCreateStart(sActivityName);
                    return;
                }
                return;
            }
            if (!isValid(str)) {
                return;
            }
            sOnCreateEnd = System.currentTimeMillis();
            if (isFirstWindowFocusChanged) {
                return;
            }
            AppInstrumentation.launcherActivityOnCreateEnd();
            return;
        }
        boolean z2 = true;
        if (TextUtils.equals("onResume", str2) && isValid(str)) {
            if (z) {
                if (sOnCreateStart <= 0) {
                    return;
                }
                sOnResumeStart = System.currentTimeMillis();
                if (!isFirstWindowFocusChanged) {
                    AppInstrumentation.launcherActivityOnResumeStart(sActivityName);
                }
                PageShowHelper.onPageShowHideAction(sActivityName, true);
                return;
            }
            if (sOnCreateStart <= 0) {
                return;
            }
            sOnResumeEnd = System.currentTimeMillis();
            if (isFirstWindowFocusChanged) {
                return;
            }
            AppInstrumentation.launcherActivityOnResumeEnd();
            return;
        }
        if (!TextUtils.equals("onWindowFocusChanged", str2) || !isValid(str) || sOnCreateStart <= 0) {
            return;
        }
        if (!isFirstWindowFocusChanged) {
            AppInstrumentation.launcherActivityOnWindowFocusChangedStart(sActivityName);
            isFirstWindowFocusChanged = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        sOnWindowFocusedChangeStart = currentTimeMillis;
        if (currentTimeMillis - sOnCreateStart < 5000) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("begin_time", sOnCreateStart);
                jSONObject.put("end_time", sOnWindowFocusedChangeStart);
                jSONObject.put("page_type", "activity");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("onCreate", sOnCreateEnd - sOnCreateStart);
                jSONObject2.put("onResume", sOnResumeEnd - sOnResumeStart);
                jSONObject2.put("activityOnCreateToWindowFocusChanged", sOnWindowFocusedChangeStart - sOnCreateStart);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(WM7.SCENE_SERVICE, sActivityName);
                HashSet<String> hashSet = sMethodSet;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(sActivityName);
                LIZ.append(str2);
                if (hashSet.contains(X1D.LIZIZ(LIZ))) {
                    z2 = false;
                }
                jSONObject3.put("is_first", z2);
                HashSet<String> hashSet2 = sMethodSet;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(sActivityName);
                LIZ2.append(str2);
                hashSet2.add(X1D.LIZIZ(LIZ2));
                MonitorTool.monitorPerformance("page_load", jSONObject2, jSONObject3, jSONObject);
            } catch (Exception unused) {
            }
        }
        sOnCreateStart = 0L;
        sActivityName = null;
    }
}
