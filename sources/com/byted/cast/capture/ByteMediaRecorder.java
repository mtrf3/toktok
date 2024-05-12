package com.byted.cast.capture;

import X.C03880Dg;
import X.C16880lQ;
import X.C65300Pk0;
import X.C90177ZaH;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.byted.cast.capture.ByteMediaRecorder;
import com.byted.cast.capture.NotifyServer.ProjectionService;
import com.byted.cast.capture.audio.AudioRecorder;
import com.byted.cast.capture.muxer.MediaMuxerWrapper;
import com.byted.cast.capture.video.VideoRecorderManager;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.config.Config;
import com.byted.cast.mediacommon.IMediaRecorder;
import com.byted.cast.mediacommon.IMediaRecorderCallback;
import com.byted.cast.mediacommon.ISafetyInterface;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.utils.HandlerWrapper;
import com.byted.cast.mediacommon.utils.Logger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes29.dex */
public class ByteMediaRecorder implements IMediaRecorder {
    public static volatile ByteMediaRecorder mMediaRecorder;
    public Boolean bAutoStart;
    public Boolean bEnableOrient;
    public volatile Boolean bProjectionReady;
    public volatile Boolean bStartProjectionService;
    public volatile boolean bUseSelfMediaProjection;
    public AudioRecorder.IAudioRecordFrameCallback mAudioFrameCallback;
    public AudioRecorder mAudioRecorder;
    public final CallBackThread mCallBackThread;
    public final HandlerWrapper mCallBackThreadHandler;
    public Context mContext;
    public ArrayList<IMediaRecorderCallback> mEventListeners;
    public MediaMuxerWrapper mMediaMuxer;
    public MediaProjection mMediaProjection;
    public MediaProjectionManager mMediaProjectionManager;
    public final Object mRecordingStateLock;
    public int mRequestCode;
    public ISafetyInterface mSafetyInterface;
    public MediaSetting mSettings;
    public boolean mStarted;
    public VideoRecorderManager.IVideoCallback mVideoFrameCallback;
    public VideoRecorderManager mVideoRecorderManager;
    public VirtualDisplay.Callback mVirtualDisplayCallback;
    public volatile boolean needSetVirtualDisplayWH;
    public volatile int reTryCount;

    /* renamed from: com.byted.cast.capture.ByteMediaRecorder$2, reason: invalid class name */
    /* loaded from: classes29.dex */
    public class AnonymousClass2 implements VideoRecorderManager.IVideoCallback {
        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreateVirtualDisplayFail$1() {
            ByteMediaRecorder.this.doStop();
            ByteMediaRecorder.this.bProjectionReady = Boolean.FALSE;
            ByteMediaRecorder.this.requestMediaRecord();
            ByteMediaRecorder.this.doStart();
        }

        @Override // com.byted.cast.capture.video.VideoRecorderManager.IVideoCallback
        public void onRecevieFrameTimeout() {
            ByteMediaRecorder.this.insertFrame();
        }

        @Override // com.byted.cast.capture.video.VideoRecorderManager.IVideoCallback
        public void onVideoEncoderStop() {
            MediaMuxerWrapper mediaMuxerWrapper = ByteMediaRecorder.this.mMediaMuxer;
            if (mediaMuxerWrapper != null) {
                mediaMuxerWrapper.removeTrack(MediaMuxerWrapper.VIDEO);
            }
        }

        public AnonymousClass2() {
        }

        @Override // com.byted.cast.capture.video.VideoRecorderManager.IVideoCallback
        public void onCreateVirtualDisplayFail(String str) {
            ByteMediaRecorder.this.reTryCount++;
            if (ByteMediaRecorder.this.reTryCount >= 2) {
                Logger.e("ByteMediaRecorder", "retry ERROR!!!");
                onVideoRecordError(14004007, "create VirtualDisplayFail");
                MediaMonitor.onMonitor("MediaCapture_Error", 100004, "createVirtualDisplay", str);
                return;
            }
            ByteMediaRecorder.this.mCallBackThreadHandler.post(new Runnable() { // from class: X.ZZA
                @Override // java.lang.Runnable
                public final void run() {
                    ByteMediaRecorder.AnonymousClass2.this.lambda$onCreateVirtualDisplayFail$1();
                }
            });
        }

        @Override // com.byted.cast.capture.video.VideoRecorderManager.IVideoCallback
        public void onVideoOutputFormatChange(MediaFormat mediaFormat) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onVideoOutputFormatChange:");
            LIZ.append(mediaFormat.toString());
            Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
            MediaMuxerWrapper mediaMuxerWrapper = ByteMediaRecorder.this.mMediaMuxer;
            if (mediaMuxerWrapper != null) {
                mediaMuxerWrapper.addTrack(MediaMuxerWrapper.VIDEO, mediaFormat);
            }
        }

        @Override // com.byted.cast.capture.video.VideoRecorderManager.IVideoCallback
        public void onVideoSizeChanged(int i) {
            if (ByteMediaRecorder.this.mSettings.getVideoProfile().getSourceType() == MediaSetting.VIDEO_SOURCE_TYPE.SCREEN) {
                ByteMediaRecorder byteMediaRecorder = ByteMediaRecorder.this;
                if (byteMediaRecorder.mStarted && byteMediaRecorder.bEnableOrient.booleanValue()) {
                    ByteMediaRecorder.this.mVideoRecorderManager.reStart(i);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoRecordError$2(int i, String str) {
            synchronized (ByteMediaRecorder.this.mRecordingStateLock) {
                ArrayList<IMediaRecorderCallback> arrayList = ByteMediaRecorder.this.mEventListeners;
                if (arrayList != null) {
                    Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onVideoRecordError(i, str);
                    }
                }
            }
        }

        @Override // com.byted.cast.capture.video.VideoRecorderManager.IVideoCallback
        public void onVideoRecordError(final int i, final String str) {
            ByteMediaRecorder.this.mCallBackThreadHandler.post(new Runnable() { // from class: X.ZZ9
                @Override // java.lang.Runnable
                public final void run() {
                    ByteMediaRecorder.AnonymousClass2.this.lambda$onVideoRecordError$2(i, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoEncoder$0(String str, int i, int i2, int i3, int i4) {
            synchronized (ByteMediaRecorder.this.mRecordingStateLock) {
                ArrayList<IMediaRecorderCallback> arrayList = ByteMediaRecorder.this.mEventListeners;
                if (arrayList != null) {
                    Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onVideoEncoder(str, i, i2, i3, i4);
                    }
                }
            }
        }

        @Override // com.byted.cast.capture.video.VideoRecorderManager.IVideoCallback
        public void onVideoEncoder(final String str, final int i, final int i2, final int i3, final int i4) {
            ByteMediaRecorder.this.mCallBackThreadHandler.post(new Runnable() { // from class: X.ZZB
                @Override // java.lang.Runnable
                public final void run() {
                    ByteMediaRecorder.AnonymousClass2.this.lambda$onVideoEncoder$0(str, i, i2, i3, i4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoFrameCodec$3(byte[] bArr, int i, int i2, int i3, MediaSetting.VideoFormat videoFormat, long j, int i4) {
            synchronized (ByteMediaRecorder.this.mRecordingStateLock) {
                ArrayList<IMediaRecorderCallback> arrayList = ByteMediaRecorder.this.mEventListeners;
                if (arrayList != null) {
                    Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onVideoFrameCodec(bArr, i, i2, i3, videoFormat, j, i4);
                    }
                }
            }
        }

        @Override // com.byted.cast.capture.video.VideoRecorderManager.IVideoCallback
        public void onVideoFrameCodec(final byte[] bArr, final int i, final int i2, final int i3, final MediaSetting.VideoFormat videoFormat, final long j, final int i4) {
            ByteMediaRecorder.this.mCallBackThreadHandler.post(new Runnable() { // from class: X.ZZ8
                @Override // java.lang.Runnable
                public final void run() {
                    ByteMediaRecorder.AnonymousClass2.this.lambda$onVideoFrameCodec$3(bArr, i, i2, i3, videoFormat, j, i4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoFrameAvailable$4(byte[] bArr, MediaCodec.BufferInfo bufferInfo, int i, int i2, int i3, MediaSetting.VideoFormat videoFormat, long j, int i4) {
            MediaMuxerWrapper mediaMuxerWrapper = ByteMediaRecorder.this.mMediaMuxer;
            if (mediaMuxerWrapper != null && mediaMuxerWrapper.isStarted()) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                if (bArr.length != bufferInfo.size) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("zhy test ERROR data.length");
                    LIZ.append(bArr.length);
                    LIZ.append("!= bufferinfo.size");
                    LIZ.append(bufferInfo.size);
                    Logger.e("ByteMediaRecorder", X1D.LIZIZ(LIZ));
                }
                MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                bufferInfo2.set(0, bArr.length, bufferInfo.presentationTimeUs, bufferInfo.flags);
                ByteMediaRecorder.this.mMediaMuxer.writeSampleData(MediaMuxerWrapper.VIDEO, wrap, bufferInfo2, i);
            }
            synchronized (ByteMediaRecorder.this.mRecordingStateLock) {
                ArrayList<IMediaRecorderCallback> arrayList = ByteMediaRecorder.this.mEventListeners;
                if (arrayList != null) {
                    Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onVideoFrameAvailable(bArr, bArr.length, i2, i3, videoFormat, j, i4, i);
                    }
                }
            }
        }

        @Override // com.byted.cast.capture.video.VideoRecorderManager.IVideoCallback
        public void onVideoFrameAvailable(final byte[] bArr, final MediaCodec.BufferInfo bufferInfo, final int i, final int i2, final MediaSetting.VideoFormat videoFormat, final long j, final int i3, final int i4) {
            ByteMediaRecorder.this.mCallBackThreadHandler.post(new Runnable() { // from class: X.ZZC
                @Override // java.lang.Runnable
                public final void run() {
                    ByteMediaRecorder.AnonymousClass2.this.lambda$onVideoFrameAvailable$4(bArr, bufferInfo, i4, i, i2, videoFormat, j, i3);
                }
            });
        }
    }

    /* renamed from: com.byted.cast.capture.ByteMediaRecorder$3, reason: invalid class name */
    /* loaded from: classes29.dex */
    public class AnonymousClass3 implements AudioRecorder.IAudioRecordFrameCallback {
        @Override // com.byted.cast.capture.audio.AudioRecorder.IAudioRecordFrameCallback
        public void onAudioEncoderStop() {
            MediaMuxerWrapper mediaMuxerWrapper = ByteMediaRecorder.this.mMediaMuxer;
            if (mediaMuxerWrapper != null) {
                mediaMuxerWrapper.removeTrack(MediaMuxerWrapper.AUDIO);
            }
        }

        public AnonymousClass3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAudioRecordFailed$1(int i) {
            synchronized (ByteMediaRecorder.this.mRecordingStateLock) {
                ArrayList<IMediaRecorderCallback> arrayList = ByteMediaRecorder.this.mEventListeners;
                if (arrayList != null) {
                    Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onAudioRecordFailed(i);
                    }
                }
            }
        }

        @Override // com.byted.cast.capture.audio.AudioRecorder.IAudioRecordFrameCallback
        public void onAudioOutputFormatChange(MediaFormat mediaFormat) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onAudioOutputFormatChange:");
            LIZ.append(mediaFormat.toString());
            Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
            MediaMuxerWrapper mediaMuxerWrapper = ByteMediaRecorder.this.mMediaMuxer;
            if (mediaMuxerWrapper != null) {
                mediaMuxerWrapper.addTrack(MediaMuxerWrapper.AUDIO, mediaFormat);
            }
        }

        @Override // com.byted.cast.capture.audio.AudioRecorder.IAudioRecordFrameCallback
        public void onAudioRecordFailed(final int i) {
            ByteMediaRecorder.this.mCallBackThreadHandler.post(new Runnable() { // from class: X.ZZD
                @Override // java.lang.Runnable
                public final void run() {
                    ByteMediaRecorder.AnonymousClass3.this.lambda$onAudioRecordFailed$1(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAudioFrameAvailable$2(byte[] bArr, MediaCodec.BufferInfo bufferInfo, MediaSetting.ACODEC_ID acodec_id, long j) {
            MediaMuxerWrapper mediaMuxerWrapper = ByteMediaRecorder.this.mMediaMuxer;
            if (mediaMuxerWrapper != null && mediaMuxerWrapper.isStarted()) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                bufferInfo2.set(7, bArr.length - 7, bufferInfo.presentationTimeUs, bufferInfo.flags);
                ByteMediaRecorder.this.mMediaMuxer.writeSampleData(MediaMuxerWrapper.AUDIO, wrap, bufferInfo2, 0);
            }
            synchronized (ByteMediaRecorder.this.mRecordingStateLock) {
                ArrayList<IMediaRecorderCallback> arrayList = ByteMediaRecorder.this.mEventListeners;
                if (arrayList != null) {
                    Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onAudioFrameAvailable(bArr, bArr.length, acodec_id, j);
                    }
                }
            }
        }

        @Override // com.byted.cast.capture.audio.AudioRecorder.IAudioRecordFrameCallback
        public void onAudioFrameAvailable(final byte[] bArr, final MediaCodec.BufferInfo bufferInfo, final MediaSetting.ACODEC_ID acodec_id, final long j) {
            ByteMediaRecorder.this.mCallBackThreadHandler.post(new Runnable() { // from class: X.ZZF
                @Override // java.lang.Runnable
                public final void run() {
                    ByteMediaRecorder.AnonymousClass3.this.lambda$onAudioFrameAvailable$2(bArr, bufferInfo, acodec_id, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAudioEncoder$0(String str, int i, int i2, int i3, int i4) {
            synchronized (ByteMediaRecorder.this.mRecordingStateLock) {
                ArrayList<IMediaRecorderCallback> arrayList = ByteMediaRecorder.this.mEventListeners;
                if (arrayList != null) {
                    Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onAudioEncoder(str, i, i2, i3, i4);
                    }
                }
            }
        }

        @Override // com.byted.cast.capture.audio.AudioRecorder.IAudioRecordFrameCallback
        public void onAudioEncoder(final String str, final int i, final int i2, final int i3, final int i4) {
            ByteMediaRecorder.this.mCallBackThreadHandler.post(new Runnable() { // from class: X.ZZG
                @Override // java.lang.Runnable
                public final void run() {
                    ByteMediaRecorder.AnonymousClass3.this.lambda$onAudioEncoder$0(str, i, i2, i3, i4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAudioPcm$3(byte[] bArr, int i, int i2, int i3, int i4, long j) {
            synchronized (ByteMediaRecorder.this.mRecordingStateLock) {
                ArrayList<IMediaRecorderCallback> arrayList = ByteMediaRecorder.this.mEventListeners;
                if (arrayList != null) {
                    Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onAudioPcm(bArr, i, i2, i3, i4, j);
                    }
                }
            }
        }

        @Override // com.byted.cast.capture.audio.AudioRecorder.IAudioRecordFrameCallback
        public void onAudioPcm(final byte[] bArr, final int i, final int i2, final int i3, final int i4, final long j) {
            ByteMediaRecorder.this.mCallBackThreadHandler.post(new Runnable() { // from class: X.ZZE
                @Override // java.lang.Runnable
                public final void run() {
                    ByteMediaRecorder.AnonymousClass3.this.lambda$onAudioPcm$3(bArr, i, i2, i3, i4, j);
                }
            });
        }
    }

    /* loaded from: classes29.dex */
    public static class CallBackThread extends HandlerThread {
        public CallBackThread() {
            super("VideoRecorderManagerThread", -16);
        }
    }

    public static void com_byted_cast_capture_ByteMediaRecorder_android_media_projection_MediaProjection_stop(MediaProjection mediaProjection) {
        if (new C03880Dg(2).LIZJ(102102, "android/media/projection/MediaProjection", "stop", mediaProjection, new Object[0], "void", new C65300Pk0(false, "()V", "-4618100481944940798")).LIZ) {
            return;
        }
        mediaProjection.stop();
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public final /* synthetic */ void setAudioCert(Object obj) {
        C90177ZaH.LJIILLIIL(this, obj);
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public final /* synthetic */ void setAudioStopCert(Object obj) {
        C90177ZaH.LJIJJ(this, obj);
    }

    public boolean doStart() {
        synchronized (this.mRecordingStateLock) {
            if (this.bUseSelfMediaProjection && !this.bProjectionReady.booleanValue()) {
                this.bAutoStart = Boolean.TRUE;
                Logger.w("ByteMediaRecorder", "mActivityResult, mActivityIntent do not bReady!");
                return true;
            }
            this.mStarted = true;
            MediaMonitor.onMonitor("MediaCapture_Start", "");
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.start(this.mMediaProjection);
            }
            AudioRecorder audioRecorder = this.mAudioRecorder;
            if (audioRecorder != null) {
                audioRecorder.start(this.mMediaProjection);
            }
            return true;
        }
    }

    public void doStop() {
        synchronized (this.mRecordingStateLock) {
            if (!this.mStarted) {
                Logger.w("ByteMediaRecorder", "already stopped!");
                return;
            }
            MediaMonitor.onMonitor("MediaCapture_Stop", "");
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.stop();
            }
            AudioRecorder audioRecorder = this.mAudioRecorder;
            if (audioRecorder != null) {
                audioRecorder.stop();
            }
            Boolean bool = Boolean.FALSE;
            this.bAutoStart = bool;
            this.mStarted = false;
            if (this.mSettings.getVideoProfile().getSourceType() == MediaSetting.VIDEO_SOURCE_TYPE.EXTERNAL_SURFACE) {
                this.bProjectionReady = bool;
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public Surface getInputSurface() {
        Logger.i("ByteMediaRecorder", "getInputSurface: ");
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                return videoRecorderManager.getInputSurface();
            }
            return null;
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void insertFrame() {
        Logger.i("ByteMediaRecorder", "insertFrame: ");
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.insertFrame();
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void pause() {
        Logger.i("ByteMediaRecorder", "pause");
        synchronized (this.mRecordingStateLock) {
            MediaMonitor.onMonitor("MediaCapture_Pause", "");
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.pause();
            }
            AudioRecorder audioRecorder = this.mAudioRecorder;
            if (audioRecorder != null) {
                audioRecorder.pause();
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void prepareVideoEncoder() {
        Logger.i("ByteMediaRecorder", "prepareVideoEncoder: ");
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.prepareVideoEncoder();
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void release() {
        Logger.i("ByteMediaRecorder", "release: ");
        synchronized (this.mRecordingStateLock) {
            if (this.mMediaProjection != null && this.bUseSelfMediaProjection) {
                Logger.i("ByteMediaRecorder", "waitting for mVideoRecorderManager stop...");
                VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
                if (videoRecorderManager != null && !videoRecorderManager.isStoped()) {
                    synchronized (VideoRecorderManager.vLockStop) {
                        try {
                            VideoRecorderManager.vLockStop.wait(500L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                Logger.i("ByteMediaRecorder", "mVideoRecorderManager stopped");
                try {
                    com_byted_cast_capture_ByteMediaRecorder_android_media_projection_MediaProjection_stop(this.mMediaProjection);
                    this.mMediaProjection = null;
                    this.bUseSelfMediaProjection = false;
                    this.bProjectionReady = Boolean.FALSE;
                } catch (Exception e2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("mMediaProjection stop ERROR");
                    LIZ.append(e2);
                    Logger.e("ByteMediaRecorder", X1D.LIZIZ(LIZ));
                    this.mMediaProjection = null;
                    this.bUseSelfMediaProjection = false;
                    this.bProjectionReady = Boolean.FALSE;
                }
            }
            if (this.mMediaProjectionManager != null) {
                this.mMediaProjectionManager = null;
            }
            VideoRecorderManager videoRecorderManager2 = this.mVideoRecorderManager;
            if (videoRecorderManager2 != null) {
                videoRecorderManager2.release();
                this.mVideoRecorderManager = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                this.mContext.stopService(new Intent(this.mContext, (Class<?>) ProjectionService.class));
            }
            mMediaRecorder = null;
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void requestIDR() {
        Logger.i("ByteMediaRecorder", "requestIDR: ");
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.requestIDR();
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void requestMediaRecord() {
        Logger.i("ByteMediaRecorder", "requestMediaRecord");
        if (this.bProjectionReady.booleanValue() || this.mSafetyInterface == null) {
            return;
        }
        MediaMonitor.onMonitor("MediaCapture_Request", "");
        this.bUseSelfMediaProjection = true;
        if (!this.bStartProjectionService.booleanValue()) {
            try {
                Intent intent = new Intent(this.mContext, (Class<?>) ProjectionService.class);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.mContext.startForegroundService(intent);
                } else {
                    C16880lQ.LLLL(this.mContext, intent);
                }
                this.bStartProjectionService = Boolean.TRUE;
            } catch (Exception e) {
                this.bStartProjectionService = Boolean.FALSE;
                e.printStackTrace();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startService ProjectionService ERORR ");
                LIZ.append(e);
                Logger.e("ByteMediaRecorder", X1D.LIZIZ(LIZ));
                MediaMonitor.onMonitor("MediaCapture_Error", 100002, "ProjectionService", e.toString());
            }
        }
        PermissionBridgeActivity.activityStart(this.mContext, 1, true);
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void resume() {
        Logger.i("ByteMediaRecorder", "resume");
        synchronized (this.mRecordingStateLock) {
            MediaMonitor.onMonitor("MediaCapture_Resume", "");
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.resume();
            }
            AudioRecorder audioRecorder = this.mAudioRecorder;
            if (audioRecorder != null) {
                audioRecorder.resume();
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public boolean start() {
        Logger.i("ByteMediaRecorder", "start");
        this.reTryCount = 0;
        resume();
        if (this.mStarted) {
            Logger.w("ByteMediaRecorder", "already started!");
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.requestIDR();
                return true;
            }
            return true;
        }
        return doStart();
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void stop() {
        Logger.i("ByteMediaRecorder", "stop");
        resume();
        if (!this.mEventListeners.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mEventListeners not is null, size: ");
            LIZ.append(this.mEventListeners.size());
            Logger.w("ByteMediaRecorder", X1D.LIZIZ(LIZ));
            return;
        }
        doStop();
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void stopSaveRecorder() {
        Logger.i("ByteMediaRecorder", "stopSaveRecorder: ");
        synchronized (this.mRecordingStateLock) {
            MediaMuxerWrapper mediaMuxerWrapper = this.mMediaMuxer;
            if (mediaMuxerWrapper != null) {
                mediaMuxerWrapper.stop();
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void addMediaRecorderCallback(IMediaRecorderCallback iMediaRecorderCallback) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addMediaRecorderCallback: ");
        LIZ.append(iMediaRecorderCallback);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            ArrayList<IMediaRecorderCallback> arrayList = this.mEventListeners;
            if (arrayList != null) {
                Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() == iMediaRecorderCallback) {
                        Logger.w("ByteMediaRecorder", "addMediaRecorderCallback: same listener");
                        return;
                    }
                }
                this.mEventListeners.add(iMediaRecorderCallback);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void changeSurfaceFillType(MediaSetting.FILL_TYPE fill_type) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeSurfaceFillType: ");
        LIZ.append(fill_type);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.changeSurfaceFillType(fill_type);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void enableAudioMix(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableAudioMix: ");
        LIZ.append(z);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            AudioRecorder audioRecorder = this.mAudioRecorder;
            if (audioRecorder != null) {
                audioRecorder.enableAudioMix(z);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void enableSetMaxFps(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableSetMaxFps: ");
        LIZ.append(z);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.enableSetMaxFps(z);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public boolean getPicture(String str) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getPicture: ");
        LIZ.append(str);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                z = videoRecorderManager.getPicture(str);
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void removeMediaRecorderCallback(IMediaRecorderCallback iMediaRecorderCallback) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeMediaRecorderCallback: ");
        LIZ.append(iMediaRecorderCallback);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            ArrayList<IMediaRecorderCallback> arrayList = this.mEventListeners;
            if (arrayList != null) {
                Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                while (it.hasNext()) {
                    IMediaRecorderCallback next = it.next();
                    if (next == iMediaRecorderCallback) {
                        this.mEventListeners.remove(next);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void removeSurface(Surface surface) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeSurface: ");
        LIZ.append(surface);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.removeSurface(surface);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setAudioEnable(boolean z) {
        boolean z2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioEnable: ");
        LIZ.append(z);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("audioEnable:");
        LIZ2.append(z);
        MediaMonitor.onMonitor("MediaCapture_Audio_Enable", X1D.LIZIZ(LIZ2));
        synchronized (this.mRecordingStateLock) {
            AudioRecorder audioRecorder = this.mAudioRecorder;
            if (audioRecorder != null) {
                if (!z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                audioRecorder.mute(z2);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setAudioMixScale(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioMixScale: ");
        LIZ.append(i);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            AudioRecorder audioRecorder = this.mAudioRecorder;
            if (audioRecorder != null) {
                audioRecorder.setAudioMixScale(i);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setAudioSource(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioSource: ");
        LIZ.append(i);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            AudioRecorder audioRecorder = this.mAudioRecorder;
            if (audioRecorder != null) {
                audioRecorder.setAudioSource(i);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setBitrateKps(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setBitrateKps: ");
        LIZ.append(i);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.setBitrateKbps(i);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setCaptureSource(MediaSetting.VIDEO_SOURCE_TYPE video_source_type) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setCaptureSource: ");
        LIZ.append(video_source_type);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("type:");
        LIZ2.append(video_source_type);
        MediaMonitor.onMonitor("MediaCapture_Capture_Source", X1D.LIZIZ(LIZ2));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.setCaptureSource(video_source_type);
            }
        }
    }

    public void setConfig(Config config) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setConfig: ");
        LIZ.append(config);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        MediaMonitor.onMonitor("MediaCapture_Resume", "");
        VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
        if (videoRecorderManager != null) {
            videoRecorderManager.setConfig(config);
        }
        AudioRecorder audioRecorder = this.mAudioRecorder;
        if (audioRecorder != null) {
            audioRecorder.setConfig(config);
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setFlashEnable(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setFlashEnable: ");
        LIZ.append(z);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("flashEnable:");
        LIZ2.append(z);
        MediaMonitor.onMonitor("MediaCapture_Enable_Flash", X1D.LIZIZ(LIZ2));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.setFlashEnable(z);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setInputSurfaceListener(ISurfaceListener iSurfaceListener) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setInputSurfaceListener: ");
        LIZ.append(iSurfaceListener);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.setInputSurfaceListener(iSurfaceListener);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setMediaProjection(MediaProjection mediaProjection) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMediaProjection:");
        LIZ.append(mediaProjection);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        if (mediaProjection != null) {
            this.mMediaProjection = mediaProjection;
            this.bUseSelfMediaProjection = false;
            this.bProjectionReady = Boolean.TRUE;
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setPreviewSurface(Surface surface) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPreviewSurface: ");
        LIZ.append(surface);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.addSurface(surface, MediaSetting.FILL_TYPE.PADDING, true);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setResizeScreen(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setResizeScreen: ");
        LIZ.append(z);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            this.bEnableOrient = Boolean.valueOf(z);
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.setResizeScreen(z);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setSeparateAudio(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSeparateAudio: ");
        LIZ.append(z);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            AudioRecorder audioRecorder = this.mAudioRecorder;
            if (audioRecorder != null) {
                audioRecorder.setSeparateAudio(z);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setVideoCodecID(MediaSetting.VCODEC_ID vcodec_id) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVideoCodecID codecId:");
        LIZ.append(vcodec_id);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.setVideoCodecID(vcodec_id);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setVirtualDisplayFlag(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVirtualDisplayFlag: ");
        LIZ.append(i);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.setVirtualDisplayFlag(i);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setVirtualDisplayName(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVirtualDisplayName: ");
        LIZ.append(str);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.setVirtualDisplayName(str);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void startSaveRecorder(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startSaveRecorder: ");
        LIZ.append(str);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            MediaMuxerWrapper mediaMuxerWrapper = this.mMediaMuxer;
            if (mediaMuxerWrapper != null) {
                mediaMuxerWrapper.start(str);
                this.mVideoRecorderManager.requestIDR();
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void switchCamera(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchCamera: ");
        LIZ.append(str);
        LIZ.append("::");
        LIZ.append(this.mVideoRecorderManager);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("cameraId:");
        LIZ2.append(str);
        MediaMonitor.onMonitor("MediaCapture_Switch_Camera", X1D.LIZIZ(LIZ2));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.switchCamera(str);
            }
        }
    }

    public ByteMediaRecorder(Context context, MediaSetting mediaSetting) {
        Boolean bool = Boolean.FALSE;
        this.bProjectionReady = bool;
        this.bStartProjectionService = bool;
        this.bAutoStart = bool;
        this.bEnableOrient = bool;
        this.mEventListeners = new ArrayList<>();
        this.mRecordingStateLock = new Object();
        this.mSettings = null;
        this.reTryCount = 0;
        this.mVirtualDisplayCallback = new VirtualDisplay.Callback() { // from class: com.byted.cast.capture.ByteMediaRecorder.1
            @Override // android.hardware.display.VirtualDisplay.Callback
            public void onPaused() {
                Logger.w("ByteMediaRecorder", "VirtualDisplayCallback onPaused ");
                synchronized (ByteMediaRecorder.this.mRecordingStateLock) {
                    ArrayList<IMediaRecorderCallback> arrayList = ByteMediaRecorder.this.mEventListeners;
                    if (arrayList != null) {
                        Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().onPaused();
                        }
                    }
                }
            }

            @Override // android.hardware.display.VirtualDisplay.Callback
            public void onResumed() {
                Logger.w("ByteMediaRecorder", "VirtualDisplayCallback onResumed ");
                synchronized (ByteMediaRecorder.this.mRecordingStateLock) {
                    ArrayList<IMediaRecorderCallback> arrayList = ByteMediaRecorder.this.mEventListeners;
                    if (arrayList != null) {
                        Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().onResumed();
                        }
                    }
                }
            }

            @Override // android.hardware.display.VirtualDisplay.Callback
            public void onStopped() {
                Logger.w("ByteMediaRecorder", "VirtualDisplayCallback onStopped ");
                synchronized (ByteMediaRecorder.this.mRecordingStateLock) {
                    ArrayList<IMediaRecorderCallback> arrayList = ByteMediaRecorder.this.mEventListeners;
                    if (arrayList != null) {
                        Iterator<IMediaRecorderCallback> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().onStopped();
                        }
                    }
                }
            }
        };
        this.mVideoFrameCallback = new AnonymousClass2();
        this.mAudioFrameCallback = new AnonymousClass3();
        this.needSetVirtualDisplayWH = true;
        Logger.setLogLevel(4);
        CallBackThread callBackThread = new CallBackThread();
        this.mCallBackThread = callBackThread;
        callBackThread.start();
        this.mCallBackThreadHandler = new HandlerWrapper(new Handler(callBackThread.getLooper()));
        try {
            this.mSafetyInterface = (ISafetyInterface) Class.forName("com.byted.cast.capture.safetyinterface.SafetyInterface").newInstance();
        } catch (Throwable th) {
            this.mSafetyInterface = null;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("create safetyinterface fail : ");
            LIZ.append(th.toString());
            Logger.e("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        }
        init(context, mediaSetting);
        Logger.i("ByteMediaRecorder", "Version:3.10.2.3.overseas-tt");
    }

    public static ByteMediaRecorder getInstance(Context context, MediaSetting mediaSetting) {
        if (mMediaRecorder != null && mediaSetting != null && mediaSetting.getConfig() != null) {
            mMediaRecorder.setConfig(mediaSetting.getConfig());
        }
        if (context == null || mediaSetting == null) {
            return mMediaRecorder;
        }
        if (mMediaRecorder == null) {
            synchronized (ByteMediaRecorder.class) {
                if (mMediaRecorder == null) {
                    mMediaRecorder = new ByteMediaRecorder(context, mediaSetting);
                }
            }
        }
        return mMediaRecorder;
    }

    private void init(Context context, MediaSetting mediaSetting) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaRecoder init ");
        LIZ.append(this.mEventListeners.size());
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        MediaMonitor.onMonitor("MediaCapture_Init", mediaSetting.toString());
        this.mContext = context;
        this.mStarted = false;
        this.mSettings = mediaSetting;
        this.mMediaMuxer = new MediaMuxerWrapper();
        if (!mediaSetting.isExternalScreenSource()) {
            this.mMediaMuxer.addEncoder(MediaMuxerWrapper.VIDEO);
            this.mVideoRecorderManager = new VideoRecorderManager(context, mediaSetting, this.mVideoFrameCallback, this.mVirtualDisplayCallback);
        }
        if (!mediaSetting.isExternalAudioSource()) {
            this.mMediaMuxer.addEncoder(MediaMuxerWrapper.AUDIO);
            this.mAudioRecorder = new AudioRecorder(mediaSetting, this.mAudioFrameCallback);
        }
        MediaMonitor.onMonitor("MediaCapture_Init_Success", "");
    }

    public void requestMediaRecord(Activity activity, int i) {
        Logger.i("ByteMediaRecorder", "requestMediaRecord +");
        Context context = this.mContext;
        if (context == null) {
            MediaMonitor.onMonitor("MediaCapture_Error", 100002, "nullptr", "mContext in null");
            Logger.e("ByteMediaRecorder", "mContext == null !!!");
            return;
        }
        this.mRequestCode = i;
        ISafetyInterface iSafetyInterface = this.mSafetyInterface;
        if (iSafetyInterface != null) {
            MediaProjectionManager mediaProjectionManager = iSafetyInterface.getMediaProjectionManager(context);
            this.mMediaProjectionManager = mediaProjectionManager;
            if (mediaProjectionManager == null) {
                VideoRecorderManager.IVideoCallback iVideoCallback = this.mVideoFrameCallback;
                if (iVideoCallback != null) {
                    iVideoCallback.onVideoRecordError(14004001, "android should be reboot");
                }
                MediaMonitor.onMonitor("MediaCapture_Error", 100002, "getSystemService", "mMediaProjectionManager init ERROR!!!");
                Logger.e("ByteMediaRecorder", "mMediaProjectionManager init ERROR!!!");
                return;
            }
            C16880lQ.LJFF(activity, i, this.mSafetyInterface.createScreenCaptureIntent(mediaProjectionManager));
        } else {
            Logger.e("ByteMediaRecorder", "mSafetyInterface is NULL");
        }
        Logger.i("ByteMediaRecorder", "requestMediaRecord -");
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setVirtualDisplayWH(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVirtualDisplayWH:");
        LIZ.append(i);
        LIZ.append("x");
        LIZ.append(i2);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.setVirtualDisplayWH(i, i2);
                this.needSetVirtualDisplayWH = false;
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void addSurface(Surface surface, MediaSetting.FILL_TYPE fill_type, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addSurface: ");
        LIZ.append(surface);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.addSurface(surface, fill_type, z);
            }
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        Logger.i("ByteMediaRecorder", "onActivityResult +");
        if (i != this.mRequestCode || intent == null) {
            Logger.e("ByteMediaRecorder", "param error, screen recorder init failed!");
            VideoRecorderManager.IVideoCallback iVideoCallback = this.mVideoFrameCallback;
            if (iVideoCallback != null) {
                iVideoCallback.onVideoRecordError(14004001, "requestMediaRecord refuse!!!");
            }
            MediaMonitor.onMonitor("MediaCapture_Error", 100002, "requestCode", "param error");
            return false;
        }
        try {
            ISafetyInterface iSafetyInterface = this.mSafetyInterface;
            if (iSafetyInterface != null) {
                this.mMediaProjection = iSafetyInterface.getMediaProjection(this.mMediaProjectionManager, i2, intent);
                this.bUseSelfMediaProjection = true;
                this.bProjectionReady = Boolean.TRUE;
            }
            if (this.mMediaProjection == null) {
                MediaMonitor.onMonitor("MediaCapture_Error", 100002, "nullptr", "mMediaProjection is null");
                Logger.e("ByteMediaRecorder", "something is wrong, mMediaProjection init failed!");
                return false;
            }
            if (this.bAutoStart.booleanValue()) {
                start();
            }
            MediaMonitor.onMonitor("MediaCapture_Request_Sucess", "");
            Logger.i("ByteMediaRecorder", "onActivityResult -");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            this.mMediaProjection = null;
            this.bUseSelfMediaProjection = false;
            this.bProjectionReady = Boolean.FALSE;
            MediaMonitor.onMonitor("MediaCapture_Error", 100002, "getMediaProjection", e.toString());
            Logger.e("ByteMediaRecorder", "creat Projection ERROR!!!");
            VideoRecorderManager.IVideoCallback iVideoCallback2 = this.mVideoFrameCallback;
            if (iVideoCallback2 != null) {
                iVideoCallback2.onVideoRecordError(14004001, "creat Projection ERROR");
            }
            return false;
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaRecorder
    public void setDisplay(int i, int i2, int i3, int i4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDisplay w:");
        LIZ.append(i);
        LIZ.append(" h:");
        LIZ.append(i2);
        LIZ.append(" b:");
        LIZ.append(i3);
        LIZ.append(" fps:");
        LIZ.append(i4);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        synchronized (this.mRecordingStateLock) {
            VideoRecorderManager videoRecorderManager = this.mVideoRecorderManager;
            if (videoRecorderManager != null) {
                videoRecorderManager.setDisplay(i, i2, i3, i4);
                if (this.needSetVirtualDisplayWH) {
                    this.mVideoRecorderManager.setVirtualDisplayWH(i, i2);
                }
            }
        }
    }
}
