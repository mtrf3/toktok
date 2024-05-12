package X;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class P9I {
    public static int LIZIZ = 1;
    public final Context LIZ;

    public String LJ() {
        long currentTimeMillis = System.currentTimeMillis();
        CameraManager cameraManager = (CameraManager) C16880lQ.LLILL(this.LIZ, "camera");
        try {
            String LJFF = LJFF(cameraManager.getCameraIdList(), cameraManager);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getWideAngleID, wideAngleId = ");
            LIZ.append(LJFF);
            LIZ.append(", cost time = ");
            LIZ.append(System.currentTimeMillis() - currentTimeMillis);
            C63922P6w.LIZLLL("TECameraHardware2Proxy", X1D.LIZIZ(LIZ));
            return LJFF;
        } catch (Throwable th) {
            C63922P6w.LIZJ("TECameraHardware2Proxy", "exception occurs when getWideAngleID", th);
            return CardStruct.IStatusCode.DEFAULT;
        }
    }

    public final boolean LJII() {
        boolean z = false;
        try {
            if (LIZIZ == 2) {
                long currentTimeMillis = System.currentTimeMillis();
                Class<?> cls = Class.forName("com.google.ar.core.ArCoreApk");
                C16880lQ.LLJJJIL("arcore_sdk_c");
                Object invoke = cls.getMethod("checkAvailability", Context.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), this.LIZ);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("cost: ");
                LIZ.append(System.currentTimeMillis() - currentTimeMillis);
                LIZ.append(", ARCore availability ");
                LIZ.append(invoke.toString());
                C63922P6w.LIZLLL("TECameraHardware2Proxy", X1D.LIZIZ(LIZ));
                z = "SUPPORTED_INSTALLED".equals(invoke.toString());
            }
        } catch (Throwable th) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ARCore is not support ");
                LIZ2.append(th);
                C63922P6w.LIZIZ("TECameraHardware2Proxy", X1D.LIZIZ(LIZ2));
            } catch (Throwable unused) {
            }
        }
        C87367YQp.LIZIZ("te_record_camera_is_support_arcore", String.valueOf(z));
        return z;
    }

    public boolean LJIIJ() {
        return !LJ().equals(CardStruct.IStatusCode.DEFAULT);
    }

    public P9I(Context context) {
        this.LIZ = context;
    }

    public static Range LJI(CameraCharacteristics cameraCharacteristics) {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
                if (range != null) {
                    return range;
                }
            }
        } catch (Exception e) {
            C63922P6w.LJFF("TECameraHardware2Proxy", "getZoomValueRange catch exception: ", e);
        }
        return new Range(Float.valueOf(0.0f), (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM));
    }

    public static boolean LJIIIZ(CameraCharacteristics cameraCharacteristics) {
        int[] iArr;
        int i;
        if (cameraCharacteristics == null || (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length <= 0) {
            i = 0;
        } else {
            i = 1;
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 != null) {
            int length = iArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (iArr2[i2] == 1) {
                    i |= 2;
                    break;
                }
                i2++;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Stabilization type: ");
        LIZ.append(Integer.toBinaryString(i));
        C63922P6w.LIZLLL("TECameraHardware2Proxy", X1D.LIZIZ(LIZ));
        C87367YQp.LIZ("te_record_camera_stabilization", i);
        if (i <= 0) {
            return false;
        }
        return true;
    }

    public static P9I LIZIZ(int i, Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getDeviceProxy, cameraType: ");
        LIZ.append(i);
        C63922P6w.LIZLLL("TECameraHardware2Proxy", X1D.LIZIZ(LIZ));
        LIZIZ = i;
        String str = Build.BRAND;
        if (str.toLowerCase().equals("samsung")) {
            return new P9K(context);
        }
        String str2 = Build.HARDWARE;
        String lowerCase = str2.toLowerCase();
        if (lowerCase.equals("qcom") || lowerCase.matches("msm[0-9]*")) {
            C63922P6w.LIZ("TECameraHardware2", "QCOM Platform.");
            return new P9L(context);
        }
        if (str2.toLowerCase().matches("mt[0-9]*")) {
            C63922P6w.LIZ("TECameraHardware2", "MTK Platform.");
            return new C88187YjH(context);
        }
        String lowerCase2 = str.toLowerCase();
        if (lowerCase2.equals("huawei") || lowerCase2.equals("honor")) {
            return new P9J(context);
        }
        C63922P6w.LIZIZ("TECameraHardware2Proxy", "Unknown platform");
        return new P9I(context);
    }

    public static float LIZLLL(CameraCharacteristics cameraCharacteristics, float f) {
        Float f2 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f2 == null) {
            return 0.0f;
        }
        float floatValue = f2.floatValue();
        if (f == -1.0f) {
            if (Build.VERSION.SDK_INT < 30) {
                return floatValue / 2.0f;
            }
            return floatValue;
        }
        return floatValue * f;
    }

    public static String LJFF(String[] strArr, CameraManager cameraManager) {
        float[] fArr;
        String str = CardStruct.IStatusCode.DEFAULT;
        try {
            float f = Float.MAX_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if ((num == null || num.intValue() != 0) && (fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS)) != null && fArr.length > 0) {
                    float f2 = fArr[0];
                    if (f2 != -1.0f && f2 <= f) {
                        str = str2;
                        f = f2;
                    }
                }
            }
            return str;
        } catch (Throwable th) {
            C63922P6w.LIZJ("TECameraHardware2Proxy", "exception occurs when getWideAngleID: ", th);
            return str;
        }
    }

    public static boolean LJIIIIZZ(CameraCharacteristics cameraCharacteristics, int i) {
        int i2;
        if (cameraCharacteristics == null) {
            return false;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        if (i2 < 0 || i2 > 4) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Invalid hardware level = ");
            LIZ.append(i2);
            C63922P6w.LIZIZ("TECameraHardware2Proxy", X1D.LIZIZ(LIZ));
            return false;
        }
        int i3 = O5Y.LJIIJ[i2];
        C87367YQp.LIZ("te_record_camera_hardware_level", i3);
        if (Build.VERSION.SDK_INT < 22 && i2 == 2) {
            return false;
        }
        if (i3 >= i) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Camera hardware level supported, deviceLevel = ");
            LIZ2.append(i3);
            LIZ2.append(", require = ");
            LIZ2.append(i);
            C63922P6w.LIZLLL("TECameraHardware2Proxy", X1D.LIZIZ(LIZ2));
            return true;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Camera hardware level not supported, deviceLevel = ");
        LIZ3.append(i3);
        LIZ3.append(", require = ");
        LIZ3.append(i);
        C63922P6w.LIZIZ("TECameraHardware2Proxy", X1D.LIZIZ(LIZ3));
        return false;
    }

    public static int LIZ(CameraCharacteristics cameraCharacteristics, CaptureRequest.Builder builder, boolean z) {
        if (cameraCharacteristics == null || builder == null) {
            return -100;
        }
        if (!z) {
            C63922P6w.LIZLLL("TECameraHardware2Proxy", "configStabilization not toggle");
            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            return 0;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("EIS mode: ");
                LIZ.append(i);
                C63922P6w.LIZLLL("TECameraHardware2Proxy", X1D.LIZIZ(LIZ));
                if (i == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    C63922P6w.LIZLLL("TECameraHardware2Proxy", "Enable EIS");
                    return 0;
                }
            }
        } else {
            C63922P6w.LIZLLL("TECameraHardware2Proxy", "Don't supported EIS");
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("OIS mode: ");
                LIZ2.append(i2);
                C63922P6w.LIZLLL("TECameraHardware2Proxy", X1D.LIZIZ(LIZ2));
                if (i2 == 1) {
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                    C63922P6w.LIZLLL("TECameraHardware2Proxy", "Enable OIS");
                    return 0;
                }
            }
            return -200;
        }
        C63922P6w.LIZLLL("TECameraHardware2Proxy", "Don't supported OIS");
        return -200;
    }

    public static TEFrameRateRange LIZJ(CameraCharacteristics cameraCharacteristics, int i, int i2, int i3, int i4) {
        TEFrameRateRange tEFrameRateRange = new TEFrameRateRange(i, i2);
        if (cameraCharacteristics == null) {
            return tEFrameRateRange;
        }
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr == null) {
            return tEFrameRateRange;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        int i5 = tEFrameRateRange.fpsUnitFactor;
        int i6 = 0;
        for (Range range : rangeArr) {
            int[] iArr = {((Integer) range.getLower()).intValue() * i5, ((Integer) range.getUpper()).intValue() * i5};
            arrayList.add(iArr);
            int i7 = iArr[1];
            if (i6 < i7) {
                i6 = i7;
            }
        }
        C87367YQp.LIZ("te_record_camera_max_fps", i6);
        int i8 = tEFrameRateRange.min;
        int i9 = tEFrameRateRange.fpsUnitFactor;
        int[] LJIILJJIL = PDA.LJIILJJIL(i3, i4, new int[]{i8 / i9, tEFrameRateRange.max / i9}, arrayList);
        tEFrameRateRange.min = LJIILJJIL[0];
        tEFrameRateRange.max = LJIILJJIL[1];
        return tEFrameRateRange;
    }
}
