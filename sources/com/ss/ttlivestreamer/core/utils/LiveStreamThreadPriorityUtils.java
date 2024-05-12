package com.ss.ttlivestreamer.core.utils;

import com.ss.ttlivestreamer.core.opengl.GLThread;

/* loaded from: classes12.dex */
public class LiveStreamThreadPriorityUtils {
    public static LiveStreamThreadPrioritySettings settings;

    public static GLThread getGRKHandlerThread() {
        return getGLThread(LiveStreamThreadType.GRK_THREAD, "GLRenderVideoSink");
    }

    public static GLThread getVideoCaptureOesProcessThread() {
        return getGLThread(LiveStreamThreadType.VIDEO_CAPTURE, "TTLSOesProcessThread");
    }

    public static GLThread getVideoCaptureThread() {
        return getGLThread(LiveStreamThreadType.VIDEO_CAPTURE, "LiveCoreVideoCaptureThread");
    }

    public static SafeHandlerThread getWorkerThread() {
        LiveStreamThreadSettingItem settings2;
        LiveStreamThreadPrioritySettings liveStreamThreadPrioritySettings = settings;
        if (liveStreamThreadPrioritySettings == null) {
            settings2 = null;
        } else {
            settings2 = liveStreamThreadPrioritySettings.getSettings(LiveStreamThreadType.WORK_THREAD);
        }
        if (isEnable(settings2)) {
            return SafeHandlerThreadPoolExecutor.lockThread("LiveCoreWorkThread", settings2.getPriority());
        }
        return SafeHandlerThreadPoolExecutor.lockThread("LiveCoreWorkThread");
    }

    public static void init(LiveStreamThreadPrioritySettings liveStreamThreadPrioritySettings) {
        settings = liveStreamThreadPrioritySettings;
    }

    public static boolean isEnable(LiveStreamThreadSettingItem liveStreamThreadSettingItem) {
        if (liveStreamThreadSettingItem == null || liveStreamThreadSettingItem.getType() == null) {
            return false;
        }
        return liveStreamThreadSettingItem.isEnable();
    }

    public static GLThread getGLThread(LiveStreamThreadType liveStreamThreadType, String str) {
        LiveStreamThreadSettingItem settings2;
        GLThread lockGLThread;
        LiveStreamThreadPrioritySettings liveStreamThreadPrioritySettings = settings;
        if (liveStreamThreadPrioritySettings == null) {
            settings2 = null;
        } else {
            settings2 = liveStreamThreadPrioritySettings.getSettings(liveStreamThreadType);
        }
        if (isEnable(settings2)) {
            lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread(str, settings2.getPriority());
        } else {
            lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread(str);
        }
        LiveStreamGpuHintSettingsUtils.initWithGlThread(lockGLThread);
        return lockGLThread;
    }
}
