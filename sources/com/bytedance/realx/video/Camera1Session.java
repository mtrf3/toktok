package com.bytedance.realx.video;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.V0N;
import X.X1D;
import X.ZV3;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.Camera1Session;
import com.bytedance.realx.video.CameraEnumerationAndroid;
import com.bytedance.realx.video.CameraSession;
import com.bytedance.realx.video.CameraVideoCapturer;
import com.bytedance.realx.video.VideoFrame;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes33.dex */
public class Camera1Session implements CameraSession, Camera.FaceDetectionListener {
    public static int sMinFramerate;
    public final Context applicationContext;
    public final Camera camera;
    public final int cameraId;
    public final Handler cameraThreadHandler;
    public final CameraEnumerationAndroid.CaptureFormat captureFormat;
    public final boolean captureToTexture;
    public final long constructionTimeNs;
    public final CameraSession.Events events;
    public boolean firstFrameReported;
    public int gravityOrientation;
    public final Sensor gravitySensor;
    public final Camera.CameraInfo info;
    public boolean isDesktopMode;
    public int mDisplayRotationCheckCounter;
    public boolean mEnableFaceAE;
    public boolean mEnableFollowGravity;
    public boolean mFaceDetectStarted;
    public int mLastDisplayRotation;
    public int mLastValidDisplayRotation;
    public final int scaleHeight;
    public final int scaleWidth;
    public final SensorManager sensorManager;
    public SessionState state;
    public final SurfaceTextureHelper surfaceTextureHelper;
    public final SensorEventListener gravityEventListener = new SensorEventListener() { // from class: com.bytedance.realx.video.Camera1Session.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float abs = Math.abs(f);
            float abs2 = Math.abs(f2);
            if (Math.abs(abs - abs2) < 4.0d) {
                return;
            }
            if (abs >= abs2) {
                if (f >= 0.0f) {
                    Camera1Session.this.gravityOrientation = CameraSession.UIDeviceOrientation.LandscapeRight.value();
                    return;
                } else {
                    Camera1Session.this.gravityOrientation = CameraSession.UIDeviceOrientation.LandscapeLeft.value();
                    return;
                }
            }
            if (f2 >= 0.0f) {
                Camera1Session.this.gravityOrientation = CameraSession.UIDeviceOrientation.Portrait.value();
            } else {
                Camera1Session.this.gravityOrientation = CameraSession.UIDeviceOrientation.PortraitUpsideDown.value();
            }
        }
    };
    public CameraVideoCapturer.ORIENTATION_MODE mOrientation = CameraVideoCapturer.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;

    public static Camera com_bytedance_realx_video_Camera1Session_android_hardware_Camera_open(int i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Camera;", "8417857550369135749");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100100, "android/hardware/Camera", "open", Camera.class, objArr, "android.hardware.Camera", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", null, objArr, Camera.class, c65300Pk0, false);
            return (Camera) LIZJ.LIZIZ;
        }
        Camera open = Camera.open(i);
        c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", open, objArr, Camera.class, c65300Pk0, true);
        return open;
    }

    public static void com_bytedance_realx_video_Camera1Session_android_hardware_Camera_release(Camera camera) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "8417857550369135749");
        if (c03880Dg.LIZJ(100101, "android/hardware/Camera", "release", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100101, "android/hardware/Camera", "release", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.release();
            c03880Dg.LIZIZ(100101, "android/hardware/Camera", "release", null, objArr, camera, c65300Pk0, true);
        }
    }

    public static void com_bytedance_realx_video_Camera1Session_android_hardware_Camera_startPreview(Camera camera) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "8417857550369135749");
        if (c03880Dg.LIZJ(100102, "android/hardware/Camera", "startPreview", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.startPreview();
            c03880Dg.LIZIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera, c65300Pk0, true);
        }
    }

    public static void com_bytedance_realx_video_Camera1Session_android_hardware_Camera_stopPreview(Camera camera) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "8417857550369135749");
        if (c03880Dg.LIZJ(100103, "android/hardware/Camera", "stopPreview", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.stopPreview();
            c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, true);
        }
    }

    public static Sensor com_bytedance_realx_video_Camera1Session_android_hardware_SensorManager_getDefaultSensor(SensorManager sensorManager, int i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "8417857550369135749");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    public static boolean com_bytedance_realx_video_Camera1Session_android_hardware_SensorManager_registerListener(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100700, "android/hardware/SensorManager", "registerListener", sensorManager, new Object[]{sensorEventListener, sensor, Integer.valueOf(i)}, "boolean", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z", "8417857550369135749"));
        return LIZJ.LIZ ? ((Boolean) LIZJ.LIZIZ).booleanValue() : sensorManager.registerListener(sensorEventListener, sensor, i);
    }

    @Override // android.hardware.Camera.FaceDetectionListener
    public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new AnonymousClass3());
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new VideoSink() { // from class: X.ZWJ
            @Override // com.bytedance.realx.video.VideoSink
            public final void onFrame(VideoFrame videoFrame) {
                Camera1Session.this.lambda$listenForTextureFrames$0(videoFrame);
            }
        });
    }

    private void startCapturing() {
        boolean z;
        RXLogging.w("Camera1Session", "Start capturing");
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() { // from class: com.bytedance.realx.video.Camera1Session.2
            @Override // android.hardware.Camera.ErrorCallback
            public void onError(int i, Camera camera) {
                String str;
                if (new C03880Dg(2).LIZJ(100107, "com/bytedance/realx/video/Camera1Session$2", "onError", this, new Object[]{Integer.valueOf(i), camera}, "void", new C65300Pk0(false, "(ILandroid/hardware/Camera;)V", "8417857550369135749")).LIZ) {
                    return;
                }
                if (i == 100) {
                    str = "CAMERA_ERROR_SERVER_DIED";
                } else if (i == 2) {
                    str = "CAMERA_ERROR_EVICTED";
                } else if (i == 1) {
                    str = "CAMERA_ERROR_UNKNOWN";
                } else {
                    str = "Camera error: " + i;
                }
                RXLogging.e("Camera1Session", str);
                Camera1Session.this.stopInternal();
                Camera1Session camera1Session = Camera1Session.this;
                camera1Session.events.onCameraError(camera1Session, str);
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            com_bytedance_realx_video_Camera1Session_android_hardware_Camera_startPreview(this.camera);
            int maxNumDetectedFaces = this.camera.getParameters().getMaxNumDetectedFaces();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("supportedFaces is ");
            LIZ.append(maxNumDetectedFaces);
            RXLogging.i("Camera1Session", X1D.LIZIZ(LIZ));
            if (maxNumDetectedFaces > 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.mEnableFaceAE && z) {
                this.camera.setFaceDetectionListener(this);
                this.camera.startFaceDetection();
                this.mFaceDetectStarted = true;
            }
            if (this.mEnableFaceAE && !z) {
                RXLogging.w("Camera1Session", "mEnableFaceAE is ture but camera not support faceae");
            }
            if (this.mEnableFollowGravity) {
                enableFollowGravity(true);
            }
        } catch (RuntimeException e) {
            stopInternal();
            this.events.onCameraError(this, e.getMessage());
        }
    }

    @Override // com.bytedance.realx.video.CameraSession
    public int getDeviceOrientation() {
        if (!this.mEnableFollowGravity) {
            return ZV3.LIZIZ(ContextUtils.getApplicationContext());
        }
        return this.gravityOrientation;
    }

    public int getFrameOrientation() {
        int LIZIZ = ZV3.LIZIZ(this.applicationContext);
        int i = this.mLastValidDisplayRotation;
        int i2 = this.mDisplayRotationCheckCounter;
        if (i2 > 0) {
            this.mDisplayRotationCheckCounter = i2 - 1;
        } else if (i2 == 0) {
            if (!isInForeground(this.applicationContext)) {
                i = this.mLastValidDisplayRotation;
            } else {
                i = LIZIZ;
            }
            this.mDisplayRotationCheckCounter = -1;
        } else if (LIZIZ != this.mLastDisplayRotation) {
            int i3 = sMinFramerate;
            if (i3 > 0) {
                this.mDisplayRotationCheckCounter = i3;
            } else {
                this.mDisplayRotationCheckCounter = 5;
            }
        }
        this.mLastDisplayRotation = LIZIZ;
        this.mLastValidDisplayRotation = i;
        Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing != 0) {
            i = 360 - i;
        }
        return (cameraInfo.orientation + i) % 360;
    }

    public int getGravityOrientation() {
        int i = this.gravityOrientation;
        Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing == 1) {
            i = 360 - i;
        }
        return (cameraInfo.orientation + i) % 360;
    }

    public void stopInternal() {
        RXLogging.w("Camera1Session", "Stop internal");
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState == sessionState2) {
            RXLogging.w("Camera1Session", "Camera is already stopped");
            return;
        }
        this.state = sessionState2;
        this.surfaceTextureHelper.stopListening();
        try {
            if (this.mFaceDetectStarted) {
                this.camera.stopFaceDetection();
            }
            com_bytedance_realx_video_Camera1Session_android_hardware_Camera_stopPreview(this.camera);
            if (this.mEnableFollowGravity) {
                enableFollowGravity(false);
            }
            if (this.captureToTexture) {
                this.camera.setPreviewTexture(null);
            }
            com_bytedance_realx_video_Camera1Session_android_hardware_Camera_release(this.camera);
            this.events.onCameraClosed(this);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        RXLogging.w("Camera1Session", "Stop done");
    }

    public void checkIsOnCameraThread() {
        if (C16880lQ.LLLLIIIILLL() == this.cameraThreadHandler.getLooper().getThread()) {
        } else {
            throw new IllegalStateException("Wrong thread");
        }
    }

    @Override // com.bytedance.realx.video.CameraSession
    public float getCameraZoomMaxRatio() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("turn on flash light camera1, cameraId:");
        LIZ.append(this.cameraId);
        RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ));
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED && isCameraZoomSupported()) {
            return this.camera.getParameters().getMaxZoom();
        }
        return 1.0f;
    }

    @Override // com.bytedance.realx.video.CameraSession
    public boolean isCameraTorchSupported() {
        checkIsOnCameraThread();
        Context context = this.applicationContext;
        if (context != null) {
            return context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        }
        return false;
    }

    @Override // com.bytedance.realx.video.CameraSession
    public boolean isCameraZoomSupported() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("turn on flash light camera1, cameraId:");
        LIZ.append(this.cameraId);
        RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ));
        checkIsOnCameraThread();
        if (this.state == SessionState.STOPPED) {
            return false;
        }
        Camera.Parameters parameters = this.camera.getParameters();
        if (!parameters.isZoomSupported() && !parameters.isSmoothZoomSupported()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.realx.video.CameraSession
    public void stop() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Stop camera1 session on camera ");
        LIZ.append(this.cameraId);
        RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ));
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long nanoTime = System.nanoTime();
            stopInternal();
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
        }
    }

    @Override // com.bytedance.realx.video.CameraSession
    public void turnOffFlashLight() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("turn on flash light camera1, cameraId:");
        LIZ.append(this.cameraId);
        RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ));
        checkIsOnCameraThread();
        if (this.info.facing == 1) {
            RXLogging.w("Camera1Session", "front camera not support flash light");
        } else if (this.state != SessionState.STOPPED) {
            Camera.Parameters parameters = this.camera.getParameters();
            parameters.setFlashMode("off");
            this.camera.setParameters(parameters);
        }
    }

    @Override // com.bytedance.realx.video.CameraSession
    public void turnOnFlashLight() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("turn on flash light camera1, cameraId:");
        LIZ.append(this.cameraId);
        RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ));
        checkIsOnCameraThread();
        if (this.info.facing == 1) {
            RXLogging.w("Camera1Session", "front camera not support flash light");
        } else if (this.state != SessionState.STOPPED) {
            Camera.Parameters parameters = this.camera.getParameters();
            parameters.setFlashMode("torch");
            this.camera.setParameters(parameters);
        }
    }

    /* renamed from: com.bytedance.realx.video.Camera1Session$3, reason: invalid class name */
    /* loaded from: classes33.dex */
    public class AnonymousClass3 implements Camera.PreviewCallback {
        public AnonymousClass3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPreviewFrame$0(byte[] bArr) {
            Camera1Session camera1Session = Camera1Session.this;
            if (camera1Session.state == SessionState.RUNNING) {
                camera1Session.camera.addCallbackBuffer(bArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPreviewFrame$1(final byte[] bArr) {
            Camera1Session.this.cameraThreadHandler.post(new Runnable() { // from class: X.ZUf
                @Override // java.lang.Runnable
                public final void run() {
                    Camera1Session.AnonymousClass3.this.lambda$onPreviewFrame$0(bArr);
                }
            });
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(final byte[] bArr, Camera camera) {
            int frameOrientation;
            boolean z;
            Camera1Session.this.checkIsOnCameraThread();
            Camera1Session camera1Session = Camera1Session.this;
            if (camera != camera1Session.camera) {
                RXLogging.e("Camera1Session", "Callback from a different camera. This should never happen.");
                return;
            }
            if (camera1Session.state != SessionState.RUNNING) {
                RXLogging.w("Camera1Session", "Bytebuffer frame captured but camera is no longer running.");
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            if (!Camera1Session.this.firstFrameReported) {
                TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.this.constructionTimeNs);
                Camera1Session.this.firstFrameReported = true;
            }
            CameraEnumerationAndroid.CaptureFormat captureFormat = Camera1Session.this.captureFormat;
            NV21Buffer nV21Buffer = new NV21Buffer(bArr, captureFormat.width, captureFormat.height, new Runnable() { // from class: X.ZUc
                @Override // java.lang.Runnable
                public final void run() {
                    Camera1Session.AnonymousClass3.this.lambda$onPreviewFrame$1(bArr);
                }
            });
            Camera1Session camera1Session2 = Camera1Session.this;
            if (camera1Session2.mEnableFollowGravity) {
                frameOrientation = camera1Session2.getGravityOrientation();
            } else {
                frameOrientation = camera1Session2.getFrameOrientation();
                Camera1Session camera1Session3 = Camera1Session.this;
                camera1Session3.gravityOrientation = ZV3.LIZIZ(camera1Session3.applicationContext);
            }
            if (Camera1Session.this.info.facing == 1) {
                z = true;
            } else {
                z = false;
            }
            VideoFrame videoFrame = new VideoFrame(nV21Buffer, frameOrientation, nanos, z);
            Camera1Session camera1Session4 = Camera1Session.this;
            camera1Session4.events.onFrameCaptured(camera1Session4, videoFrame);
            videoFrame.release();
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

    public static boolean isInForeground(Context context) {
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if ((runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) || runningAppProcessInfo.importance == 125) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$listenForTextureFrames$0(VideoFrame videoFrame) {
        VideoFrame.Buffer cropAndScale;
        int frameOrientation;
        boolean z;
        boolean z2;
        int i;
        CameraEnumerationAndroid.CaptureFormat captureFormat;
        int i2;
        checkIsOnCameraThread();
        if (this.state != SessionState.RUNNING) {
            RXLogging.w("Camera1Session", "Texture frame captured but camera is no longer running.");
            return;
        }
        if (!this.firstFrameReported) {
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs);
            this.firstFrameReported = true;
        }
        int i3 = this.scaleWidth;
        if (i3 != 0 && (i = this.scaleHeight) != 0 && ((i2 = (captureFormat = this.captureFormat).width) != i3 || captureFormat.height != i)) {
            if (i2 / captureFormat.height > i3 / i) {
                VideoFrame.Buffer buffer = videoFrame.getBuffer();
                CameraEnumerationAndroid.CaptureFormat captureFormat2 = this.captureFormat;
                float f = captureFormat2.width;
                int i4 = this.scaleWidth;
                int i5 = this.scaleHeight;
                int i6 = captureFormat2.height;
                cropAndScale = buffer.cropAndScale(((int) (f - ((i4 / i5) * i6))) / 2, 0, (int) ((i4 / i5) * i6), i6, i4, i5);
            } else {
                VideoFrame.Buffer buffer2 = videoFrame.getBuffer();
                CameraEnumerationAndroid.CaptureFormat captureFormat3 = this.captureFormat;
                float f2 = captureFormat3.height;
                int i7 = this.scaleHeight;
                int i8 = this.scaleWidth;
                int i9 = captureFormat3.width;
                cropAndScale = buffer2.cropAndScale(0, ((int) (f2 - ((i7 / i8) * i9))) / 2, i9, (int) ((i7 / i8) * i9), i8, i7);
            }
        } else {
            VideoFrame.Buffer buffer3 = videoFrame.getBuffer();
            int i10 = this.scaleWidth;
            int i11 = this.scaleHeight;
            int i12 = this.captureFormat.height;
            cropAndScale = buffer3.cropAndScale(0, 0, (int) ((i10 / i11) * i12), i12, i10, i11);
        }
        if (cropAndScale == null) {
            RXLogging.e("Camera1Session", "cropandscale return null buffer");
            return;
        }
        if (this.mEnableFollowGravity) {
            frameOrientation = getGravityOrientation();
        } else {
            frameOrientation = getFrameOrientation();
            this.gravityOrientation = ZV3.LIZIZ(this.applicationContext);
        }
        TextureBufferImpl textureBufferImpl = (TextureBufferImpl) cropAndScale;
        if (this.info.facing == 1) {
            z = true;
        } else {
            z = false;
        }
        VideoFrame.TextureBuffer LIZ = ZV3.LIZ(textureBufferImpl, z, 0);
        long timestampNs = videoFrame.getTimestampNs();
        if (this.info.facing == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        VideoFrame videoFrame2 = new VideoFrame(LIZ, frameOrientation, timestampNs, z2);
        cropAndScale.release();
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }

    @Override // com.bytedance.realx.video.CameraSession
    public int enableFollowGravity(boolean z) {
        SensorManager sensorManager;
        Sensor sensor = this.gravitySensor;
        if (sensor == null || (sensorManager = this.sensorManager) == null) {
            return -1;
        }
        try {
            if (z) {
                com_bytedance_realx_video_Camera1Session_android_hardware_SensorManager_registerListener(sensorManager, this.gravityEventListener, sensor, 2);
                this.mEnableFollowGravity = true;
            } else {
                com_bytedance_realx_video_Camera1Session_android_hardware_SensorManager_registerListener(sensorManager, null, sensor, 2);
                this.mEnableFollowGravity = false;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return 0;
    }

    @Override // com.bytedance.realx.video.CameraSession
    public int setCameraZoomRatio(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("turn on flash light camera1, cameraId:");
        LIZ.append(this.cameraId);
        RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ));
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            Camera.Parameters parameters = this.camera.getParameters();
            if (isCameraZoomSupported()) {
                int min = (int) Math.min(parameters.getMaxZoom(), f);
                if (parameters.isSmoothZoomSupported()) {
                    this.camera.startSmoothZoom(min);
                    return 0;
                }
                parameters.setZoom(min);
                this.camera.setParameters(parameters);
                return 0;
            }
        }
        return -1;
    }

    @Override // com.bytedance.realx.video.CameraSession
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        this.mOrientation = orientation_mode;
    }

    public static Size findClosestPictureSize(Camera.Parameters parameters, int i, int i2) {
        if (parameters == null || parameters.getSupportedPictureSizes() == null) {
            RXLogging.e("Camera1Session", "camera parameters is null!");
            return null;
        }
        return CameraEnumerationAndroid.getUpClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i, i2);
    }

    public static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i, int i2, int i3) {
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange;
        if (parameters.getSupportedPreviewFpsRange() == null) {
            RXLogging.e("Camera1Session", "camera parameters is null!");
            return null;
        }
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Available fps ranges: ");
        LIZ.append(convertFramerates);
        RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ));
        if (Build.MODEL.equalsIgnoreCase("PEGM00") && i3 == 15) {
            closestSupportedFramerateRange = new CameraEnumerationAndroid.CaptureFormat.FramerateRange(15000, 20000);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("unsupported framerate for special device found, hardcode framerange to:");
            LIZ2.append(closestSupportedFramerateRange.toString());
            RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ2));
        } else {
            closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i3);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("selected fps range :");
        LIZ3.append(closestSupportedFramerateRange.toString());
        RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ3));
        List<Size> convertSizes = Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes());
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("Available supportedPreviewSizes : ");
        LIZ4.append(convertSizes.toString());
        RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ4));
        Size upClosestSupportedSize = CameraEnumerationAndroid.getUpClosestSupportedSize(convertSizes, i, i2);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("selected preview size");
        LIZ5.append(upClosestSupportedSize.toString());
        RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ5));
        return new CameraEnumerationAndroid.CaptureFormat(upClosestSupportedSize.width, upClosestSupportedSize.height, closestSupportedFramerateRange);
    }

    public static void updateCameraParameters(Camera camera, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat, Size size, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat.framerate;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat.width, captureFormat.height);
        String str = Build.MODEL;
        if (!str.equalsIgnoreCase("PEGM00") && !str.equalsIgnoreCase("PEGT00")) {
            parameters.setPictureSize(size.width, size.height);
        }
        if (!z) {
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera.setParameters(parameters);
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, boolean z, boolean z2, Context context, SurfaceTextureHelper surfaceTextureHelper, int i, int i2, int i3, int i4, boolean z3, boolean z4) {
        long nanoTime = System.nanoTime();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Open camera ");
        LIZ.append(i);
        LIZ.append(" brand:");
        LIZ.append(Build.BRAND);
        LIZ.append(", modle:");
        LIZ.append(Build.MODEL);
        LIZ.append(", width:");
        LIZ.append(i2);
        LIZ.append(", height:");
        LIZ.append(i3);
        LIZ.append(", framerate:");
        LIZ.append(i4);
        LIZ.append(", faceae:");
        LIZ.append(z3);
        LIZ.append(", followGravity:");
        LIZ.append(z4);
        LIZ.append(", captureToTexture:");
        LIZ.append(z);
        RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ));
        events.onCameraOpening();
        try {
            Camera com_bytedance_realx_video_Camera1Session_android_hardware_Camera_open = com_bytedance_realx_video_Camera1Session_android_hardware_Camera_open(i);
            if (com_bytedance_realx_video_Camera1Session_android_hardware_Camera_open == null) {
                CameraSession.FailureType failureType = CameraSession.FailureType.ERROR;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("android.hardware.Camera.open returned null for camera id = ");
                LIZ2.append(i);
                createSessionCallback.onFailure(failureType, X1D.LIZIZ(LIZ2));
                return;
            }
            try {
                com_bytedance_realx_video_Camera1Session_android_hardware_Camera_open.setPreviewTexture(surfaceTextureHelper.getSurfaceTexture());
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                try {
                    Camera.Parameters parameters = com_bytedance_realx_video_Camera1Session_android_hardware_Camera_open.getParameters();
                    CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, i2, i3, i4);
                    Size findClosestPictureSize = findClosestPictureSize(parameters, i2, i3);
                    events.onCameraConfig(findClosestPictureSize.width, findClosestPictureSize.height, findClosestCaptureFormat.framerate);
                    sMinFramerate = findClosestCaptureFormat.framerate.min / 1000;
                    updateCameraParameters(com_bytedance_realx_video_Camera1Session_android_hardware_Camera_open, parameters, findClosestCaptureFormat, findClosestPictureSize, z);
                    if (!z) {
                        int frameSize = findClosestCaptureFormat.frameSize();
                        int i5 = 0;
                        do {
                            com_bytedance_realx_video_Camera1Session_android_hardware_Camera_open.addCallbackBuffer(ByteBuffer.allocateDirect(frameSize).array());
                            i5++;
                        } while (i5 < 3);
                    }
                    try {
                        com_bytedance_realx_video_Camera1Session_android_hardware_Camera_open.setDisplayOrientation(0);
                    } catch (RuntimeException unused) {
                    }
                    createSessionCallback.onDone(new Camera1Session(events, z, z2, context, surfaceTextureHelper, i, com_bytedance_realx_video_Camera1Session_android_hardware_Camera_open, cameraInfo, findClosestCaptureFormat, nanoTime, i2, i3, z3, z4));
                } catch (RuntimeException e) {
                    com_bytedance_realx_video_Camera1Session_android_hardware_Camera_release(com_bytedance_realx_video_Camera1Session_android_hardware_Camera_open);
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e.getMessage());
                }
            } catch (IOException | RuntimeException e2) {
                com_bytedance_realx_video_Camera1Session_android_hardware_Camera_release(com_bytedance_realx_video_Camera1Session_android_hardware_Camera_open);
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e2.getMessage());
            }
        } catch (RuntimeException e3) {
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e3.getMessage());
        }
    }

    public Camera1Session(CameraSession.Events events, boolean z, boolean z2, Context context, SurfaceTextureHelper surfaceTextureHelper, int i, Camera camera, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat, long j, int i2, int i3, boolean z3, boolean z4) {
        this.mEnableFollowGravity = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Create new camera1 session on camera ");
        LIZ.append(i);
        RXLogging.w("Camera1Session", X1D.LIZIZ(LIZ));
        this.cameraThreadHandler = new Handler();
        this.events = events;
        this.captureToTexture = z;
        this.isDesktopMode = z2;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = i;
        this.camera = camera;
        this.info = cameraInfo;
        this.captureFormat = captureFormat;
        this.constructionTimeNs = j;
        this.scaleWidth = i2;
        this.scaleHeight = i3;
        this.mEnableFaceAE = z3;
        SensorManager sensorManager = (SensorManager) C16880lQ.LLILL(context, "sensor");
        this.sensorManager = sensorManager;
        this.gravitySensor = com_bytedance_realx_video_Camera1Session_android_hardware_SensorManager_getDefaultSensor(sensorManager, 9);
        this.mEnableFollowGravity = z4;
        surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
        startCapturing();
    }
}
