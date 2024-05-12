package X;

import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wvc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83856Wvc implements InterfaceC83737Wth {
    public final /* synthetic */ C83855Wvb LIZ;

    public C83856Wvc(C83855Wvb c83855Wvb) {
        this.LIZ = c83855Wvb;
    }

    @Override // X.InterfaceC83737Wth
    public final void LIZIZ(int i) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJLLL);
        LIZ.append(" CameraOpenListener => onOpenSuccess");
        LIZLLL.i(X1D.LIZIZ(LIZ));
        C83855Wvb c83855Wvb = this.LIZ;
        c83855Wvb.LJLZ = i;
        int Z6 = c83855Wvb.Z6(true);
        this.LIZ.LJI().LIZJ(Z6);
        this.LIZ.LJII().LIZLLL(Z6);
        boolean b = ((InterfaceC83865Wvl) this.LIZ.LJLJJL.getValue()).b(this.LIZ.LLD.LJLIL.O3());
        C5NP LIZLLL2 = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LIZ.LJLLL);
        LIZ2.append(" CameraOpenListener => setSharedTextureStatus status: ");
        LIZ2.append(b);
        LIZLLL2.i(X1D.LIZIZ(LIZ2));
        C89468Z9k LJII = this.LIZ.LJII();
        LJII.getClass();
        new AqS164S0100000_14(LJII, 415).invoke();
    }

    @Override // X.InterfaceC83737Wth
    public final void LIZ(int i, int i2, String info) {
        o.LJIIIZ(info, "info");
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        C0EH.LIZLLL(LIZ, this.LIZ.LJLLL, " CameraOpenListener => onOpenFail [cameraType, errorCode, info] | [", i, ", ");
        LIZ.append(i2);
        LIZ.append(", ");
        LIZ.append(info);
        LIZ.append(']');
        LIZLLL.i(X1D.LIZIZ(LIZ));
        this.LIZ.LJII().LIZIZ(i, i2, info);
        C89468Z9k LJII = this.LIZ.LJII();
        LJII.getClass();
        new AqS164S0100000_14(LJII, 415).invoke();
    }
}
