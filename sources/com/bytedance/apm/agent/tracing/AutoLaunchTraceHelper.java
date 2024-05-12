package com.bytedance.apm.agent.tracing;

import X.C09970aH;
import X.C25620zW;
import X.C47135Ieh;
import X.C64089PDh;
import X.F9U;
import X.PEF;
import X.X1D;
import defpackage.b1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AutoLaunchTraceHelper {
    public static long sAttachBaseContextEndTime = 0;
    public static long sAttachBaseContextStartTime = 0;
    public static long sConstructorEndTime = 0;
    public static long sConstructorStartTime = 0;
    public static boolean sIsValid = false;
    public static long sLauncherActivityCreateEndTime = 0;
    public static long sLauncherActivityCreateStartTime = 0;
    public static String sLauncherActivityName = null;
    public static long sLauncherActivityOnWindowFocusChangedTime = 0;
    public static long sLauncherActivityResumeEndTime = 0;
    public static long sLauncherActivityResumeStartTime = 0;
    public static long sLauncherActivityStartEndTime = 0;
    public static long sLauncherActivityStartStartTime = 0;
    public static long sMaxValidTimeMs = 15000;
    public static long sOnCreateEndTime;
    public static long sOnCreateStartTime;

    public static JSONArray assemblySpan() {
        JSONArray jSONArray = new JSONArray();
        JSONObject LJ = C47135Ieh.LJ("module_name", "base", "span_name", "app_constructor");
        LJ.put("start", sConstructorStartTime);
        LJ.put("end", sConstructorEndTime);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module_name", "base");
        jSONObject.put("span_name", "app_attachBaseContext");
        jSONObject.put("start", sAttachBaseContextStartTime);
        jSONObject.put("end", sAttachBaseContextEndTime);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("module_name", "base");
        jSONObject2.put("span_name", "app_onCreate");
        jSONObject2.put("start", sOnCreateStartTime);
        jSONObject2.put("end", sOnCreateEndTime);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("module_name", "base");
        jSONObject3.put("span_name", "activity_onCreate");
        jSONObject3.put("start", sLauncherActivityCreateStartTime);
        jSONObject3.put("end", sLauncherActivityCreateEndTime);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("module_name", "base");
        jSONObject4.put("span_name", "activity_onResume");
        jSONObject4.put("start", sLauncherActivityResumeStartTime);
        jSONObject4.put("end", sLauncherActivityResumeEndTime);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("module_name", "base");
        jSONObject5.put("span_name", "activity_onStart");
        jSONObject5.put("start", sLauncherActivityStartStartTime);
        jSONObject5.put("end", sLauncherActivityStartEndTime);
        if (sLauncherActivityOnWindowFocusChangedTime > 0) {
            JSONObject LJ2 = C47135Ieh.LJ("module_name", "base", "span_name", "activity_onWindowFocusChanged");
            LJ2.put("start", sLauncherActivityOnWindowFocusChangedTime);
            jSONArray.put(LJ2);
        }
        jSONArray.put(LJ);
        jSONArray.put(jSONObject);
        jSONArray.put(jSONObject2);
        jSONArray.put(jSONObject3);
        jSONArray.put(jSONObject4);
        jSONArray.put(jSONObject5);
        return jSONArray;
    }

    public static void reportStats() {
        try {
            if (C09970aH.LJIIJ == -1) {
                return;
            }
            long j = sLauncherActivityOnWindowFocusChangedTime - sConstructorStartTime;
            if (j > 0 && j <= sMaxValidTimeMs) {
                JSONArray assemblySpan = assemblySpan();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", "launch_stats");
                jSONObject.put("start", sConstructorStartTime);
                jSONObject.put("end", sLauncherActivityOnWindowFocusChangedTime);
                jSONObject.put("spans", assemblySpan);
                jSONObject.put("collect_from", 1);
                jSONObject.put("page_name", sLauncherActivityName);
                jSONObject.put("launch_mode", C09970aH.LJIIJ);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("trace", jSONObject);
                if (C09970aH.LJII()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("auto span: ");
                    LIZ.append(jSONObject);
                    X1D.LIZIZ(LIZ);
                }
                C64089PDh.LJIIJ().LIZLLL(new PEF("start_trace", "", null, null, jSONObject2));
            }
        } catch (JSONException unused) {
        }
    }

    public static void launcherActivityOnCreateEnd() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreateEnd ");
        LIZ.append(sLauncherActivityCreateStartTime);
        LIZ.append(" ");
        LIZ.append(sLauncherActivityCreateEndTime);
        X1D.LIZIZ(LIZ);
        if (sLauncherActivityCreateEndTime == 0 && sIsValid) {
            sLauncherActivityCreateEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnResumeEnd() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResumeEnd ");
        LIZ.append(sLauncherActivityResumeStartTime);
        LIZ.append(" ");
        LIZ.append(sLauncherActivityResumeEndTime);
        X1D.LIZIZ(LIZ);
        if (sLauncherActivityResumeEndTime == 0 && sIsValid) {
            sLauncherActivityResumeEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnCreateStart(String str) {
        boolean z;
        StringBuilder LIZJ = b1.LIZJ(str, " onCreateStart ");
        LIZJ.append(sLauncherActivityCreateStartTime);
        LIZJ.append(" ");
        boolean z2 = false;
        if (sLauncherActivityCreateStartTime - sOnCreateEndTime < 800) {
            z = true;
        } else {
            z = false;
        }
        LIZJ.append(z);
        X1D.LIZIZ(LIZJ);
        if (sLauncherActivityCreateStartTime == 0) {
            sLauncherActivityCreateStartTime = System.currentTimeMillis();
            StringBuilder LIZJ2 = b1.LIZJ(str, " onCreateStart ");
            LIZJ2.append(sLauncherActivityCreateStartTime);
            LIZJ2.append("  ");
            LIZJ2.append(sOnCreateEndTime);
            LIZJ2.append(" ");
            if (sLauncherActivityCreateStartTime - sOnCreateEndTime < 800) {
                z2 = true;
            }
            LIZJ2.append(z2);
            X1D.LIZIZ(LIZJ2);
            if (sLauncherActivityCreateStartTime - sOnCreateEndTime < 800) {
                sIsValid = true;
                sLauncherActivityName = str;
            }
        }
    }

    public static void launcherActivityOnResumeStart(String str) {
        StringBuilder LIZJ = b1.LIZJ(str, " onResume ");
        LIZJ.append(sLauncherActivityResumeStartTime);
        X1D.LIZIZ(LIZJ);
        if (sLauncherActivityResumeStartTime == 0 && sIsValid) {
            sLauncherActivityResumeStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnStartEnd(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStartEnd ");
        LIZ.append(sLauncherActivityStartStartTime);
        LIZ.append(" ");
        LIZ.append(sLauncherActivityStartEndTime);
        X1D.LIZIZ(LIZ);
        if (sLauncherActivityStartEndTime == 0 && sIsValid) {
            sLauncherActivityStartEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnStartStart(String str) {
        StringBuilder LIZJ = b1.LIZJ(str, " onStart ");
        LIZJ.append(sLauncherActivityStartStartTime);
        X1D.LIZIZ(LIZJ);
        if (sLauncherActivityStartStartTime == 0 && sIsValid) {
            sLauncherActivityStartStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnWindowFocusChangedStart(String str) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("OnWindowFocusChanged ", str, " ");
        LIZIZ.append(sLauncherActivityOnWindowFocusChangedTime);
        LIZIZ.append(" ");
        LIZIZ.append(sOnCreateStartTime);
        LIZIZ.append(" ");
        LIZIZ.append(sIsValid);
        X1D.LIZIZ(LIZIZ);
        if (sLauncherActivityOnWindowFocusChangedTime == 0 && sOnCreateStartTime > 0 && sIsValid) {
            sLauncherActivityOnWindowFocusChangedTime = System.currentTimeMillis();
            sLauncherActivityName = str;
            sIsValid = false;
        }
        F9U.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper.1
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_apm_agent_tracing_AutoLaunchTraceHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_apm_agent_tracing_AutoLaunchTraceHelper$1__run$___twin___() {
                AutoLaunchTraceHelper.reportStats();
            }

            public static void com_bytedance_apm_agent_tracing_AutoLaunchTraceHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_bytedance_apm_agent_tracing_AutoLaunchTraceHelper$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static void setMaxValidTimeMs(long j) {
        sMaxValidTimeMs = j;
    }

    public static void assignAppTime(long j, long j2, long j3, long j4, long j5, long j6) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assignAppTime: ");
        LIZ.append(sOnCreateEndTime);
        X1D.LIZIZ(LIZ);
        sConstructorStartTime = j;
        sConstructorEndTime = j2;
        sAttachBaseContextStartTime = j3;
        sAttachBaseContextEndTime = j4;
        sOnCreateStartTime = j5;
        sOnCreateEndTime = j6;
        if (j <= 0) {
            return;
        }
        long j7 = C09970aH.LJIILIIL;
        if (j7 != 0 && j >= j7) {
            return;
        }
        C09970aH.LJIILIIL = j;
    }
}
