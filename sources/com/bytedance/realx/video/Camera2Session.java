package com.bytedance.realx.video;

import X.C03880Dg;
import X.C16880lQ;
import X.C65300Pk0;
import X.V0N;
import X.X1D;
import X.ZV3;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.Camera2Session;
import com.bytedance.realx.video.CameraEnumerationAndroid;
import com.bytedance.realx.video.CameraSession;
import com.bytedance.realx.video.CameraVideoCapturer;
import com.bytedance.realx.video.VideoFrame;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes33.dex */
public class Camera2Session implements CameraSession {
    public final Context applicationContext;
    public final CameraSession.CreateSessionCallback callback;
    public CameraCharacteristics cameraCharacteristics;
    public CameraDevice cameraDevice;
    public final String cameraId;
    public final CameraManager cameraManager;
    public int cameraOrientation;
    public final Handler cameraThreadHandler;
    public CameraEnumerationAndroid.CaptureFormat captureFormat;
    public CameraCaptureSession captureSession;
    public final long constructionTimeNs;
    public final CameraSession.Events events;
    public boolean firstFrameReported;
    public int fpsUnitFactor;
    public final int framerate;
    public final int height;
    public boolean isCameraFrontFacing;
    public SessionState state = SessionState.RUNNING;
    public Surface surface;
    public final SurfaceTextureHelper surfaceTextureHelper;
    public final int width;
    public static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, 10000, 50);
    public static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, 10000, 50);
    public static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    public static void com_bytedance_realx_video_Camera2Session_android_hardware_camera2_CameraDevice_close(CameraDevice cameraDevice) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "8417857577881749860");
        if (c03880Dg.LIZJ(100201, "android/hardware/camera2/CameraDevice", "close", cameraDevice, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100201, "android/hardware/camera2/CameraDevice", "close", null, objArr, cameraDevice, c65300Pk0, false);
        } else {
            cameraDevice.close();
            c03880Dg.LIZIZ(100201, "android/hardware/camera2/CameraDevice", "close", null, objArr, cameraDevice, c65300Pk0, true);
        }
    }

    public static void com_bytedance_realx_video_Camera2Session_android_hardware_camera2_CameraManager_openCamera(CameraManager cameraManager, String str, CameraDevice.StateCallback stateCallback, Handler handler) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, stateCallback, handler};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V", "8417857577881749860");
        if (c03880Dg.LIZJ(100206, "android/hardware/camera2/CameraManager", "openCamera", cameraManager, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100206, "android/hardware/camera2/CameraManager", "openCamera", null, objArr, cameraManager, c65300Pk0, false);
        } else {
            cameraManager.openCamera(str, stateCallback, handler);
            c03880Dg.LIZIZ(100206, "android/hardware/camera2/CameraManager", "openCamera", null, objArr, cameraManager, c65300Pk0, true);
        }
    }

    @Override // com.bytedance.realx.video.CameraSession
    public int enableFollowGravity(boolean z) {
        return z ? -1 : 0;
    }

    @Override // com.bytedance.realx.video.CameraSession
    public float getCameraZoomMaxRatio() {
        return 1.0f;
    }

    @Override // com.bytedance.realx.video.CameraSession
    public boolean isCameraTorchSupported() {
        return false;
    }

    @Override // com.bytedance.realx.video.CameraSession
    public boolean isCameraZoomSupported() {
        return false;
    }

    @Override // com.bytedance.realx.video.CameraSession
    public int setCameraZoomRatio(float f) {
        return 0;
    }

    @Override // com.bytedance.realx.video.CameraSession
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
    }

    @Override // com.bytedance.realx.video.CameraSession
    public void turnOffFlashLight() {
    }

    @Override // com.bytedance.realx.video.CameraSession
    public void turnOnFlashLight() {
    }

    public int getFrameOrientation() {
        int LIZIZ = ZV3.LIZIZ(this.applicationContext);
        if (!this.isCameraFrontFacing) {
            LIZIZ = 360 - LIZIZ;
        }
        return (this.cameraOrientation + LIZIZ) % 360;
    }

    public void stopInternal() {
        RXLogging.i("Camera2Session", "Stop internal");
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            com_bytedance_realx_video_Camera2Session_android_hardware_camera2_CameraDevice_close(cameraDevice);
            this.cameraDevice = null;
        }
        RXLogging.i("Camera2Session", "Stop done");
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread();
        Range[] rangeArr = (Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor);
        List<Size> supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Available preview sizes: ");
        LIZ.append(supportedSizes);
        RXLogging.i("Camera2Session", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Available fps ranges: ");
        LIZ2.append(convertFramerates);
        RXLogging.i("Camera2Session", X1D.LIZIZ(LIZ2));
        if (convertFramerates.isEmpty() || supportedSizes.isEmpty()) {
            reportError("No supported capture formats.");
            return;
        }
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, this.framerate);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
        CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
        this.captureFormat = new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Using capture format: ");
        LIZ3.append(this.captureFormat);
        RXLogging.i("Camera2Session", X1D.LIZIZ(LIZ3));
    }

    private void openCamera() {
        checkIsOnCameraThread();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Opening camera ");
        LIZ.append(this.cameraId);
        RXLogging.i("Camera2Session", X1D.LIZIZ(LIZ));
        this.events.onCameraOpening();
        try {
            com_bytedance_realx_video_Camera2Session_android_hardware_camera2_CameraManager_openCamera(this.cameraManager, this.cameraId, new CameraStateCallback(), this.cameraThreadHandler);
        } catch (CameraAccessException e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Failed to open camera: ");
            LIZ2.append(e);
            reportError(X1D.LIZIZ(LIZ2));
        }
    }

    private void start() {
        boolean z;
        checkIsOnCameraThread();
        RXLogging.i("Camera2Session", "start");
        try {
            CameraCharacteristics cameraCharacteristics = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraCharacteristics = cameraCharacteristics;
            this.cameraOrientation = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            if (((Integer) this.cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.isCameraFrontFacing = z;
            findCaptureFormat();
            openCamera();
        } catch (CameraAccessException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getCameraCharacteristics(): ");
            LIZ.append(e.getMessage());
            reportError(X1D.LIZIZ(LIZ));
        }
    }

    public void checkIsOnCameraThread() {
        if (C16880lQ.LLLLIIIILLL() == this.cameraThreadHandler.getLooper().getThread()) {
        } else {
            throw new IllegalStateException("Wrong thread");
        }
    }

    @Override // com.bytedance.realx.video.CameraSession
    public int getDeviceOrientation() {
        return ZV3.LIZIZ(ContextUtils.getApplicationContext());
    }

    @Override // com.bytedance.realx.video.CameraSession
    public void stop() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Stop camera2 session on camera ");
        LIZ.append(this.cameraId);
        RXLogging.i("Camera2Session", X1D.LIZIZ(LIZ));
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long nanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    /* loaded from: classes33.dex */
    public static class CameraCaptureCallback extends CameraCaptureSession.CaptureCallback {
        public CameraCaptureCallback() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Capture failed: ");
            LIZ.append(captureFailure);
            RXLogging.i("Camera2Session", X1D.LIZIZ(LIZ));
        }
    }

    /* loaded from: classes33.dex */
    public class CameraStateCallback extends CameraDevice.StateCallback {
        public CameraStateCallback() {
        }

        private String getErrorDescription(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Unknown camera error: ");
                                LIZ.append(i);
                                return X1D.LIZIZ(LIZ);
                            }
                            return "Camera service has encountered a fatal error.";
                        }
                        return "Camera device has encountered a fatal error.";
                    }
                    return "Camera device could not be opened due to a device policy.";
                }
                return "Camera device could not be opened because there are too many other open camera devices.";
            }
            return "Camera device is in use already.";
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            RXLogging.i("Camera2Session", "Camera device closed.");
            Camera2Session camera2Session = Camera2Session.this;
            camera2Session.events.onCameraClosed(camera2Session);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            boolean z;
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session camera2Session = Camera2Session.this;
            if (camera2Session.captureSession == null && camera2Session.state != SessionState.STOPPED) {
                z = true;
            } else {
                z = false;
            }
            camera2Session.state = SessionState.STOPPED;
            camera2Session.stopInternal();
            if (z) {
                Camera2Session.this.callback.onFailure(CameraSession.FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                Camera2Session camera2Session2 = Camera2Session.this;
                camera2Session2.events.onCameraDisconnected(camera2Session2);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            if (new C03880Dg(2).LIZJ(100200, "com/bytedance/realx/video/Camera2Session$CameraStateCallback", "onOpened", this, new Object[]{cameraDevice}, "void", new C65300Pk0(false, "(Landroid/hardware/camera2/CameraDevice;)V", "8417857577881749860")).LIZ) {
                return;
            }
            Camera2Session.this.checkIsOnCameraThread();
            RXLogging.i("Camera2Session", "Camera opened.");
            Camera2Session camera2Session = Camera2Session.this;
            camera2Session.cameraDevice = cameraDevice;
            SurfaceTextureHelper surfaceTextureHelper = camera2Session.surfaceTextureHelper;
            CameraEnumerationAndroid.CaptureFormat captureFormat = camera2Session.captureFormat;
            surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
            Camera2Session.this.surface = new Surface(Camera2Session.this.surfaceTextureHelper.getSurfaceTexture());
            try {
                cameraDevice.createCaptureSession(Arrays.asList(Camera2Session.this.surface), new CaptureSessionCallback(), Camera2Session.this.cameraThreadHandler);
            } catch (CameraAccessException e) {
                Camera2Session.this.reportError("Failed to create capture session. " + e);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            if (new C03880Dg(2).LIZJ(100207, "com/bytedance/realx/video/Camera2Session$CameraStateCallback", "onError", this, new Object[]{cameraDevice, Integer.valueOf(i)}, "void", new C65300Pk0(false, "(Landroid/hardware/camera2/CameraDevice;I)V", "8417857577881749860")).LIZ) {
                return;
            }
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.this.reportError(getErrorDescription(i));
        }
    }

    /* loaded from: classes33.dex */
    public class CaptureSessionCallback extends CameraCaptureSession.StateCallback {
        public CaptureSessionCallback() {
        }

        private void chooseFocusMode(CaptureRequest.Builder builder) {
            for (int i : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) {
                if (i == 3) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    RXLogging.i("Camera2Session", "Using continuous video auto-focus.");
                    return;
                }
            }
            RXLogging.i("Camera2Session", "Auto-focus is not available.");
        }

        private void chooseStabilizationMode(CaptureRequest.Builder builder) {
            int[] iArr = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        RXLogging.i("Camera2Session", "Using optical stabilization.");
                        return;
                    }
                }
            }
            for (int i2 : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                if (i2 == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    RXLogging.i("Camera2Session", "Using video stabilization.");
                    return;
                }
            }
            RXLogging.i("Camera2Session", "Stabilization not available.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigured$0(VideoFrame videoFrame) {
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session camera2Session = Camera2Session.this;
            if (camera2Session.state != SessionState.RUNNING) {
                RXLogging.i("Camera2Session", "Texture frame captured but camera is no longer running.");
                return;
            }
            if (!camera2Session.firstFrameReported) {
                camera2Session.firstFrameReported = true;
                Camera2Session.camera2StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera2Session.this.constructionTimeNs));
            }
            TextureBufferImpl textureBufferImpl = (TextureBufferImpl) videoFrame.getBuffer();
            Camera2Session camera2Session2 = Camera2Session.this;
            VideoFrame videoFrame2 = new VideoFrame(ZV3.LIZ(textureBufferImpl, camera2Session2.isCameraFrontFacing, -camera2Session2.cameraOrientation), Camera2Session.this.getFrameOrientation(), videoFrame.getTimestampNs());
            Camera2Session camera2Session3 = Camera2Session.this;
            camera2Session3.events.onFrameCaptured(camera2Session3, videoFrame2);
            videoFrame2.release();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            cameraCaptureSession.close();
            Camera2Session.this.reportError("Failed to configure capture session.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            RXLogging.i("Camera2Session", "Camera capture session configured.");
            Camera2Session camera2Session = Camera2Session.this;
            camera2Session.captureSession = cameraCaptureSession;
            try {
                CaptureRequest.Builder createCaptureRequest = camera2Session.cameraDevice.createCaptureRequest(3);
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                Camera2Session camera2Session2 = Camera2Session.this;
                Integer valueOf = Integer.valueOf(camera2Session2.captureFormat.framerate.min / camera2Session2.fpsUnitFactor);
                Camera2Session camera2Session3 = Camera2Session.this;
                createCaptureRequest.set(key, new Range(valueOf, Integer.valueOf(camera2Session3.captureFormat.framerate.max / camera2Session3.fpsUnitFactor)));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                chooseStabilizationMode(createCaptureRequest);
                chooseFocusMode(createCaptureRequest);
                Camera2Session camera2Session4 = Camera2Session.this;
                CameraSession.Events events = camera2Session4.events;
                CameraEnumerationAndroid.CaptureFormat captureFormat = camera2Session4.captureFormat;
                events.onCameraConfig(captureFormat.width, captureFormat.height, captureFormat.framerate);
                createCaptureRequest.addTarget(Camera2Session.this.surface);
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), new CameraCaptureCallback(), Camera2Session.this.cameraThreadHandler);
                Camera2Session.this.surfaceTextureHelper.startListening(new VideoSink() { // from class: X.ZWL
                    @Override // com.bytedance.realx.video.VideoSink
                    public final void onFrame(VideoFrame videoFrame) {
                        Camera2Session.CaptureSessionCallback.this.lambda$onConfigured$0(videoFrame);
                    }
                });
                RXLogging.i("Camera2Session", "Camera device successfully started.");
                Camera2Session camera2Session5 = Camera2Session.this;
                camera2Session5.callback.onDone(camera2Session5);
            } catch (CameraAccessException e) {
                Camera2Session camera2Session6 = Camera2Session.this;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failed to start capture request. ");
                LIZ.append(e);
                camera2Session6.reportError(X1D.LIZIZ(LIZ));
            }
        }
    }

    /* loaded from: classes33.dex */
    public enum SessionState {
        RUNNING,
        STOPPED;

        public static SessionState valueOf(String str) {
            return (SessionState) V0N.LJJJ(SessionState.class, str);
        }
    }

    public void reportError(String str) {
        boolean z;
        checkIsOnCameraThread();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error: ");
        LIZ.append(str);
        RXLogging.e("Camera2Session", X1D.LIZIZ(LIZ));
        if (this.captureSession == null && this.state != SessionState.STOPPED) {
            z = true;
        } else {
            z = false;
        }
        this.state = SessionState.STOPPED;
        stopInternal();
        if (z) {
            this.callback.onFailure(CameraSession.FailureType.ERROR, str);
        } else {
            this.events.onCameraError(this, str);
        }
    }

    public Camera2Session(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Create new camera2 session on camera ");
        LIZ.append(str);
        RXLogging.i("Camera2Session", X1D.LIZIZ(LIZ));
        this.constructionTimeNs = System.nanoTime();
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events;
        this.applicationContext = context;
        this.cameraManager = cameraManager;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = str;
        this.width = i;
        this.height = i2;
        this.framerate = i3;
        start();
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        new Camera2Session(createSessionCallback, events, context, cameraManager, surfaceTextureHelper, str, i, i2, i3);
    }
}
