package com.bytedance.realx.video;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.SystemClock;
import android.util.AndroidException;
import android.util.Range;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.CameraEnumerationAndroid;
import com.bytedance.realx.video.CameraVideoCapturer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes33.dex */
public class Camera2Enumerator implements CameraEnumerator {
    public static final Map<String, List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats = new HashMap();
    public final CameraManager cameraManager;
    public final Context context;

    @Override // com.bytedance.realx.video.CameraEnumerator
    public String[] getDeviceNames() {
        try {
            CameraManager cameraManager = this.cameraManager;
            if (cameraManager != null) {
                return cameraManager.getCameraIdList();
            }
        } catch (AndroidException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Camera access exception: ");
            LIZ.append(e);
            RXLogging.e("Camera2Enumerator", X1D.LIZIZ(LIZ));
        }
        return new String[0];
    }

    public Camera2Enumerator(Context context) {
        this.context = context;
        this.cameraManager = (CameraManager) C16880lQ.LLILL(context, "camera");
    }

    public static List<Size> convertSizes(android.util.Size[] sizeArr) {
        ArrayList arrayList = new ArrayList();
        for (android.util.Size size : sizeArr) {
            arrayList.add(new Size(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    private CameraCharacteristics getCameraCharacteristics(String str) {
        try {
            CameraManager cameraManager = this.cameraManager;
            if (cameraManager != null) {
                return cameraManager.getCameraCharacteristics(str);
            }
            return null;
        } catch (AndroidException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Camera access exception: ");
            LIZ.append(e);
            RXLogging.e("Camera2Enumerator", X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public static int getFpsUnitFactor(Range<Integer>[] rangeArr) {
        if (rangeArr.length == 0 || rangeArr[0].getUpper().intValue() < 1000) {
            return 1000;
        }
        return 1;
    }

    public static List<Size> getSupportedSizes(CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null) {
            return null;
        }
        List<Size> convertSizes = convertSizes(outputSizes);
        if (Build.VERSION.SDK_INT < 22 && intValue == 2) {
            Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            ArrayList arrayList = new ArrayList();
            for (Size size : convertSizes) {
                if (rect.width() * size.height == rect.height() * size.width) {
                    arrayList.add(size);
                }
            }
            return arrayList;
        }
        return convertSizes;
    }

    public static boolean isSupported(Context context) {
        CameraManager cameraManager = (CameraManager) C16880lQ.LLILL(context, "camera");
        try {
            for (String str : cameraManager.getCameraIdList()) {
                if (((Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    return false;
                }
            }
            return true;
        } catch (AndroidException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Camera access exception: ");
            LIZ.append(e);
            RXLogging.e("Camera2Enumerator", X1D.LIZIZ(LIZ));
            return false;
        }
    }

    @Override // com.bytedance.realx.video.CameraEnumerator
    public int getDeviceOrientation(String str) {
        return ((Integer) getCameraCharacteristics(str).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    @Override // com.bytedance.realx.video.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(this.context, str);
    }

    @Override // com.bytedance.realx.video.CameraEnumerator
    public boolean isBackFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        if (cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.realx.video.CameraEnumerator
    public boolean isFrontFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        if (cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return true;
        }
        return false;
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(Range<Integer>[] rangeArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (Range<Integer> range : rangeArr) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(range.getLower().intValue() * i, range.getUpper().intValue() * i));
        }
        return arrayList;
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(CameraManager cameraManager, String str) {
        long j;
        int round;
        Map<String, List<CameraEnumerationAndroid.CaptureFormat>> map = cachedSupportedFormats;
        synchronized (map) {
            if (map.containsKey(str)) {
                return map.get(str);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Get supported formats for camera index ");
            LIZ.append(str);
            LIZ.append(".");
            RXLogging.i("Camera2Enumerator", X1D.LIZIZ(LIZ));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = convertFramerates(rangeArr, getFpsUnitFactor(rangeArr));
                List<Size> supportedSizes = getSupportedSizes(cameraCharacteristics);
                Iterator<CameraEnumerationAndroid.CaptureFormat.FramerateRange> it = convertFramerates.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i = Math.max(i, it.next().max);
                }
                ArrayList arrayList = new ArrayList();
                for (Size size : supportedSizes) {
                    try {
                        j = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, new android.util.Size(size.width, size.height));
                    } catch (Exception unused) {
                        j = 0;
                    }
                    if (j == 0) {
                        round = i;
                    } else {
                        round = ((int) Math.round(1.0E9d / j)) * 1000;
                    }
                    arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, 0, round));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Format: ");
                    LIZ2.append(size.width);
                    LIZ2.append("x");
                    LIZ2.append(size.height);
                    LIZ2.append("@");
                    LIZ2.append(round);
                    RXLogging.i("Camera2Enumerator", X1D.LIZIZ(LIZ2));
                }
                cachedSupportedFormats.put(str, arrayList);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Get supported formats for camera index ");
                LIZ3.append(str);
                LIZ3.append(" done. Time spent: ");
                LIZ3.append(elapsedRealtime2 - elapsedRealtime);
                LIZ3.append(" ms.");
                RXLogging.i("Camera2Enumerator", X1D.LIZIZ(LIZ3));
                return arrayList;
            } catch (Exception e) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("getCameraCharacteristics(): ");
                LIZ4.append(e);
                RXLogging.e("Camera2Enumerator", X1D.LIZIZ(LIZ4));
                return new ArrayList();
            }
        }
    }

    @Override // com.bytedance.realx.video.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera2Capturer(this.context, str, cameraEventsHandler);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(Context context, String str) {
        return getSupportedFormats((CameraManager) C16880lQ.LLILL(context, "camera"), str);
    }
}
