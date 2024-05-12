package com.ss.ttlivestreamer.livestreamv2.utils;

import com.ss.ttlivestreamer.core.utils.LiveStreamGpuHintSettingsUtils;
import com.ss.ttlivestreamer.core.utils.LiveStreamThreadPriorityUtils;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusiness;
import com.ss.ttlivestreamer.core.utils.TTLSThreadConfigHelper;
import com.ss.ttlivestreamer.core.utils.TokenCertConfigUtils;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;

/* loaded from: classes12.dex */
public class TTLSConstantsLifecycleCallback {
    public static synchronized void onInit(LiveCore.Builder builder) {
        synchronized (TTLSConstantsLifecycleCallback.class) {
            LiveStreamThreadPriorityUtils.init(builder.getPrioritySettings());
            LiveStreamGpuHintSettingsUtils.initGpuHintSettings(builder.getGpuHintSettings());
            TTLSThreadConfigHelper.init(builder.getThreadConfigs());
        }
    }

    public static synchronized void onLiveStreamCreated(ILiveStream iLiveStream) {
        synchronized (TTLSConstantsLifecycleCallback.class) {
            TTLSPreInitBusiness.getInstance().onLiveStreamCreated(iLiveStream);
        }
    }

    public static synchronized void onRelease(ILiveStream iLiveStream) {
        synchronized (TTLSConstantsLifecycleCallback.class) {
            TokenCertConfigUtils.getInstance().release();
            TTLSThreadConfigHelper.release();
            TTLSPreInitBusiness.getInstance().destroyPreInitInfos(iLiveStream);
        }
    }
}
