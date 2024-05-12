package com.ss.bytertc.base.media.screen;

import X.C16880lQ;
import X.X1D;
import X.ZVB;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.video.CapturerObserver;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.ScreenCapturerAndroid;
import com.bytedance.realx.video.VideoCapturer;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.utils.LogUtil;

/* loaded from: classes33.dex */
public class ScreenVideoCaptureAndroid {
    public EglBase cameraEglBase;
    public CapturerObserver localCapturerObserver = new CapturerObserver() { // from class: com.ss.bytertc.base.media.screen.ScreenVideoCaptureAndroid.1
        @Override // com.bytedance.realx.video.CapturerObserver
        public void onCapturerFormatSelected(int i, int i2, int i3, int i4, int i5) {
        }

        @Override // com.bytedance.realx.video.CapturerObserver
        public void onCapturerStopped() {
            RTCScreenVideoNativeFunctions.nativeOnCapturerStopped(ScreenVideoCaptureAndroid.this.mNativeCaptureObserver);
        }

        @Override // com.bytedance.realx.video.CapturerObserver
        public void onCapturerError(String str) {
            RTCScreenVideoNativeFunctions.nativeOnCapturerError(ScreenVideoCaptureAndroid.this.mNativeCaptureObserver, 0, str);
        }

        @Override // com.bytedance.realx.video.CapturerObserver
        public void onCapturerStarted(boolean z) {
            if (z) {
                RTCScreenVideoNativeFunctions.nativeOnCapturerStarted(ScreenVideoCaptureAndroid.this.mNativeCaptureObserver);
            } else {
                RTCScreenVideoNativeFunctions.nativeOnCapturerError(ScreenVideoCaptureAndroid.this.mNativeCaptureObserver, 0, "start error");
            }
        }

        @Override // com.bytedance.realx.video.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            RTCScreenVideoNativeFunctions.nativeOnFrameCaptured(ScreenVideoCaptureAndroid.this.mNativeCaptureObserver, videoFrame);
        }
    };
    public Intent mCaptureScreenIntent;
    public boolean mIsVideoCaptureInited;
    public boolean mIsVideoCaptureWorking;
    public long mNativeCaptureObserver;
    public VideoCapturer mVideoCapturer;
    public EglBase.Context sharedEglGroup;

    public void release() {
        if (this.mVideoCapturer != null) {
            stopCapture();
            this.mVideoCapturer.dispose();
            this.mVideoCapturer = null;
        }
        EglBase eglBase = this.cameraEglBase;
        if (eglBase != null) {
            eglBase.release();
            this.cameraEglBase = null;
        }
        this.mIsVideoCaptureInited = false;
        this.mIsVideoCaptureWorking = false;
        this.sharedEglGroup = null;
        this.mCaptureScreenIntent = null;
    }

    public void stopCapture() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            try {
                videoCapturer.stopCapture();
                this.mIsVideoCaptureWorking = false;
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    private VideoCapturer createVideoCapturer(Intent intent) {
        try {
            return new ScreenCapturerAndroid(intent, new MediaProjection.Callback() { // from class: com.ss.bytertc.base.media.screen.ScreenVideoCaptureAndroid.2
                @Override // android.media.projection.MediaProjection.Callback
                public void onStop() {
                    CapturerObserver capturerObserver;
                    LogUtil.e("ScreenVideoCaptureAndroid", "User revoked permission to capture the screen.");
                    ScreenVideoCaptureAndroid screenVideoCaptureAndroid = ScreenVideoCaptureAndroid.this;
                    if (screenVideoCaptureAndroid.mVideoCapturer != null && screenVideoCaptureAndroid.mIsVideoCaptureInited && screenVideoCaptureAndroid.mIsVideoCaptureWorking && (capturerObserver = screenVideoCaptureAndroid.localCapturerObserver) != null) {
                        capturerObserver.onCapturerError("media projection unexpected exit when capture screen video");
                    }
                }
            });
        } catch (IllegalArgumentException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Create VideoCapture fail : ");
            LIZ.append(e.getMessage());
            LogUtil.e("ScreenVideoCaptureAndroid", X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public ScreenVideoCaptureAndroid(long j, EglBase.Context context) {
        this.mNativeCaptureObserver = j;
        this.sharedEglGroup = context;
    }

    private void startVideoCapture(int i, int i2, int i3) {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            try {
                videoCapturer.startCapture(i, i2, i3);
                this.mIsVideoCaptureWorking = true;
            } catch (IllegalArgumentException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("VideoCapture startCapture fail : ");
                LIZ.append(e.getMessage());
                LogUtil.e("ScreenVideoCaptureAndroid", X1D.LIZIZ(LIZ));
            }
        }
    }

    public void changeCaptureFormat(int i, int i2, int i3) {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            videoCapturer.changeCaptureFormat(i, i2, i3);
        }
    }

    public void startCapture(int i, int i2, int i3, Intent intent) {
        int i4;
        if (intent == null) {
            LogUtil.e("ScreenVideoCaptureAndroid", "startCapture failed, intent is null");
            return;
        }
        this.mCaptureScreenIntent = intent;
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            videoCapturer.dispose();
            this.mVideoCapturer = null;
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        }
        if (Build.VERSION.SDK_INT > 28) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        RTCScreenVideoNativeFunctions.nativeOnCapturerSetType(this.mNativeCaptureObserver, i4);
        this.mVideoCapturer = createVideoCapturer(this.mCaptureScreenIntent);
        if (this.cameraEglBase == null) {
            this.cameraEglBase = ZVB.LIZIZ(this.sharedEglGroup);
        }
        VideoCapturer videoCapturer2 = this.mVideoCapturer;
        if (videoCapturer2 != null) {
            ((ScreenCapturerAndroid) videoCapturer2).initialize(this.cameraEglBase.getEglBaseContext(), ContextUtils.getApplicationContext(), this.localCapturerObserver);
            this.mIsVideoCaptureInited = true;
            startVideoCapture(i, i2, i3);
        } else {
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        }
    }
}
