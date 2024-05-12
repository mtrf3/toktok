package com.bytedance.realx.video.camera;

import X.C04330Ez;
import X.C16880lQ;
import X.X1D;
import X.ZVB;
import android.content.Intent;
import android.hardware.Camera;
import android.media.projection.MediaProjection;
import android.view.WindowManager;
import com.bytedance.realx.RXNativeFunctions;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.Camera1Capturer;
import com.bytedance.realx.video.Camera1Enumerator;
import com.bytedance.realx.video.CameraVideoCapturer;
import com.bytedance.realx.video.CapturerObserver;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.ScreenCapturerAndroid;
import com.bytedance.realx.video.SurfaceTextureHelper;
import com.bytedance.realx.video.VideoCapturer;
import com.bytedance.realx.video.VideoFrame;

/* loaded from: classes33.dex */
public class RXVideoCaptureAndroid {
    public final int UIDeviceOrientationPortrait;
    public EglBase cameraEglBase;
    public CameraVideoCapturer.CameraEventsHandler mCameraEventsHandler;
    public int mCaptureBufferType;
    public Intent mCaptureScreenIntent;
    public int mHeight;
    public boolean mIsCaptureScreen;
    public boolean mIsVideoCaptureInited;
    public boolean mIsVideoCaptureWorking;
    public long mNativeCaptureObserver;
    public SurfaceTextureHelper mSurfaceTextureHelper;
    public VideoCapturer mVideoCapturer;
    public int mWidth;
    public EglBase.Context sharedEglGroup;
    public boolean mIsFrontCamera = true;
    public final int UIDeviceOrientationLandscapeLeft = 90;
    public final int UIDeviceOrientationPortraitUpsidedown = 180;
    public final int UIDeviceOrientationLandscapeRight = 270;
    public CapturerObserver localCapturerObserver = new CapturerObserver() { // from class: com.bytedance.realx.video.camera.RXVideoCaptureAndroid.1
        @Override // com.bytedance.realx.video.CapturerObserver
        public void onCapturerStopped() {
            RXLogging.w("RXVideoCaptureAndroid", "onCapturerStopped...");
            RXNativeFunctions.nativeOnCapturerStopped(RXVideoCaptureAndroid.this.mNativeCaptureObserver);
        }

        @Override // com.bytedance.realx.video.CapturerObserver
        public void onCapturerError(String str) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onCapturerError: ");
            LIZ.append(str);
            RXLogging.e("RXVideoCaptureAndroid", X1D.LIZIZ(LIZ));
            if (str.equals("CAMERA_ERROR_SERVER_DIED")) {
                RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, -1005);
            } else if (str.equals("CAMERA_ERROR_EVICTED") || str.equals("CAMERA_ERROR_UNKNOWN")) {
                RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, -1004);
            } else {
                RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, -1005);
            }
        }

        @Override // com.bytedance.realx.video.CapturerObserver
        public void onCapturerStarted(boolean z) {
            if (z) {
                RXLogging.w("RXVideoCaptureAndroid", "onCapturerStarted...");
                RXNativeFunctions.nativeOnCapturerStarted(RXVideoCaptureAndroid.this.mNativeCaptureObserver, z);
            } else {
                RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, 0);
            }
        }

        @Override // com.bytedance.realx.video.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            RXNativeFunctions.nativeOnFrameCaptured(RXVideoCaptureAndroid.this.mNativeCaptureObserver, videoFrame);
        }

        @Override // com.bytedance.realx.video.CapturerObserver
        public void onCapturerFormatSelected(int i, int i2, int i3, int i4, int i5) {
            RXLogging.w("RXVideoCaptureAndroid", "onCapturerFormatSelected...");
            RXNativeFunctions.nativeOnCapturerFormatSelected(RXVideoCaptureAndroid.this.mNativeCaptureObserver, i, i2, i3, i4, i5);
        }
    };

    private boolean isCaptureToTextureSupported() {
        return true;
    }

    public int getCameraFace() {
        if (this.mIsFrontCamera) {
            return 1;
        }
        return 0;
    }

    public float getCameraZoomMaxRatio() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            return videoCapturer.getCameraZoomMaxRatio();
        }
        return -1.0f;
    }

    public int getDeviceOrientation() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            return videoCapturer.getDeviceOrientation();
        }
        return getUIOrientation();
    }

    public boolean isCameraTorchSupported() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            return videoCapturer.isCameraTorchSupported();
        }
        return false;
    }

    public boolean isCameraZoomSupported() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            return videoCapturer.isCameraZoomSupported();
        }
        return false;
    }

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
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            this.mSurfaceTextureHelper = null;
        }
        this.mIsVideoCaptureInited = false;
        this.mIsVideoCaptureWorking = false;
        this.sharedEglGroup = null;
        this.mCaptureScreenIntent = null;
    }

    public void stopCapture() {
        RXLogging.w("RXVideoCaptureAndroid", "stopCapture...");
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

    public void switchCamera() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer == null || !this.mIsVideoCaptureInited || !(videoCapturer instanceof CameraVideoCapturer)) {
            return;
        }
        this.mIsFrontCamera = !this.mIsFrontCamera;
        ((CameraVideoCapturer) videoCapturer).switchCamera(new CameraVideoCapturer.CameraSwitchHandler() { // from class: com.bytedance.realx.video.camera.RXVideoCaptureAndroid.2
            @Override // com.bytedance.realx.video.CameraVideoCapturer.CameraSwitchHandler
            public void onCameraSwitchError(String str) {
            }

            @Override // com.bytedance.realx.video.CameraVideoCapturer.CameraSwitchHandler
            public void onCameraSwitchDone(boolean z) {
                RXVideoCaptureAndroid.this.mIsFrontCamera = z;
            }
        });
    }

    public void turnOffFlashLight() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            videoCapturer.turnOffFlashLight();
        }
    }

    public void turnOnFlashLight() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            videoCapturer.turnOnFlashLight();
        }
    }

    public static int[] getCameraSensorOrientations() {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras <= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getNumberOfCameras failed on count ");
            LIZ.append(numberOfCameras);
            RXLogging.w("RXVideoCaptureAndroid", X1D.LIZIZ(LIZ));
            return null;
        }
        int[] iArr = new int[numberOfCameras];
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i = 0;
        while (i < numberOfCameras) {
            try {
                Camera.getCameraInfo(i, cameraInfo);
                iArr[i] = cameraInfo.orientation;
                i++;
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("getCameraInfo failed on index ");
                LIZ2.append(i);
                LIZ2.append(',');
                LIZ2.append(e.getMessage());
                RXLogging.w("RXVideoCaptureAndroid", X1D.LIZIZ(LIZ2));
                return null;
            }
        }
        return iArr;
    }

    public int getUIOrientation() {
        int rotation = ((WindowManager) C16880lQ.LLILL(ContextUtils.getApplicationContext(), "window")).getDefaultDisplay().getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return 0;
                }
                return 90;
            }
            return 180;
        }
        return 270;
    }

    /* loaded from: classes33.dex */
    public class BufferType {
        public BufferType() {
        }
    }

    public static boolean isFrontCamera(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing != 1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getCameraInfo failed on index ");
            LIZ.append(i);
            LIZ.append(',');
            LIZ.append(e.getMessage());
            RXLogging.w("RXVideoCaptureAndroid", X1D.LIZIZ(LIZ));
            return false;
        }
    }

    public int enableFollowGravity(boolean z) {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            return videoCapturer.enableFollowGravity(z);
        }
        return 0;
    }

    public int setCameraZoomRatio(float f) {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            return videoCapturer.setCameraZoomRatio(f);
        }
        return -1;
    }

    public RXVideoCaptureAndroid(boolean z, long j, EglBase.Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RXVideoCaptureAndroid Created, CaptureScreen=");
        LIZ.append(z);
        RXLogging.w("RXVideoCaptureAndroid", X1D.LIZIZ(LIZ));
        this.mIsCaptureScreen = z;
        this.mNativeCaptureObserver = j;
        this.sharedEglGroup = context;
    }

    private VideoCapturer createVideoCapturer(boolean z, int i, Intent intent) {
        boolean z2;
        try {
            if (z) {
                return new ScreenCapturerAndroid(intent, new MediaProjection.Callback() { // from class: com.bytedance.realx.video.camera.RXVideoCaptureAndroid.3
                    @Override // android.media.projection.MediaProjection.Callback
                    public void onStop() {
                        RXLogging.e("RXVideoCaptureAndroid", "User revoked permission to capture the screen.");
                    }
                });
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("createVideoCapturer info, cameraPosition: ");
            LIZ.append(i);
            RXLogging.i("RXVideoCaptureAndroid", X1D.LIZIZ(LIZ));
            if (this.mCaptureBufferType != 1 && isCaptureToTextureSupported()) {
                z2 = true;
            } else {
                z2 = false;
            }
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator(z2, false);
            String[] deviceNames = camera1Enumerator.getDeviceNames();
            for (String str : deviceNames) {
                if (camera1Enumerator.isFrontFacing(str) && i == 1) {
                    CameraVideoCapturer createCapturer = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler);
                    if (createCapturer == null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("VideoCapturer isFrontFacing create null, name:");
                        LIZ2.append(str);
                        RXLogging.e("RXVideoCaptureAndroid", X1D.LIZIZ(LIZ2));
                    } else {
                        return createCapturer;
                    }
                }
                if (camera1Enumerator.isBackFacing(str) && i == 0) {
                    CameraVideoCapturer createCapturer2 = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler);
                    if (createCapturer2 == null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("VideoCapturer isBackFacing create null, name:");
                        LIZ3.append(str);
                        RXLogging.e("RXVideoCaptureAndroid", X1D.LIZIZ(LIZ3));
                    } else {
                        return createCapturer2;
                    }
                }
            }
            RXLogging.w("RXVideoCaptureAndroid", "enumerator camera but cannot find a match one, use default");
            if (deviceNames.length > 0) {
                String str2 = deviceNames[0];
                CameraVideoCapturer createCapturer3 = camera1Enumerator.createCapturer(str2, this.mCameraEventsHandler);
                if (createCapturer3 != null) {
                    return createCapturer3;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("VideoCapturer first camera create null, name:");
                LIZ4.append(str2);
                RXLogging.e("RXVideoCaptureAndroid", X1D.LIZIZ(LIZ4));
            } else {
                RXLogging.e("RXVideoCaptureAndroid", "num of camera in device is zero");
            }
            RXLogging.e("RXVideoCaptureAndroid", "cannot init VideoCapture: ");
            return null;
        } catch (IllegalArgumentException e) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("Create VideoCapture fail : ");
            LIZ5.append(e.getMessage());
            RXLogging.e("RXVideoCaptureAndroid", X1D.LIZIZ(LIZ5));
            return null;
        }
    }

    private void startVideoCapture(int i, int i2, int i3) {
        RXLogging.w("RXVideoCaptureAndroid", C16880lQ.LLLZ("startVideoCapture: width: %d, height: &d, fps: &d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            try {
                videoCapturer.startCapture(i, i2, i3);
                this.mIsVideoCaptureWorking = true;
            } catch (IllegalArgumentException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("VideoCapture startCapture fail : ");
                LIZ.append(e.getMessage());
                RXLogging.e("RXVideoCaptureAndroid", X1D.LIZIZ(LIZ));
            }
        }
    }

    public void startCapture(int i, int i2, int i3, int i4, int i5, Intent intent, boolean z) {
        RXLogging.w("RXVideoCaptureAndroid", "startCapture...");
        this.mWidth = i;
        this.mHeight = i2;
        this.mCaptureScreenIntent = intent;
        this.mCaptureBufferType = i5;
        if (C04330Ez.LIZ(ContextUtils.getApplicationContext(), "android.permission.CAMERA") != 0) {
            RXNativeFunctions.nativeOnCapturerError(this.mNativeCaptureObserver, -100);
            return;
        }
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            videoCapturer.dispose();
            this.mVideoCapturer = null;
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        }
        this.mVideoCapturer = createVideoCapturer(this.mIsCaptureScreen, i4, this.mCaptureScreenIntent);
        if (this.cameraEglBase == null) {
            this.cameraEglBase = ZVB.LIZIZ(this.sharedEglGroup);
        }
        if (this.mVideoCapturer == null) {
            RXLogging.e("RXVideoCaptureAndroid", "mVideoCapturer is null...");
        }
        SurfaceTextureHelper create = SurfaceTextureHelper.create("RXLocalCapturer", this.cameraEglBase.getEglBaseContext());
        this.mSurfaceTextureHelper = create;
        VideoCapturer videoCapturer2 = this.mVideoCapturer;
        if (videoCapturer2 != null && create != null) {
            videoCapturer2.initialize(create, ContextUtils.getApplicationContext(), this.localCapturerObserver);
            this.mIsVideoCaptureInited = true;
            VideoCapturer videoCapturer3 = this.mVideoCapturer;
            if (videoCapturer3 instanceof Camera1Capturer) {
                ((Camera1Capturer) videoCapturer3).enableFaceAE(z);
            }
            startVideoCapture(i, i2, i3);
            return;
        }
        this.mIsVideoCaptureInited = false;
        this.mIsVideoCaptureWorking = false;
    }
}
