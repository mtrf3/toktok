package X;

import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WsO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83656WsO implements InterfaceC83996Wxs {
    public final /* synthetic */ C44428Hc8 LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ CameraModule LIZJ;

    @Override // X.InterfaceC83996Wxs
    public final void LIZ() {
        String str;
        C44428Hc8 c44428Hc8 = this.LIZ;
        if (c44428Hc8.LIZIZ) {
            c44428Hc8.LJ();
        }
        int LIZ = this.LIZJ.LIZ(false);
        InterfaceC83659WsR interfaceC83659WsR = this.LIZJ.LJLILLLLZI;
        long LIZIZ = this.LIZ.LIZIZ(TimeUnit.MILLISECONDS);
        String cameraTypeString = this.LIZJ.LJLJL.getCameraTypeString();
        if (LIZ == 0) {
            str = "front";
        } else {
            str = "back";
        }
        interfaceC83659WsR.LJIIIIZZ(LIZIZ, cameraTypeString, str, this.LIZIZ);
        this.LIZJ.LJLILLLLZI.LJFF();
        this.LIZJ.LJLJL.LLLLLZ(this);
    }

    public C83656WsO(C44428Hc8 c44428Hc8, CameraModule cameraModule, String str) {
        this.LIZJ = cameraModule;
        this.LIZ = c44428Hc8;
        this.LIZIZ = str;
    }
}
