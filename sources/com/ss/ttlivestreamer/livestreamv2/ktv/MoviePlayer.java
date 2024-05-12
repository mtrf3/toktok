package com.ss.ttlivestreamer.livestreamv2.ktv;

import X.AnonymousClass028;
import X.X1D;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.Surface;
import android.view.View;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.TextureBufferImpl;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.ShortVideoAudioPushManager;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.engine.VideoTrack;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import com.ss.ttlivestreamer.core.player.AVPlayerBase;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.livestreamv2.RenderView;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class MoviePlayer implements IKaraokeMovie, SurfaceTextureHelper.OnTextureFrameAvailableListener, GLRenderVideoSink.GlRenderInfoListener {
    public boolean mAspectRatioOnFit;
    public LiveCore.Builder mBuilder;
    public VideoSink mCameraVideoSink;
    public boolean mChangeToKTV;
    public LiveCore mCore;
    public boolean mEnableKTV;
    public IKaraokeMovie.Listener mListener;
    public IAVPlayer mPlayer;
    public AudioDeviceModule.AudioRenderSink mPlayerAudioRender;
    public Surface mPlayerSurface;
    public Runnable mPostLastFrame;
    public boolean mRenderModeIsFit;
    public SurfaceTextureHelper mSurfaceHelper;
    public VideoCapturer mVideoCapture;
    public int mVideoHeight;
    public VideoMixer mVideoMixer;
    public VideoTrack mVideoTrack;
    public int mVideoWidth;
    public RenderView mView;
    public Handler mViewHandler;
    public int mOriginVideoIdx = -1;
    public int mMVVideoIdx = -1;
    public VideoMixer.VideoMixerDescription mOriginVideoDescription = VideoMixer.VideoMixerDescription.LEFT_HALF();
    public VideoMixer.VideoMixerDescription mMVVideoDescription = VideoMixer.VideoMixerDescription.RIGHT_HALF();

    private synchronized void updateVideoDescription() {
        int i;
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer != null && (i = this.mOriginVideoIdx) >= 0 && this.mMVVideoIdx >= 0) {
            VideoMixer.VideoMixerDescription videoMixerDescription = this.mOriginVideoDescription;
            if (videoMixerDescription != null) {
                videoMixer.updateDescription(i, videoMixerDescription);
            }
            VideoMixer.VideoMixerDescription videoMixerDescription2 = this.mMVVideoDescription;
            if (videoMixerDescription2 != null) {
                videoMixer.updateDescription(this.mMVVideoIdx, videoMixerDescription2);
            }
        }
    }

    public int getCameraVideoTrack() {
        return 0;
    }

    public int getMVVideoTrack() {
        return 1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public boolean readAudioBufferByKaraoke(ByteBuffer byteBuffer, int i, int i2, int i3) {
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public synchronized void release() {
        this.mCore.changeToKTVMode(false, this);
        stop();
        releaseRender();
        IAVPlayer iAVPlayer = this.mPlayer;
        this.mPostLastFrame = null;
        this.mPlayer = null;
        VideoTrack videoTrack = this.mVideoTrack;
        if (videoTrack != null) {
            videoTrack.setEnable(false);
            this.mVideoTrack.release();
            this.mVideoTrack = null;
        }
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer != null) {
            videoMixer.removeTrack(this.mOriginVideoIdx);
            this.mVideoMixer.removeTrack(this.mMVVideoIdx);
            this.mVideoMixer = null;
        }
        VideoCapturer videoCapturer = this.mVideoCapture;
        if (videoCapturer != null) {
            videoCapturer.stop();
            this.mVideoCapture.release();
            this.mVideoCapture = null;
        }
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mPlayerAudioRender;
        if (audioRenderSink != null) {
            audioRenderSink.release();
            this.mPlayerAudioRender = null;
        }
        if (iAVPlayer != null) {
            iAVPlayer.stop();
            iAVPlayer.release();
        }
        this.mCore = null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void setVolume(float f) {
    }

    private void releaseRender() {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null) {
            iAVPlayer.setDisplay((Surface) null);
        }
        Surface surface = this.mPlayerSurface;
        if (surface != null) {
            surface.release();
            this.mPlayerSurface = null;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            this.mSurfaceHelper = null;
        }
        RenderView renderView = this.mView;
        if (renderView != null) {
            renderView.setGlRenderInfoListener(null);
            this.mView.release();
            this.mView = null;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public long getCurrentPlaybackTimeMs() {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null && (iAVPlayer instanceof AVPlayerBase)) {
            return ((AVPlayerBase) iAVPlayer).getCurrentPlaybackTimeMs();
        }
        return 0L;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public int getDurationMs() {
        IAVPlayer.MetaData metaData;
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null && (metaData = iAVPlayer.getMetaData()) != null) {
            return metaData.getInt("player_duration_ms");
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public IAVPlayer.MetaData getMetadata() {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null) {
            return iAVPlayer.getMetaData();
        }
        return null;
    }

    public void initVideoMixer() {
        if (this.mVideoCapture != null) {
            AVLog.iow("KaraokeMovie", "VideoCapture already created.");
            return;
        }
        try {
            int videoWidth = this.mCore.getBuilder().getVideoWidth();
            int videoHeight = this.mCore.getBuilder().getVideoHeight();
            int videoFps = this.mCore.getBuilder().getVideoFps();
            MVVideoCapture mVVideoCapture = new MVVideoCapture();
            VideoMixer videoMixer = null;
            VideoTrack videoTrack = (VideoTrack) this.mCore.createTrack(mVVideoCapture, null);
            if (videoTrack != null) {
                mVVideoCapture.start(videoWidth, videoHeight, videoFps);
                videoTrack.setEnable(true);
                videoMixer = mVVideoCapture.getVideoMixer();
                this.mOriginVideoIdx = videoMixer.createTrack();
                this.mMVVideoIdx = videoMixer.createTrack();
                videoMixer.setOriginTrackIndex(this.mOriginVideoIdx);
                if (this.mOriginVideoIdx < 0 || this.mMVVideoIdx < 0) {
                    videoTrack.release();
                    mVVideoCapture.stop();
                    mVVideoCapture.release();
                    this.mMVVideoIdx = -1;
                    this.mOriginVideoIdx = -1;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("InitVideoMixer failed ");
                    LIZ.append(videoWidth);
                    LIZ.append("x");
                    LIZ.append(videoHeight);
                    LIZ.append("@");
                    LIZ.append(videoFps);
                    AVLog.ioe("KaraokeMovie", X1D.LIZIZ(LIZ));
                    return;
                }
            } else {
                mVVideoCapture.release();
            }
            this.mVideoCapture = mVVideoCapture;
            this.mVideoTrack = videoTrack;
            this.mVideoMixer = videoMixer;
            updateVideoDescription();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("InitVideoMixer succeed - ");
            LIZ2.append(videoWidth);
            LIZ2.append("x");
            LIZ2.append(videoHeight);
            LIZ2.append("@");
            LIZ2.append(videoFps);
            AVLog.iod("KaraokeMovie", X1D.LIZIZ(LIZ2));
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public boolean isEnableAGC() {
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mPlayerAudioRender;
        if (audioRenderSink != null) {
            return audioRenderSink.isEnableAGC();
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public boolean isLoop() {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null) {
            return iAVPlayer.isLoop();
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public boolean isMirror() {
        RenderView renderView = this.mView;
        if (renderView != null) {
            return renderView.isMirror(true);
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public boolean isMute() {
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mPlayerAudioRender;
        if (audioRenderSink != null) {
            return audioRenderSink.isMute();
        }
        return true;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void pause() {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null) {
            iAVPlayer.pause();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void prepare() {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null && this.mEnableKTV) {
            iAVPlayer.prepare();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void start() {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null && this.mEnableKTV) {
            iAVPlayer.start();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void stop() {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null && this.mEnableKTV) {
            iAVPlayer.stop();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public VideoSink getCameraVideoSink() {
        return this.mCameraVideoSink;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public IAVPlayer getPlayer() {
        return this.mPlayer;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public VideoTrack getVideoTrack() {
        return this.mVideoTrack;
    }

    private void createRender(View view) {
        if (view != null) {
            RenderView renderView = new RenderView(view);
            this.mView = renderView;
            renderView.setFitMode(this.mRenderModeIsFit);
            this.mView.setAutoFullAspectRatioOnFit(this.mAspectRatioOnFit);
            this.mView.setGlRenderInfoListener(this);
        }
        Handler glThreadHandler = this.mView.getGlThreadHandler();
        this.mViewHandler = glThreadHandler;
        ThreadUtils.invokeAtFrontUninterruptibly(glThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer.4
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_ktv_MoviePlayer$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_ktv_MoviePlayer$4__run$___twin___() {
                MoviePlayer moviePlayer = MoviePlayer.this;
                moviePlayer.mSurfaceHelper = new SurfaceTextureHelper(moviePlayer.mViewHandler) { // from class: com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer.4.1SharedSurfaceTextureHelper
                    @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper
                    public void handlerExit() {
                    }
                };
            }

            public static void com_ss_ttlivestreamer_livestreamv2_ktv_MoviePlayer$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_ss_ttlivestreamer_livestreamv2_ktv_MoviePlayer$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        this.mSurfaceHelper.startListening(this);
        this.mPlayerSurface = new Surface(this.mSurfaceHelper.getSurfaceTexture());
    }

    private void setupPlayer(IAVPlayer iAVPlayer) {
        if (iAVPlayer instanceof AVPlayerBase) {
            AVPlayerBase aVPlayerBase = (AVPlayerBase) iAVPlayer;
            if (aVPlayerBase.isTTPlayer() && aVPlayerBase.isSystemMediaPlayer()) {
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
                if (AnonymousClass028.LJI(androidRuntimeException, "KaraokeMovie.setupPlayer")) {
                    throw androidRuntimeException;
                }
            }
        }
        iAVPlayer.setErrorListener(new IAVPlayer.ErrorListener() { // from class: com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer.2
            @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.ErrorListener
            public void onError(IAVPlayer iAVPlayer2, int i, Exception exc) {
                MoviePlayer.this.onError(i, exc);
            }
        });
        iAVPlayer.setEventListener(new IAVPlayer.EventListener() { // from class: com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer.3
            @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
            public void onProgress(IAVPlayer iAVPlayer2, long j) {
            }

            @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
            public void onCompletion(IAVPlayer iAVPlayer2) {
                MoviePlayer.this.onInfo(6, 0L, (String) null);
            }

            @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
            public void onPause(IAVPlayer iAVPlayer2, int i) {
                MoviePlayer.this.onInfo(4, i, (String) null);
            }

            @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
            public void onPrepared(IAVPlayer iAVPlayer2, int i) {
                MoviePlayer.this.mVideoHeight = iAVPlayer2.getMetaData().getInt("video_height");
                MoviePlayer.this.mVideoWidth = iAVPlayer2.getMetaData().getInt("video_width");
                MoviePlayer moviePlayer = MoviePlayer.this;
                if (moviePlayer.mVideoWidth != 0 && moviePlayer.mVideoHeight != 0) {
                    moviePlayer.initVideoMixer();
                }
                MoviePlayer.this.onInfo(1, i, (String) null);
            }

            @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
            public void onStarted(IAVPlayer iAVPlayer2, int i) {
                MoviePlayer moviePlayer = MoviePlayer.this;
                if (!moviePlayer.mChangeToKTV) {
                    moviePlayer.mChangeToKTV = true;
                    moviePlayer.mCore.changeToKTVMode(true, moviePlayer);
                }
                MoviePlayer.this.onInfo(2, i, (String) null);
            }

            @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
            public void onStop(IAVPlayer iAVPlayer2, int i) {
                MoviePlayer.this.onInfo(3, i, (String) null);
            }

            @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
            public void onSeeked(IAVPlayer iAVPlayer2, long j, boolean z) {
                String str;
                MoviePlayer moviePlayer = MoviePlayer.this;
                if (z) {
                    str = null;
                } else {
                    str = "Seek failed.";
                }
                moviePlayer.onInfo(4, j, str);
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void enableAGC(boolean z) {
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mPlayerAudioRender;
        if (audioRenderSink != null) {
            audioRenderSink.setEnableAGC(z, false);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void enableAudioMixer(boolean z) {
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mPlayerAudioRender;
        if (audioRenderSink != null) {
            if (z) {
                audioRenderSink.setQuirks(1L);
            } else {
                audioRenderSink.setQuirks(0L);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public VideoMixer.VideoMixerDescription getVideoMixerDescription(int i) {
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        if (i == 0) {
            videoMixerDescription.copy(this.mOriginVideoDescription);
        } else {
            videoMixerDescription.copy(this.mMVVideoDescription);
        }
        return videoMixerDescription;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void mute(boolean z) {
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mPlayerAudioRender;
        if (audioRenderSink != null) {
            audioRenderSink.setMute(z);
        }
    }

    public void onCameraVideoFrame(VideoFrame videoFrame) {
        int i;
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer != null && (i = this.mOriginVideoIdx) >= 0) {
            videoMixer.mixFrame(i, videoFrame);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void seek(long j) {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null) {
            iAVPlayer.seekTo(j);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void setAutoFillAspectRatioOnFit(boolean z) {
        RenderView renderView = this.mView;
        if (renderView != null) {
            renderView.setAutoFullAspectRatioOnFit(z);
        }
        this.mAspectRatioOnFit = z;
        VideoMixer.VideoMixerDescription videoMixerDescription = getVideoMixerDescription(getMVVideoTrack());
        videoMixerDescription.setAutoFillOnFit(z);
        setVideoMixerDescription(getMVVideoTrack(), videoMixerDescription);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void setDataSource(String str) {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null) {
            iAVPlayer.setDataSource(this.mBuilder.getContext(), str);
            if (iAVPlayer instanceof AVPlayerBase) {
                if (this.mPlayerAudioRender == null) {
                    this.mPlayerAudioRender = this.mCore.getADM().createRenderSink();
                }
                TEBundle parameter = this.mCore.getADM().getParameter();
                if (!((AVPlayerBase) iAVPlayer).setExternalNativeAudioRender(ShortVideoAudioPushManager.getAudioLongAddress(this.mPlayerAudioRender, parameter.getInt("adm_audio_player_sample"), parameter.getInt("adm_audio_player_channel")))) {
                    this.mPlayerAudioRender.release();
                    this.mPlayerAudioRender = null;
                }
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void setDisplay(View view) {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null) {
            if (view != null) {
                createRender(view);
            } else {
                releaseRender();
            }
            iAVPlayer.setDisplay(this.mPlayerSurface);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void setListener(IKaraokeMovie.Listener listener) {
        this.mListener = listener;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void setLoop(boolean z) {
        IAVPlayer iAVPlayer = this.mPlayer;
        if (iAVPlayer != null) {
            iAVPlayer.setLoop(z);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void setMirror(boolean z) {
        RenderView renderView = this.mView;
        if (renderView != null) {
            renderView.setMirror(z, true);
        }
        VideoMixer.VideoMixerDescription videoMixerDescription = getVideoMixerDescription(getMVVideoTrack());
        videoMixerDescription.setMirror(false, z);
        setVideoMixerDescription(getMVVideoTrack(), videoMixerDescription);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public void setRenderMode(boolean z) {
        int i;
        RenderView renderView = this.mView;
        if (renderView != null) {
            renderView.setFitMode(z);
        }
        this.mRenderModeIsFit = z;
        VideoMixer.VideoMixerDescription videoMixerDescription = getVideoMixerDescription(getMVVideoTrack());
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        videoMixerDescription.setMode(i);
        setVideoMixerDescription(getMVVideoTrack(), videoMixerDescription);
    }

    public MoviePlayer(LiveCore liveCore, IAVPlayer iAVPlayer) {
        this.mEnableKTV = false;
        this.mEnableKTV = liveCore.getBuilder().isEnableKTV();
        this.mCore = liveCore;
        liveCore.startAudioPlayer();
        this.mPlayer = iAVPlayer;
        this.mBuilder = this.mCore.getBuilder();
        this.mCameraVideoSink = new VideoSink() { // from class: com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer.1
            @Override // com.ss.ttlivestreamer.core.engine.VideoSink
            public void OnDiscardedFrame() {
            }

            @Override // com.ss.ttlivestreamer.core.engine.VideoSink
            public void onFrame(VideoFrame videoFrame) {
                MoviePlayer.this.onCameraVideoFrame(videoFrame);
            }
        };
        setupPlayer(this.mPlayer);
    }

    public void onError(int i, Exception exc) {
        IKaraokeMovie.Listener listener = this.mListener;
        if (listener != null) {
            listener.onKaraokeError(-1, exc);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error at ");
        LIZ.append(this);
        LIZ.append(" code ");
        LIZ.append(i);
        AVLog.ioe("KaraokeMovie", X1D.LIZIZ(LIZ), exc);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie
    public synchronized void setVideoMixerDescription(int i, VideoMixer.VideoMixerDescription videoMixerDescription) {
        if (i == 0) {
            if (videoMixerDescription != null) {
                this.mOriginVideoDescription.copy(videoMixerDescription);
            }
        } else if (i == 1 && videoMixerDescription != null) {
            this.mMVVideoDescription.copy(videoMixerDescription);
        }
        updateVideoDescription();
    }

    private TextureBufferImpl getBuffer(int i, float[] fArr, long j) {
        return new TextureBufferImpl(this.mVideoWidth, this.mVideoHeight, VideoFrame.TextureBuffer.Type.OES, i, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), new TextureBufferImpl.ToI420Interface() { // from class: com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer.6
            @Override // com.ss.ttlivestreamer.core.buffer.TextureBufferImpl.ToI420Interface
            public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
                throw new AndroidRuntimeException("BUG");
            }
        }, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer.7
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_ktv_MoviePlayer$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_ktv_MoviePlayer$7__run$___twin___() {
                SurfaceTextureHelper surfaceTextureHelper = MoviePlayer.this.mSurfaceHelper;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.returnTextureFrame();
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_ktv_MoviePlayer$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                boolean LIZ;
                try {
                    anonymousClass7.com_ss_ttlivestreamer_livestreamv2_ktv_MoviePlayer$7__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.GlRenderInfoListener
    public void onInfo(int i, int i2, int i3) {
        if (i != 2) {
            return;
        }
        Runnable runnable = this.mPostLastFrame;
        Handler handler = this.mViewHandler;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        reportFirstVideoFrame(i, fArr, j);
        processVideoFrame(i, fArr, j);
    }

    public void processVideoFrame(int i, float[] fArr, long j) {
        VideoFrame videoFrame;
        SurfaceTextureHelper surfaceTextureHelper;
        RenderView renderView = this.mView;
        boolean z = false;
        if (renderView != null) {
            videoFrame = new VideoFrame(getBuffer(i, fArr, j), 0, 0L);
            renderView.onFrame(videoFrame);
        } else {
            videoFrame = null;
        }
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer != null && this.mMVVideoIdx >= 0) {
            int i2 = this.mVideoWidth;
            int i3 = this.mVideoHeight;
            if (i2 > 0 && i3 > 0) {
                videoMixer.mixFrame(this.mMVVideoIdx, new VideoMixer.VideoMixerTexture(i2, i3, 0, VideoMixer.TEXTURE_TYPE_OES, new int[]{i, 0, 0}, fArr));
                z = true;
            }
        }
        if (videoFrame != null) {
            videoFrame.release();
        } else {
            if (!z || (surfaceTextureHelper = this.mSurfaceHelper) == null) {
                return;
            }
            surfaceTextureHelper.returnTextureFrame();
        }
    }

    public void reportFirstVideoFrame(final int i, final float[] fArr, final long j) {
        if (this.mPostLastFrame == null) {
            this.mPostLastFrame = new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.ktv.MoviePlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_ktv_MoviePlayer$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_ktv_MoviePlayer$5__run$___twin___() {
                    MoviePlayer.this.processVideoFrame(i, fArr, j);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_ktv_MoviePlayer$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                    boolean LIZ;
                    try {
                        anonymousClass5.com_ss_ttlivestreamer_livestreamv2_ktv_MoviePlayer$5__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            };
        }
    }

    public void onInfo(int i, long j, String str) {
        IKaraokeMovie.Listener listener = this.mListener;
        if (listener != null) {
            listener.onKaraokeInfo(i, j, str);
        }
    }
}
