package X;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Wvd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83857Wvd implements InterfaceC83996Wxs {
    public final /* synthetic */ C83855Wvb LIZ;
    public final /* synthetic */ C44428Hc8 LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC83996Wxs
    public final void LIZ() {
        String str;
        C44428Hc8 stopwatch = this.LIZIZ;
        o.LJIIIIZZ(stopwatch, "stopwatch");
        if (stopwatch.LIZIZ) {
            this.LIZIZ.LJ();
        }
        this.LIZ.LJIIIIZZ("changeCameraFirstFrame");
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJLLL);
        LIZ.append(" => VEBlurDuration # onCameraSwitchedSuccessFirstFrame, duration: ");
        LIZ.append(System.currentTimeMillis() - this.LIZ.LJLLLLLL);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        int Z6 = this.LIZ.Z6(false);
        C89468Z9k LJII = this.LIZ.LJII();
        long LIZIZ = this.LIZIZ.LIZIZ(TimeUnit.MILLISECONDS);
        String cameraTypeString = this.LIZ.getCameraController().getCameraTypeString();
        if (Z6 == 0) {
            str = "front";
        } else {
            str = "back";
        }
        LJII.LJIIIIZZ(LIZIZ, cameraTypeString, str, this.LIZJ);
        this.LIZ.LJII().LJFF();
        this.LIZ.getCameraController().LLLLLZ(this);
    }

    public C83857Wvd(C83855Wvb c83855Wvb, C44428Hc8 c44428Hc8, String str) {
        this.LIZ = c83855Wvb;
        this.LIZIZ = c44428Hc8;
        this.LIZJ = str;
    }
}
