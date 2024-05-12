package X;

import com.ss.android.ugc.asve.recorder.camera.VECameraController;

/* renamed from: X.Wxh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83985Wxh implements InterfaceC163346b4 {
    public final /* synthetic */ VECameraController LIZ;

    @Override // X.InterfaceC163346b4
    public final void onAppBackground() {
        C84133X0f c84133X0f = this.LIZ.LJZ;
        c84133X0f.getClass();
        P4Q.LJFF("VECameraCapture", "onBackGround");
        c84133X0f.LJLLI.changeAppLifeCycle(true);
    }

    @Override // X.InterfaceC163346b4
    public final void onAppForeground() {
        C84133X0f c84133X0f = this.LIZ.LJZ;
        c84133X0f.getClass();
        P4Q.LJFF("VECameraCapture", "onForeGround");
        c84133X0f.LJLLI.changeAppLifeCycle(false);
    }

    public C83985Wxh(VECameraController vECameraController) {
        this.LIZ = vECameraController;
    }
}
