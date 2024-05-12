package com.byted.cast.capture.video.camera;

import X.C03880Dg;
import X.C16880lQ;
import X.C65300Pk0;
import X.C90176ZaG;
import X.X1D;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.byted.cast.common.api.ICameraAdapter;
import com.byted.cast.common.config.Config;
import com.byted.cast.mediacommon.IMediaCamera;
import com.byted.cast.mediacommon.ISafetyInterface;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.utils.Logger;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.IOException;
import java.util.List;

/* loaded from: classes29.dex */
public class MediaCamera implements IMediaCamera {
    public static final String TAG = C16880lQ.LJLLJ(MediaCamera.class);
    public Camera.Size cameraPreviewSize;
    public int currentCamera = 1;
    public Camera mCamera;
    public int mCameraPreviewThousandFps;
    public Config mConfig;
    public ISafetyInterface mSafetyInterface;

    public static void com_byted_cast_capture_video_camera_MediaCamera_android_hardware_Camera_startPreview(Camera camera) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-5667133893147715925");
        if (c03880Dg.LIZJ(100102, "android/hardware/Camera", "startPreview", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.startPreview();
            c03880Dg.LIZIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera, c65300Pk0, true);
        }
    }

    public static void com_byted_cast_capture_video_camera_MediaCamera_android_hardware_Camera_stopPreview(Camera camera) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-5667133893147715925");
        if (c03880Dg.LIZJ(100103, "android/hardware/Camera", "stopPreview", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.stopPreview();
            c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, true);
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaCamera
    public final /* synthetic */ void setStartCert(Object obj) {
        C90176ZaG.LJI(this, obj);
    }

    @Override // com.byted.cast.mediacommon.IMediaCamera
    public final /* synthetic */ void setStopCert(Object obj) {
        C90176ZaG.LJII(this, obj);
    }

    @Override // com.byted.cast.mediacommon.IMediaCamera
    public Point getCameraSize() {
        if (this.cameraPreviewSize == null) {
            return null;
        }
        Camera.Size size = this.cameraPreviewSize;
        return new Point(size.width, size.height);
    }

    @Override // com.byted.cast.mediacommon.IMediaCamera
    public void releaseCamera() {
        ICameraAdapter cameraAdapter;
        try {
            if (this.mCamera != null) {
                String str = TAG;
                Logger.i(str, "releaseCamera -- in");
                com_byted_cast_capture_video_camera_MediaCamera_android_hardware_Camera_stopPreview(this.mCamera);
                Config config = this.mConfig;
                if (config != null && (cameraAdapter = config.getCameraAdapter()) != null) {
                    cameraAdapter.releaseCamera(this.mCamera);
                } else {
                    ISafetyInterface iSafetyInterface = this.mSafetyInterface;
                    if (iSafetyInterface != null) {
                        iSafetyInterface.releaseCamera(this.mCamera);
                    } else {
                        Logger.e(str, "releaseCamera Error !!!");
                    }
                }
                this.mCamera = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Logger.i(TAG, "releaseCamera -- done");
    }

    public MediaCamera() {
        Logger.i(TAG, "construct");
        try {
            this.mSafetyInterface = (ISafetyInterface) Class.forName("com.byted.cast.capture.safetyinterface.SafetyInterface").newInstance();
        } catch (Throwable th) {
            this.mSafetyInterface = null;
            String str = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("create safetyinterface fail : ");
            LIZ.append(th.toString());
            Logger.e(str, X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaCamera
    public int getFps() {
        return this.mCameraPreviewThousandFps;
    }

    @Override // com.byted.cast.mediacommon.IMediaCamera
    public void setConfig(Config config) {
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setConfig config:");
        LIZ.append(config);
        Logger.i(str, X1D.LIZIZ(LIZ));
        this.mConfig = config;
    }

    @Override // com.byted.cast.mediacommon.IMediaCamera
    public void setFlashEnable(boolean z) {
        List<String> supportedFlashModes;
        String str = TAG;
        Logger.i(str, "setFlashEnable");
        Camera camera = this.mCamera;
        if (camera != null && (supportedFlashModes = camera.getParameters().getSupportedFlashModes()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("supportedFlash:");
            LIZ.append(supportedFlashModes);
            Logger.i(str, X1D.LIZIZ(LIZ));
            if (this.currentCamera == 0) {
                Camera.Parameters parameters = this.mCamera.getParameters();
                if (z) {
                    parameters.setFlashMode("torch");
                } else {
                    parameters.setFlashMode("off");
                }
                this.mCamera.setParameters(parameters);
                return;
            }
            Logger.e(str, "Front Camera Do not support Flash!!!");
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaCamera
    public void startPreview(SurfaceTexture surfaceTexture) {
        if (this.mCamera != null) {
            Logger.i(TAG, "starting camera preview");
            try {
                this.mCamera.setPreviewTexture(surfaceTexture);
                com_byted_cast_capture_video_camera_MediaCamera_android_hardware_Camera_startPreview(this.mCamera);
            } catch (IOException e) {
                MediaMonitor.onMonitor("MediaCapture_Error", 100004, "camera", e.toString());
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.byted.cast.mediacommon.IMediaCamera
    public void openCamera(int i, int i2, int i3, int i4, int i5) {
        ICameraAdapter iCameraAdapter;
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("openCamera: w");
        LIZ.append(i);
        LIZ.append(" h");
        LIZ.append(i2);
        LIZ.append(" fps");
        LIZ.append(i3);
        LIZ.append("id");
        LIZ.append(i4);
        Logger.i(str, X1D.LIZIZ(LIZ));
        this.currentCamera = i4;
        if (this.mCamera != null) {
            MediaMonitor.onMonitor("MediaCapture_Error", 100004, "camera", "camera already initialized");
            Logger.e(str, "camera already initialized");
            return;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Config config = this.mConfig;
            if (config != null) {
                iCameraAdapter = config.getCameraAdapter();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("mConfig != null cameraAdapter : ");
                LIZ2.append(iCameraAdapter);
                Logger.i(str, X1D.LIZIZ(LIZ2));
            } else {
                iCameraAdapter = null;
            }
            int numberOfCameras = Camera.getNumberOfCameras();
            int i6 = 0;
            while (true) {
                if (i6 >= numberOfCameras) {
                    break;
                }
                Camera.getCameraInfo(i6, cameraInfo);
                if (cameraInfo.facing != i4) {
                    i6++;
                } else if (iCameraAdapter == null) {
                    ISafetyInterface iSafetyInterface = this.mSafetyInterface;
                    if (iSafetyInterface != null) {
                        this.mCamera = iSafetyInterface.openCamera(i6);
                    } else {
                        Logger.e(TAG, "openCamera Error !!!");
                    }
                } else {
                    this.mCamera = iCameraAdapter.openCamera(i6);
                }
            }
            if (this.mCamera == null) {
                String str2 = TAG;
                Logger.i(str2, "No front-facing camera found; opening default");
                if (iCameraAdapter != null) {
                    this.mCamera = iCameraAdapter.openCamera();
                } else {
                    ISafetyInterface iSafetyInterface2 = this.mSafetyInterface;
                    if (iSafetyInterface2 != null) {
                        this.mCamera = iSafetyInterface2.openCamera();
                    } else {
                        Logger.e(str2, "openCamera Error !!!");
                    }
                }
            }
            Camera camera = this.mCamera;
            if (camera == null) {
                MediaMonitor.onMonitor("MediaCapture_Error", 100004, "camera", "Unable to open camera");
                Logger.e(TAG, "Unable to open camera");
                return;
            }
            Camera.Parameters parameters = camera.getParameters();
            CameraUtils.choosePreviewSize(parameters, i, i2);
            this.mCameraPreviewThousandFps = CameraUtils.chooseFixedPreviewFps(parameters, i3 * 1000);
            parameters.setRecordingHint(true);
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (supportedFocusModes != null && !supportedFocusModes.isEmpty()) {
                String str3 = "continuous-video";
                if (!supportedFocusModes.contains("continuous-video")) {
                    str3 = (String) ListProtector.get(supportedFocusModes, 0);
                }
                parameters.setFocusMode(str3);
                String str4 = TAG;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("set focus mode: ");
                LIZ3.append(str3);
                Logger.i(str4, X1D.LIZIZ(LIZ3));
            }
            this.mCamera.setParameters(parameters);
            this.cameraPreviewSize = parameters.getPreviewSize();
            String str5 = this.cameraPreviewSize.width + "x" + this.cameraPreviewSize.height + " @" + (this.mCameraPreviewThousandFps / 1000.0f) + "fps id" + this.currentCamera;
            Logger.i(TAG, "Camera config: " + str5);
            if (i5 == 0) {
                this.mCamera.setDisplayOrientation(90);
            } else {
                if (i5 != 3) {
                    return;
                }
                this.mCamera.setDisplayOrientation(180);
            }
        } catch (Exception e) {
            MediaMonitor.onMonitor("MediaCapture_Error", 100004, "camera", "Unable to open camera");
            String str6 = TAG;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Unable to open camera : ");
            LIZ4.append(e.toString());
            Logger.e(str6, X1D.LIZIZ(LIZ4));
        }
    }
}
