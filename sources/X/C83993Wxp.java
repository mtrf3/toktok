package X;

import com.ss.android.ugc.asve.recorder.camera.VECameraController;

/* renamed from: X.Wxp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83993Wxp implements InterfaceC63852P4e {
    public final /* synthetic */ VECameraController LIZ;

    public C83993Wxp(VECameraController vECameraController) {
        this.LIZ = vECameraController;
    }

    @Override // X.InterfaceC63852P4e
    public final void getISORange(int[] iArr) {
        VECameraController vECameraController = this.LIZ;
        vECameraController.LLIIIJ = iArr[0];
        vECameraController.LLIIIILZ = iArr[1];
    }
}
