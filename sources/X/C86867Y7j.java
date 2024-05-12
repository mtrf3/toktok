package X;

import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Y7j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86867Y7j implements InterfaceC32416Cns {
    public InterfaceC88471Ynr<? super Boolean, ? super Integer, C76800UCe> LJLIL;

    @Override // X.InterfaceC32416Cns
    public final void LIZIZ() {
    }

    public C86867Y7j(AqS197S0100000_15 aqS197S0100000_15) {
        this.LJLIL = aqS197S0100000_15;
    }

    @Override // X.InterfaceC32416Cns
    public final void LIZ(long j) {
        if (this.LJLIL != null) {
            C32257ClJ.LJIIIIZZ(new AqS165S0100000_15(this, 895));
        }
    }

    @Override // X.InterfaceC32416Cns
    public final void onFailed(Throwable th) {
        if (this.LJLIL != null) {
            C32257ClJ.LJIIIIZZ(new AqS165S0100000_15(this, 896));
        }
    }

    @Override // X.InterfaceC32416Cns
    public final void LIZLLL(long j, String path) {
        o.LJIIIZ(path, "path");
        if (this.LJLIL != null) {
            C32257ClJ.LJIIIIZZ(new AqS165S0100000_15(this, 897));
        }
    }
}
