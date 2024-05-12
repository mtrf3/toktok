package com.bytedance.realx.video;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.X1D;
import android.hardware.Camera;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.CameraEnumerationAndroid;
import com.bytedance.realx.video.CameraVideoCapturer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes33.dex */
public class Camera1Enumerator implements CameraEnumerator {
    public static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    public final boolean captureToTexture;
    public final boolean isDesktopMode;

    public Camera1Enumerator() {
        this(true, false);
    }

    public static Camera com_bytedance_realx_video_Camera1Enumerator_android_hardware_Camera_open(int i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Camera;", "-7091761463533845643");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100100, "android/hardware/Camera", "open", Camera.class, objArr, "android.hardware.Camera", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", null, objArr, Camera.class, c65300Pk0, false);
            return (Camera) LIZJ.LIZIZ;
        }
        Camera open = Camera.open(i);
        c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", open, objArr, Camera.class, c65300Pk0, true);
        return open;
    }

    public static void com_bytedance_realx_video_Camera1Enumerator_android_hardware_Camera_release(Camera camera) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-7091761463533845643");
        if (c03880Dg.LIZJ(100101, "android/hardware/Camera", "release", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100101, "android/hardware/Camera", "release", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.release();
            c03880Dg.LIZIZ(100101, "android/hardware/Camera", "release", null, objArr, camera, c65300Pk0, true);
        }
    }

    @Override // com.bytedance.realx.video.CameraEnumerator
    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            String deviceName = getDeviceName(i);
            if (deviceName != null) {
                arrayList.add(deviceName);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Index: ");
                LIZ.append(i);
                LIZ.append(". ");
                LIZ.append(deviceName);
                RXLogging.w("Camera1Enumerator", X1D.LIZIZ(LIZ));
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Index: ");
                LIZ2.append(i);
                LIZ2.append(". Failed to query camera name.");
                RXLogging.e("Camera1Enumerator", X1D.LIZIZ(LIZ2));
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static List<Size> convertSizes(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int i) {
        int i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Get supported formats for camera index ");
        LIZ.append(i);
        LIZ.append(".");
        RXLogging.w("Camera1Enumerator", X1D.LIZIZ(LIZ));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Camera camera = null;
        try {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Opening camera with index ");
                LIZ2.append(i);
                RXLogging.w("Camera1Enumerator", X1D.LIZIZ(LIZ2));
                camera = com_bytedance_realx_video_Camera1Enumerator_android_hardware_Camera_open(i);
                Camera.Parameters parameters = camera.getParameters();
                com_bytedance_realx_video_Camera1Enumerator_android_hardware_Camera_release(camera);
                ArrayList arrayList = new ArrayList();
                if (parameters != null) {
                    try {
                        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                        int i3 = 0;
                        if (supportedPreviewFpsRange != null) {
                            int[] iArr = (int[]) ListProtector.get(supportedPreviewFpsRange, supportedPreviewFpsRange.size() - 1);
                            i3 = iArr[0];
                            i2 = iArr[1];
                        } else {
                            i2 = 0;
                        }
                        for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                            arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, i3, i2));
                        }
                    } catch (Exception e) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("getSupportedFormats() failed on camera index ");
                        LIZ3.append(i);
                        RXLogging.e("Camera1Enumerator", X1D.LIZIZ(LIZ3), e);
                    }
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Get supported formats for camera index ");
                LIZ4.append(i);
                LIZ4.append(" done. Time spent: ");
                LIZ4.append(elapsedRealtime2 - elapsedRealtime);
                LIZ4.append(" ms.");
                RXLogging.w("Camera1Enumerator", X1D.LIZIZ(LIZ4));
                return arrayList;
            } catch (RuntimeException e2) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("Open camera failed on camera index ");
                LIZ5.append(i);
                RXLogging.e("Camera1Enumerator", X1D.LIZIZ(LIZ5), e2);
                ArrayList arrayList2 = new ArrayList();
                if (camera != null) {
                    com_bytedance_realx_video_Camera1Enumerator_android_hardware_Camera_release(camera);
                }
                return arrayList2;
            }
        } catch (Throwable th) {
            if (camera != null) {
                com_bytedance_realx_video_Camera1Enumerator_android_hardware_Camera_release(camera);
            }
            throw th;
        }
    }

    public static int getCameraIndex(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getCameraIndex: ");
        LIZ.append(str);
        RXLogging.w("Camera1Enumerator", X1D.LIZIZ(LIZ));
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            if (str.equals(getDeviceName(i))) {
                return i;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("No such camera: ");
        LIZ2.append(str);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    public static Camera.CameraInfo getCameraInfo(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getCameraInfo failed on index ");
            LIZ.append(i);
            RXLogging.e("Camera1Enumerator", X1D.LIZIZ(LIZ), e);
            return null;
        }
    }

    public static String getDeviceName(int i) {
        String str;
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return null;
        }
        if (cameraInfo.facing == 1) {
            str = "front";
        } else {
            str = "back";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Camera ");
        LIZ.append(i);
        LIZ.append(", Facing ");
        LIZ.append(str);
        LIZ.append(", Orientation ");
        LIZ.append(cameraInfo.orientation);
        return X1D.LIZIZ(LIZ);
    }

    public static synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i) {
        List<CameraEnumerationAndroid.CaptureFormat> list;
        synchronized (Camera1Enumerator.class) {
            if (cachedSupportedFormats == null) {
                cachedSupportedFormats = new ArrayList();
                for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
                    cachedSupportedFormats.add(enumerateFormats(i2));
                }
            }
            list = (List) ListProtector.get(cachedSupportedFormats, i);
        }
        return list;
    }

    @Override // com.bytedance.realx.video.CameraEnumerator
    public int getDeviceOrientation(String str) {
        return getCameraInfo(getCameraIndex(str)).orientation;
    }

    @Override // com.bytedance.realx.video.CameraEnumerator
    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo != null && cameraInfo.facing == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.realx.video.CameraEnumerator
    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo != null && cameraInfo.facing == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.realx.video.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    public Camera1Enumerator(boolean z, boolean z2) {
        this.captureToTexture = z;
        this.isDesktopMode = z2;
    }

    @Override // com.bytedance.realx.video.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture, this.isDesktopMode);
    }
}
