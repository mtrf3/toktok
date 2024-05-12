package com.bytedance.realx.video;

import X.C16880lQ;
import X.ZV3;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.video.EglBase;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes33.dex */
public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    public CapturerObserver capturerObserver;
    public Context mContext;
    public CountDownLatch mCountDownLatch;
    public boolean needStartService;

    @Override // com.bytedance.realx.video.VideoCapturer
    public synchronized void dispose() {
        if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().dispose();
        } else {
            Intent intent = new Intent();
            intent.putExtra("hc", this.mCountDownLatch.hashCode());
            try {
                Context context = this.mContext;
                context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 5, intent));
            } catch (ForegroundServiceStartNotAllowedException unused) {
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onCapturerError("Start foreground service failed.");
                }
            }
            try {
                this.mCountDownLatch.await(1500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public int enableFollowGravity(boolean z) {
        return -1;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public float getCameraZoomMaxRatio() {
        return 1.0f;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public boolean isCameraTorchSupported() {
        return false;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public boolean isCameraZoomSupported() {
        return false;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public int setCameraZoomRatio(float f) {
        return 0;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public synchronized void stopCapture() {
        if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().stopCapture();
        } else {
            try {
                Context context = this.mContext;
                context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 2, null));
            } catch (ForegroundServiceStartNotAllowedException unused) {
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onCapturerError("Start foreground service failed.");
                }
            }
        }
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public void turnOffFlashLight() {
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public void turnOnFlashLight() {
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public int getDeviceOrientation() {
        return ZV3.LIZIZ(ContextUtils.getApplicationContext());
    }

    public MediaProjection getMediaProjection() {
        return ScreenCaptureAndroidManager.INSTANCE().getMediaProjection();
    }

    @Override // com.bytedance.realx.video.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().onFrame(videoFrame);
            return;
        }
        int addFrame = ScreenCaptureAndroidManager.INSTANCE().addFrame(videoFrame);
        Intent intent = new Intent();
        intent.putExtra("i", addFrame);
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 4, intent));
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this(intent, callback, true);
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback, boolean z) {
        this.mCountDownLatch = new CountDownLatch(1);
        this.needStartService = true;
        this.capturerObserver = null;
        ScreenCaptureAndroidManager.INSTANCE().addLock(this.mCountDownLatch.hashCode(), this.mCountDownLatch);
        ScreenCaptureAndroidManager.INSTANCE().setData(intent, callback);
        this.needStartService = z;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().changeCaptureFormat(i, i2, i3);
        } else {
            Intent intent = new Intent();
            intent.putExtra("w", i);
            intent.putExtra("h", i2);
            intent.putExtra("if", i3);
            try {
                Context context = this.mContext;
                context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 3, intent));
            } catch (ForegroundServiceStartNotAllowedException unused) {
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onCapturerError("Start foreground service failed.");
                }
            }
        }
    }

    public synchronized void initialize(EglBase.Context context, Context context2, CapturerObserver capturerObserver) {
        this.mContext = context2;
        this.capturerObserver = capturerObserver;
        ScreenCaptureAndroidManager.INSTANCE().initialize(context, context2, capturerObserver);
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        startCapture(i, i2, i3, 4);
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.mContext = context;
        this.capturerObserver = capturerObserver;
        ScreenCaptureAndroidManager.INSTANCE().initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3, int i4) {
        if (!this.needStartService || Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().startCapture(i, i2, i3, i4);
        } else {
            Intent intent = new Intent();
            intent.putExtra("w", i);
            intent.putExtra("h", i2);
            intent.putExtra("if", i3);
            if (i4 <= 0) {
                i4 = 4;
            }
            intent.putExtra("minfr", i4);
            try {
                Context context = this.mContext;
                context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 1, intent));
            } catch (ForegroundServiceStartNotAllowedException unused) {
                CapturerObserver capturerObserver = this.capturerObserver;
                if (capturerObserver != null) {
                    capturerObserver.onCapturerError("Start foreground service failed.");
                }
            }
        }
    }
}
