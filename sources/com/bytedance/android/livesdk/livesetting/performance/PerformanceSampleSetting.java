package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C5H3;
import X.C86869Y7l;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.livesetting.model.PerformanceSample;

@SettingsKey("live_performance_sample_report_opt")
/* loaded from: classes16.dex */
public final class PerformanceSampleSetting {
    public static final PerformanceSampleSetting INSTANCE = new PerformanceSampleSetting();
    public static int didLastNum = -1;

    @Group(isDefault = true, value = "default group")
    public static final PerformanceSample DEFAULT = new PerformanceSample();
    public static final C5H3 getValue$delegate = C221108m2.LIZIZ(C86869Y7l.LJLIL);

    public final boolean isReportGpu() {
        int i;
        if (!isExperiment(false)) {
            return true;
        }
        PerformanceSample getValue = getGetValue();
        if (getValue != null) {
            i = getValue.audienceGpuSampleRate;
        } else {
            i = 10;
        }
        return isReport(false, i);
    }

    public final PerformanceSample getGetValue() {
        return (PerformanceSample) getValue$delegate.getValue();
    }

    public final boolean isExperiment(boolean z) {
        if (z) {
            PerformanceSample getValue = getGetValue();
            if (getValue == null) {
                return false;
            }
            return getValue.isHostExperiment;
        }
        PerformanceSample getValue2 = getGetValue();
        if (getValue2 == null) {
            return false;
        }
        return getValue2.isAudienceExperiment;
    }

    public final boolean isReportCpu(boolean z) {
        if (!isExperiment(z)) {
            return true;
        }
        int i = 10;
        if (z) {
            PerformanceSample getValue = getGetValue();
            if (getValue != null) {
                i = getValue.hostCpuSampleRate;
            }
        } else {
            PerformanceSample getValue2 = getGetValue();
            if (getValue2 != null) {
                i = getValue2.audienceCpuSampleRate;
            }
        }
        return isReport(z, i);
    }

    public final boolean isReportMem(boolean z) {
        if (!isExperiment(z)) {
            return true;
        }
        int i = 10;
        if (z) {
            PerformanceSample getValue = getGetValue();
            if (getValue != null) {
                i = getValue.hostMemSampleRate;
            }
        } else {
            PerformanceSample getValue2 = getGetValue();
            if (getValue2 != null) {
                i = getValue2.audienceMemSampleRate;
            }
        }
        return isReport(z, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting.didLastNum >= 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isReport(boolean r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.isExperiment(r6)
            r4 = 1
            if (r0 != 0) goto L8
            return r4
        L8:
            int r0 = com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting.didLastNum
            r3 = 0
            if (r0 >= 0) goto L5a
            r2 = 10
            java.lang.String r1 = com.ss.android.deviceregister.DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L3c
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L3c
            if (r0 != 0) goto L4c
            int r0 = r1.length()     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L3c
            int r0 = r0 - r4
            char r0 = r1.charAt(r0)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L3c
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L3c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L3c
            com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting.didLastNum = r0     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L3c
            goto L4c
        L2d:
            r0 = move-exception
            java.lang.String r1 = "PerformanceSampleSetting"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            X.C0NB.LJIIIZ(r1, r0)     // Catch: java.lang.Throwable -> L3c
            int r0 = com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting.didLastNum
            if (r0 >= 0) goto L5a
            goto L50
        L3c:
            r1 = move-exception
            int r0 = com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting.didLastNum
            if (r0 >= 0) goto L4b
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            int r0 = r0.nextInt(r3, r2)
            com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting.didLastNum = r0
        L4b:
            throw r1
        L4c:
            int r0 = com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting.didLastNum
            if (r0 >= 0) goto L5a
        L50:
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            int r0 = r0.nextInt(r3, r2)
            com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting.didLastNum = r0
        L5a:
            int r0 = com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting.didLastNum
            if (r0 >= r7) goto L5f
        L5e:
            return r4
        L5f:
            r4 = 0
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting.isReport(boolean, int):boolean");
    }
}
