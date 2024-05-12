package com.bytedance.apm.agent.monitor;

import X.C16880lQ;
import X.C64062PCg;
import X.C64089PDh;
import X.C64094PDm;
import X.F9U;
import X.PEC;
import X.PEF;
import X.WM7;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MonitorTool {
    public static void monitorStart(String str, long j, long j2) {
        if (j2 > j) {
            try {
                final JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, j2 - j);
                final JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("begin_time", j);
                jSONObject2.put("end_time", j2);
                F9U.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.monitor.MonitorTool.4
                    @Override // java.lang.Runnable
                    public void run() {
                        com_bytedance_apm_agent_monitor_MonitorTool$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_bytedance_apm_agent_monitor_MonitorTool$4__run$___twin___() {
                        C64089PDh.LJIIJ().LIZLLL(new PEF("start", "", jSONObject, null, jSONObject2));
                    }

                    public static void com_bytedance_apm_agent_monitor_MonitorTool$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                        boolean LIZ;
                        try {
                            anonymousClass4.com_bytedance_apm_agent_monitor_MonitorTool$4__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static void monitorUIAction(final String str, final String str2, final JSONObject jSONObject) {
        F9U.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.monitor.MonitorTool.1
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_apm_agent_monitor_MonitorTool$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_apm_agent_monitor_MonitorTool$1__run$___twin___() {
                C64089PDh.LJIIJ().LIZLLL(new PEC(str, str2, jSONObject));
            }

            public static void com_bytedance_apm_agent_monitor_MonitorTool$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_bytedance_apm_agent_monitor_MonitorTool$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static void reportTraceTime(final String str, final String str2, final long j) {
        F9U.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.monitor.MonitorTool.5
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_apm_agent_monitor_MonitorTool$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_apm_agent_monitor_MonitorTool$5__run$___twin___() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str2, j);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(WM7.SCENE_SERVICE, str);
                    C64089PDh.LJIIJ().LIZLLL(new PEF("page_load", "page_load", jSONObject, jSONObject2, null));
                } catch (Exception unused) {
                }
            }

            public static void com_bytedance_apm_agent_monitor_MonitorTool$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_bytedance_apm_agent_monitor_MonitorTool$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static void monitorStart(final JSONObject jSONObject, long j, long j2) {
        try {
            final JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("begin_time", j);
            jSONObject2.put("end_time", j2);
            jSONObject2.put("from", "monitor-plugin");
            F9U.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.monitor.MonitorTool.3
                @Override // java.lang.Runnable
                public void run() {
                    com_bytedance_apm_agent_monitor_MonitorTool$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_bytedance_apm_agent_monitor_MonitorTool$3__run$___twin___() {
                    C64089PDh.LJIIJ().LIZLLL(new PEF("start", "", jSONObject, null, jSONObject2));
                }

                public static void com_bytedance_apm_agent_monitor_MonitorTool$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_bytedance_apm_agent_monitor_MonitorTool$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void monitorPerformance(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3) {
        F9U.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.monitor.MonitorTool.2
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_apm_agent_monitor_MonitorTool$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_apm_agent_monitor_MonitorTool$2__run$___twin___() {
                C64089PDh.LJIIJ().LIZLLL(new PEF(str, "", jSONObject, jSONObject2, jSONObject3));
            }

            public static void com_bytedance_apm_agent_monitor_MonitorTool$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_bytedance_apm_agent_monitor_MonitorTool$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static void monitorSLA(final long j, final long j2, final String str, final String str2, final String str3, final int i, final JSONObject jSONObject) {
        F9U.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.monitor.MonitorTool.6
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_apm_agent_monitor_MonitorTool$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_apm_agent_monitor_MonitorTool$6__run$___twin___() {
                C64094PDm.LIZ.LIZLLL(new C64062PCg("api_all", j, j2, str, str2, str3, i, jSONObject));
            }

            public static void com_bytedance_apm_agent_monitor_MonitorTool$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                boolean LIZ;
                try {
                    anonymousClass6.com_bytedance_apm_agent_monitor_MonitorTool$6__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
