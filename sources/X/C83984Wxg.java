package X;

import com.ss.android.ugc.asve.recorder.camera.VECameraController;

/* renamed from: X.Wxg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83984Wxg implements InterfaceC83737Wth {
    public final /* synthetic */ VECameraController LIZ;
    public final /* synthetic */ InterfaceC83737Wth LIZIZ;

    @Override // X.InterfaceC83737Wth
    public final void LIZIZ(int i) {
        InterfaceC83697Wt3 interfaceC83697Wt3 = this.LIZ.LLIZLLLIL;
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZ("camera_open");
        }
        InterfaceC83737Wth interfaceC83737Wth = this.LIZIZ;
        if (interfaceC83737Wth != null) {
            interfaceC83737Wth.LIZIZ(i);
        }
        this.LIZ.LJIIIIZZ(this);
    }

    public C83984Wxg(VECameraController vECameraController, InterfaceC83737Wth interfaceC83737Wth) {
        this.LIZ = vECameraController;
        this.LIZIZ = interfaceC83737Wth;
    }

    @Override // X.InterfaceC83737Wth
    public final void LIZ(int i, int i2, String str) {
        InterfaceC83737Wth interfaceC83737Wth = this.LIZIZ;
        if (interfaceC83737Wth != null) {
            interfaceC83737Wth.LIZ(i, i2, str);
        }
        this.LIZ.LJIIIIZZ(this);
    }
}
