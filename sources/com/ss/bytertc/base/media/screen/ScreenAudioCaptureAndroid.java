package com.ss.bytertc.base.media.screen;

import X.C04330Ez;
import android.content.Context;
import android.os.Build;
import com.bytedance.realx.audio.ScreenAudioCaptureAndroidManager;
import com.bytedance.realx.audio.ScreenAudioCaptureObserver;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.video.RXScreenCaptureService;

/* loaded from: classes33.dex */
public class ScreenAudioCaptureAndroid implements ScreenAudioCaptureObserver {
    public Context mContext;
    public boolean mIsAudioCaptureWorking;
    public long mNativeCaptureObserver;

    @Override // com.bytedance.realx.audio.ScreenAudioCaptureObserver
    public void onCapturerStarted() {
        RTCScreenAudioNativeFunctions.nativeOnCapturerStarted(this.mNativeCaptureObserver);
    }

    @Override // com.bytedance.realx.audio.ScreenAudioCaptureObserver
    public void onCapturerStopped() {
        RTCScreenAudioNativeFunctions.nativeOnCapturerStopped(this.mNativeCaptureObserver);
    }

    public void stopCapture() {
        if (this.mIsAudioCaptureWorking) {
            if (Build.VERSION.SDK_INT > 28 && ScreenServiceManager.serviceStarted.get()) {
                Context context = this.mContext;
                context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 7, null));
            }
            this.mIsAudioCaptureWorking = false;
        }
    }

    public void release() {
        stopCapture();
        if (this.mContext != null && Build.VERSION.SDK_INT > 28 && ScreenServiceManager.serviceStarted.get()) {
            Context context = this.mContext;
            context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 8, null));
        }
    }

    public void startCapture() {
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        if (Build.VERSION.SDK_INT <= 28 || C04330Ez.LIZ(applicationContext, "android.permission.RECORD_AUDIO") != 0) {
            RTCScreenAudioNativeFunctions.nativeOnCapturerError(this.mNativeCaptureObserver, 1);
            return;
        }
        ScreenAudioCaptureAndroidManager.INSTANCE().initialize(this.mContext, this);
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 6, null));
        this.mIsAudioCaptureWorking = true;
    }

    public ScreenAudioCaptureAndroid(long j) {
        this.mNativeCaptureObserver = j;
    }

    @Override // com.bytedance.realx.audio.ScreenAudioCaptureObserver
    public void onAudioFrameCapture(byte[] bArr, int i, int i2, int i3) {
        RTCScreenAudioNativeFunctions.nativeOnAuidoFrameCaptured(this.mNativeCaptureObserver, bArr, i, i2, i3);
    }
}
