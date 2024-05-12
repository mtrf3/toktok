package com.ss.ttlivestreamer.livestreamv2;

import X.C15890jp;
import X.X1D;
import android.os.Handler;
import com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.engine.VideoTrack;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class InputVideoStream implements IInputVideoStream, VideoCapturer.VideoCapturerObserver {
    public int mCurrentFrameHeight;
    public int mCurrentFrameWidth;
    public ExternalVideoCapturer mExternalVideoCapturer;
    public int mFps;
    public Handler mHandler;
    public int mHeight;
    public Observer mObserver;
    public final boolean mUnReleaseInInputStream;
    public final VideoFrameStatics mVideoFrameStatics;
    public VideoMixer.VideoMixerDescription mVideoMixerDescription;
    public VideoTrack mVideoTrack;
    public int mWidth;

    /* loaded from: classes12.dex */
    public interface Observer {
        void onMixerDescriptionChange(InputVideoStream inputVideoStream, VideoMixer.VideoMixerDescription videoMixerDescription);

        void releaseInputStream(InputVideoStream inputVideoStream);
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureError(int i, Exception exc) {
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureInfo(int i, int i2, int i3, String str) {
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureStarted() {
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureStopped() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public synchronized void release() {
        Observer observer = this.mObserver;
        if (observer != null) {
            observer.releaseInputStream(this);
        }
        ExternalVideoCapturer externalVideoCapturer = this.mExternalVideoCapturer;
        if (externalVideoCapturer != null) {
            externalVideoCapturer.release();
            this.mExternalVideoCapturer = null;
        }
        VideoTrack videoTrack = this.mVideoTrack;
        if (videoTrack != null && !this.mUnReleaseInInputStream) {
            videoTrack.release();
            this.mVideoTrack = null;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public int getRealFps() {
        return (int) this.mVideoFrameStatics.getRealRatePerSecond();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public String name() {
        return this.mVideoTrack.id();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public int stop() {
        AVLog.iow("InputVideoStream", "InputVideoStream: stop.");
        this.mExternalVideoCapturer.stop();
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public int start() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InputVideoStream: start.width:");
        LIZ.append(this.mWidth);
        LIZ.append(",height:");
        LIZ.append(this.mHeight);
        LIZ.append(",fps:");
        LIZ.append(this.mFps);
        AVLog.iow("InputVideoStream", X1D.LIZIZ(LIZ));
        this.mExternalVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public int fps() {
        return this.mFps;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public int getHeight() {
        return this.mHeight;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public VideoMixer.VideoMixerDescription getMixerDescription() {
        return this.mVideoMixerDescription;
    }

    public VideoTrack getVideoTrack() {
        return this.mVideoTrack;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public void setMixerDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
        if (videoMixerDescription == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update mix description:");
        LIZ.append(this);
        LIZ.append(",desc:");
        LIZ.append(videoMixerDescription);
        AVLog.iow("InputVideoStream", X1D.LIZIZ(LIZ));
        this.mVideoMixerDescription.copy(videoMixerDescription);
        this.mObserver.onMixerDescriptionChange(this, videoMixerDescription);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        if (i != this.mCurrentFrameWidth || i2 != this.mCurrentFrameHeight) {
            this.mCurrentFrameWidth = i;
            this.mCurrentFrameHeight = i2;
            this.mExternalVideoCapturer.adaptOutputFormat(i, i2, this.mFps);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Report first video frame at ");
            C15890jp.LIZIZ(LIZ, i, "x", i2, " timestamp ");
            LIZ.append(j);
            AVLog.iod("InputVideoStream", X1D.LIZIZ(LIZ));
        }
        this.mVideoFrameStatics.add();
        return this.mExternalVideoCapturer.pushVideoFrame(byteBuffer, i, i2, i3, j, TimeUtils.currentTimeMs());
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public int pushVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, long j) {
        if (i != this.mCurrentFrameWidth || i2 != this.mCurrentFrameHeight) {
            this.mCurrentFrameWidth = i;
            this.mCurrentFrameHeight = i2;
            this.mExternalVideoCapturer.adaptOutputFormat(i, i2, this.mFps);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Report first video frame at ");
            C15890jp.LIZIZ(LIZ, i, "x", i2, " timestamp ");
            LIZ.append(j);
            AVLog.iod("InputVideoStream", X1D.LIZIZ(LIZ));
        }
        this.mVideoFrameStatics.add();
        return this.mExternalVideoCapturer.pushVideoFrame(byteBufferArr, iArr, i, i2, i3, j, TimeUtils.currentTimeMs());
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
        if (i2 != this.mCurrentFrameWidth || i3 != this.mCurrentFrameHeight) {
            this.mCurrentFrameWidth = i2;
            this.mCurrentFrameHeight = i3;
            this.mExternalVideoCapturer.adaptOutputFormat(i2, i3, this.mFps);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Report first video frame at ");
            C15890jp.LIZIZ(LIZ, i2, "x", i3, " timestamp ");
            LIZ.append(j);
            AVLog.iod("InputVideoStream", X1D.LIZIZ(LIZ));
        }
        this.mVideoFrameStatics.add();
        return this.mExternalVideoCapturer.pushVideoFrame(i, z, i2, i3, i4, fArr, j, null, TimeUtils.currentTimeMs());
    }

    public InputVideoStream(MediaEngineFactory mediaEngineFactory, Handler handler, Observer observer, int i, int i2, int i3, String str, boolean z) {
        this.mUnReleaseInInputStream = z;
        ExternalVideoCapturer externalVideoCapturer = new ExternalVideoCapturer(this, handler);
        this.mExternalVideoCapturer = externalVideoCapturer;
        this.mVideoTrack = mediaEngineFactory.createVideoTrack(externalVideoCapturer, str);
        this.mObserver = observer;
        this.mFps = i3;
        this.mWidth = i;
        this.mHeight = i2;
        this.mVideoMixerDescription = VideoMixer.VideoMixerDescription.INVISIABLE();
        this.mVideoFrameStatics = new VideoFrameStatics(1000);
    }
}
