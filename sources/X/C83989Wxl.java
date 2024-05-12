package X;

import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import com.ss.android.vesdk.VECameraSettings;

/* renamed from: X.Wxl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83989Wxl implements InterfaceC83996Wxs {
    public final /* synthetic */ VECameraController LIZ;

    @Override // X.InterfaceC83996Wxs
    public final void LIZ() {
        this.LIZ.LJJJJL();
        this.LIZ.LLLLLZ(this);
        VECameraController vECameraController = this.LIZ;
        VECameraSettings vECameraSettings = vECameraController.LJZL;
        float f = vECameraSettings.mDefaultZoomRatio;
        vECameraController.LLIFFJFJJ = f;
        vECameraController.LLII = f;
        vECameraSettings.mDefaultZoomRatio = 1.0f;
    }

    public C83989Wxl(VECameraController vECameraController) {
        this.LIZ = vECameraController;
    }
}
