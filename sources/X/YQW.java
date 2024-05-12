package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes16.dex */
public interface YQW {
    public static final MeteringRectangle[] LIZ = {new MeteringRectangle(0, 0, 0, 0, 0)};

    void LIZ(CaptureRequest.Builder builder);

    CameraCaptureSession.CaptureCallback LIZIZ(boolean z);

    CameraCaptureSession.CaptureCallback LIZJ(CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z);

    int LLJJL();
}
