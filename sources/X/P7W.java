package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class P7W {
    public static final java.util.Map<String, Object> LIZ = new HashMap();

    public static synchronized String[] LIZIZ(CameraManager cameraManager) {
        String[] cameraIdList;
        synchronized (P7W.class) {
            java.util.Map<String, Object> map = LIZ;
            if (((HashMap) map).containsKey("CAMERA_2_LIST")) {
                cameraIdList = (String[]) ((HashMap) map).get("CAMERA_2_LIST");
            } else {
                cameraIdList = cameraManager.getCameraIdList();
                if (cameraIdList != null) {
                    ((HashMap) map).put("CAMERA_2_LIST", cameraIdList);
                }
            }
        }
        return cameraIdList;
    }

    public static synchronized CameraCharacteristics LIZ(CameraManager cameraManager, String str) {
        CameraCharacteristics cameraCharacteristics;
        synchronized (P7W.class) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("CAMERA_2_CHARACTERISTICS");
            LIZ2.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            java.util.Map<String, Object> map = LIZ;
            if (((HashMap) map).containsKey(LIZIZ)) {
                cameraCharacteristics = (CameraCharacteristics) ((HashMap) map).get(LIZIZ);
            } else {
                cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                ((HashMap) map).put(LIZIZ, cameraCharacteristics);
            }
        }
        return cameraCharacteristics;
    }

    public static synchronized StreamConfigurationMap LIZJ(CameraCharacteristics cameraCharacteristics, String str) {
        StreamConfigurationMap streamConfigurationMap;
        synchronized (P7W.class) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("CAMERA_2_STREAM_CONFIGURATION_MAP");
            LIZ2.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            java.util.Map<String, Object> map = LIZ;
            if (((HashMap) map).containsKey(LIZIZ)) {
                streamConfigurationMap = (StreamConfigurationMap) ((HashMap) map).get(LIZIZ);
            } else {
                streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                ((HashMap) map).put(LIZIZ, streamConfigurationMap);
            }
        }
        return streamConfigurationMap;
    }

    public static String LIZLLL(String[] strArr, CameraManager cameraManager) {
        float[] fArr;
        String str = CardStruct.IStatusCode.DEFAULT;
        try {
            float f = Float.MAX_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics LIZ2 = LIZ(cameraManager, str2);
                Integer num = (Integer) LIZ2.get(CameraCharacteristics.LENS_FACING);
                if ((num == null || num.intValue() != 0) && (fArr = (float[]) LIZ2.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS)) != null && fArr.length > 0) {
                    float f2 = fArr[0];
                    if (f2 != -1.0f && f2 <= f) {
                        str = str2;
                        f = f2;
                    }
                }
            }
            return str;
        } catch (Throwable th) {
            C63922P6w.LIZJ("TECameraProb", "exception occurs when getWideAngleID: ", th);
            return str;
        }
    }
}
