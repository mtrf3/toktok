package com.bytedance.apm.agent.tracing;

import X.C2LC;
import X.F9U;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class AutoPageTraceHelper {
    public static boolean sIsFirstWindowFocusChangedActivity;
    public static final HashSet<String> sMethodSet = new HashSet<>(32);
    public static final ConcurrentLinkedQueue<PageTraceEntity> sPageList = new ConcurrentLinkedQueue<>();
    public static long sMaxValidTimeMs = 20000;

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void reportStats() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.tracing.AutoPageTraceHelper.reportStats():void");
    }

    public static void setMaxValidTimeMs(long j) {
        sMaxValidTimeMs = j;
    }

    public static void reportViewIdStats(long j, String str) {
        PageTraceEntity peek = sPageList.peek();
        if (peek == null || !TextUtils.equals(str, peek.pageName)) {
            return;
        }
        peek.onViewShowTs = j;
        F9U.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.tracing.AutoPageTraceHelper.2
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_apm_agent_tracing_AutoPageTraceHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_apm_agent_tracing_AutoPageTraceHelper$2__run$___twin___() {
                AutoPageTraceHelper.reportStats();
            }

            public static void com_bytedance_apm_agent_tracing_AutoPageTraceHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_bytedance_apm_agent_tracing_AutoPageTraceHelper$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static void onTrace(String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnCreateStart(str);
                }
                ConcurrentLinkedQueue<PageTraceEntity> concurrentLinkedQueue = sPageList;
                if (concurrentLinkedQueue.size() > 50) {
                    concurrentLinkedQueue.poll();
                }
                concurrentLinkedQueue.add(new PageTraceEntity(str, System.currentTimeMillis()));
                return;
            }
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnCreateEnd();
            }
            PageTraceEntity peek = sPageList.peek();
            if (peek == null) {
                return;
            }
            peek.onCreateEndTs = System.currentTimeMillis();
            return;
        }
        if (TextUtils.equals("onResume", str2)) {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnResumeStart(str);
                }
                PageTraceEntity peek2 = sPageList.peek();
                if (peek2 == null) {
                    return;
                }
                peek2.onResumeStartTs = System.currentTimeMillis();
                return;
            }
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnResumeEnd();
            }
            PageTraceEntity peek3 = sPageList.peek();
            if (peek3 == null) {
                return;
            }
            peek3.onResumeEndTs = System.currentTimeMillis();
            return;
        }
        if (TextUtils.equals("onWindowFocusChanged", str2)) {
            if (!z) {
                return;
            }
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnWindowFocusChangedStart(str);
                sIsFirstWindowFocusChangedActivity = true;
            }
            PageTraceEntity peek4 = sPageList.peek();
            if (peek4 == null || peek4.onWindowFocusTs != 0) {
                return;
            }
            peek4.onWindowFocusTs = System.currentTimeMillis();
            if (C2LC.LIZ(str) != null) {
                return;
            }
            F9U.LIZ.LIZJ(new Runnable() { // from class: com.bytedance.apm.agent.tracing.AutoPageTraceHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    com_bytedance_apm_agent_tracing_AutoPageTraceHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_bytedance_apm_agent_tracing_AutoPageTraceHelper$1__run$___twin___() {
                    AutoPageTraceHelper.reportStats();
                }

                public static void com_bytedance_apm_agent_tracing_AutoPageTraceHelper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_bytedance_apm_agent_tracing_AutoPageTraceHelper$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            return;
        }
        if (!TextUtils.equals("onStart", str2)) {
            return;
        }
        if (z) {
            if (sIsFirstWindowFocusChangedActivity) {
                return;
            }
            AutoLaunchTraceHelper.launcherActivityOnStartStart(str);
        } else {
            if (sIsFirstWindowFocusChangedActivity) {
                return;
            }
            AutoLaunchTraceHelper.launcherActivityOnStartEnd(str);
        }
    }
}
