package X;

import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;

/* renamed from: X.Ws7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83639Ws7 implements InterfaceC83737Wth {
    public final /* synthetic */ CameraModule LIZ;

    public C83639Ws7(CameraModule cameraModule) {
        this.LIZ = cameraModule;
    }

    @Override // X.InterfaceC83737Wth
    public final void LIZIZ(int i) {
        C82891Wg3.LIZLLL().d("CameraModule => onOpenSuccess");
        CameraModule cameraModule = this.LIZ;
        cameraModule.LJLLLL = i;
        int LIZ = cameraModule.LIZ(true);
        this.LIZ.LJLJI.LIZJ(LIZ);
        this.LIZ.LJLILLLLZI.LIZLLL(LIZ);
        CameraModule cameraModule2 = this.LIZ;
        cameraModule2.LJLJL.b(cameraModule2.LJLL.booleanValue());
        this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC83737Wth
    public final void LIZ(int i, int i2, String str) {
        this.LIZ.LJLILLLLZI.LIZIZ(i, i2, str);
        this.LIZ.LIZIZ();
    }
}
