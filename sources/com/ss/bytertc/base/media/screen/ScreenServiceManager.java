package com.ss.bytertc.base.media.screen;

import android.content.Context;
import android.os.Build;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.video.RXScreenCaptureService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes33.dex */
public class ScreenServiceManager {
    public static AtomicBoolean serviceStarted = new AtomicBoolean(false);

    public void stopService() {
        if (Build.VERSION.SDK_INT <= 28) {
            return;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        applicationContext.startForegroundService(RXScreenCaptureService.getServiceIntent(applicationContext, 9, null));
        serviceStarted.compareAndSet(true, false);
    }

    public ScreenServiceManager() {
        serviceStarted.compareAndSet(false, true);
    }
}
