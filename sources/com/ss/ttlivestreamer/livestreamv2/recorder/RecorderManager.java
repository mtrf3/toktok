package com.ss.ttlivestreamer.livestreamv2.recorder;

import X.C0H1;
import X.C0NY;
import X.C25620zW;
import X.JBR;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.capture.video.ScreenVideoCapturer;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.codec.DefaultAudioEncoderFactory;
import com.ss.ttlivestreamer.core.codec.DefaultVideoEncoderFactory;
import com.ss.ttlivestreamer.core.engine.AudioEncoderFactory;
import com.ss.ttlivestreamer.core.engine.AudioTrack;
import com.ss.ttlivestreamer.core.engine.MediaEncodeStream;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.engine.Transport;
import com.ss.ttlivestreamer.core.engine.VideoEncoderFactory;
import com.ss.ttlivestreamer.core.engine.VideoProcessor;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.engine.VideoTrack;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.recorder.MediaRecorder;
import com.ss.ttlivestreamer.core.recorder.NativeMp4Recorder;
import com.ss.ttlivestreamer.core.recorder.SystemMediaRecorder;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;
import com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class RecorderManager implements IRecorderManager, VideoCapturer.VideoCapturerObserver, MediaEncodeStream.Observer, Transport.EventObserver {
    public final int STAT_ERROR;
    public final int STAT_RELEASE;
    public final int STAT_START;
    public final int STAT_STOP;
    public AudioEncoderFactory mAudioEncoderFactory;
    public int mAudioRecordIdx;
    public AudioTrack mAudioTrack;
    public List<AudioTrack> mAudioTrackList;
    public IRecorderManager.Config mConfig;
    public boolean mEnableAccelera;
    public TEBundle mEncodeOpt;
    public Transport mEncodeStreamCallback;
    public IRecorderManager mExternRecordMgr;
    public String mFile;
    public Handler mGLHandler;
    public GLThread mGLThread;
    public IRecorderManager.IRecorderListener mListener;
    public MediaEncodeStream mMediaEncodeStream;
    public MediaEngineFactory mMediaEngineFactory;
    public ArrayList<Transport.MediaPacket> mMediaPacketsCache;
    public int mMode;
    public long mReceiveAudioFrameCounts;
    public long mReceiveVideoFrameCounts;
    public SafeHandlerThread mRecordThread;
    public MediaRecorder mRecorder;
    public Context mScreenContext;
    public Intent mScreenIntent;
    public AudioCapturer mSharedAudioCapture;
    public RecordVideoSink mSharedCaptureSink;
    public VideoCapturer mSharedVideoCapture;
    public AtomicInteger mState;
    public SurfaceTextureSharedHandler mSurfaceTextureSharedHandler;
    public VideoCapturer mVideoCapturer;
    public VideoEncoderFactory mVideoEncoderFactory;
    public int mVideoRecordIdx;
    public VideoTrack mVideoTrack;
    public WaterMarkProcess mWaterMarkProcess;
    public long mWriteAudioFrameCounts;
    public long mWriteVideoFrameCounts;

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureInfo(int i, int i2, int i3, String str) {
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureStarted() {
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureStopped() {
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, float[] fArr, long j) {
        return -1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
    public synchronized void release() {
        stop();
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (safeHandlerThread != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread);
            this.mRecordThread = null;
        }
        this.mMediaEngineFactory = null;
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(gLThread);
            this.mGLThread = null;
        }
        RecordVideoSink recordVideoSink = this.mSharedCaptureSink;
        if (recordVideoSink != null) {
            recordVideoSink.release();
            this.mSharedCaptureSink = null;
        }
        this.mScreenContext = null;
        this.mState.set(4);
    }

    private void onCreateEncodeStream() {
        if (this.mMediaEncodeStream == null) {
            this.mVideoEncoderFactory = new DefaultVideoEncoderFactory();
            this.mAudioEncoderFactory = new DefaultAudioEncoderFactory();
            Object obj = this.mRecorder;
            if (obj instanceof Transport) {
                this.mEncodeStreamCallback = (Transport) obj;
            } else {
                this.mEncodeStreamCallback = new EncodeStreamCallback();
            }
            MediaEncodeStream createMediaEncodeStream = this.mMediaEngineFactory.createMediaEncodeStream(this.mVideoEncoderFactory, this.mAudioEncoderFactory, this.mEncodeStreamCallback);
            this.mMediaEncodeStream = createMediaEncodeStream;
            createMediaEncodeStream.registerObserver(this);
            this.mMediaEncodeStream.stop();
        }
    }

    private void onDestroyTrack() {
        AudioTrack audioTrack;
        VideoTrack videoTrack;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.stop();
        }
        RecordVideoSink recordVideoSink = this.mSharedCaptureSink;
        if (recordVideoSink != null) {
            recordVideoSink.stop();
        }
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            videoCapturer.stop();
        }
        MediaEncodeStream mediaEncodeStream2 = this.mMediaEncodeStream;
        if (mediaEncodeStream2 != null && (videoTrack = this.mVideoTrack) != null) {
            mediaEncodeStream2.removeTrack(videoTrack);
        }
        MediaEncodeStream mediaEncodeStream3 = this.mMediaEncodeStream;
        if (mediaEncodeStream3 != null && (audioTrack = this.mAudioTrack) != null) {
            mediaEncodeStream3.removeTrack(audioTrack);
            Iterator<AudioTrack> it = this.mAudioTrackList.iterator();
            while (it.hasNext()) {
                this.mMediaEncodeStream.removeTrack(it.next());
            }
        }
        MediaEncodeStream mediaEncodeStream4 = this.mMediaEncodeStream;
        if (mediaEncodeStream4 != null) {
            mediaEncodeStream4.release();
            this.mMediaEncodeStream = null;
        }
        VideoTrack videoTrack2 = this.mVideoTrack;
        if (videoTrack2 != null) {
            videoTrack2.release();
            this.mVideoTrack = null;
        }
        AudioTrack audioTrack2 = this.mAudioTrack;
        if (audioTrack2 != null) {
            audioTrack2.release();
            this.mAudioTrack = null;
        }
        VideoCapturer videoCapturer2 = this.mVideoCapturer;
        if (videoCapturer2 != null) {
            videoCapturer2.release();
            this.mVideoCapturer = null;
        }
        SurfaceTextureSharedHandler surfaceTextureSharedHandler = this.mSurfaceTextureSharedHandler;
        if (surfaceTextureSharedHandler != null) {
            surfaceTextureSharedHandler.dispose();
            this.mSurfaceTextureSharedHandler = null;
        }
        VideoEncoderFactory videoEncoderFactory = this.mVideoEncoderFactory;
        if (videoEncoderFactory != null) {
            videoEncoderFactory.release();
            this.mVideoEncoderFactory = null;
        }
        AudioEncoderFactory audioEncoderFactory = this.mAudioEncoderFactory;
        if (audioEncoderFactory != null) {
            audioEncoderFactory.release();
            this.mAudioEncoderFactory = null;
        }
        Transport transport = this.mEncodeStreamCallback;
        if (transport != null) {
            if (!(transport instanceof MediaRecorder)) {
                transport.release();
            }
            this.mEncodeStreamCallback = null;
        }
    }

    private void onStartAudio() {
        if (this.mConfig.haveAudio) {
            if (this.mSharedAudioCapture == null) {
                this.mState.set(3);
                this.mListener.onRecorderError(-4, new Exception("Not found shared audio capture."));
                return;
            }
            onCreateAudioTrack();
        }
        AudioCapturer audioCapturer = this.mSharedAudioCapture;
        if (audioCapturer != null) {
            audioCapturer.resume();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("encoderStream cfg:");
        LIZ.append(this.mEncodeOpt.toString());
        AVLog.iod("RecorderManager", X1D.LIZIZ(LIZ));
    }

    private void onStartCamera() {
        boolean z;
        if (this.mConfig.havaVideo) {
            if (this.mSharedVideoCapture == null) {
                this.mSharedVideoCapture = this.mSharedCaptureSink;
                z = true;
            } else {
                z = false;
            }
            onCreateVideoTrack();
            if (z) {
                RecordVideoSink recordVideoSink = this.mSharedCaptureSink;
                IRecorderManager.Config config = this.mConfig;
                recordVideoSink.start(config.videoWidth, config.videoHeight, config.videoFps);
            }
        }
        onStartAudio();
    }

    private void onStartRecorder() {
        int start;
        IRecorderManager.Config config = this.mConfig;
        if (!config.havaVideo) {
            if (!config.haveAudio) {
                return;
            }
        } else if (this.mVideoRecordIdx < 0) {
            return;
        }
        if ((config.haveAudio && this.mAudioRecordIdx < 0) || (start = this.mRecorder.start()) >= 0) {
            return;
        }
        this.mState.set(3);
        this.mListener.onRecorderError(-7, new Exception(C0NY.LIZIZ("Start recorder error (", start, ")")));
    }

    private void onStartScreen() {
        if (this.mConfig.havaVideo) {
            ScreenSourceWrapper screenSourceWrapper = new ScreenSourceWrapper(this.mScreenIntent, this);
            if (this.mGLHandler == null) {
                GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("RecorderProcessThread");
                this.mGLThread = lockGLThread;
                lockGLThread.start();
                this.mGLHandler = this.mGLThread.getHandler();
            }
            ThreadUtils.invokeAtFrontUninterruptibly(this.mGLHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.recorder.RecorderManager.6
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$6__run$___twin___() {
                    RecorderManager recorderManager = RecorderManager.this;
                    recorderManager.mSurfaceTextureSharedHandler = new SurfaceTextureSharedHandler(recorderManager.mGLHandler);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                    boolean LIZ;
                    try {
                        anonymousClass6.com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$6__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            screenSourceWrapper.initialize(this.mSurfaceTextureSharedHandler, this.mScreenContext);
            IRecorderManager.Config config = this.mConfig;
            screenSourceWrapper.setOutputFormat(config.videoWidth, config.videoHeight, config.videoFps);
            this.mVideoCapturer = screenSourceWrapper;
            onCreateVideoTrack();
        }
        onStartAudio();
        if (this.mVideoCapturer != null && this.mState.get() != 3) {
            VideoCapturer videoCapturer = this.mVideoCapturer;
            IRecorderManager.Config config2 = this.mConfig;
            videoCapturer.start(config2.videoWidth, config2.videoHeight, config2.videoFps);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
    public IRecorderManager.Config getConfig() {
        return this.mConfig.dump();
    }

    public VideoSink getSharedSink() {
        RecordVideoSink recordVideoSink = this.mSharedCaptureSink;
        if (recordVideoSink != null) {
            return recordVideoSink.getVideoSink();
        }
        return null;
    }

    public void onClearCache() {
        while (!this.mMediaPacketsCache.isEmpty()) {
            onWriteFile((Transport.MediaPacket) ListProtector.remove(this.mMediaPacketsCache, 0));
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
    public void stop() {
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (this.mState.get() != 4 && safeHandlerThread != null) {
            safeHandlerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.recorder.RecorderManager.7
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$7__run$___twin___() {
                    RecorderManager recorderManager = RecorderManager.this;
                    IRecorderManager iRecorderManager = recorderManager.mExternRecordMgr;
                    if (iRecorderManager != null && recorderManager.mMode == 2) {
                        iRecorderManager.stop();
                    } else {
                        recorderManager.onStop();
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                    boolean LIZ;
                    try {
                        anonymousClass7.com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$7__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    private void onCreateAudioTrack() {
        onCreateEncodeStream();
        this.mAudioTrack = this.mMediaEngineFactory.createAudioTrack(this.mSharedAudioCapture);
        if (this.mEncodeOpt == null) {
            this.mEncodeOpt = this.mMediaEncodeStream.getParameter();
        }
        this.mEncodeOpt.setString("audio_type", "audio/faac");
        this.mEncodeOpt.setInt("audio_sample", this.mConfig.audioSample);
        this.mEncodeOpt.setInt("audio_channels", this.mConfig.audioChannel);
        this.mEncodeOpt.setLong("audio_bit_rate", this.mConfig.audioBitrate);
        this.mMediaEncodeStream.setParameter(this.mEncodeOpt);
        this.mMediaEncodeStream.addTrack(this.mAudioTrack);
        this.mMediaEncodeStream.getAudioMixer().setEnable(true);
        this.mMediaEncodeStream.setOriginAudioTrack(this.mAudioTrack.id());
        this.mMediaEncodeStream.setAudioMixerDescription(this.mAudioTrack.id(), new AudioMixer.AudioMixerDescription());
        for (AudioTrack audioTrack : this.mAudioTrackList) {
            this.mMediaEncodeStream.addTrack(audioTrack);
            this.mMediaEncodeStream.setAudioMixerDescription(audioTrack.id(), new AudioMixer.AudioMixerDescription());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" add audio track to encode stream ");
            LIZ.append(audioTrack.id());
            AVLog.iod("RecorderManager", X1D.LIZIZ(LIZ));
        }
    }

    private void onCreateVideoTrack() {
        String str;
        onCreateEncodeStream();
        MediaEngineFactory mediaEngineFactory = this.mMediaEngineFactory;
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer == null) {
            videoCapturer = this.mSharedVideoCapture;
        }
        VideoTrack createVideoTrack = mediaEngineFactory.createVideoTrack(videoCapturer);
        this.mVideoTrack = createVideoTrack;
        WaterMarkProcess waterMarkProcess = this.mWaterMarkProcess;
        if (waterMarkProcess != null) {
            createVideoTrack.setVideoProcessor(waterMarkProcess);
        }
        if (this.mEncodeOpt == null) {
            this.mEncodeOpt = this.mMediaEncodeStream.getParameter();
        }
        if (this.mEnableAccelera) {
            str = "video/avc";
        } else {
            str = "video/bytevc0";
        }
        this.mEncodeOpt.setString("video_type", str);
        this.mEncodeOpt.setBool("video_enable_accelera", this.mEnableAccelera);
        this.mEncodeOpt.setInt("video_width", this.mConfig.videoWidth);
        this.mEncodeOpt.setInt("video_height", this.mConfig.videoHeight);
        this.mEncodeOpt.setLong("video_bitrate", this.mConfig.videoBitrate);
        this.mEncodeOpt.setInt("video_fps", this.mConfig.videoFps);
        this.mEncodeOpt.setBool("enableBFrame", false);
        this.mEncodeOpt.setInt("configuration_type", 1);
        if (this.mConfig.videoProfileHigh) {
            this.mEncodeOpt.setInt("video_profileLevel", 3);
        } else {
            this.mEncodeOpt.setInt("video_profileLevel", 1);
        }
        if (this.mEnableAccelera) {
            this.mEncodeOpt.setInt("video_profileLevel", 1);
        }
        this.mMediaEncodeStream.setParameter(this.mEncodeOpt);
        this.mMediaEncodeStream.addTrack(this.mVideoTrack);
    }

    public void onStop() {
        int i;
        String str;
        onDestroyTrack();
        int i2 = this.mState.get();
        this.mState.set(2);
        MediaRecorder mediaRecorder = this.mRecorder;
        if (mediaRecorder != null) {
            i = mediaRecorder.stop();
            this.mRecorder.release();
            this.mRecorder = null;
        } else {
            i = -1;
        }
        this.mVideoRecordIdx = -1;
        this.mAudioRecordIdx = -1;
        this.mWriteAudioFrameCounts = 0L;
        this.mWriteVideoFrameCounts = 0L;
        this.mReceiveAudioFrameCounts = 0L;
        this.mReceiveVideoFrameCounts = 0L;
        this.mMediaPacketsCache.clear();
        IRecorderManager.IRecorderListener iRecorderListener = this.mListener;
        if (iRecorderListener != null) {
            if (i >= 0 && i2 != 3) {
                str = this.mFile;
            } else {
                str = "";
            }
            iRecorderListener.onRecorderStoped(str);
        }
    }

    public IRecorderManager getExternRecordMgr() {
        return this.mExternRecordMgr;
    }

    /* loaded from: classes12.dex */
    public class EncodeStreamCallback extends Transport {
        @Override // com.ss.ttlivestreamer.core.engine.Transport
        public void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        }

        @Override // com.ss.ttlivestreamer.core.engine.Transport
        public void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        }

        public EncodeStreamCallback() {
        }

        @Override // com.ss.ttlivestreamer.core.engine.Transport
        public void sendPacket(Transport.MediaPacket mediaPacket) {
            if (mediaPacket.isVideo) {
                RecorderManager.this.mReceiveVideoFrameCounts++;
            } else {
                RecorderManager.this.mReceiveAudioFrameCounts++;
            }
            RecorderManager.this.receiverPacket(mediaPacket);
        }
    }

    /* loaded from: classes12.dex */
    public class WaterMarkProcess extends VideoProcessor implements SurfaceTexture.OnFrameAvailableListener {
        public Handler mHandler;
        public Surface mSurface;
        public SurfaceTexture mSurfaceTexture;
        public int mTex = GlUtil.generateTexture(36197);
        public boolean mUpdateFrame;

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public synchronized void release() {
            this.mSurface.release();
            this.mSurfaceTexture.release();
            GLES20.glDeleteTextures(1, new int[]{this.mTex}, 0);
            super.release();
        }

        public Canvas lock(Rect rect) {
            return this.mSurface.lockCanvas(rect);
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            this.mUpdateFrame = true;
        }

        @Override // com.ss.ttlivestreamer.core.engine.VideoProcessor
        public VideoFrame process(VideoFrame videoFrame) {
            if (this.mUpdateFrame) {
                this.mUpdateFrame = false;
            }
            return videoFrame;
        }

        public void unlockAndPost(Canvas canvas) {
            this.mSurface.unlockCanvasAndPost(canvas);
        }

        public WaterMarkProcess(Handler handler) {
            this.mHandler = handler;
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.mTex);
            this.mSurfaceTexture = surfaceTexture;
            IRecorderManager.Config config = RecorderManager.this.mConfig;
            surfaceTexture.setDefaultBufferSize(config.videoWidth, config.videoHeight);
            this.mSurfaceTexture.setOnFrameAvailableListener(this, this.mHandler);
            this.mSurface = new Surface(this.mSurfaceTexture);
        }
    }

    private Transport.MediaPacket copyPacket(Transport.MediaPacket mediaPacket) {
        Transport.MediaPacket mediaPacket2 = new Transport.MediaPacket();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaPacket.size);
        mediaPacket.buffer.position(mediaPacket.offset);
        mediaPacket.buffer.limit(mediaPacket.size);
        allocateDirect.put(mediaPacket.buffer);
        mediaPacket2.set(allocateDirect, mediaPacket.isVideo, 0, mediaPacket.size, mediaPacket.presentationTimeUs, mediaPacket.flags);
        return mediaPacket2;
    }

    private int findNextNal(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int position2 = byteBuffer.position();
        if (byteBuffer.get(position2) == 0 && byteBuffer.get(position2 + 1) == 0 && byteBuffer.get(position2 + 2) == 0 && byteBuffer.get(position2 + 3) == 1) {
            position2 += 4;
            i = 4;
        } else if (byteBuffer.get(position2) == 0 && byteBuffer.get(position2 + 1) == 0 && byteBuffer.get(position2 + 2) == 1) {
            position2 += 3;
            i = 3;
        } else {
            i = 0;
        }
        int i2 = -1;
        while (i + position < byteBuffer.capacity() - 3) {
            byte b = byteBuffer.get(position2);
            position2++;
            i2 = (i2 << 8) | b;
            i++;
            if (i2 == 1) {
                return i - 4;
            }
            if ((16777215 & i2) == 1) {
                return i - 3;
            }
        }
        return 0;
    }

    private boolean onUpdateConfig(IRecorderManager.Config config) {
        if (config.havaVideo && (config.videoFps < 1 || config.videoWidth < 1 || config.videoHeight < 1 || config.videoBitrate < 1)) {
            this.mListener.onRecorderError(-2, new IllegalArgumentException("video parameter invalid."));
            return false;
        }
        if (config.haveAudio && (config.audioBitrate < 1 || config.audioSample < 1 || config.audioChannel < 0)) {
            this.mListener.onRecorderError(-3, new IllegalArgumentException("Audio parameter invalid"));
            return false;
        }
        this.mConfig = config;
        if (config.isAlign16) {
            config.videoHeight = align(config.videoHeight, 16);
            IRecorderManager.Config config2 = this.mConfig;
            config2.videoWidth = align(config2.videoWidth, 16);
        }
        return true;
    }

    private void setupParameter(LiveStreamBuilder liveStreamBuilder) {
        boolean z;
        IRecorderManager.Config config = new IRecorderManager.Config();
        this.mConfig = config;
        config.videoBitrate = liveStreamBuilder.getVideoBitrate();
        this.mConfig.videoFps = liveStreamBuilder.getVideoFps();
        this.mConfig.videoHeight = liveStreamBuilder.getVideoHeight();
        this.mConfig.videoWidth = liveStreamBuilder.getVideoWidth();
        IRecorderManager.Config config2 = this.mConfig;
        if (liveStreamBuilder.getVideoProfile() == 3) {
            z = true;
        } else {
            z = false;
        }
        config2.videoProfileHigh = z;
        this.mConfig.audioBitrate = liveStreamBuilder.getAudioBitrate();
        this.mConfig.audioChannel = liveStreamBuilder.getAudioChannel();
        this.mConfig.audioSample = liveStreamBuilder.getAudioSampleHZ();
        this.mScreenIntent = liveStreamBuilder.getScreenCaptureIntent();
        this.mScreenContext = liveStreamBuilder.getContext();
        this.mEnableAccelera = liveStreamBuilder.isEnableVideoEncodeAccelera();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
    public void addAudioTrack(final AudioTrack audioTrack) {
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (safeHandlerThread != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(safeHandlerThread.getHandler(), new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.recorder.RecorderManager.8
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$8__run$___twin___() {
                    if (audioTrack != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("add tract ");
                        LIZ.append(audioTrack.id());
                        AVLog.iod("RecorderManager", X1D.LIZIZ(LIZ));
                        MediaEncodeStream mediaEncodeStream = RecorderManager.this.mMediaEncodeStream;
                        if (mediaEncodeStream != null) {
                            mediaEncodeStream.addTrack(audioTrack);
                        }
                        RecorderManager.this.mAudioTrackList.remove(audioTrack);
                        RecorderManager.this.mAudioTrackList.add(audioTrack);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                    boolean LIZ;
                    try {
                        anonymousClass8.com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$8__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
    public Canvas lock(Rect rect) {
        WaterMarkProcess waterMarkProcess = this.mWaterMarkProcess;
        if (waterMarkProcess != null) {
            return waterMarkProcess.lock(rect);
        }
        return null;
    }

    public void onWriteCache(Transport.MediaPacket mediaPacket) {
        this.mMediaPacketsCache.add(mediaPacket);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onWriteFile(com.ss.ttlivestreamer.core.engine.Transport.MediaPacket r8) {
        /*
            r7 = this;
            android.media.MediaCodec$BufferInfo r6 = new android.media.MediaCodec$BufferInfo
            r6.<init>()
            int r3 = r8.flags
            r0 = r3 & 1
            r2 = 0
            if (r0 == 0) goto Lbe
            r1 = 2
        Ld:
            r6.flags = r1
            r0 = r3 & 2
            if (r0 == 0) goto L14
            r2 = 1
        L14:
            r1 = r1 | r2
            r6.flags = r1
            long r0 = r8.presentationTimeUs
            r6.presentationTimeUs = r0
            int r0 = r8.offset
            r6.offset = r0
            int r0 = r8.size
            r6.size = r0
            boolean r0 = r8.isVideo
            r4 = 1
            if (r0 == 0) goto L3f
            int r3 = r7.mVideoRecordIdx
            if (r3 < 0) goto L52
            com.ss.ttlivestreamer.core.recorder.MediaRecorder r2 = r7.mRecorder
            if (r2 == 0) goto L52
            long r0 = r7.mWriteVideoFrameCounts
            long r0 = r0 + r4
            r7.mWriteVideoFrameCounts = r0
            java.nio.ByteBuffer r0 = r8.buffer
            r2.writeSampleData(r3, r0, r6)
        L3b:
            r0 = 0
            r8.buffer = r0
            return
        L3f:
            int r3 = r7.mAudioRecordIdx
            if (r3 < 0) goto L52
            com.ss.ttlivestreamer.core.recorder.MediaRecorder r2 = r7.mRecorder
            if (r2 == 0) goto L52
            long r0 = r7.mWriteAudioFrameCounts
            long r0 = r0 + r4
            r7.mWriteAudioFrameCounts = r0
            java.nio.ByteBuffer r0 = r8.buffer
            r2.writeSampleData(r3, r0, r6)
            goto L3b
        L52:
            java.lang.StringBuilder r4 = X.X1D.LIZ()
            java.lang.String r0 = "Maybe we are receiver a "
            r4.append(r0)
            boolean r0 = r8.isVideo
            if (r0 == 0) goto Lbb
            java.lang.String r0 = "video"
        L62:
            r4.append(r0)
            java.lang.String r0 = "frame and size "
            r4.append(r0)
            int r0 = r8.size
            r4.append(r0)
            java.lang.String r0 = ", but the recorder no config it or have a internal error (statue:"
            r4.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r7.mState
            r4.append(r0)
            java.lang.String r0 = ",v/a:"
            r4.append(r0)
            com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager$Config r0 = r7.mConfig
            boolean r0 = r0.havaVideo
            java.lang.String r3 = "y"
            java.lang.String r2 = "n"
            if (r0 == 0) goto Lb9
            r0 = r3
        L8a:
            r4.append(r0)
            java.lang.String r1 = "/"
            r4.append(r1)
            com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager$Config r0 = r7.mConfig
            boolean r0 = r0.haveAudio
            if (r0 == 0) goto Lb7
        L98:
            r4.append(r3)
            java.lang.String r0 = ",idx v/a:"
            r4.append(r0)
            int r0 = r7.mVideoRecordIdx
            r4.append(r0)
            r4.append(r1)
            int r0 = r7.mAudioRecordIdx
            r4.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r4)
            java.lang.String r0 = "RecorderManager"
            com.ss.ttlivestreamer.core.utils.AVLog.w(r0, r1)
            goto L3b
        Lb7:
            r3 = r2
            goto L98
        Lb9:
            r0 = r2
            goto L8a
        Lbb:
            java.lang.String r0 = "audio"
            goto L62
        Lbe:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.recorder.RecorderManager.onWriteFile(com.ss.ttlivestreamer.core.engine.Transport$MediaPacket):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        if (r10.mAudioRecordIdx < 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void receiverPacket(com.ss.ttlivestreamer.core.engine.Transport.MediaPacket r11) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.recorder.RecorderManager.receiverPacket(com.ss.ttlivestreamer.core.engine.Transport$MediaPacket):void");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
    public void removeAudioTrack(final AudioTrack audioTrack) {
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (safeHandlerThread != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(safeHandlerThread.getHandler(), new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.recorder.RecorderManager.9
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$9__run$___twin___() {
                    if (audioTrack != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("remove tract ");
                        LIZ.append(audioTrack.id());
                        AVLog.iod("RecorderManager", X1D.LIZIZ(LIZ));
                        MediaEncodeStream mediaEncodeStream = RecorderManager.this.mMediaEncodeStream;
                        if (mediaEncodeStream != null) {
                            mediaEncodeStream.removeTrack(audioTrack);
                        }
                        RecorderManager.this.mAudioTrackList.remove(audioTrack);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                    boolean LIZ;
                    try {
                        anonymousClass9.com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$9__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
    public void setupAudioSource(AudioCapturer audioCapturer) {
        this.mSharedAudioCapture = audioCapturer;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
    public void setupVideoSource(VideoCapturer videoCapturer) {
        this.mSharedVideoCapture = videoCapturer;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
    public void unlockAndPost(Canvas canvas) {
        WaterMarkProcess waterMarkProcess = this.mWaterMarkProcess;
        if (waterMarkProcess != null) {
            waterMarkProcess.unlockAndPost(canvas);
        }
    }

    /* loaded from: classes12.dex */
    public class SurfaceTextureSharedHandler extends SurfaceTextureHelper {
        @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper
        public void handlerExit() {
        }

        public SurfaceTextureSharedHandler(Handler handler) {
            super(handler);
        }
    }

    public RecorderManager(LiveStreamBuilder liveStreamBuilder, MediaEngineFactory mediaEngineFactory) {
        this(liveStreamBuilder, mediaEngineFactory, null);
    }

    private int align(int i, int i2) {
        if (i2 <= 0) {
            return i;
        }
        return (((i + i2) - 1) / i2) * i2;
    }

    public static IRecorderManager create(LiveStreamBuilder liveStreamBuilder, MediaEngineFactory mediaEngineFactory) {
        return new RecorderManager(liveStreamBuilder, mediaEngineFactory, null);
    }

    private void createRecordAudioTrack(Transport.MediaPacket mediaPacket, boolean z) {
        IRecorderManager.Config config = this.mConfig;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", config.audioSample, config.audioChannel);
        mediaPacket.buffer.position(mediaPacket.offset);
        mediaPacket.buffer.limit(mediaPacket.size);
        createAudioFormat.setByteBuffer("csd-0", mediaPacket.buffer);
        this.mAudioRecordIdx = this.mRecorder.addTrack(createAudioFormat);
        onStartRecorder();
    }

    private void createRecordVideoTrack(Transport.MediaPacket mediaPacket, boolean z) {
        int i;
        mediaPacket.buffer.position(mediaPacket.offset);
        mediaPacket.buffer.limit(mediaPacket.size);
        ByteBuffer slice = mediaPacket.buffer.slice();
        IRecorderManager.Config config = this.mConfig;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", config.videoWidth, config.videoHeight);
        slice.position(0);
        slice.position(0);
        int findNextNal = findNextNal(slice);
        if (findNextNal > 0 && findNextNal < slice.capacity()) {
            slice.position(findNextNal);
            int findNextNal2 = findNextNal(slice);
            if (findNextNal2 <= 0) {
                if (slice.capacity() < 50) {
                    i = slice.limit();
                } else {
                    AVLog.w("RecorderManager", "Not found spspps");
                    return;
                }
            } else {
                i = findNextNal2 + findNextNal;
            }
            if (findNextNal >= 1 && i >= 1) {
                slice.position(0);
                slice.limit(findNextNal);
                ByteBuffer slice2 = slice.slice();
                slice.limit(i);
                slice.position(findNextNal);
                ByteBuffer slice3 = slice.slice();
                createVideoFormat.setByteBuffer("csd-0", slice2);
                createVideoFormat.setByteBuffer("csd-1", slice3);
                createVideoFormat.setInteger("color-format", 19);
                this.mVideoRecordIdx = this.mRecorder.addTrack(createVideoFormat);
                onStartRecorder();
                return;
            }
        }
        AVLog.w("RecorderManager", "Not found spspps on recorder.");
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureError(final int i, final Exception exc) {
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (safeHandlerThread != null) {
            safeHandlerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.recorder.RecorderManager.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$1__run$___twin___() {
                    RecorderManager.this.mState.set(3);
                    RecorderManager.this.mListener.onRecorderError(i, exc);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes12.dex */
    public class ScreenSourceWrapper extends ScreenVideoCapturer {
        public long mBaseTime;
        public long mLastTime;

        public ScreenSourceWrapper(Intent intent, VideoCapturer.VideoCapturerObserver videoCapturerObserver) {
            super(intent, videoCapturerObserver);
        }

        public void setOutputFormat(int i, int i2, int i3) {
            nativeAdaptedOutputFormat(i, i2, i3);
        }

        @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
        public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
            if (this.mLastTime == 0) {
                this.mLastTime = j;
            }
            if (this.mBaseTime == 0) {
                this.mBaseTime = TimeUtils.nativeNanoTime() / 1000;
                long guessFrameTimestampDiffUs = LiveStreamVideoCapture.guessFrameTimestampDiffUs(j);
                if (guessFrameTimestampDiffUs > 0) {
                    this.mBaseTime -= guessFrameTimestampDiffUs;
                }
            }
            long j2 = (j - this.mLastTime) + this.mBaseTime;
            this.mBaseTime = j2;
            this.mLastTime = j;
            return super.onFrame(buffer, i, i2, i3, j2);
        }
    }

    public RecorderManager(LiveStreamBuilder liveStreamBuilder, MediaEngineFactory mediaEngineFactory, IRecorderManager iRecorderManager) {
        this.STAT_START = 1;
        this.STAT_STOP = 2;
        this.STAT_ERROR = 3;
        this.STAT_RELEASE = 4;
        this.mAudioRecordIdx = -1;
        this.mVideoRecordIdx = -1;
        this.mAudioTrackList = new ArrayList();
        this.mMediaEngineFactory = mediaEngineFactory;
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("RecorderThread");
        this.mRecordThread = lockThread;
        lockThread.start();
        this.mState = new AtomicInteger(2);
        this.mMediaPacketsCache = new ArrayList<>();
        this.mSharedCaptureSink = new RecordVideoSink();
        if (liveStreamBuilder != null) {
            setupParameter(liveStreamBuilder);
        } else {
            this.mConfig = new IRecorderManager.Config();
        }
        this.mExternRecordMgr = iRecorderManager;
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaEncodeStream.Observer
    public void onMediaEncodeStreamEvent(final int i, int i2, long j, String str) {
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (safeHandlerThread != null) {
            safeHandlerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.recorder.RecorderManager.2
                public void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$2__run$___twin___() {
                    if (2 == i) {
                        boolean bool = RecorderManager.this.mEncodeOpt.getBool("video_enable_accelera");
                        String string = RecorderManager.this.mEncodeOpt.getString("video_type");
                        if (bool || !string.equalsIgnoreCase("video/bytevc0")) {
                            RecorderManager.this.mEncodeOpt.setString("video_type", "video/bytevc0");
                            RecorderManager.this.mEncodeOpt.setBool("video_enable_accelera", false);
                            RecorderManager recorderManager = RecorderManager.this;
                            MediaEncodeStream mediaEncodeStream = recorderManager.mMediaEncodeStream;
                            if (mediaEncodeStream != null) {
                                mediaEncodeStream.setParameter(recorderManager.mEncodeOpt);
                            }
                            AVLog.d("RecorderManager", "Update recorder encoder to soft.");
                            return;
                        }
                        RecorderManager.this.mState.set(3);
                        IRecorderManager.IRecorderListener iRecorderListener = RecorderManager.this.mListener;
                        StringBuilder LIZIZ = C25620zW.LIZIZ("Not found video encoder (", string, "/");
                        iRecorderListener.onRecorderError(-1, new Exception(JBR.LJFF(LIZIZ, "w", ")", LIZIZ)));
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public void onStart(String str, IRecorderManager.IRecorderListener iRecorderListener, IRecorderManager.Config config, int i) {
        if (this.mState.get() == 1) {
            iRecorderListener.onRecorderError(-1, new IllegalStateException("Already start"));
        }
        if (this.mState.get() == 3) {
            iRecorderListener.onRecorderError(-1, new IllegalStateException("Error status call and no stop."));
            return;
        }
        this.mListener = iRecorderListener;
        if (onUpdateConfig(config)) {
            this.mFile = str;
            this.mMode = i;
            IRecorderManager.Config config2 = this.mConfig;
            if (config2.useMediaMuxer) {
                this.mRecorder = new SystemMediaRecorder(str, 0);
            } else {
                NativeMp4Recorder nativeMp4Recorder = new NativeMp4Recorder(config2.havaVideo, config2.haveAudio);
                nativeMp4Recorder.setEventObserver(this);
                TEBundle parameter = nativeMp4Recorder.getParameter();
                parameter.dump();
                parameter.setInt("mp4_video_height", this.mConfig.videoHeight);
                parameter.setInt("mp4_video_width", this.mConfig.videoWidth);
                parameter.setInt("mp4_fps", this.mConfig.videoFps);
                parameter.setBool("mp4_enable_BFrame", false);
                parameter.setString("mp4_file_name", this.mFile);
                parameter.dump();
                nativeMp4Recorder.setParameter(parameter);
                this.mRecorder = nativeMp4Recorder;
                nativeMp4Recorder.start();
            }
            if (this.mRecorder == null) {
                this.mState.set(3);
                iRecorderListener.onRecorderError(-6, new UnsupportedOperationException("Not found MediaRecorder"));
                return;
            }
            if (this.mMode == 1) {
                onStartScreen();
            } else {
                onStartCamera();
            }
            if (this.mState.get() != 3) {
                this.mState.set(1);
                this.mMediaEncodeStream.start();
                this.mListener.onRecorderStarted();
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport.EventObserver
    public void onTransportEvent(final int i, final int i2, final long j, String str) {
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (safeHandlerThread != null) {
            safeHandlerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.recorder.RecorderManager.3
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$3__run$___twin___() {
                    int i3 = i;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                return;
                            }
                            RecorderManager.this.mState.set(3);
                            IRecorderManager.IRecorderListener iRecorderListener = RecorderManager.this.mListener;
                            int i4 = i;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Recorder have an internal error (");
                            LIZ.append(i2);
                            LIZ.append(", ");
                            iRecorderListener.onRecorderError(i4, new Exception(C0H1.LIZJ(LIZ, j, ")", LIZ)));
                            MediaEncodeStream mediaEncodeStream = RecorderManager.this.mMediaEncodeStream;
                            if (mediaEncodeStream == null) {
                                return;
                            }
                            mediaEncodeStream.stop();
                            return;
                        }
                        AVLog.d("RecorderManager", "Recorded on native.");
                        return;
                    }
                    AVLog.d("RecorderManager", "Recording on native.");
                }

                public static void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
    public void start(final String str, final IRecorderManager.IRecorderListener iRecorderListener, final IRecorderManager.Config config, final int i) {
        if (this.mState.get() != 4) {
            this.mRecordThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.recorder.RecorderManager.5
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$5__run$___twin___() {
                    int i2;
                    RecorderManager recorderManager = RecorderManager.this;
                    IRecorderManager iRecorderManager = recorderManager.mExternRecordMgr;
                    if (iRecorderManager != null && (i2 = i) == 2) {
                        recorderManager.mMode = i2;
                        iRecorderManager.start(str, iRecorderListener, config, i2);
                    } else {
                        recorderManager.onStart(str, iRecorderListener, config, i);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                    boolean LIZ;
                    try {
                        anonymousClass5.com_ss_ttlivestreamer_livestreamv2_recorder_RecorderManager$5__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }
}
