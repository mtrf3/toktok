package X;

import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;

/* renamed from: X.WsS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83660WsS implements InterfaceC83737Wth {
    public final /* synthetic */ C44428Hc8 LIZ;
    public final /* synthetic */ CameraModule LIZIZ;

    @Override // X.InterfaceC83737Wth
    public final void LIZIZ(int i) {
        int LIZ = this.LIZIZ.LIZ(false);
        CameraModule cameraModule = this.LIZIZ;
        cameraModule.LJLLLL = i;
        cameraModule.LJLJI.LIZJ(LIZ);
        this.LIZIZ.LJLILLLLZI.LJIIJ(LIZ);
        this.LIZIZ.LIZIZ();
    }

    public C83660WsS(C44428Hc8 c44428Hc8, CameraModule cameraModule, String str) {
        this.LIZIZ = cameraModule;
        this.LIZ = c44428Hc8;
    }

    @Override // X.InterfaceC83737Wth
    public final void LIZ(int i, int i2, String str) {
        this.LIZ.LIZJ();
        this.LIZIZ.LIZIZ();
        this.LIZIZ.LJLILLLLZI.LJI(i, i2, str);
    }
}
