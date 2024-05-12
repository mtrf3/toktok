package com.bytedance.realx.video;

import X.C16880lQ;
import X.V0N;
import X.X1D;
import X.ZV9;
import android.content.Context;
import android.media.MediaRecorder;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.CameraCapturer;
import com.bytedance.realx.video.CameraEnumerationAndroid;
import com.bytedance.realx.video.CameraSession;
import com.bytedance.realx.video.CameraVideoCapturer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes33.dex */
public abstract class CameraCapturer implements CameraVideoCapturer {
    public Context applicationContext;
    public final CameraEnumerator cameraEnumerator;
    public String cameraName;
    public CameraVideoCapturer.CameraStatistics cameraStatistics;
    public Handler cameraThreadHandler;
    public CapturerObserver capturerObserver;
    public CameraSession currentSession;
    public final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    public boolean firstFrameObserved;
    public int framerate;
    public int height;
    public int openAttemptsRemaining;
    public boolean sessionOpening;
    public SurfaceTextureHelper surfaceHelper;
    public CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    public final Handler uiThreadHandler;
    public int width;
    public CameraVideoCapturer.ORIENTATION_MODE mOrientationMode = CameraVideoCapturer.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
    public final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() { // from class: com.bytedance.realx.video.CameraCapturer.1
        @Override // com.bytedance.realx.video.CameraSession.CreateSessionCallback
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer cameraCapturer = CameraCapturer.this;
            cameraCapturer.uiThreadHandler.removeCallbacks(cameraCapturer.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Create session done. Switch state: ");
                LIZ.append(CameraCapturer.this.switchState);
                RXLogging.w("CameraCapturer", X1D.LIZIZ(LIZ));
                if (cameraSession != null) {
                    cameraSession.setOrientationMode(CameraCapturer.this.mOrientationMode);
                }
                CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                CameraCapturer cameraCapturer2 = CameraCapturer.this;
                cameraCapturer2.sessionOpening = false;
                cameraCapturer2.currentSession = cameraSession;
                cameraCapturer2.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer2.surfaceHelper, cameraCapturer2.eventsHandler);
                CameraCapturer cameraCapturer3 = CameraCapturer.this;
                cameraCapturer3.firstFrameObserved = false;
                cameraCapturer3.stateLock.notifyAll();
                CameraCapturer cameraCapturer4 = CameraCapturer.this;
                SwitchState switchState = cameraCapturer4.switchState;
                if (switchState == SwitchState.IN_PROGRESS) {
                    cameraCapturer4.switchState = SwitchState.IDLE;
                    CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler = cameraCapturer4.switchEventsHandler;
                    if (cameraSwitchHandler != null) {
                        cameraSwitchHandler.onCameraSwitchDone(cameraCapturer4.cameraEnumerator.isFrontFacing(cameraCapturer4.cameraName));
                        CameraCapturer.this.switchEventsHandler = null;
                    }
                } else if (switchState == SwitchState.PENDING) {
                    cameraCapturer4.switchState = SwitchState.IDLE;
                    cameraCapturer4.switchCameraInternal(cameraCapturer4.switchEventsHandler);
                }
            }
        }

        @Override // com.bytedance.realx.video.CameraSession.CreateSessionCallback
        public void onFailure(CameraSession.FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer cameraCapturer = CameraCapturer.this;
            cameraCapturer.uiThreadHandler.removeCallbacks(cameraCapturer.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                CameraCapturer cameraCapturer2 = CameraCapturer.this;
                int i = cameraCapturer2.openAttemptsRemaining - 1;
                cameraCapturer2.openAttemptsRemaining = i;
                if (i > 0) {
                    RXLogging.e("CameraCapturer", "Opening camera failed, retry: " + str);
                    CameraCapturer.this.createSessionInternal(LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
                } else {
                    RXLogging.e("CameraCapturer", "Opening camera failed, passing: " + str);
                    CameraCapturer cameraCapturer3 = CameraCapturer.this;
                    cameraCapturer3.sessionOpening = false;
                    cameraCapturer3.stateLock.notifyAll();
                    CameraCapturer cameraCapturer4 = CameraCapturer.this;
                    SwitchState switchState = cameraCapturer4.switchState;
                    SwitchState switchState2 = SwitchState.IDLE;
                    if (switchState != switchState2) {
                        CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler = cameraCapturer4.switchEventsHandler;
                        if (cameraSwitchHandler != null) {
                            cameraSwitchHandler.onCameraSwitchError(str);
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                        CameraCapturer.this.switchState = switchState2;
                    }
                    if (failureType == CameraSession.FailureType.DISCONNECTED) {
                        CameraCapturer.this.eventsHandler.onCameraDisconnected();
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraError(str);
                    }
                }
            }
        }
    };
    public final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() { // from class: com.bytedance.realx.video.CameraCapturer.2
        @Override // com.bytedance.realx.video.CameraSession.Events
        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (cameraCapturer.currentSession != null) {
                    RXLogging.e("CameraCapturer", "onCameraOpening while session was open.");
                } else {
                    cameraCapturer.eventsHandler.onCameraOpening(cameraCapturer.cameraName);
                }
            }
        }

        @Override // com.bytedance.realx.video.CameraSession.Events
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                CameraSession cameraSession2 = cameraCapturer.currentSession;
                if (cameraSession != cameraSession2 && cameraSession2 != null) {
                    RXLogging.e("CameraCapturer", "onCameraClosed from another session.");
                } else {
                    cameraCapturer.eventsHandler.onCameraClosed();
                }
            }
        }

        @Override // com.bytedance.realx.video.CameraSession.Events
        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (cameraSession != cameraCapturer.currentSession) {
                    RXLogging.e("CameraCapturer", "onCameraDisconnected from another session.");
                    return;
                }
                cameraCapturer.eventsHandler.onCameraDisconnected();
                CameraCapturer.this.capturerObserver.onCapturerError("CameraDisconnected");
                CameraCapturer.this.stopCapture();
            }
        }

        @Override // com.bytedance.realx.video.CameraSession.Events
        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (cameraSession != cameraCapturer.currentSession) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onCameraError from another session: ");
                    LIZ.append(str);
                    RXLogging.e("CameraCapturer", X1D.LIZIZ(LIZ));
                    return;
                }
                cameraCapturer.eventsHandler.onCameraError(str);
                CameraCapturer.this.capturerObserver.onCapturerError(str);
                CameraCapturer.this.stopCapture();
            }
        }

        @Override // com.bytedance.realx.video.CameraSession.Events
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (cameraSession != cameraCapturer.currentSession) {
                    RXLogging.e("CameraCapturer", "onFrameCaptured from another session.");
                    return;
                }
                if (!cameraCapturer.firstFrameObserved) {
                    cameraCapturer.eventsHandler.onFirstFrameAvailable();
                    CameraCapturer.this.firstFrameObserved = true;
                }
                CameraVideoCapturer.CameraStatistics cameraStatistics = CameraCapturer.this.cameraStatistics;
                if (cameraStatistics != null) {
                    cameraStatistics.addFrame();
                }
                CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
            }
        }

        @Override // com.bytedance.realx.video.CameraSession.Events
        public void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.eventsHandler.onCameraConfig(i, i2, framerateRange);
                CameraCapturer.this.capturerObserver.onCapturerFormatSelected(i, i2, framerateRange.min / 1000, framerateRange.max / 1000, RXPixelFormat.kUnknown.value());
            }
        }
    };
    public final Runnable openCameraTimeoutRunnable = new Runnable() { // from class: com.bytedance.realx.video.CameraCapturer.3
        @Override // java.lang.Runnable
        public void run() {
            com_bytedance_realx_video_CameraCapturer$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_bytedance_realx_video_CameraCapturer$3__run$___twin___() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }

        public static void com_bytedance_realx_video_CameraCapturer$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
            boolean LIZ;
            try {
                anonymousClass3.com_bytedance_realx_video_CameraCapturer$3__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    };
    public final Object stateLock = new Object();
    public SwitchState switchState = SwitchState.IDLE;
    public String nativeLibraryName = "bytertc";
    public boolean mEnableFollowGravity = false;

    @Override // com.bytedance.realx.video.CameraVideoCapturer
    public final /* synthetic */ void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        ZV9.LIZ(this, mediaRecorder, mediaRecorderHandler);
    }

    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3);

    @Override // com.bytedance.realx.video.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // com.bytedance.realx.video.CameraVideoCapturer
    public final /* synthetic */ void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        ZV9.LIZIZ(this, mediaRecorderHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$turnOffFlashLight$2() {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            cameraSession.turnOffFlashLight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$turnOnFlashLight$1() {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            cameraSession.turnOnFlashLight();
        }
    }

    public void checkIsOnCameraThread() {
        if (this.cameraThreadHandler != null && C16880lQ.LLLLIIIILLL() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        RXLogging.e("CameraCapturer", "Check is on camera thread failed.");
        throw new RuntimeException("Not on camera thread.");
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public void dispose() {
        RXLogging.w("CameraCapturer", "dispose");
        stopCapture();
    }

    public String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public float getCameraZoomMaxRatio() {
        final AtomicReference atomicReference = new AtomicReference(Float.valueOf(1.0f));
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: X.ZUs
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.lambda$getCameraZoomMaxRatio$5(atomicReference);
            }
        });
        return ((Float) atomicReference.get()).floatValue();
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public int getDeviceOrientation() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: X.ZUj
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.lambda$getDeviceOrientation$7(atomicInteger);
            }
        });
        return atomicInteger.get();
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public boolean isCameraTorchSupported() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: X.ZUz
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.lambda$isCameraTorchSupported$0(atomicBoolean);
            }
        });
        return atomicBoolean.get();
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public boolean isCameraZoomSupported() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: X.ZUv
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.lambda$isCameraZoomSupported$3(atomicBoolean);
            }
        });
        return atomicBoolean.get();
    }

    public void printStackTrace() {
        Thread thread;
        Handler handler = this.cameraThreadHandler;
        if (handler != null && (thread = handler.getLooper().getThread()) != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                RXLogging.w("CameraCapturer", "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    RXLogging.w("CameraCapturer", stackTraceElement.toString());
                }
            }
        }
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public void stopCapture() {
        RXLogging.w("CameraCapturer", "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                RXLogging.w("CameraCapturer", "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    RXLogging.e("CameraCapturer", "Stop capture interrupted while waiting for the session to open.");
                    C16880lQ.LLLLIIIILLL().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                RXLogging.w("CameraCapturer", "Stop capture: Nulling session");
                CameraVideoCapturer.CameraStatistics cameraStatistics = this.cameraStatistics;
                if (cameraStatistics != null) {
                    cameraStatistics.release();
                    this.cameraStatistics = null;
                }
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() { // from class: com.bytedance.realx.video.CameraCapturer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com_bytedance_realx_video_CameraCapturer$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_bytedance_realx_video_CameraCapturer$6__run$___twin___() {
                        cameraSession.stop();
                    }

                    public static void com_bytedance_realx_video_CameraCapturer$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                        boolean LIZ;
                        try {
                            anonymousClass6.com_bytedance_realx_video_CameraCapturer$6__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                RXLogging.w("CameraCapturer", "Stop capture: No session open");
            }
        }
        RXLogging.w("CameraCapturer", "Stop capture done");
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public void turnOffFlashLight() {
        this.cameraThreadHandler.post(new Runnable() { // from class: X.ZV1
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.lambda$turnOffFlashLight$2();
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public void turnOnFlashLight() {
        this.cameraThreadHandler.post(new Runnable() { // from class: X.ZUx
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.lambda$turnOnFlashLight$1();
            }
        });
    }

    /* loaded from: classes33.dex */
    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS;

        public static SwitchState valueOf(String str) {
            return (SwitchState) V0N.LJJJ(SwitchState.class, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCameraZoomMaxRatio$5(AtomicReference atomicReference) {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            atomicReference.set(Float.valueOf(cameraSession.getCameraZoomMaxRatio()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getDeviceOrientation$7(AtomicInteger atomicInteger) {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            atomicInteger.set(cameraSession.getDeviceOrientation());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isCameraTorchSupported$0(AtomicBoolean atomicBoolean) {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            atomicBoolean.set(cameraSession.isCameraTorchSupported());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isCameraZoomSupported$3(AtomicBoolean atomicBoolean) {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            atomicBoolean.set(cameraSession.isCameraZoomSupported());
        }
    }

    public void createSessionInternal(int i) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i + 10000);
        Handler handler = this.cameraThreadHandler;
        if (handler == null) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.bytedance.realx.video.CameraCapturer.5
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_realx_video_CameraCapturer$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_realx_video_CameraCapturer$5__run$___twin___() {
                try {
                    synchronized (CameraCapturer.this.stateLock) {
                        CameraCapturer cameraCapturer = CameraCapturer.this;
                        cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, cameraCapturer.cameraSessionEventsHandler, cameraCapturer.applicationContext, cameraCapturer.surfaceHelper, cameraCapturer.cameraName, cameraCapturer.width, cameraCapturer.height, cameraCapturer.framerate);
                    }
                } catch (IllegalArgumentException e) {
                    CapturerObserver capturerObserver = CameraCapturer.this.capturerObserver;
                    if (capturerObserver != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Create VideoCapture Session fail : ");
                        LIZ.append(e.getMessage());
                        capturerObserver.onCapturerError(X1D.LIZIZ(LIZ));
                    }
                }
            }

            public static void com_bytedance_realx_video_CameraCapturer$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_bytedance_realx_video_CameraCapturer$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, i);
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public int enableFollowGravity(final boolean z) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: X.ZUp
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.lambda$enableFollowGravity$6(z, atomicInteger);
            }
        });
        int i = atomicInteger.get();
        if (i == 0) {
            this.mEnableFollowGravity = z;
        }
        return i;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public int setCameraZoomRatio(final float f) {
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        ThreadUtils.invokeAtFrontUninterruptibly(this.cameraThreadHandler, new Runnable() { // from class: X.ZUm
            @Override // java.lang.Runnable
            public final void run() {
                CameraCapturer.this.lambda$setCameraZoomRatio$4(f, atomicInteger);
            }
        });
        return atomicInteger.get();
    }

    @Override // com.bytedance.realx.video.CameraVideoCapturer
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        this.mOrientationMode = orientation_mode;
    }

    @Override // com.bytedance.realx.video.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        RXLogging.w("CameraCapturer", "switchCamera");
        Handler handler = this.cameraThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.bytedance.realx.video.CameraCapturer.7
                @Override // java.lang.Runnable
                public void run() {
                    com_bytedance_realx_video_CameraCapturer$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_bytedance_realx_video_CameraCapturer$7__run$___twin___() {
                    CameraCapturer.this.switchCameraInternal(cameraSwitchHandler);
                }

                public static void com_bytedance_realx_video_CameraCapturer$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                    boolean LIZ;
                    try {
                        anonymousClass7.com_bytedance_realx_video_CameraCapturer$7__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public void switchCameraInternal(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        RXLogging.w("CameraCapturer", "switchCamera internal");
        String[] deviceNames = this.cameraEnumerator.getDeviceNames();
        if (deviceNames.length < 2) {
            if (cameraSwitchHandler != null) {
                cameraSwitchHandler.onCameraSwitchError("No camera to switch to.");
                return;
            }
            return;
        }
        synchronized (this.stateLock) {
            if (this.switchState != SwitchState.IDLE) {
                reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                return;
            }
            boolean z = this.sessionOpening;
            if (!z && this.currentSession == null) {
                reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                return;
            }
            this.switchEventsHandler = cameraSwitchHandler;
            if (z) {
                this.switchState = SwitchState.PENDING;
                return;
            }
            this.switchState = SwitchState.IN_PROGRESS;
            RXLogging.w("CameraCapturer", "switchCamera: Stopping session");
            CameraVideoCapturer.CameraStatistics cameraStatistics = this.cameraStatistics;
            if (cameraStatistics != null) {
                cameraStatistics.release();
                this.cameraStatistics = null;
            }
            final CameraSession cameraSession = this.currentSession;
            Handler handler = this.cameraThreadHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.bytedance.realx.video.CameraCapturer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        com_bytedance_realx_video_CameraCapturer$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_bytedance_realx_video_CameraCapturer$8__run$___twin___() {
                        cameraSession.stop();
                    }

                    public static void com_bytedance_realx_video_CameraCapturer$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                        boolean LIZ;
                        try {
                            anonymousClass8.com_bytedance_realx_video_CameraCapturer$8__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
            this.currentSession = null;
            this.cameraName = deviceNames[(Arrays.asList(deviceNames).indexOf(this.cameraName) + 1) % deviceNames.length];
            this.sessionOpening = true;
            this.openAttemptsRemaining = 1;
            createSessionInternal(0);
            RXLogging.w("CameraCapturer", "switchCamera done");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableFollowGravity$6(boolean z, AtomicInteger atomicInteger) {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            atomicInteger.set(cameraSession.enableFollowGravity(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCameraZoomRatio$4(float f, AtomicInteger atomicInteger) {
        CameraSession cameraSession = this.currentSession;
        if (cameraSession != null) {
            cameraSession.setCameraZoomRatio(f);
            atomicInteger.set(0);
        }
    }

    private void reportCameraSwitchError(String str, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        RXLogging.e("CameraCapturer", str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator) {
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() { // from class: com.bytedance.realx.video.CameraCapturer.4
            @Override // com.bytedance.realx.video.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
                RXLogging.w("CameraCapturer", "CameraEventsHandler onCameraClosed");
            }

            @Override // com.bytedance.realx.video.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
                RXLogging.e("CameraCapturer", "CameraEventsHandler onCameraDisconnected");
            }

            @Override // com.bytedance.realx.video.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
                RXLogging.w("CameraCapturer", "CameraEventsHandler onFirstFrameAvailable");
            }

            @Override // com.bytedance.realx.video.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(String str2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CameraEventsHandler onCameraError: ");
                LIZ.append(str2);
                RXLogging.e("CameraCapturer", X1D.LIZIZ(LIZ));
            }

            @Override // com.bytedance.realx.video.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String str2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CameraEventsHandler onCameraFreezed: ");
                LIZ.append(str2);
                RXLogging.e("CameraCapturer", X1D.LIZIZ(LIZ));
            }

            @Override // com.bytedance.realx.video.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String str2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CameraEventsHandler onCameraOpening");
                LIZ.append(str2);
                RXLogging.w("CameraCapturer", X1D.LIZIZ(LIZ));
            }

            @Override // com.bytedance.realx.video.CameraVideoCapturer.CameraEventsHandler
            public void onCameraConfig(int i, int i2, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
                RXLogging.w("CameraCapturer", "CameraEventsHandler onCameraClosed");
            }
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator;
        this.cameraName = str;
        this.uiThreadHandler = new Handler(C16880lQ.LLJJJJ());
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        if (deviceNames.length != 0) {
            if (Arrays.asList(deviceNames).contains(this.cameraName)) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Camera name ");
            LIZ.append(this.cameraName);
            LIZ.append(" does not match any known camera device.");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        throw new RuntimeException("No cameras attached.");
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeCaptureFormat: ");
        LIZ.append(i);
        LIZ.append("x");
        LIZ.append(i2);
        LIZ.append("@");
        LIZ.append(i3);
        RXLogging.w("CameraCapturer", X1D.LIZIZ(LIZ));
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i, i2, i3);
        }
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        Handler handler;
        this.applicationContext = context;
        synchronized (this.stateLock) {
            this.capturerObserver = capturerObserver;
        }
        this.surfaceHelper = surfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            handler = null;
        } else {
            handler = surfaceTextureHelper.getHandler();
        }
        this.cameraThreadHandler = handler;
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public void startCapture(int i, int i2, int i3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startCapture: ");
        LIZ.append(i);
        LIZ.append("x");
        LIZ.append(i2);
        LIZ.append("@");
        LIZ.append(i3);
        RXLogging.w("CameraCapturer", X1D.LIZIZ(LIZ));
        if (this.applicationContext != null) {
            synchronized (this.stateLock) {
                if (this.sessionOpening || this.currentSession != null) {
                    RXLogging.w("CameraCapturer", "Session already open");
                    return;
                }
                this.width = i;
                this.height = i2;
                this.framerate = i3;
                this.sessionOpening = true;
                this.openAttemptsRemaining = 3;
                createSessionInternal(0);
                return;
            }
        }
        throw new RuntimeException("CameraCapturer must be initialized before calling startCapture.");
    }

    @Override // com.bytedance.realx.video.VideoCapturer
    public void startCapture(int i, int i2, int i3, int i4) {
        startCapture(i, i2, i3);
    }
}
