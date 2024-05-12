package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IzB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48405IzB implements InterfaceC48019Isx {
    public final /* synthetic */ C48404IzA LJLIL;

    @Override // X.InterfaceC48019Isx
    public final void LJFF(int i, int i2) {
    }

    @Override // X.InterfaceC48019Isx
    public final void onPrepared() {
        InterfaceC48019Isx interfaceC48019Isx = this.LJLIL.LJLILLLLZI;
        if (interfaceC48019Isx != null) {
            interfaceC48019Isx.onPrepared();
        }
        this.LJLIL.LJLIL.LIZIZ.setLooping(false);
        this.LJLIL.setMute(true);
        C48407IzD c48407IzD = this.LJLIL.LJLIL;
        c48407IzD.LIZIZ.start();
        c48407IzD.LIZ = 4;
        C48405IzB c48405IzB = c48407IzD.LIZJ;
        if (c48405IzB != null) {
            c48405IzB.LIZ(false);
        }
    }

    public C48405IzB(C48404IzA c48404IzA) {
        this.LJLIL = c48404IzA;
    }

    @Override // X.InterfaceC48019Isx
    public final void LIZ(boolean z) {
        InterfaceC48019Isx interfaceC48019Isx = this.LJLIL.LJLILLLLZI;
        if (interfaceC48019Isx != null) {
            interfaceC48019Isx.LIZ(z);
        }
    }

    @Override // X.InterfaceC48019Isx
    public final void LJI(int i) {
        InterfaceC48019Isx interfaceC48019Isx = this.LJLIL.LJLILLLLZI;
        if (interfaceC48019Isx != null) {
            interfaceC48019Isx.LJI(i);
        }
    }

    @Override // X.InterfaceC48019Isx
    public final void LIZIZ(int i, int i2) {
        InterfaceC48019Isx interfaceC48019Isx = this.LJLIL.LJLILLLLZI;
        if (interfaceC48019Isx != null) {
            interfaceC48019Isx.LIZIZ(i, i2);
        }
    }

    @Override // X.InterfaceC48019Isx
    public final void LIZJ(int i, boolean z) {
        InterfaceC48019Isx interfaceC48019Isx = this.LJLIL.LJLILLLLZI;
        if (interfaceC48019Isx != null) {
            interfaceC48019Isx.LIZJ(i, z);
        }
    }

    @Override // X.InterfaceC48019Isx
    public final void LIZLLL(int i, String errorDesc, boolean z) {
        o.LJIIJ(errorDesc, "errorDesc");
        InterfaceC48019Isx interfaceC48019Isx = this.LJLIL.LJLILLLLZI;
        if (interfaceC48019Isx != null) {
            interfaceC48019Isx.LIZLLL(i, errorDesc, z);
        }
    }
}
