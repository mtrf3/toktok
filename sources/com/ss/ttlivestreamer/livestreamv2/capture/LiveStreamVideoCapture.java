package com.ss.ttlivestreamer.livestreamv2.capture;

import X.AnonymousClass028;
import X.C06460Ne;
import X.C15890jp;
import X.C19U;
import X.C48263Iwt;
import X.C61845OOz;
import X.C7MY;
import X.V10;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import com.bytedance.bpea.basics.Cert;
import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.capture.audio.AudioRecordThread;
import com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer;
import com.ss.ttlivestreamer.core.capture.video.ScreenVideoCaptureWithInnerRecord;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.LiveStreamThreadPriorityUtils;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusiness;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.capture.algorithm.CameraAlgorithmParamWrapper;
import com.ss.ttlivestreamer.livestreamv2.capture.algorithm.CameraLensCallbackWrapper;
import com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.ve.LiveAlgorithmParam;
import com.ss.ttlivestreamer.livestreamv2.utils.PrivacyCertManager;
import com.ss.ttlivestreamer.livestreamv2.utils.VideoDumpProxy;
import defpackage.b1;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.LinkedList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LiveStreamVideoCapture extends VideoCapturer implements VideoCapturer.VideoCapturerObserver, IVideoCapturerControl {
    public static Boolean supportOesProcessDevice;
    public boolean enableEffectFlag;
    public boolean enableVideoCaptureOesProcess;
    public int gameLiveDupInterval;
    public int mAdaptedHeight;
    public int mAdaptedWidth;
    public int mAvalidFps;
    public final BGMHandler mBGMHandler;
    public long mBGMTimestampDeltaUs;
    public int mBGMode;
    public int mBGModeFps;
    public Runnable mBackgroundPushVideoFrameRunable;
    public int mBackgroundTex;
    public boolean mBgPushWithAdaptedResolution;
    public Bundle mCameraParams;
    public boolean mCameraSwitchInternal;
    public final Deque<Integer> mCaptureStoppedSeq;
    public Context mContext;
    public GlRenderDrawer mDrawer;
    public boolean mDropFrameDisable;
    public JSONObject mDumpVideoParams;
    public boolean mEnableAudioStereoCapture;
    public final boolean mEnableChangeCameraFpsWhenRunning;
    public final boolean mEnableUpdateVideoCapture;
    public IFilterManager mFilterManager;
    public int mFps;
    public GLThread mGlThread;
    public Handler mHandler;
    public int mHeight;
    public boolean mHorizontalMirror;
    public boolean mIsResume;
    public long mLastTimestamp;
    public LiveStreamBuilder mLiveStreamBuilder;
    public final LiveAlgorithmParam.RhythmicMotion mLiveTransParams;
    public final boolean mNeedRestartCameraWhenChangeCaptureResolution;
    public WeakReference<Observer> mObserver;
    public int mOesTex;
    public boolean mOesTo2DInNewThread;
    public int mRadioModeFps;
    public int mSaveDevicesIdWhenToBack;
    public Intent mScreenIntent;
    public int mSource;
    public final Object mStatFence;
    public int mStatus;
    public SurfaceTextureHelper mSurfaceTextureHelper;
    public SwitchCaptureRunnable mSwitchCaptureRunnable;
    public GlTextureFrameBuffer mTextureFrameBuffer;
    public ThreadUtils.ThreadChecker mThreadChecker;
    public boolean mVerticalMirror;
    public Handler mVideoCaptureOesProcessHandler;
    public GLThread mVideoCaptureOesProcessThread;
    public VideoCapturer mVideoCapturer;
    public int mWidth;
    public boolean pauseDisableEffectSwitch;
    public int screenAudioCaptureDelayMicPackage;

    /* loaded from: classes12.dex */
    public class ExternWrapper extends ExternalVideoCapturer {
        public VideoFrameStatics mRealRateStatics;
        public int mRotation;
        public float[] mTexMatrix;

        @Override // com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer, com.ss.ttlivestreamer.core.engine.NativeObject
        public synchronized void release() {
            if (this.mBufferAlreadyReturn) {
                GLES20.glFinish();
            } else {
                LiveStreamVideoCapture.this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.ExternWrapper.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$ExternWrapper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$ExternWrapper$2__run$___twin___() {
                        AVLog.iow("LiveStreamVideoCapture", "Release texture on new post.");
                        GLES20.glFinish();
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$ExternWrapper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                        boolean LIZ;
                        try {
                            anonymousClass2.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$ExternWrapper$2__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
            super.release();
        }

        @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
        public float getInCapFps() {
            return this.mRealRateStatics.getRealRatePerSecond();
        }

        public int pushLastFrame(long j) {
            String str;
            GlTextureFrameBuffer glTextureFrameBuffer = LiveStreamVideoCapture.this.mTextureFrameBuffer;
            if (glTextureFrameBuffer == null) {
                return -1;
            }
            int width = glTextureFrameBuffer.getWidth();
            int height = glTextureFrameBuffer.getHeight();
            if (width < 1 || height < 1 || !this.mBufferAlreadyReturn) {
                if (this.mBufferAlreadyReturn) {
                    str = "never push any frame.";
                } else {
                    str = "current texture not return.";
                }
                AVLog.w("LiveStreamVideoCapture", str);
                return -1;
            }
            return super.pushVideoFrame(glTextureFrameBuffer.getTextureId(), false, glTextureFrameBuffer.getWidth(), glTextureFrameBuffer.getHeight(), this.mRotation, this.mTexMatrix, j, null, TimeUtils.currentTimeMs());
        }

        public ExternWrapper(VideoCapturer.VideoCapturerObserver videoCapturerObserver, Handler handler, boolean z) {
            super(videoCapturerObserver, handler);
            enableSigalMode(!z);
            this.mRealRateStatics = new VideoFrameStatics(1000);
        }

        @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
        public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
            return LiveStreamVideoCapture.this.onFrame(buffer, i, i2, i3, j);
        }

        @Override // com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer
        public int pushVideoFrame(final int i, final boolean z, final int i2, final int i3, int i4, float[] fArr, final long j, final Bundle bundle, long j2) {
            final int[] iArr = {-1};
            this.mRealRateStatics.add();
            if ((!this.mBufferAlreadyReturn && isSigBufferMode()) || this.mStatus != 1 || LiveStreamVideoCapture.this.mStatus != 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("drop frame: mBufferAlreadyReturn ");
                LIZ.append(this.mBufferAlreadyReturn);
                LIZ.append(", mStatus ");
                LIZ.append(this.mStatus);
                LIZ.append(", LiveStreamVideoCapture.this.mStatus ");
                LIZ.append(LiveStreamVideoCapture.this.mStatus);
                AVLog2.logToIODevice2(5, "LiveStreamVideoCapture", X1D.LIZIZ(LIZ), null, 23, 10000);
                return iArr[0];
            }
            blockingWaitBufferReturn("ExternWrapper push texture");
            this.mRotation = i4;
            this.mTexMatrix = fArr;
            ThreadUtils.invokeAtFrontUninterruptibly(LiveStreamVideoCapture.this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.ExternWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$ExternWrapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$ExternWrapper$1__run$___twin___() {
                    Observer observer;
                    LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
                    GlTextureFrameBuffer glTextureFrameBuffer = liveStreamVideoCapture.mTextureFrameBuffer;
                    if (glTextureFrameBuffer == null || liveStreamVideoCapture.mDrawer == null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("drop frame: mTextureFrameBuffer ");
                        LIZ2.append(LiveStreamVideoCapture.this.mTextureFrameBuffer);
                        LIZ2.append(", mDrawer ");
                        LIZ2.append(LiveStreamVideoCapture.this.mDrawer);
                        AVLog2.logToIODevice2(5, "LiveStreamVideoCapture", X1D.LIZIZ(LIZ2), null, 24, 10000);
                        return;
                    }
                    if (glTextureFrameBuffer.getHeight() != i3 || LiveStreamVideoCapture.this.mTextureFrameBuffer.getWidth() != i2) {
                        try {
                            LiveStreamVideoCapture.this.mTextureFrameBuffer.setSize(i2, i3);
                        } catch (Exception e) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("drop frame: textureFrameBuffer setSize failed (");
                            LIZ3.append(e.getMessage());
                            LIZ3.append(") w ");
                            LIZ3.append(i2);
                            LIZ3.append(" h ");
                            LIZ3.append(i3);
                            AVLog2.logToIODevice2(6, "LiveStreamVideoCapture", X1D.LIZIZ(LIZ3), null, 25, 10000);
                            WeakReference<Observer> weakReference = LiveStreamVideoCapture.this.mObserver;
                            if (weakReference != null && (observer = weakReference.get()) != null) {
                                observer.onVideoCaptureError(-200, e);
                                return;
                            }
                            return;
                        }
                    }
                    GLES20.glBindFramebuffer(36160, LiveStreamVideoCapture.this.mTextureFrameBuffer.getFrameBufferId());
                    try {
                        GlUtil.checkNoGLES2Error("bindFrameBuffer failed");
                        int i5 = i;
                        if (i5 <= 0) {
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                            GLES20.glClear(16384);
                        } else if (z) {
                            LiveStreamVideoCapture.this.mDrawer.drawOes(i5, null, null, 0, 0, i2, i3);
                        } else {
                            LiveStreamVideoCapture.this.mDrawer.drawRgb(i5, null, null, 0, 0, i2, i3);
                        }
                        GLES20.glFlush();
                        GLES20.glBindFramebuffer(36160, 0);
                        try {
                            GlUtil.checkNoGLES2Error("drawer is error.");
                            int[] iArr2 = iArr;
                            ExternWrapper externWrapper = ExternWrapper.this;
                            int textureId = LiveStreamVideoCapture.this.mTextureFrameBuffer.getTextureId();
                            int i6 = i2;
                            int i7 = i3;
                            ExternWrapper externWrapper2 = ExternWrapper.this;
                            iArr2[0] = ExternWrapper.super.pushVideoFrame(textureId, false, i6, i7, externWrapper2.mRotation, externWrapper2.mTexMatrix, j, bundle, TimeUtils.currentTimeMs());
                        } catch (Throwable unused) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("drop frame: Drawer is error with ignore frame timestamp ");
                            LIZ4.append(j);
                            AVLog2.logToIODevice2(6, "LiveStreamVideoCapture", X1D.LIZIZ(LIZ4), null, 27, 10000);
                        }
                    } catch (Throwable unused2) {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("drop frame: bindFrameBuffer faild (tex:");
                        LIZ5.append(LiveStreamVideoCapture.this.mTextureFrameBuffer.getTextureId());
                        LIZ5.append(" fb:");
                        LIZ5.append(LiveStreamVideoCapture.this.mTextureFrameBuffer.getFrameBufferId());
                        LIZ5.append(" w:");
                        LIZ5.append(i2);
                        LIZ5.append(" h:");
                        LIZ5.append(i3);
                        AVLog2.logToIODevice2(6, "LiveStreamVideoCapture", X1D.LIZIZ(LIZ5), null, 26, 10000);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$ExternWrapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ2;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$ExternWrapper$1__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
            return iArr[0];
        }
    }

    /* loaded from: classes12.dex */
    public interface Observer {
        void onVideoCaptureError(int i, Exception exc);

        void onVideoCaptureInfo(int i, int i2, int i3, String str);

        void onVideoCaptureStarted();

        void onVideoCaptureStopped();
    }

    /* loaded from: classes12.dex */
    public class RadioModeWrapper extends ExternalVideoCapturer {
        public long mConstIntervalMs;
        public int mRadioModeCaptureFps;
        public Runnable mRadioModePushVideoFrameRunnable;

        @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
        public float getInCapFps() {
            return this.mRadioModeCaptureFps;
        }

        @Override // com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer, com.ss.ttlivestreamer.core.capture.video.VideoCapturer
        public void stop() {
            super.stop();
            LiveStreamVideoCapture.this.mHandler.removeCallbacks(this.mRadioModePushVideoFrameRunnable);
            AVLog.iod("LiveStreamVideoCapture", "RadioModeVideoCapture stopped");
        }

        public boolean copyCurrentFrame(final GlRenderDrawer glRenderDrawer, final GlTextureFrameBuffer glTextureFrameBuffer) {
            if (glRenderDrawer != null && glTextureFrameBuffer != null) {
                ThreadUtils.invokeAtFrontUninterruptibly(LiveStreamVideoCapture.this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.RadioModeWrapper.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$RadioModeWrapper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$RadioModeWrapper$2__run$___twin___() {
                        GlTextureFrameBuffer glTextureFrameBuffer2 = glTextureFrameBuffer;
                        LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
                        glTextureFrameBuffer2.setSize(liveStreamVideoCapture.mWidth, liveStreamVideoCapture.mHeight);
                        GLES20.glBindFramebuffer(36160, glTextureFrameBuffer.getFrameBufferId());
                        GlRenderDrawer glRenderDrawer2 = glRenderDrawer;
                        LiveStreamVideoCapture liveStreamVideoCapture2 = LiveStreamVideoCapture.this;
                        glRenderDrawer2.drawRgb(liveStreamVideoCapture2.mBackgroundTex, null, null, 0, 0, liveStreamVideoCapture2.mWidth, liveStreamVideoCapture2.mHeight);
                        if (GLThreadManager.isNeedFinish()) {
                            GLES20.glFinish();
                        } else {
                            GLES20.glFlush();
                        }
                        GlUtil.clearAllGLError();
                        GlUtil.checkNoGLES2Error("copy radio frame failed with background.");
                        GLES20.glBindFramebuffer(36160, 0);
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$RadioModeWrapper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                        boolean LIZ;
                        try {
                            anonymousClass2.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$RadioModeWrapper$2__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                return true;
            }
            return true;
        }

        public RadioModeWrapper(VideoCapturer.VideoCapturerObserver videoCapturerObserver, Handler handler) {
            super(videoCapturerObserver, handler);
            this.mRadioModeCaptureFps = 30;
            LiveStreamVideoCapture.this.clearBackgroundTex();
            int i = LiveStreamVideoCapture.this.mRadioModeFps;
            if (i > 0) {
                this.mRadioModeCaptureFps = i;
            }
            this.mConstIntervalMs = 1000 / this.mRadioModeCaptureFps;
            this.mRadioModePushVideoFrameRunnable = new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.RadioModeWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$RadioModeWrapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$RadioModeWrapper$1__run$___twin___() {
                    int i2;
                    int i3;
                    synchronized (LiveStreamVideoCapture.this.mStatFence) {
                        RadioModeWrapper radioModeWrapper = RadioModeWrapper.this;
                        LiveStreamVideoCapture.this.mHandler.removeCallbacks(radioModeWrapper.mRadioModePushVideoFrameRunnable);
                        RadioModeWrapper radioModeWrapper2 = RadioModeWrapper.this;
                        if (!LiveStreamVideoCapture.this.mIsResume || radioModeWrapper2.status() != 1) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("returned! mIsResume: ");
                            LIZ.append(LiveStreamVideoCapture.this.mIsResume);
                            LIZ.append(" , status: ");
                            LIZ.append(RadioModeWrapper.this.status());
                            AVLog.iow("LiveStreamVideoCapture", X1D.LIZIZ(LIZ));
                            return;
                        }
                        long nativeNanoTime = TimeUtils.nativeNanoTime() / 1000;
                        RadioModeWrapper radioModeWrapper3 = RadioModeWrapper.this;
                        LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
                        long j = (nativeNanoTime - liveStreamVideoCapture.mLastTimestamp) / 1000;
                        long j2 = radioModeWrapper3.mConstIntervalMs;
                        if (j < j2) {
                            long j3 = j2 - j;
                            liveStreamVideoCapture.mHandler.postDelayed(radioModeWrapper3.mRadioModePushVideoFrameRunnable, j3);
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("returned! delayMs : ");
                            LIZ2.append(j3);
                            LIZ2.append(" , mConstIntervalMs : ");
                            LIZ2.append(RadioModeWrapper.this.mConstIntervalMs);
                            LIZ2.append(" , diffMs : ");
                            LIZ2.append(j);
                            AVLog.iow("LiveStreamVideoCapture", X1D.LIZIZ(LIZ2));
                            return;
                        }
                        boolean z = liveStreamVideoCapture.mBgPushWithAdaptedResolution;
                        if (z) {
                            i2 = liveStreamVideoCapture.mAdaptedWidth;
                        } else {
                            i2 = liveStreamVideoCapture.mWidth;
                        }
                        if (z) {
                            i3 = liveStreamVideoCapture.mAdaptedHeight;
                        } else {
                            i3 = liveStreamVideoCapture.mHeight;
                        }
                        radioModeWrapper3.pushVideoFrame(liveStreamVideoCapture.mBackgroundTex, false, i2, i3, 0, null, nativeNanoTime, null, TimeUtils.currentTimeMs());
                        RadioModeWrapper radioModeWrapper4 = RadioModeWrapper.this;
                        LiveStreamVideoCapture.this.mHandler.post(radioModeWrapper4.mRadioModePushVideoFrameRunnable);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$RadioModeWrapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$RadioModeWrapper$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            };
        }

        @Override // com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer, com.ss.ttlivestreamer.core.capture.video.VideoCapturer
        public void start(int i, int i2, int i3) {
            super.start(i, i2, i3);
            LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
            liveStreamVideoCapture.mWidth = i;
            liveStreamVideoCapture.mHeight = i2;
            this.mFps = i3;
            int i4 = liveStreamVideoCapture.mRadioModeFps;
            if (i4 > 0) {
                this.mRadioModeCaptureFps = i4;
            } else {
                this.mRadioModeCaptureFps = i3;
            }
            this.mConstIntervalMs = 1000 / this.mRadioModeCaptureFps;
            liveStreamVideoCapture.mHandler.post(this.mRadioModePushVideoFrameRunnable);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RadioModeVideoCapture started: width:");
            LIZ.append(i);
            LIZ.append(" height");
            LIZ.append(i2);
            LIZ.append(" fps:");
            LIZ.append(i3);
            AVLog.iod("LiveStreamVideoCapture", X1D.LIZIZ(LIZ));
        }

        @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
        public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
            return LiveStreamVideoCapture.this.onFrame(buffer, i, i2, i3, j);
        }
    }

    /* loaded from: classes12.dex */
    public class ScreenWrapper extends ScreenVideoCaptureWithInnerRecord {
        public long mBaseTime;
        public long mLastTime;
        public VideoDumpProxy.RawVideoDumperProxy mRawVideoDumper;
        public VideoFrameStatics mRealRateStatics;
        public float[] mTexMatrix;

        private void dumpScreenVideo(int i, int i2, int i3, int i4) {
        }

        public void setDumpFrameParams(JSONObject jSONObject) {
        }

        @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
        public float getInCapFps() {
            VideoFrameStatics videoFrameStatics = this.mRealRateStatics;
            if (videoFrameStatics != null) {
                return videoFrameStatics.getRealRatePerSecond();
            }
            return 0.0f;
        }

        public boolean copyCurrentFrame(final GlRenderDrawer glRenderDrawer, final GlTextureFrameBuffer glTextureFrameBuffer) {
            if (glRenderDrawer != null && glTextureFrameBuffer != null) {
                ThreadUtils.invokeAtFrontUninterruptibly(LiveStreamVideoCapture.this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.ScreenWrapper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$ScreenWrapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$ScreenWrapper$1__run$___twin___() {
                        ScreenWrapper screenWrapper = ScreenWrapper.this;
                        SurfaceTextureHelper surfaceTextureHelper = screenWrapper.surfaceTextureHelper;
                        if (surfaceTextureHelper == null) {
                            return;
                        }
                        if (screenWrapper.mTexMatrix == null) {
                            screenWrapper.mTexMatrix = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
                        }
                        glTextureFrameBuffer.setSize(screenWrapper.width, screenWrapper.height);
                        GLES20.glBindFramebuffer(36160, glTextureFrameBuffer.getFrameBufferId());
                        GlRenderDrawer glRenderDrawer2 = glRenderDrawer;
                        int textureId = surfaceTextureHelper.getTextureId();
                        ScreenWrapper screenWrapper2 = ScreenWrapper.this;
                        glRenderDrawer2.drawOes(textureId, null, screenWrapper2.mTexMatrix, 0, 0, screenWrapper2.width, screenWrapper2.height);
                        if (GLThreadManager.isNeedFinish()) {
                            GLES20.glFinish();
                        } else {
                            GLES20.glFlush();
                        }
                        GlUtil.checkNoGLES2Error("copy screen frame failed with background.");
                        GLES20.glBindFramebuffer(36160, 0);
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$ScreenWrapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$ScreenWrapper$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                return false;
            }
            return false;
        }

        public ScreenWrapper(Intent intent, VideoCapturer.VideoCapturerObserver videoCapturerObserver, int i) {
            super(intent, videoCapturerObserver);
            this.mRealRateStatics = new VideoFrameStatics(1000);
            updateDupInterval(i);
        }

        @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
        public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            dumpScreenVideo(textureBuffer.getTextureId(), textureBuffer.getWidth(), textureBuffer.getHeight(), LiveStreamVideoCapture.this.mFps);
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
            VideoFrameStatics videoFrameStatics = this.mRealRateStatics;
            if (videoFrameStatics != null) {
                videoFrameStatics.add();
            }
            long j2 = (j - this.mLastTime) + this.mBaseTime;
            this.mBaseTime = j2;
            this.mLastTime = j;
            return LiveStreamVideoCapture.this.onFrame(buffer, i, i2, i3, j2);
        }
    }

    private void onToExtern() {
        stopVideoCapturer(true);
        this.mVideoCapturer = new ExternWrapper(this, this.mHandler, this.mDropFrameDisable);
        setupMirror();
        this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
    }

    private void onToRadioMode() {
        stopVideoCapturer(true);
        AVLog.ioi("LiveStreamVideoCapture", "onToRadioMode! new RadioModeWrapper()");
        this.mVideoCapturer = new RadioModeWrapper(this, this.mHandler);
        setupMirror();
        this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
    }

    private void onToScreen() {
        stopVideoCapturer(true);
        ScreenWrapper screenWrapper = new ScreenWrapper(this.mScreenIntent, this, this.gameLiveDupInterval);
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            this.mSurfaceTextureHelper = null;
        }
        SurfaceTextureSharedHandler surfaceTextureSharedHandler = new SurfaceTextureSharedHandler(this.mHandler);
        this.mSurfaceTextureHelper = surfaceTextureSharedHandler;
        screenWrapper.initialize(surfaceTextureSharedHandler, this.mContext);
        this.mVideoCapturer = screenWrapper;
        screenWrapper.setDumpFrameParams(this.mDumpVideoParams);
        this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
    }

    public IVideoCapturerControl getISPControl() {
        return this;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        stop();
        Handler handler = this.mHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.12
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$12__run$___twin___() {
                    LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
                    if (liveStreamVideoCapture.mVideoCaptureOesProcessHandler == null) {
                        liveStreamVideoCapture.releaseOesTex();
                    }
                    int i = LiveStreamVideoCapture.this.mBackgroundTex;
                    if (i != 0) {
                        GLES20.glDeleteTextures(1, new int[]{i}, 0);
                    }
                    GlTextureFrameBuffer glTextureFrameBuffer = LiveStreamVideoCapture.this.mTextureFrameBuffer;
                    if (glTextureFrameBuffer != null) {
                        glTextureFrameBuffer.release();
                        LiveStreamVideoCapture.this.mTextureFrameBuffer = null;
                    }
                    GlRenderDrawer glRenderDrawer = LiveStreamVideoCapture.this.mDrawer;
                    if (glRenderDrawer != null) {
                        glRenderDrawer.release();
                        LiveStreamVideoCapture.this.mDrawer = null;
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
                    boolean LIZ;
                    try {
                        anonymousClass12.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$12__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        Handler handler2 = this.mVideoCaptureOesProcessHandler;
        if (handler2 != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler2, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.13
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$13__run$___twin___() {
                    LiveStreamVideoCapture.this.releaseOesTex();
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
                    boolean LIZ;
                    try {
                        anonymousClass13.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$13__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            SafeHandlerThreadPoolExecutor.unlockThread(this.mVideoCaptureOesProcessThread);
            this.mVideoCaptureOesProcessHandler = null;
        }
        this.mCaptureStoppedSeq.clear();
        SafeHandlerThreadPoolExecutor.unlockThread(this.mGlThread);
        super.release();
    }

    /* loaded from: classes12.dex */
    public class SwitchCaptureRunnable implements Runnable {
        public PrivacyCertManager.CertUnit mCert;
        public int mDevice;
        public Intent mIntent;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$SwitchCaptureRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$SwitchCaptureRunnable__run$___twin___() {
            PrivacyCertManager.getInstance().saveCert(0, this.mCert);
            LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
            liveStreamVideoCapture.mScreenIntent = this.mIntent;
            int i = this.mDevice;
            liveStreamVideoCapture.mSaveDevicesIdWhenToBack = i;
            liveStreamVideoCapture.onSwitchVideoCapturer(i);
            PrivacyCertManager.getInstance().popCert(0);
        }

        public SwitchCaptureRunnable() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$SwitchCaptureRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(SwitchCaptureRunnable switchCaptureRunnable) {
            boolean LIZ;
            try {
                switchCaptureRunnable.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$SwitchCaptureRunnable__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public void setDevice(int i, Intent intent) {
            this.mDevice = i;
            this.mIntent = intent;
            this.mCert = PrivacyCertManager.getInstance().popCert(0);
        }
    }

    private void adaptVideoCaptureResolution() {
        if (this.mCameraParams.getBoolean("enableChooseBestCaptureResolution") && !this.mCameraParams.getBoolean("disableUpdateVideoCapture")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("adaptVideoCaptureResolution, mAdaptedWidth=");
            LIZ.append(this.mAdaptedWidth);
            LIZ.append(", mAdaptedHeight=");
            LIZ.append(this.mAdaptedHeight);
            AVLog.ioi("LiveStreamVideoCapture", X1D.LIZIZ(LIZ));
            this.mWidth = this.mAdaptedWidth;
            this.mHeight = this.mAdaptedHeight;
        }
    }

    private CameraVideoCapturer getCameraHandler() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && (videoCapturer instanceof CameraVideoCapturer)) {
            return (CameraVideoCapturer) videoCapturer;
        }
        return null;
    }

    private void initLiveAlgorithmParam() {
        Bundle bundle = this.mCameraParams;
        if (bundle != null && bundle.getBoolean("enableOneKeyProcess")) {
            this.mLiveTransParams.setOpenOneKeyProcess(true);
        }
    }

    private void pauseDisableEffect() {
        IFilterManager iFilterManager = this.mFilterManager;
        if (iFilterManager != null && this.pauseDisableEffectSwitch) {
            boolean isEnable = iFilterManager.isEnable();
            DebugLogUtils.isEnableDebugLog();
            if (isEnable) {
                this.enableEffectFlag = true;
                this.mFilterManager.enable(false);
                return;
            }
            return;
        }
        DebugLogUtils.isEnableDebugLog();
    }

    private void releaseVideoCapture() {
        this.mBGMHandler.removeMessages(10001);
        this.mHandler.removeCallbacks(this.mSwitchCaptureRunnable);
        this.mHandler.removeCallbacks(this.mBackgroundPushVideoFrameRunable);
        this.mHandler.post(new PrivacyCertManager.RunnableWithCert(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.11
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$11__run$___twin___() {
                LiveStreamVideoCapture.this.stopVideoCapturer(false);
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                boolean LIZ;
                try {
                    anonymousClass11.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$11__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, new int[]{0}));
    }

    private void resumeRecoverEffect() {
        if (this.mFilterManager != null && this.pauseDisableEffectSwitch) {
            if (this.enableEffectFlag) {
                DebugLogUtils.isEnableDebugLog();
                this.enableEffectFlag = false;
                this.mFilterManager.enable(true);
                return;
            }
            DebugLogUtils.isEnableDebugLog();
            return;
        }
        DebugLogUtils.isEnableDebugLog();
    }

    public boolean backgroundMode() {
        return !this.mIsResume;
    }

    public void clearBackgroundTex() {
        if (this.mBackgroundTex == 0) {
            this.mBackgroundTex = GlUtil.generateTexture(3553);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.mBackgroundTex);
            GLES20.glTexImage2D(3553, 0, 6408, this.mWidth, this.mHeight, 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
            GlUtil.checkNoGLES2Error("clearBackgroundTex");
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public long getAverageExposureTime() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && (videoCapturer instanceof CameraVideoCapturer)) {
            return ((CameraVideoCapturer) videoCapturer).getAverageExposureTime();
        }
        return -1L;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public long getAvgFps() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && (videoCapturer instanceof CameraVideoCapturer)) {
            return ((CameraVideoCapturer) videoCapturer).getAvgFps();
        }
        return -1L;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public long getCameraAlgorithmState() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && (videoCapturer instanceof CameraVideoCapturer)) {
            return ((CameraVideoCapturer) videoCapturer).getCameraAlgorithmState();
        }
        return 0L;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public double getCameraAvgCaptureResultFps() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && (videoCapturer instanceof CameraVideoCapturer)) {
            return ((CameraVideoCapturer) videoCapturer).getCameraAvgCaptureResultFps();
        }
        return -1.0d;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int getCameraCaptureHeight() {
        VideoCapturer videoCapturer;
        if (this.mCameraParams.getBoolean("camera_size_opt", false) && (videoCapturer = this.mVideoCapturer) != null && (videoCapturer instanceof CameraVideoCapturer)) {
            return ((CameraVideoCapturer) videoCapturer).getCameraCaptureHeight();
        }
        return -1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int getCameraCaptureWidth() {
        VideoCapturer videoCapturer;
        if (this.mCameraParams.getBoolean("camera_size_opt", false) && (videoCapturer = this.mVideoCapturer) != null && (videoCapturer instanceof CameraVideoCapturer)) {
            return ((CameraVideoCapturer) videoCapturer).getCameraCaptureWidth();
        }
        return -1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int getCameraState() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && (videoCapturer instanceof CameraVideoCapturer)) {
            return ((CameraVideoCapturer) videoCapturer).getCameraState();
        }
        return -1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public long getISOInfo() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && (videoCapturer instanceof CameraVideoCapturer)) {
            return ((CameraVideoCapturer) videoCapturer).getISOInfo();
        }
        return -1L;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public float getInCaptureRealFps() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            return videoCapturer.getInCapFps();
        }
        return 0.0f;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public String getRealCameraFpsRangeStr() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer instanceof CameraVideoCapturer) {
            return ((CameraVideoCapturer) videoCapturer).getRealCameraFpsRangeStr();
        }
        return "";
    }

    public int getStoppedSource() {
        int i = this.mSource;
        Deque<Integer> deque = this.mCaptureStoppedSeq;
        if (deque != null && deque.size() != 0) {
            return this.mCaptureStoppedSeq.removeFirst().intValue();
        }
        return i;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public boolean isCamera2Like() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer instanceof CameraVideoCapturer) {
            return ((CameraVideoCapturer) videoCapturer).isCamera2Like();
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureStarted() {
        Observer observer;
        WeakReference<Observer> weakReference = this.mObserver;
        if (weakReference != null && (observer = weakReference.get()) != null) {
            observer.onVideoCaptureStarted();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoCaptureStarted,device:");
        LIZ.append(this.mSource);
        AVLog.logKibana(5, "LiveStreamVideoCapture", X1D.LIZIZ(LIZ), null);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onVideoCaptureStarted, device:");
        LIZ2.append(this.mSource);
        LIZ2.append(", status:");
        LIZ2.append(this.mStatus);
        AVLog.iow("LiveStreamVideoCapture", X1D.LIZIZ(LIZ2));
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureStopped() {
        Observer observer;
        WeakReference<Observer> weakReference = this.mObserver;
        if (weakReference != null && (observer = weakReference.get()) != null) {
            observer.onVideoCaptureStopped();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoCaptureStopped,device:");
        LIZ.append(this.mSource);
        AVLog.logKibana(5, "LiveStreamVideoCapture", X1D.LIZIZ(LIZ), null);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onVideoCaptureStopped,device:");
        LIZ2.append(this.mSource);
        LIZ2.append(", status:");
        LIZ2.append(this.mStatus);
        AVLog.iow("LiveStreamVideoCapture", X1D.LIZIZ(LIZ2));
    }

    public void pause() {
        synchronized (this.mStatFence) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Pause capture, status ");
            LIZ.append(status());
            AVLog.iod("LiveStreamVideoCapture", X1D.LIZIZ(LIZ));
            this.mIsResume = false;
            if (this.mBGMode == 2) {
                this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.10
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$10__run$___twin___() {
                        LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
                        VideoCapturer videoCapturer = liveStreamVideoCapture.mVideoCapturer;
                        if (videoCapturer instanceof CameraWrapper) {
                            ((CameraVideoCapturer) videoCapturer).copyCurrentFrame(liveStreamVideoCapture.mDrawer, liveStreamVideoCapture.mTextureFrameBuffer);
                        } else if (videoCapturer instanceof ScreenWrapper) {
                            ((ScreenWrapper) videoCapturer).copyCurrentFrame(liveStreamVideoCapture.mDrawer, liveStreamVideoCapture.mTextureFrameBuffer);
                        } else {
                            if (!(videoCapturer instanceof RadioModeWrapper)) {
                                return;
                            }
                            ((RadioModeWrapper) videoCapturer).copyCurrentFrame(liveStreamVideoCapture.mDrawer, liveStreamVideoCapture.mTextureFrameBuffer);
                        }
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                        boolean LIZ2;
                        try {
                            anonymousClass10.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$10__run$___twin___();
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                });
            }
            this.mBGMHandler.removeMessages(10001);
            BgmMessageBundle bgmMessageBundle = new BgmMessageBundle();
            bgmMessageBundle.screenIntent = this.mScreenIntent;
            bgmMessageBundle.videoCert = PrivacyCertManager.getInstance().popCert(0);
            this.mBGMHandler.sendMessage(this.mBGMHandler.obtainMessage(10001, 0, 0, bgmMessageBundle));
            pauseDisableEffect();
        }
    }

    public void releaseOesTex() {
        int i = this.mOesTex;
        if (i > 0) {
            GLES20.glDeleteTextures(0, new int[]{i}, 0);
            this.mOesTex = 0;
        }
    }

    public void resume() {
        synchronized (this.mStatFence) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Resume capture, status ");
            LIZ.append(status());
            AVLog.iod("LiveStreamVideoCapture", X1D.LIZIZ(LIZ));
            this.mIsResume = true;
            this.mBGMHandler.removeMessages(10001);
            BgmMessageBundle bgmMessageBundle = new BgmMessageBundle();
            bgmMessageBundle.screenIntent = this.mScreenIntent;
            bgmMessageBundle.videoCert = PrivacyCertManager.getInstance().popCert(0);
            this.mBGMHandler.sendMessage(this.mBGMHandler.obtainMessage(10001, 1, 0, bgmMessageBundle));
            resumeRecoverEffect();
        }
    }

    public void setupMirror() {
        String str;
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && (videoCapturer instanceof ExternalVideoCapturer)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setupMirror: mHorizontalMirror ");
            LIZ.append(this.mHorizontalMirror);
            LIZ.append(", mVerticalMirror ");
            String LIZ2 = C19U.LIZ(LIZ, this.mVerticalMirror, ". ", LIZ);
            if (videoCapturer instanceof CameraVideoCapturer) {
                StringBuilder LIZJ = b1.LIZJ(LIZ2, "With ");
                if (((CameraVideoCapturer) videoCapturer).isBackCam()) {
                    str = "back camera. ";
                } else {
                    str = "front camera. ";
                }
                LIZJ.append(str);
                LIZ2 = X1D.LIZIZ(LIZJ);
            }
            AVLog.logToIODevice(4, "LiveStreamVideoCapture", LIZ2, new Throwable());
            ExternalVideoCapturer externalVideoCapturer = (ExternalVideoCapturer) videoCapturer;
            externalVideoCapturer.enableMirror(this.mHorizontalMirror, true);
            externalVideoCapturer.enableMirror(this.mVerticalMirror, false);
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public void stop() {
        if (this.mStatus == 2) {
            return;
        }
        this.mStatus = 2;
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder != null && liveStreamBuilder.isCaptureReleaseLockOptimize()) {
            releaseVideoCapture();
            return;
        }
        synchronized (this.mStatFence) {
            releaseVideoCapture();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void stopCameraRhythmAlgorithm() {
        this.mLiveTransParams.setOpenRhythm(false);
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && (videoCapturer instanceof CameraVideoCapturer)) {
            ((CameraVideoCapturer) videoCapturer).stopCameraRhythmAlgorithm();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void cancelAudioFocus() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            cameraHandler.cancelAudioFocus();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void cancelAutoFocus() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            cameraHandler.cancelAudioFocus();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public boolean currentSupportISPControl() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null && cameraHandler.currentSupportISPControl()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public IVideoCapturerControl.Range getExposureCompensationRange() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.getExposureCompensationRange();
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public JSONObject getRealCameraStatus() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.getRealCameraStatus();
        }
        return null;
    }

    public int getValidCaptureFps() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.getValidCaptureFps();
        }
        return this.mFps;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void startLiveOneKeyProcess() {
        DebugLogUtils.isEnableDebugLog();
        Bundle bundle = this.mCameraParams;
        if (bundle != null && bundle.getBoolean("enableOneKeyProcess")) {
            this.mLiveTransParams.setOpenOneKeyProcess(true);
            VideoCapturer videoCapturer = this.mVideoCapturer;
            if (videoCapturer != null && (videoCapturer instanceof CameraVideoCapturer)) {
                ((CameraVideoCapturer) videoCapturer).startLiveOneKeyProcess();
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void stopLiveOneKeyProcess() {
        DebugLogUtils.isEnableDebugLog();
        Bundle bundle = this.mCameraParams;
        if (bundle != null && bundle.getBoolean("enableOneKeyProcess")) {
            this.mLiveTransParams.setOpenOneKeyProcess(false);
            VideoCapturer videoCapturer = this.mVideoCapturer;
            if (videoCapturer != null && (videoCapturer instanceof CameraVideoCapturer)) {
                ((CameraVideoCapturer) videoCapturer).stopLiveOneKeyProcess();
            }
        }
    }

    public int getAdaptedFps() {
        return this.mAvalidFps;
    }

    public int getAdaptedHeight() {
        return this.mAdaptedHeight;
    }

    public int getAdaptedWidth() {
        return this.mAdaptedWidth;
    }

    public int getBackgroundPolicy() {
        return this.mBGMode;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int getCurrentCaptureDevice() {
        return this.mSource;
    }

    public long getCurrentCaptureTimestamp() {
        return this.mLastTimestamp;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public int status() {
        return this.mStatus;
    }

    /* loaded from: classes12.dex */
    public class BGMHandler extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z;
            Object obj = message.obj;
            if (obj instanceof BgmMessageBundle) {
                BgmMessageBundle bgmMessageBundle = (BgmMessageBundle) obj;
                LiveStreamVideoCapture.this.mScreenIntent = bgmMessageBundle.screenIntent;
                PrivacyCertManager.getInstance().saveCert(0, bgmMessageBundle.videoCert);
            }
            if (message.what == 10001) {
                if (message.arg1 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
                liveStreamVideoCapture.mBGMTimestampDeltaUs = 0L;
                if (!z) {
                    liveStreamVideoCapture.onSwitchVideoCapturer(4);
                    LiveStreamVideoCapture liveStreamVideoCapture2 = LiveStreamVideoCapture.this;
                    if (liveStreamVideoCapture2.mBGMode != 4) {
                        long nanoTime = System.nanoTime() / 1000;
                        LiveStreamVideoCapture liveStreamVideoCapture3 = LiveStreamVideoCapture.this;
                        liveStreamVideoCapture2.mBGMTimestampDeltaUs = nanoTime - liveStreamVideoCapture3.mLastTimestamp;
                        liveStreamVideoCapture3.mHandler.post(liveStreamVideoCapture3.mBackgroundPushVideoFrameRunable);
                    } else {
                        liveStreamVideoCapture2.mHandler.removeCallbacks(liveStreamVideoCapture2.mBackgroundPushVideoFrameRunable);
                    }
                } else {
                    liveStreamVideoCapture.mHandler.removeCallbacks(liveStreamVideoCapture.mBackgroundPushVideoFrameRunable);
                    LiveStreamVideoCapture liveStreamVideoCapture4 = LiveStreamVideoCapture.this;
                    int i = liveStreamVideoCapture4.mSaveDevicesIdWhenToBack;
                    if (i != 0) {
                        liveStreamVideoCapture4.onSwitchVideoCapturer(i);
                    }
                }
            }
            PrivacyCertManager.getInstance().popCert(0);
        }

        public BGMHandler(Looper looper) {
            super(looper);
        }
    }

    /* loaded from: classes12.dex */
    public class BgmMessageBundle {
        public Intent screenIntent;
        public PrivacyCertManager.CertUnit videoCert;

        public BgmMessageBundle() {
        }
    }

    private Bitmap convert(Object obj) {
        Bitmap bitmap;
        boolean z;
        int i;
        int i2;
        if (obj instanceof String) {
            Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
            Matrix matrix = new Matrix();
            matrix.setScale(1.0f, -1.0f);
            bitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            decodeFile.recycle();
            z = true;
        } else if (obj instanceof Bitmap) {
            bitmap = (Bitmap) obj;
            z = false;
        } else {
            return null;
        }
        if (bitmap != null) {
            if (this.mBgPushWithAdaptedResolution) {
                i = this.mAdaptedWidth;
                i2 = this.mAdaptedHeight;
            } else {
                i = this.mWidth;
                i2 = this.mHeight;
            }
            if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
                Matrix matrix2 = new Matrix();
                matrix2.reset();
                matrix2.postScale(i / bitmap.getWidth(), i2 / bitmap.getHeight());
                if (this.mOesTo2DInNewThread) {
                    matrix2.setScale(1.0f, -1.0f);
                }
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                if (z) {
                    bitmap.recycle();
                }
                return createBitmap;
            }
            if (z) {
                return bitmap;
            }
            if (this.mOesTo2DInNewThread) {
                Matrix matrix3 = new Matrix();
                matrix3.reset();
                matrix3.setScale(1.0f, -1.0f);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix3, true);
            }
            return Bitmap.createBitmap(bitmap);
        }
        return bitmap;
    }

    private int getMinFps(int i) {
        int i2 = this.mCameraParams.getInt("videoCaptureMinFps", -1);
        if (i2 > 0 && i2 <= 30) {
            if (i > 0) {
                if (i <= 30) {
                    if (i2 <= i) {
                        return i2;
                    }
                    return i;
                }
            } else {
                return i;
            }
        } else if (i < 30) {
            return i;
        }
        return 7;
    }

    public static long guessFrameTimestampDiffUs(long j) {
        long currentTimeMillis = (System.currentTimeMillis() * 1000) - j;
        if (Math.abs(currentTimeMillis) < 5000000) {
            return currentTimeMillis;
        }
        long nanoTime = (System.nanoTime() / 1000) - j;
        if (Math.abs(nanoTime) < 5000000) {
            return nanoTime;
        }
        return 0L;
    }

    private boolean supportOesCopyDeviceType(boolean z) {
        boolean z2;
        int i;
        if (supportOesProcessDevice == null) {
            if (!z) {
                supportOesProcessDevice = Boolean.TRUE;
            } else {
                try {
                    if (!Build.HARDWARE.toLowerCase().startsWith("mt67") || ((i = Build.VERSION.SDK_INT) != 29 && i != 30)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    supportOesProcessDevice = Boolean.valueOf(z2);
                } catch (Exception unused) {
                    supportOesProcessDevice = Boolean.TRUE;
                }
            }
        }
        return supportOesProcessDevice.booleanValue();
    }

    private void updateRadioModeFps(int i) {
        this.mRadioModeFps = i;
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer instanceof RadioModeWrapper) {
            if (i <= 0) {
                i = this.mFps;
            }
            ((RadioModeWrapper) videoCapturer).mRadioModeCaptureFps = i;
            ((RadioModeWrapper) videoCapturer).mConstIntervalMs = 1000 / i;
        }
    }

    public void doSetBackGroundPhotoPath(Bitmap bitmap) {
        clearBackgroundTex();
        if (bitmap != null && !bitmap.isRecycled()) {
            GLES20.glBindTexture(3553, this.mBackgroundTex);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            GLES20.glBindTexture(3553, 0);
            bitmap.recycle();
        }
    }

    public boolean isMirror(boolean z) {
        if (z) {
            return this.mHorizontalMirror;
        }
        return this.mVerticalMirror;
    }

    public void onSwitchVideoCapturer(int i) {
        onSwitchVideoCapturer(i, false);
    }

    public void setBackGroundPhotoPath(Object obj) {
        if (this.mWidth == 0 || this.mHeight == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Size is 0!");
            LIZ.append(this.mWidth);
            LIZ.append(",");
            LIZ.append(this.mHeight);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ));
            if (!AnonymousClass028.LJI(androidRuntimeException, "LiveStreamVideoCapture.setBackGroundPhotoPath")) {
                AVLog.ioe("LiveStreamVideoCapture", "setBackgroundPhotoPath failed. Size is 0");
                return;
            }
            throw androidRuntimeException;
        }
        final Bitmap convert = convert(obj);
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.4
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$4__run$___twin___() {
                LiveStreamVideoCapture.this.doSetBackGroundPhotoPath(convert);
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ2;
                try {
                    anonymousClass4.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$4__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }

    public void setBackgroundFps(int i) {
        if (i > 0 && i < 15) {
            this.mBGModeFps = i;
            DebugLogUtils.isEnableDebugLog();
        }
    }

    public void setBackgroundPolicy(int i) {
        this.mBGMode = i;
    }

    public void setDumpFrameParams(JSONObject jSONObject) {
        this.mDumpVideoParams = jSONObject;
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            cameraHandler.setDumpFrameParams(jSONObject);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int setExposureCompensation(float f) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.setExposureCompensation(f);
        }
        return -1;
    }

    public void setFilterManager(IFilterManager iFilterManager) {
        this.mFilterManager = iFilterManager;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void setLensCallback(CameraLensCallbackWrapper cameraLensCallbackWrapper) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            cameraHandler.setLensCallback(cameraLensCallbackWrapper);
        }
    }

    public void setPauseDisableEffectSwitch(boolean z) {
        this.pauseDisableEffectSwitch = z;
    }

    public void setScreenAudioCaptureDelayMicPackage(int i) {
        this.screenAudioCaptureDelayMicPackage = i;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void startCameraRhythmAlgorithm(LiveAlgorithmParam.RhythmicMotion rhythmicMotion) {
        this.mLiveTransParams.setOpenRhythm(true);
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && (videoCapturer instanceof CameraVideoCapturer)) {
            ((CameraVideoCapturer) videoCapturer).startCameraRhythmAlgorithm(rhythmicMotion);
        }
    }

    public void stopVideoCapturer(boolean z) {
        PrivacyCertManager.CertUnit certUnit;
        if (this.mVideoCapturer != null) {
            if (z) {
                certUnit = PrivacyCertManager.getInstance().popCert(0);
                PrivacyCertManager.getInstance().saveCert(0, new PrivacyCertManager.CertUnit(0, DataflowID0x58060103.ttlsVideoStopWhenSwithVideo(), "LiveStreamVideoCapture.switchVideoCapture"));
            } else {
                certUnit = null;
            }
            this.mVideoCapturer.stop();
            this.mVideoCapturer.release();
            this.mVideoCapturer = null;
            if (z) {
                PrivacyCertManager.getInstance().popCert(0);
                PrivacyCertManager.getInstance().saveCert(0, certUnit);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int toggleFlashLight(boolean z) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.toggleFlashLight(z);
        }
        return -1;
    }

    public void updateScreenIntent(Intent intent) {
        this.mScreenIntent = intent;
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

    private boolean isVideoCaptureSizeChanged(int i, int i2) {
        if (i != this.mWidth || i2 != this.mHeight) {
            return true;
        }
        return false;
    }

    private void onToCamBack(boolean z, boolean z2) {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && (videoCapturer instanceof CameraVideoCapturer) && ((CameraVideoCapturer) videoCapturer).isBackCam() == z && !z2) {
            return;
        }
        GLThread glThread = TTLSPreInitBusiness.getInstance().getGlThread("TTLSOesProcessThread");
        this.mVideoCaptureOesProcessThread = glThread;
        if (this.enableVideoCaptureOesProcess) {
            if (glThread == null) {
                GLThread videoCaptureOesProcessThread = LiveStreamThreadPriorityUtils.getVideoCaptureOesProcessThread();
                this.mVideoCaptureOesProcessThread = videoCaptureOesProcessThread;
                videoCaptureOesProcessThread.start();
            }
            this.mVideoCaptureOesProcessHandler = this.mVideoCaptureOesProcessThread.getHandler();
        } else if (glThread != null) {
            glThread.quitSafely();
            this.mVideoCaptureOesProcessThread = null;
        }
        boolean z3 = this.mCameraParams.getBoolean("useCamera2API");
        VideoCapturer videoCapturer2 = this.mVideoCapturer;
        if (videoCapturer2 != null && (videoCapturer2 instanceof CameraVideoCapturer) && this.mCameraSwitchInternal && !z3 && !z2) {
            ((CameraVideoCapturer) videoCapturer2).switchCamera();
            return;
        }
        stopVideoCapturer(true);
        if (this.mOesTex == 0) {
            Handler handler = this.mVideoCaptureOesProcessHandler;
            if (handler != null) {
                ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.5
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$5__run$___twin___() {
                        LiveStreamVideoCapture.this.mOesTex = GlUtil.generateTexture(36197);
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                        boolean LIZ;
                        try {
                            anonymousClass5.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$5__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            } else {
                ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$6__run$___twin___() {
                        LiveStreamVideoCapture.this.mOesTex = GlUtil.generateTexture(36197);
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                        boolean LIZ;
                        try {
                            anonymousClass6.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$6__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        }
        CameraWrapper cameraWrapper = new CameraWrapper(this.mHandler, !z, this, this.mOesTex, this.mCameraParams);
        cameraWrapper.setOpenAlgorithm(this.mLiveTransParams);
        cameraWrapper.setDumpFrameParams(this.mDumpVideoParams);
        cameraWrapper.setAdaptedFormat(this.mAdaptedWidth, this.mAdaptedHeight, this.mAvalidFps);
        this.mVideoCapturer = cameraWrapper;
        initLiveAlgorithmParam();
        setupMirror();
        this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void addCameraAlgorithm(CameraAlgorithmParamWrapper cameraAlgorithmParamWrapper, boolean z) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            cameraHandler.addCameraAlgorithm(cameraAlgorithmParamWrapper, z);
        }
    }

    public void enableMirror(final boolean z, final boolean z2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.14
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$14__run$___twin___() {
                if (z2) {
                    LiveStreamVideoCapture.this.mHorizontalMirror = z;
                } else {
                    LiveStreamVideoCapture.this.mVerticalMirror = z;
                }
                LiveStreamVideoCapture.this.setupMirror();
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
                boolean LIZ;
                try {
                    anonymousClass14.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$14__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onSwitchVideoCapturer(int i, boolean z) {
        if (i == this.mSource && this.mVideoCapturer != null && !z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Ignore switching to video capture device ");
            LIZ.append(i);
            LIZ.append(" which is the same with previous.");
            AVLog.iow("LiveStreamVideoCapture", X1D.LIZIZ(LIZ));
            return;
        }
        this.mCaptureStoppedSeq.addLast(Integer.valueOf(i));
        this.mSource = i;
        boolean z2 = true;
        if (i != 0) {
            if (this.mStatus != 1) {
                StringBuilder LJ = C7MY.LJ("Ignore switching to video capture device ", i, " , mStatus : ");
                LJ.append(this.mStatus);
                AVLog.iow("LiveStreamVideoCapture", X1D.LIZIZ(LJ));
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                onToRadioMode();
                                return;
                            }
                        } else {
                            onToExtern();
                            return;
                        }
                    } else {
                        onToScreen();
                        return;
                    }
                }
            } else {
                z2 = false;
            }
            onToCamBack(z2, z);
            return;
        }
        stopVideoCapturer(true);
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureError(int i, Exception exc) {
        Observer observer;
        WeakReference<Observer> weakReference = this.mObserver;
        if (weakReference != null && (observer = weakReference.get()) != null) {
            observer.onVideoCaptureError(i, exc);
        }
        StringBuilder LJ = C7MY.LJ("onVideoCaptureError,code:", i, ",device:");
        LJ.append(this.mSource);
        AVLog.logKibana(5, "LiveStreamVideoCapture", X1D.LIZIZ(LJ), exc);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoCaptureError,code:");
        LIZ.append(i);
        LIZ.append(",device:");
        LIZ.append(this.mSource);
        LIZ.append(", status:");
        LIZ.append(this.mStatus);
        AVLog.iow("LiveStreamVideoCapture", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int queryZoomAbility(boolean z, boolean z2) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.queryZoomAbility(z, z2);
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int setCameraPreviewFpsRangeWhenRunning(int i, int i2) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.setCameraPreviewFpsRangeWhenRunning(i, i2);
        }
        return -1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int startZoom(boolean z, float f) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.startZoom(z, f);
        }
        return -1;
    }

    public void switchVideoCaptureDevice(int i, Intent intent) {
        this.mHandler.removeCallbacks(this.mSwitchCaptureRunnable);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchVideoCaptureDevice. videoCaptureDevice : ");
        LIZ.append(i);
        AVLog.ioi("LiveStreamVideoCapture", X1D.LIZIZ(LIZ));
        this.mSwitchCaptureRunnable.setDevice(i, intent);
        this.mHandler.post(this.mSwitchCaptureRunnable);
    }

    private void setCameraAdaptedFormat(int i, int i2, int i3) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            cameraHandler.setAdaptedFormat(i, i2, i3);
        }
    }

    public void registerScreenAudioPlayBack(final AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, final int i, final Cert cert) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$1__run$___twin___() {
                LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
                VideoCapturer videoCapturer = liveStreamVideoCapture.mVideoCapturer;
                if (videoCapturer instanceof ScreenVideoCaptureWithInnerRecord) {
                    ((ScreenVideoCaptureWithInnerRecord) videoCapturer).enableScreenAudioStereoCapture(liveStreamVideoCapture.mEnableAudioStereoCapture);
                    ((ScreenVideoCaptureWithInnerRecord) LiveStreamVideoCapture.this.mVideoCapturer).setAudioPlayBackObserver(iAudioRecordThreadObserver, cert);
                } else {
                    if (i <= 0) {
                        return;
                    }
                    AVLog.ioe("LiveStreamVideoCapture", "Can not registerScreenAudioPlayBack when not screen capture");
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public void start(int i, int i2, int i3) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mFps = i3;
        synchronized (this.mStatFence) {
            if (this.mStatus == 1) {
                return;
            }
            this.mStatus = 1;
            switchVideoCaptureDevice(this.mSource, this.mScreenIntent);
        }
    }

    public void startOnBackground(int i, int i2, int i3) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mFps = i3;
        synchronized (this.mStatFence) {
            if (this.mStatus == 1) {
                return;
            }
            this.mStatus = 1;
            StringBuilder LIZJ = C06460Ne.LIZJ("startOnBackground: width ", i, ", height ", i2, ", fps ");
            LIZJ.append(i3);
            AVLog.iod("LiveStreamVideoCapture", X1D.LIZIZ(LIZJ));
            pause();
        }
    }

    public LiveStreamVideoCapture(int i, Handler handler, Observer observer, LiveStreamBuilder liveStreamBuilder) {
        this(i, handler, observer, liveStreamBuilder.getContext(), liveStreamBuilder);
        int i2;
        this.mLiveStreamBuilder = liveStreamBuilder;
        this.mCameraSwitchInternal = liveStreamBuilder.isSupportCameraSwitchInternal();
        this.mDropFrameDisable = liveStreamBuilder.isDropFramesDisabled();
        this.mBgPushWithAdaptedResolution = liveStreamBuilder.getPushBase().bgPushWithAdaptedResolution;
        this.mOesTo2DInNewThread = liveStreamBuilder.getNeedOesTo2D();
        boolean z = liveStreamBuilder.getPushBase().oneKeyProcess.algSwitch;
        this.mEnableAudioStereoCapture = liveStreamBuilder.getPushBase().enableScreenAudioStereoCapture;
        this.mCameraParams.putBoolean("useCamera2API", liveStreamBuilder.isVECamera2API());
        this.mCameraParams.putBoolean("enableMinCapFpsChange", liveStreamBuilder.getVideoCaptureParams().enableMinCapFpsChange);
        this.mCameraParams.putInt("cameraType", liveStreamBuilder.getCameraType());
        this.mCameraParams.putBoolean("enableCameraStabilization", liveStreamBuilder.isEnableStabilization());
        this.mCameraParams.putInt("camera_open_retry_cnt", liveStreamBuilder.getCameraOpenRetryCnt());
        this.mCameraParams.putInt("camera_retry_start_preview_cnt", liveStreamBuilder.getCameraRetryStartPreviewCnt());
        Bundle bundle = this.mCameraParams;
        if (liveStreamBuilder.isEnableResetFpsRange()) {
            i2 = liveStreamBuilder.getVideoFps();
        } else {
            i2 = 0;
        }
        bundle.putInt("destFps", i2);
        this.mCameraParams.putBoolean("fixFpsRangeCompareBug", liveStreamBuilder.getVideoCaptureParams().fixFpsRangeCompareBug);
        this.mCameraParams.putBoolean("enableWideFov", liveStreamBuilder.isCameraEnableWideFov());
        this.mCameraParams.putBoolean("enableFallback", liveStreamBuilder.isCameraEnableFallback());
        this.mCameraParams.putInt("cameraFaceAEStrategy", liveStreamBuilder.getCameraFaceAEStratety());
        this.mCameraParams.putBoolean("enableWideAngle", liveStreamBuilder.isCameraEnableWideAngle());
        this.mCameraParams.putInt("cameraFrameFormat", liveStreamBuilder.getCameraFrameFormat());
        this.mCameraParams.putBoolean("isForceCloseCamera", liveStreamBuilder.getIsForceCloseCamera());
        this.mCameraParams.putInt("camera_log_level", liveStreamBuilder.getCameraLogLevel());
        this.mCameraParams.putBoolean("is_camera_open_close_sync", liveStreamBuilder.getCameraOpenCloseSync());
        this.mCameraParams.putString("textureMinFilter", liveStreamBuilder.getCameraTexMinFilter());
        this.mCameraParams.putInt("videoCaptureMinFps", liveStreamBuilder.getVideoCaptureMinFps());
        this.mCameraParams.putInt("cameraFrameRateStrategy", liveStreamBuilder.getCameraFrameRateStrategy());
        this.mCameraParams.putBoolean("enableOpenCamera1Opt", liveStreamBuilder.isEnableOpenCamera1Opt());
        this.mCameraParams.putInt("requiredCameraLevel", liveStreamBuilder.getRequiredCameraLevel());
        this.mCameraParams.putInt("cameraMode", liveStreamBuilder.getCameraMode());
        this.mCameraParams.putBoolean("enableFrontFacingVideoContinueFocus", liveStreamBuilder.isEnableFrontCameraContinueFocus());
        this.mCameraParams.putBoolean("enablePreviewTemplate", liveStreamBuilder.isEnableCameraPreviewTemplate());
        this.mCameraParams.putBoolean("enableCallBackStop", liveStreamBuilder.isEnableCallbackStop());
        this.mCameraParams.putBoolean("auto_cap_size", !liveStreamBuilder.getPushBase().disableUpdateVideoCapture);
        this.mCameraParams.putBoolean("enableChooseBestCaptureResolution", liveStreamBuilder.getPushBase().enableChooseBestCaptureResolution);
        this.mCameraParams.putBoolean("need_oes_to_2d", liveStreamBuilder.getNeedOesTo2D());
        this.mCameraParams.putBoolean("try_delive_frame_with_time", liveStreamBuilder.getVideoCaptureParams().tryDeliverFrameWithTime);
        this.mCameraParams.putBoolean("using_self_define_timestamp", liveStreamBuilder.getVideoCaptureParams().usingSelfDefineTimeStamp);
        this.mCameraParams.putBoolean("enableHDR", liveStreamBuilder.getOneKeyProcessParams().enableHDR);
        this.mCameraParams.putBoolean("enableDenoise", liveStreamBuilder.getOneKeyProcessParams().enableDenoise);
        this.mCameraParams.putBoolean("enableAfs", liveStreamBuilder.getOneKeyProcessParams().enableAfs);
        this.mCameraParams.putBoolean("enableHdrV2", liveStreamBuilder.getOneKeyProcessParams().enableHdrV2);
        this.mCameraParams.putBoolean("enableAsyncProcess", liveStreamBuilder.getOneKeyProcessParams().enableAsyncProcess);
        this.mCameraParams.putBoolean("enableDayScene", liveStreamBuilder.getOneKeyProcessParams().enableDayScene);
        this.mCameraParams.putBoolean("enableNightScene", liveStreamBuilder.getOneKeyProcessParams().enableNightScene);
        this.mCameraParams.putString("algParams", liveStreamBuilder.getOneKeyProcessParams().algParams);
        this.mCameraParams.putBoolean("isFirstFrame", liveStreamBuilder.getOneKeyProcessParams().isFirstFrame);
        this.mCameraParams.putBoolean("enableAlgoConfig", liveStreamBuilder.getOneKeyProcessParams().enableAlgoConfig);
        this.mCameraParams.putInt("cvdetectFrames", liveStreamBuilder.getOneKeyProcessParams().cvdetectFrames);
        this.mCameraParams.putBoolean("enableOneKeyProcess", z);
        this.mCameraParams.putInt("est_rate_statistics_type", liveStreamBuilder.getSdkSetting().switchParams.getEstRateStatisticsType());
        this.mCameraParams.putBoolean("camera_size_opt", liveStreamBuilder.getSdkSetting().cameraSizeOpt);
        this.mCameraParams.putBoolean("enable_pts_adjust", liveStreamBuilder.getSdkSetting().enablePtsAdjust);
        DebugLogUtils.isEnableDebugLog();
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSource
    public void adaptOutputFormat(int i, int i2, int i3, TEBundle tEBundle) {
        this.mAvalidFps = i3;
        this.mAdaptedWidth = i;
        this.mAdaptedHeight = i2;
        setCameraAdaptedFormat(i, i2, i3);
        super.nativeAdaptedOutputFormat(this.mAdaptedWidth, this.mAdaptedHeight, this.mAvalidFps, tEBundle);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Adapted output format ");
        LIZ.append(this.mAdaptedWidth);
        LIZ.append("x");
        C15890jp.LIZIZ(LIZ, this.mAdaptedHeight, "@", i3, "fps");
        AVLog.logKibana(5, "LiveStreamVideoCapture", X1D.LIZIZ(LIZ), null);
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureInfo(int i, int i2, int i3, String str) {
        Observer observer;
        if (i == 2) {
            this.mWidth = i2;
            this.mHeight = i3;
        }
        WeakReference<Observer> weakReference = this.mObserver;
        if (weakReference != null && (observer = weakReference.get()) != null) {
            observer.onVideoCaptureInfo(i, i2, i3, str);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int setFocusAreas(int i, int i2, int i3, int i4) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.setFocusAreas(i, i2, i3, i4);
        }
        return -1;
    }

    /* loaded from: classes12.dex */
    public class CameraWrapper extends CameraVideoCapturer {
        public long mBaseTime;
        public long mLastTime;

        @Override // com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer, com.ss.ttlivestreamer.core.capture.video.VideoCapturer
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
            return LiveStreamVideoCapture.this.onFrame(buffer, i, i2, i3, j2);
        }

        public CameraWrapper(Handler handler, boolean z, VideoCapturer.VideoCapturerObserver videoCapturerObserver, int i, Bundle bundle) {
            super(LiveStreamVideoCapture.this.mVideoCaptureOesProcessHandler, handler, z, videoCapturerObserver, LiveStreamVideoCapture.this.mContext, i, bundle);
        }
    }

    public LiveStreamVideoCapture(int i, Handler handler, Observer observer, Context context, final LiveStreamBuilder liveStreamBuilder) {
        boolean z;
        boolean z2;
        this.mRadioModeFps = -1;
        this.mStatFence = new Object();
        boolean z3 = false;
        this.mBackgroundTex = 0;
        this.mCameraParams = new Bundle();
        this.mLastTimestamp = 0L;
        this.mHorizontalMirror = false;
        this.mVerticalMirror = false;
        this.mSaveDevicesIdWhenToBack = 0;
        this.mBgPushWithAdaptedResolution = true;
        this.mOesTo2DInNewThread = false;
        this.screenAudioCaptureDelayMicPackage = 3;
        this.mBGModeFps = -1;
        this.pauseDisableEffectSwitch = false;
        this.enableEffectFlag = false;
        this.mAvalidFps = 0;
        this.mCaptureStoppedSeq = new LinkedList();
        this.mCameraSwitchInternal = true;
        this.mDropFrameDisable = false;
        this.mEnableAudioStereoCapture = false;
        this.mLiveStreamBuilder = null;
        this.mLiveTransParams = new LiveAlgorithmParam.RhythmicMotion();
        this.gameLiveDupInterval = 0;
        this.mSource = i;
        this.mHandler = handler;
        this.mObserver = new WeakReference<>(observer);
        this.mStatus = 0;
        this.mIsResume = true;
        this.mContext = context;
        this.mSaveDevicesIdWhenToBack = this.mSource;
        if (liveStreamBuilder != null && !liveStreamBuilder.getPushBase().disableUpdateVideoCapture) {
            z = true;
        } else {
            z = false;
        }
        this.mEnableUpdateVideoCapture = z;
        if (liveStreamBuilder != null && liveStreamBuilder.getPushBase().restartCameraWhenChangeResolution) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mNeedRestartCameraWhenChangeCaptureResolution = z2;
        this.mEnableChangeCameraFpsWhenRunning = liveStreamBuilder.getVideoCaptureParams().enableChangeCameraFpsWhenRunning;
        if (liveStreamBuilder.getSdkSetting().enableCopyOesProcess && supportOesCopyDeviceType(liveStreamBuilder.getSdkSetting().enableCopyOesProcessCheckSupport)) {
            z3 = true;
        }
        this.enableVideoCaptureOesProcess = z3;
        this.mRadioModeFps = liveStreamBuilder.getVideoCaptureParams().radioModeFps;
        this.gameLiveDupInterval = liveStreamBuilder.getPushBase().gameLiveDupInterval;
        Handler handler2 = this.mHandler;
        if (handler2 != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler2, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.7
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$7__run$___twin___() {
                    if (!GlUtil.nativeIsOpenGlThread()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Thread is not a gl thread.");
                        LIZ.append(LiveStreamVideoCapture.this.mHandler.getLooper().getThread().getName());
                        AVLog.logKibana(5, "LiveStreamVideoCapture", X1D.LIZIZ(LIZ), null);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("not a gl thread.");
                        LIZ2.append(LiveStreamVideoCapture.this.mHandler.getLooper().getThread().getName());
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ2));
                        if (!AnonymousClass028.LJI(androidRuntimeException, "LiveStreamVideoCapture.LiveStreamVideoCapture")) {
                            LiveStreamVideoCapture.this.mHandler = null;
                            return;
                        }
                        throw androidRuntimeException;
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                    boolean LIZ;
                    try {
                        anonymousClass7.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$7__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        if (this.mHandler == null) {
            GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("liveStreamVideoSource");
            this.mGlThread = lockGLThread;
            lockGLThread.start();
            this.mHandler = this.mGlThread.getHandler();
        }
        this.mBackgroundPushVideoFrameRunable = new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.8
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$8__run$___twin___() {
                int i2;
                int i3;
                synchronized (LiveStreamVideoCapture.this.mStatFence) {
                    LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
                    if (liveStreamVideoCapture.mIsResume || liveStreamVideoCapture.status() != 1) {
                        return;
                    }
                    LiveStreamVideoCapture liveStreamVideoCapture2 = LiveStreamVideoCapture.this;
                    liveStreamVideoCapture2.mHandler.removeCallbacks(liveStreamVideoCapture2.mBackgroundPushVideoFrameRunable);
                    LiveStreamVideoCapture liveStreamVideoCapture3 = LiveStreamVideoCapture.this;
                    int i4 = liveStreamVideoCapture3.mAvalidFps;
                    if (i4 <= 0) {
                        i4 = liveStreamVideoCapture3.mFps;
                    }
                    int i5 = liveStreamVideoCapture3.mBGModeFps;
                    if (i5 > 0) {
                        i4 = i5;
                    } else if (i4 <= 0) {
                        i4 = 30;
                    }
                    long j = 1000 / i4;
                    long nanoTime = System.nanoTime() / 1000;
                    LiveStreamVideoCapture liveStreamVideoCapture4 = LiveStreamVideoCapture.this;
                    long j2 = nanoTime - liveStreamVideoCapture4.mBGMTimestampDeltaUs;
                    long j3 = (j2 - liveStreamVideoCapture4.mLastTimestamp) / 1000;
                    if (j3 < j) {
                        liveStreamVideoCapture4.mHandler.postDelayed(liveStreamVideoCapture4.mBackgroundPushVideoFrameRunable, j - j3);
                        return;
                    }
                    VideoCapturer videoCapturer = liveStreamVideoCapture4.mVideoCapturer;
                    if (!(videoCapturer instanceof ExternWrapper)) {
                        liveStreamVideoCapture4.mHandler.post(liveStreamVideoCapture4.mBackgroundPushVideoFrameRunable);
                        return;
                    }
                    if (liveStreamVideoCapture4.mBGMode == 2 && ((ExternWrapper) videoCapturer).pushLastFrame(j2) >= 0) {
                        LiveStreamVideoCapture liveStreamVideoCapture5 = LiveStreamVideoCapture.this;
                        liveStreamVideoCapture5.mHandler.post(liveStreamVideoCapture5.mBackgroundPushVideoFrameRunable);
                        return;
                    }
                    AVLog2.logToIODevice2(5, "LiveStreamVideoCapture", "LiveStreamVideoCapture background push video", null, 28, 10000);
                    LiveStreamVideoCapture liveStreamVideoCapture6 = LiveStreamVideoCapture.this;
                    boolean z4 = liveStreamVideoCapture6.mBgPushWithAdaptedResolution;
                    if (z4) {
                        i2 = liveStreamVideoCapture6.mAdaptedWidth;
                    } else {
                        i2 = liveStreamVideoCapture6.mWidth;
                    }
                    if (z4) {
                        i3 = liveStreamVideoCapture6.mAdaptedHeight;
                    } else {
                        i3 = liveStreamVideoCapture6.mHeight;
                    }
                    int i6 = liveStreamVideoCapture6.mBackgroundTex;
                    if (i6 > 0) {
                        ((ExternWrapper) liveStreamVideoCapture6.mVideoCapturer).pushVideoFrame(i6, false, i2, i3, 0, null, j2, null, TimeUtils.currentTimeMs());
                    } else {
                        AVLog2.logToIODevice2(6, "LiveStreamVideoCapture", "Did not run setBackGroundPhotoPath,push null frame...", null, 29, 10000);
                        ((ExternWrapper) LiveStreamVideoCapture.this.mVideoCapturer).pushVideoFrame(-1, false, i2, i3, 0, null, j2, null, TimeUtils.currentTimeMs());
                    }
                    LiveStreamVideoCapture liveStreamVideoCapture7 = LiveStreamVideoCapture.this;
                    liveStreamVideoCapture7.mHandler.post(liveStreamVideoCapture7.mBackgroundPushVideoFrameRunable);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        if (this.mHandler == null) {
            this.mHandler = this.mGlThread.getHandler();
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.9
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$9__run$___twin___() {
                boolean z4;
                LiveStreamVideoCapture.this.mThreadChecker = new ThreadUtils.ThreadChecker();
                LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
                LiveStreamBuilder liveStreamBuilder2 = liveStreamBuilder;
                if (liveStreamBuilder2 != null && liveStreamBuilder2.isEnableGammaCorrectionAtExternVideoCapture()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                liveStreamVideoCapture.mDrawer = new GlRenderDrawer(z4);
                LiveStreamVideoCapture.this.mTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                boolean LIZ;
                try {
                    anonymousClass9.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$9__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        this.mBGMHandler = new BGMHandler(this.mHandler.getLooper());
        this.mSwitchCaptureRunnable = new SwitchCaptureRunnable();
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        int onFrame;
        try {
            this.mThreadChecker.checkIsOnValidThread();
        } catch (Exception e) {
            AVLog.w("LiveStreamVideoCapture", e.toString());
        }
        long j2 = j - this.mLastTimestamp;
        if (j2 < 0) {
            AVLog2.logToIODevice2(5, "LiveStreamVideoCapture", C61845OOz.LIZ("LiveStreamVideoCapture.onFrame drop frame: diffUs ", j2), null, 30, 10000);
            StringBuilder LIZJ = V10.LIZJ("BUG! time stamp revert", j, " vs. ");
            LIZJ.append(this.mLastTimestamp);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZJ));
            if (!AnonymousClass028.LJI(androidRuntimeException, "LiveStreamVideoCapture.onFrame")) {
                return -1;
            }
            throw androidRuntimeException;
        }
        this.mLastTimestamp = j;
        if (status() != 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("status ");
            LIZ.append(status());
            AVLog2.logToIODevice2(5, "LiveStreamVideoCapture", i0.LJFF("LiveStreamVideoCapture.onFrame drop frame: ", X1D.LIZIZ(LIZ)), null, 32, 10000);
            return -1;
        }
        synchronized (this.mStatFence) {
            onFrame = super.onFrame(buffer, i, i2, i3, j);
        }
        return onFrame;
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        VideoCapturer videoCapturer;
        if ((this.mBGMode != 1 && !this.mIsResume) || (videoCapturer = this.mVideoCapturer) == null || !(videoCapturer instanceof ExternWrapper)) {
            return -1;
        }
        return ((ExternalVideoCapturer) videoCapturer).pushVideoFrame(byteBuffer, i, i2, i3, TimeUtils.nativeNanoTime() / 1000, TimeUtils.currentTimeMs());
    }

    public void updateCaptureVideoResolution(int i, int i2, int i3, final int i4, int i5) {
        boolean z;
        boolean z2 = true;
        if (this.mCameraParams.getBoolean("enableMinCapFpsChange")) {
            if (this.mCameraParams.getInt("enableMinCapFpsChange") != i3 || this.mFps != i4) {
                z = true;
            } else {
                z = false;
            }
            this.mCameraParams.putInt("videoCaptureMinFps", i3);
        } else if (this.mFps != i4) {
            z = true;
        } else {
            z = false;
        }
        if (this.mEnableUpdateVideoCapture && this.mCameraParams.getBoolean("camera_size_opt", false) && isVideoCaptureSizeChanged(i, i2)) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mFps = i4;
            StringBuilder LIZJ = C06460Ne.LIZJ("updateCaptureVideoResolution: ", i, "x", i2, "x");
            LIZJ.append(i3);
            LIZJ.append("x");
            LIZJ.append(i4);
            AVLog.logKibana(5, "LiveStreamVideoCapture", X1D.LIZIZ(LIZJ), null);
            if (!this.mNeedRestartCameraWhenChangeCaptureResolution) {
                if (this.mVideoCapturer instanceof CameraVideoCapturer) {
                    ((CameraVideoCapturer) this.mVideoCapturer).updateCaptureResolution(i, i2, getMinFps(i4), i4);
                }
            } else {
                this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$2__run$___twin___() {
                        LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
                        liveStreamVideoCapture.onSwitchVideoCapturer(liveStreamVideoCapture.mSaveDevicesIdWhenToBack, true);
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                        boolean LIZ;
                        try {
                            anonymousClass2.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$2__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        } else {
            z2 = false;
        }
        if (this.mEnableChangeCameraFpsWhenRunning && !z2 && z) {
            this.mFps = i4;
            AVLog.logKibana(5, "LiveStreamVideoCapture", C48263Iwt.LIZLLL("updateCaptureVideoFps: min:", i3, " fps:", i4), null);
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.3
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$3__run$___twin___() {
                    int i6;
                    LiveStreamVideoCapture liveStreamVideoCapture;
                    int i7;
                    LiveStreamVideoCapture liveStreamVideoCapture2 = LiveStreamVideoCapture.this;
                    if (liveStreamVideoCapture2.mVideoCapturer instanceof CameraVideoCapturer) {
                        int i8 = liveStreamVideoCapture2.mCameraParams.getInt("videoCaptureMinFps", -1);
                        if (i8 > 0 && i8 <= 30 && (i7 = (liveStreamVideoCapture = LiveStreamVideoCapture.this).mFps) > 0 && i7 <= 30 && i8 <= i7) {
                            ((CameraVideoCapturer) liveStreamVideoCapture.mVideoCapturer).setCameraPreviewFpsRangeWhenRunning(i8, i4);
                            return;
                        }
                        LiveStreamVideoCapture liveStreamVideoCapture3 = LiveStreamVideoCapture.this;
                        CameraVideoCapturer cameraVideoCapturer = (CameraVideoCapturer) liveStreamVideoCapture3.mVideoCapturer;
                        int i9 = liveStreamVideoCapture3.mFps;
                        if (i9 < 30) {
                            i6 = i9;
                        } else {
                            i6 = 7;
                        }
                        cameraVideoCapturer.setCameraPreviewFpsRangeWhenRunning(i6, i9);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamVideoCapture$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        updateRadioModeFps(i5);
    }

    public int pushVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, long j) {
        VideoCapturer videoCapturer;
        if ((this.mBGMode != 1 && !this.mIsResume) || (videoCapturer = this.mVideoCapturer) == null || !(videoCapturer instanceof ExternWrapper)) {
            return -1;
        }
        return ((ExternalVideoCapturer) videoCapturer).pushVideoFrame(byteBufferArr, iArr, i, i2, i3, TimeUtils.nativeNanoTime() / 1000, TimeUtils.currentTimeMs());
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, long j) {
        VideoCapturer videoCapturer;
        if ((this.mBGMode != 1 && !this.mIsResume) || (videoCapturer = this.mVideoCapturer) == null || !(videoCapturer instanceof ExternWrapper)) {
            return -1;
        }
        return ((ExternalVideoCapturer) videoCapturer).pushVideoFrame(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, TimeUtils.nativeNanoTime() / 1000, TimeUtils.currentTimeMs());
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        VideoCapturer videoCapturer;
        if ((this.mBGMode != 1 && !this.mIsResume) || (videoCapturer = this.mVideoCapturer) == null || !(videoCapturer instanceof ExternWrapper)) {
            return -1;
        }
        return ((ExternalVideoCapturer) videoCapturer).pushVideoFrame(i, z, i2, i3, i4, fArr, TimeUtils.nativeNanoTime() / 1000, bundle, TimeUtils.currentTimeMs());
    }
}
