package com.ss.ttlivestreamer.core.utils;

import android.os.Handler;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.utils.QualcommGpuUtils;

/* loaded from: classes12.dex */
public class LiveStreamGpuHintSettingsUtils {
    public static ThreadLocal<Boolean> hasSendCommand = new ThreadLocal<>();
    public static Runnable resetRunnable = new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.LiveStreamGpuHintSettingsUtils.1
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_core_utils_LiveStreamGpuHintSettingsUtils$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_core_utils_LiveStreamGpuHintSettingsUtils$1__run$___twin___() {
            LiveStreamGpuHintSettingsUtils.doResetGpuHint();
        }

        public static void com_ss_ttlivestreamer_core_utils_LiveStreamGpuHintSettingsUtils$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            boolean LIZ;
            try {
                anonymousClass1.com_ss_ttlivestreamer_core_utils_LiveStreamGpuHintSettingsUtils$1__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    };
    public static LiveStreamGpuHintSettings settings;

    public static void doResetGpuHint() {
        Boolean bool = hasSendCommand.get();
        if (isEnabled() && bool != null && bool.booleanValue()) {
            hasSendCommand.set(Boolean.FALSE);
            QualcommGpuUtils.sendCommand(QualcommGpuUtils.CommandType.DEFAULT);
        }
    }

    public static boolean isEnabled() {
        LiveStreamGpuHintSettings liveStreamGpuHintSettings = settings;
        if (liveStreamGpuHintSettings != null && liveStreamGpuHintSettings.getType() != null && settings.isEnabled() && settings.getTime() > 0) {
            return true;
        }
        return false;
    }

    public static void resetQualcommHintIfNeeded() {
        doResetGpuHint();
    }

    public static void initGpuHintSettings(LiveStreamGpuHintSettings liveStreamGpuHintSettings) {
        settings = liveStreamGpuHintSettings;
    }

    public static void initWithGlThread(GLThread gLThread) {
        if (isEnabled()) {
            gLThread.enableGpuHint();
        }
    }

    public static void sendQualcommCommandIfNeeded(Handler handler) {
        if (isEnabled()) {
            hasSendCommand.set(Boolean.TRUE);
            QualcommGpuUtils.sendCommand(settings.getType());
            handler.removeCallbacks(resetRunnable);
            handler.postDelayed(resetRunnable, settings.getTime());
        }
    }
}
