package com.ss.ttlivestreamer.core.capture.video;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSource;

/* loaded from: classes12.dex */
public abstract class VideoCapturer extends VideoSource {
    public BeforeOnFrameCallback callback;

    /* loaded from: classes12.dex */
    public interface BeforeOnFrameCallback {
        void beforeNativeOnFrame();
    }

    /* loaded from: classes12.dex */
    public interface VideoCapturerObserver {
        void onVideoCaptureError(int i, Exception exc);

        void onVideoCaptureInfo(int i, int i2, int i3, String str);

        void onVideoCaptureStarted();

        void onVideoCaptureStopped();
    }

    public float getInCapFps() {
        return 0.0f;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSource
    public boolean isScreenCast() {
        return false;
    }

    public abstract void start(int i, int i2, int i3);

    public abstract void stop();

    public void setBeforeOnFrameCallback(BeforeOnFrameCallback beforeOnFrameCallback) {
        this.callback = beforeOnFrameCallback;
    }

    public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        BeforeOnFrameCallback beforeOnFrameCallback = this.callback;
        if (beforeOnFrameCallback != null) {
            beforeOnFrameCallback.beforeNativeOnFrame();
        }
        return nativeOnFrame(buffer, i, i2, i3, j);
    }
}
