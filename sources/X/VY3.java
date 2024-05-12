package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VY3 extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ C79902VXm LIZ;

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        o.LJIIIZ(cameraCaptureSession, "cameraCaptureSession");
    }

    public VY3(C79902VXm c79902VXm) {
        this.LIZ = c79902VXm;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        o.LJIIIZ(cameraCaptureSession, "cameraCaptureSession");
        C79902VXm c79902VXm = this.LIZ;
        if (c79902VXm.LJLZ == null) {
            return;
        }
        try {
            CameraDevice cameraDevice = c79902VXm.LJLLL;
            o.LJI(cameraDevice);
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(1);
            o.LJIIIIZZ(createCaptureRequest, "mCameraDevice!!.createCa…aDevice.TEMPLATE_PREVIEW)");
            Surface surface = this.LIZ.LJLJI;
            o.LJI(surface);
            createCaptureRequest.addTarget(surface);
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 1);
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
            this.LIZ.LJLLLL = cameraCaptureSession;
            cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), null, null);
        } catch (Exception e) {
            H78.LJ(e);
        }
    }
}
