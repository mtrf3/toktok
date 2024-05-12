package X;

import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wve, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83858Wve implements InterfaceC83737Wth {
    public final /* synthetic */ C83855Wvb LIZ;
    public final /* synthetic */ C44428Hc8 LIZIZ;

    @Override // X.InterfaceC83737Wth
    public final void LIZIZ(int i) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJLLL);
        LIZ.append(" => onOpenSuccess, cameraType: ");
        LIZ.append(i);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        int Z6 = this.LIZ.Z6(false);
        C83855Wvb c83855Wvb = this.LIZ;
        c83855Wvb.LJLZ = i;
        c83855Wvb.LJI().LIZJ(Z6);
        this.LIZ.LJII().LJIIJ(Z6);
        C89468Z9k LJII = this.LIZ.LJII();
        LJII.getClass();
        new AqS164S0100000_14(LJII, 415).invoke();
    }

    public C83858Wve(C83855Wvb c83855Wvb, C44428Hc8 c44428Hc8, String str) {
        this.LIZ = c83855Wvb;
        this.LIZIZ = c44428Hc8;
    }

    @Override // X.InterfaceC83737Wth
    public final void LIZ(int i, int i2, String info) {
        o.LJIIIZ(info, "info");
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        C0EH.LIZLLL(LIZ, this.LIZ.LJLLL, " => onOpenFail [cameraType, errorCode, info] | [", i, ", ");
        LIZ.append(i2);
        LIZ.append(", ");
        LIZ.append(info);
        LIZ.append(']');
        LIZLLL.i(X1D.LIZIZ(LIZ));
        this.LIZIZ.LIZJ();
        this.LIZ.LJIIIIZZ("openCameraFailed");
        C89468Z9k LJII = this.LIZ.LJII();
        LJII.getClass();
        new AqS164S0100000_14(LJII, 415).invoke();
        this.LIZ.LJII().LJI(i, i2, info);
    }
}
