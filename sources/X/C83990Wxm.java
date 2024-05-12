package X;

import com.ss.android.ugc.asve.recorder.camera.VECameraController;

/* renamed from: X.Wxm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83990Wxm implements P3H {
    public final /* synthetic */ VECameraController LIZ;
    public final /* synthetic */ InterfaceC88473Ynt LIZIZ;

    public C83990Wxm(VECameraController vECameraController, C83688Wsu c83688Wsu) {
        this.LIZ = vECameraController;
        this.LIZIZ = c83688Wsu;
    }

    @Override // X.P3H
    public final void getCurrentISO(int i) {
        this.LIZIZ.invoke(Integer.valueOf(i), Integer.valueOf(this.LIZ.LLIIIILZ), Integer.valueOf(this.LIZ.LLIIIJ));
    }
}
