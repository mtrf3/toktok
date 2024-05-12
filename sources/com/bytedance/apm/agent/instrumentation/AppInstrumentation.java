package com.bytedance.apm.agent.instrumentation;

import X.X1D;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.apm.agent.monitor.MonitorTool;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppInstrumentation {
    public static long attachBaseContextEndTime;
    public static long attachBaseContextStartTime;
    public static long constructorEndTime;
    public static long constructorStartTime;
    public static boolean isValid;
    public static long launcherActivityCreateEndTime;
    public static long launcherActivityCreateStartTime;
    public static String launcherActivityName;
    public static long launcherActivityOnWindowFocusChangedTime;
    public static long launcherActivityResumeEndTime;
    public static long launcherActivityResumeStartTime;
    public static long onCreateEndTime;
    public static long onCreateStartTime;

    public static void launcherActivityOnWindowFocusChangedEnd() {
    }

    public static void attachBaseContextEnd() {
        if (attachBaseContextEndTime == 0) {
            attachBaseContextEndTime = System.currentTimeMillis();
        }
    }

    public static void attachBaseContextStart() {
        if (attachBaseContextStartTime == 0) {
            attachBaseContextStartTime = System.currentTimeMillis();
        }
    }

    public static void initEnd() {
        if (constructorEndTime == 0) {
            constructorEndTime = System.currentTimeMillis();
        }
    }

    public static void initStart() {
        if (constructorStartTime == 0) {
            constructorStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnCreateEnd() {
        if (launcherActivityCreateEndTime == 0 && isValid) {
            launcherActivityCreateEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnResumeEnd() {
        if (launcherActivityResumeEndTime == 0 && isValid) {
            launcherActivityResumeEndTime = System.currentTimeMillis();
        }
    }

    public static void onCreateEnd() {
        if (onCreateEndTime == 0) {
            onCreateEndTime = System.currentTimeMillis();
        }
    }

    public static void onCreateStart() {
        if (onCreateStartTime == 0) {
            onCreateStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnCreateStart(String str) {
        if (launcherActivityCreateStartTime == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            launcherActivityCreateStartTime = currentTimeMillis;
            if (currentTimeMillis - onCreateEndTime < 800) {
                isValid = true;
                launcherActivityName = str;
            }
        }
    }

    public static void launcherActivityOnResumeStart(String str) {
        if (launcherActivityResumeStartTime == 0 && isValid) {
            launcherActivityResumeStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnWindowFocusChangedStart(String str) {
        if (launcherActivityOnWindowFocusChangedTime == 0 && onCreateStartTime > 0 && isValid) {
            long currentTimeMillis = System.currentTimeMillis();
            launcherActivityOnWindowFocusChangedTime = currentTimeMillis;
            long j = currentTimeMillis - constructorStartTime;
            if (j > 0 && j < LivePlayEnforceIntervalSetting.DEFAULT) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("application_constructor", constructorEndTime - constructorStartTime);
                    jSONObject.put("application_attachBaseContext", attachBaseContextEndTime - attachBaseContextStartTime);
                    jSONObject.put("application_onCreate", onCreateEndTime - onCreateStartTime);
                    jSONObject.put("launcher_activity_onCreate", launcherActivityCreateEndTime - launcherActivityCreateStartTime);
                    jSONObject.put("launcher_activity_onResume", launcherActivityResumeEndTime - launcherActivityResumeStartTime);
                    jSONObject.put("app_to_first_activity_windowfocus", j);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("app_to_first_activity_windowfocus#");
                    LIZ.append(launcherActivityName);
                    jSONObject.put(X1D.LIZIZ(LIZ), j);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("launcher_activity_onCreate#");
                    LIZ2.append(launcherActivityName);
                    jSONObject.put(X1D.LIZIZ(LIZ2), launcherActivityCreateEndTime - launcherActivityCreateStartTime);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("launcher_activity_onResume#");
                    LIZ3.append(launcherActivityName);
                    jSONObject.put(X1D.LIZIZ(LIZ3), launcherActivityResumeEndTime - launcherActivityResumeStartTime);
                    MonitorTool.monitorStart(jSONObject, constructorStartTime, launcherActivityResumeEndTime);
                } catch (Exception unused) {
                }
                onCreateStartTime = 0L;
                isValid = false;
            }
        }
    }
}
