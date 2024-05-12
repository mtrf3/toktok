package X;

import android.hardware.Camera;

/* loaded from: classes12.dex */
public final class PPU {
    public static int LIZ() {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return -1;
        }
        int i = 0;
        while (i < numberOfCameras) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 0) {
                break;
            }
            i++;
        }
        if (i >= numberOfCameras) {
            return 0;
        }
        return i;
    }
}
