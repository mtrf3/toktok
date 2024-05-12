package X;

import android.hardware.Camera;
import kotlin.jvm.internal.o;

/* renamed from: X.WuX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83789WuX implements InterfaceC83703Wt9 {
    public static int LIZIZ = -1;
    public final InterfaceC83790WuY LIZ;

    @Override // X.InterfaceC83703Wt9
    public final int LIZ() {
        int i;
        Integer LIZ = this.LIZ.LIZ();
        if (LIZ != null) {
            return LIZ.intValue();
        }
        if (LIZIZ == -1) {
            try {
                int numberOfCameras = Camera.getNumberOfCameras();
                if (numberOfCameras > 0) {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    int i2 = 0;
                    do {
                        Camera.getCameraInfo(i2, cameraInfo);
                        i = 1;
                        if (cameraInfo.facing == 1) {
                            break;
                        }
                        i2++;
                    } while (i2 < numberOfCameras);
                }
            } catch (Exception unused) {
            }
            i = -1;
            LIZIZ = i;
        }
        int i3 = LIZIZ;
        if (i3 == -1) {
            return 0;
        }
        return i3;
    }

    public C83789WuX(InterfaceC83790WuY cameraLogicStore) {
        o.LJIIIZ(cameraLogicStore, "cameraLogicStore");
        this.LIZ = cameraLogicStore;
    }

    @Override // X.InterfaceC83703Wt9
    public final int LIZIZ(int i) {
        if (i == 1) {
            try {
                int numberOfCameras = Camera.getNumberOfCameras();
                if (numberOfCameras <= 0) {
                    return 0;
                }
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                int i2 = 0;
                do {
                    Camera.getCameraInfo(i2, cameraInfo);
                    if (cameraInfo.facing != 1) {
                        i2++;
                    } else {
                        i = 1;
                    }
                } while (i2 < numberOfCameras);
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // X.InterfaceC83703Wt9
    public final void LIZJ(int i) {
        this.LIZ.LIZIZ(i);
    }
}
