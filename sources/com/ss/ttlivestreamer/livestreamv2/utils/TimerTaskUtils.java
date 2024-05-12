package com.ss.ttlivestreamer.livestreamv2.utils;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes12.dex */
public class TimerTaskUtils {
    public static Map<String, Timer> mapTasks = new HashMap();

    public static void removeTask(String str) {
        Timer timer = mapTasks.get(str);
        if (timer != null) {
            timer.cancel();
            mapTasks.remove(str);
        }
    }

    public static void addTask(final Runnable runnable, int i, String str) {
        removeTask(str);
        PthreadTimer pthreadTimer = new PthreadTimer("imerTaskUtils");
        long j = i;
        pthreadTimer.schedule(new TimerTask() { // from class: com.ss.ttlivestreamer.livestreamv2.utils.TimerTaskUtils.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_utils_TimerTaskUtils$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_utils_TimerTaskUtils$1__run$___twin___() {
                runnable.run();
            }

            public static void com_ss_ttlivestreamer_livestreamv2_utils_TimerTaskUtils$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_livestreamv2_utils_TimerTaskUtils$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, j, j);
        mapTasks.put(str, pthreadTimer);
    }
}
