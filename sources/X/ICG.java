package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ICG implements InterfaceC46206IBm {
    public final InterfaceC83727WtX LIZ;

    @Override // X.InterfaceC46206IBm
    public final void pause() {
        ICH S9 = this.LIZ.S9();
        if (S9 != null) {
            S9.pause();
        }
    }

    @Override // X.InterfaceC46206IBm
    public final void start() {
        ICH S9 = this.LIZ.S9();
        if (S9 != null) {
            S9.start();
        }
    }

    public ICG(InterfaceC83727WtX effectProcessor) {
        o.LJIIIZ(effectProcessor, "effectProcessor");
        this.LIZ = effectProcessor;
    }

    @Override // X.InterfaceC46206IBm
    public final void LIZIZ(boolean z) {
        ICH S9 = this.LIZ.S9();
        if (S9 != null) {
            S9.LIZIZ(z);
        }
    }

    @Override // X.InterfaceC46206IBm
    public final void LIZJ(C46207IBn c46207IBn) {
        ICF icf;
        ICH S9 = this.LIZ.S9();
        if (S9 != null) {
            if (c46207IBn != null) {
                icf = new ICF(c46207IBn);
            } else {
                icf = null;
            }
            S9.LIZJ(icf);
        }
    }
}
