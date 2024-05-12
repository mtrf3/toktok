package X;

import ccb.t;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class VAY implements InterfaceC48417IzN {
    public final WeakReference<t> LIZ;

    public VAY(t tVar) {
        this.LIZ = new WeakReference<>(tVar);
    }

    @Override // X.InterfaceC48417IzN
    public final void LIZIZ(InterfaceC47775Ip1 interfaceC47775Ip1) {
        t tVar = this.LIZ.get();
        if (tVar == null || tVar.LLIILII != EnumC47633Imj.PREPARING || tVar.LJLLL == null) {
            return;
        }
        if (tVar.F0()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPrepared callback --");
            V10.LJI(LIZ, tVar.u5, LIZ, tVar, 5);
            InterfaceC48269Iwz interfaceC48269Iwz = tVar.LJLJL;
            if (interfaceC48269Iwz != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onPrepared callback --");
                LIZ2.append(tVar.u5);
                ((VBU) interfaceC48269Iwz).LJ(X1D.LIZIZ(LIZ2));
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("preparing:");
        LIZ3.append(tVar.LLIILII);
        X1D.LIZIZ(LIZ3);
        C46496IMq.LIZ();
        VAD vad = tVar.LJLJJI;
        VAG vag = vad.o2;
        if (vag != null) {
            vag.LJIJ = System.currentTimeMillis();
        }
        if (!vad.LLLJIL) {
            vad.LJLJJI.LJIJ = System.currentTimeMillis();
        }
        tVar.LLIILII = EnumC47633Imj.PREPARED;
        if (tVar.o0 == 0) {
            C46496IMq.LIZ();
            tVar.LJLLL.start();
        }
        InterfaceC48269Iwz interfaceC48269Iwz2 = tVar.LJLJL;
        if (interfaceC48269Iwz2 == null) {
            return;
        }
        ((VBU) interfaceC48269Iwz2).LIZ(EnumC79337VBt.PREPARED, 0, "player is prepared");
    }
}
