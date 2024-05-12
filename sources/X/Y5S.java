package X;

import ij2.a;

/* loaded from: classes16.dex */
public final class Y5S implements InterfaceC81624W1s {
    public final /* synthetic */ Y5K LIZ;

    @Override // X.InterfaceC81624W1s
    public final void LIZ() {
        a aVar = a.LJIJ;
        long currentTimeMillis = System.currentTimeMillis();
        aVar.getClass();
        a.LJIIJJI(currentTimeMillis, "go_setting", "ocr_camera_access_fail");
        OHI ohi = OHI.LIZ;
        Y5K y5k = this.LIZ;
        ohi.getClass();
        OHI.LJIIIIZZ(y5k, "android.permission.CAMERA");
        this.LIZ.getClass();
    }

    @Override // X.InterfaceC81624W1s
    public final void LIZIZ() {
        a aVar = a.LJIJ;
        long currentTimeMillis = System.currentTimeMillis();
        aVar.getClass();
        a.LJIIJJI(currentTimeMillis, "cancel", "ocr_camera_access_fail");
    }

    public Y5S(Y5K y5k) {
        this.LIZ = y5k;
    }
}
